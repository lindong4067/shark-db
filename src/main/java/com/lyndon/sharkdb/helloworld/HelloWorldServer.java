package com.lyndon.sharkdb.helloworld;

import com.lyndon.sharkdb.helloworld.proto.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class HelloWorldServer {
    private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        final HelloWorldServer server = new HelloWorldServer();
        server.start();
        server.blockUntilShutdown();
    }

    private Server server;

    private void start() throws IOException {
        int port = 8083;
        server = ServerBuilder.forPort(port)
                .addService(new GreeterImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                HelloWorldServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination(100, TimeUnit.SECONDS);
        }
    }

    class GreeterImpl extends GreeterGrpc.GreeterImplBase {
        @Override
        public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
            HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }

        @Override
        public void sayHelloAgain(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
            HelloReply reply = HelloReply.newBuilder().setMessage("Hello again " + request.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }

        @Override
        public void sayListMessage(HelloRequest request, StreamObserver<StudentResponse> responseObserver) {
            System.out.println("Server received message: " + request.getName());
            responseObserver.onNext(StudentResponse.newBuilder().setName("Zhang San").setAge(18).setCity("Shanghai").build());
            responseObserver.onNext(StudentResponse.newBuilder().setName("Li Si").setAge(19).setCity("Beijing").build());
            responseObserver.onNext(StudentResponse.newBuilder().setName("Wang Wu").setAge(20).setCity("Guangzhou").build());
            responseObserver.onNext(StudentResponse.newBuilder().setName("Zhao Liu").setAge(21).setCity("Shenzhen").build());
            responseObserver.onCompleted();
        }

        /**
         * Client send stream, server return message
         * @param responseObserver
         * @return
         */
        @Override
        public StreamObserver<HelloRequest> sayHelloList(StreamObserver<StudentResponseList> responseObserver) {
            System.out.println("Server received message: sayHelloList");
            return new StreamObserver<HelloRequest>() {
                @Override
                public void onNext(HelloRequest value) {
                    System.out.println("On next: " + value.getName());
                }

                @Override
                public void onError(Throwable t) {
                    System.out.println(t.getMessage());
                }

                @Override
                public void onCompleted() {
                    StudentResponse response = StudentResponse.newBuilder().setName("Zhang San").setAge(18).setCity("Shanghai").build();
                    StudentResponse response1 = StudentResponse.newBuilder().setName("Zhang San").setAge(18).setCity("Shanghai").build();
                    StudentResponseList responseList = StudentResponseList.newBuilder().addStudentResponse(response).addStudentResponse(response1).build();
                    responseObserver.onNext(responseList);
                    responseObserver.onCompleted();
                }
            };
        }

        @Override
        public StreamObserver<StreamRequest> biTalk(StreamObserver<StreamRequest> responseObserver) {
            System.out.println("Server received message: biTalk");
            return new StreamObserver<StreamRequest>() {
                @Override
                public void onNext(StreamRequest value) {
                    System.out.println(value.getRequestInfo());
                    responseObserver.onNext(StreamRequest.newBuilder().setRequestInfo(UUID.randomUUID().toString()).build());
                }

                @Override
                public void onError(Throwable t) {
                    System.out.println(t.getMessage());
                }

                @Override
                public void onCompleted() {
                    //Close client connection. Close server connection
                    responseObserver.onCompleted();
                }
            };
        }
    }
}
