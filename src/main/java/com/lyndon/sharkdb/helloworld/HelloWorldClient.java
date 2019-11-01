package com.lyndon.sharkdb.helloworld;

import com.lyndon.sharkdb.helloworld.proto.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorldClient {
    private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());

    private ManagedChannel channel;
    private GreeterGrpc.GreeterBlockingStub blockingStub;
    private GreeterGrpc.GreeterFutureStub futureStub;
    private GreeterGrpc.GreeterStub asyncStub;

    public HelloWorldClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
        .usePlaintext()
        .build());
    }

    public HelloWorldClient(ManagedChannel channel) {
        this.channel = channel;
        this.blockingStub = GreeterGrpc.newBlockingStub(channel);
        this.asyncStub = GreeterGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void greet(String name) throws InterruptedException {
        logger.info("Will try to greet " + name + " ...");
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloReply response;
        try {
            response = blockingStub.sayHello(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getMessage());
        try {
            response = blockingStub.sayHelloAgain(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getMessage());

        try {
            Iterator<StudentResponse> zhang_san = blockingStub.sayListMessage(HelloRequest.newBuilder().setName("Zhang San").build());
            while (zhang_san.hasNext()){
                StudentResponse next = zhang_san.next();
                System.out.println(next.getName() + "," + next.getAge() + "," + next.getCity());
            }
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: ------ ");

        StreamObserver<StudentResponseList> streamObserver = new StreamObserver<StudentResponseList>() {
            @Override
            public void onNext(StudentResponseList value) {
                value.getStudentResponseList().forEach(studentResponse -> {
                    System.out.println(studentResponse.getName());
                    System.out.println(studentResponse.getAge());
                    System.out.println(studentResponse.getCity());
                    System.out.println("*************");
                });
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("completed");
            }
        };

        StreamObserver<HelloRequest> helloList = asyncStub.sayHelloList(streamObserver);

        helloList.onNext(HelloRequest.newBuilder().setName("15").build());
        helloList.onNext(HelloRequest.newBuilder().setName("16").build());
        helloList.onNext(HelloRequest.newBuilder().setName("17").build());
        helloList.onNext(HelloRequest.newBuilder().setName("18").build());

        helloList.onCompleted();

        logger.info("Greeting: ------ ");

        StreamObserver<StreamRequest> streamRequestStreamObserver = asyncStub.biTalk(new StreamObserver<StreamRequest>() {
            @Override
            public void onNext(StreamRequest value) {
                System.out.println(value.getRequestInfo());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed");
            }
        });
        for (int i = 0; i < 10; i++) {
            streamRequestStreamObserver.onNext(StreamRequest.newBuilder().setRequestInfo(LocalDateTime.now().toString()).build());
            TimeUnit.SECONDS.sleep(1);
        }
        streamRequestStreamObserver.onCompleted();
    }

    public static void main(String[] args) throws InterruptedException {
        HelloWorldClient client = new HelloWorldClient("localhost", 8083);
        try {
            String user = "World";
            if (args.length > 0){
                user = args[0];
            }
            client.greet(user);
        } finally {
            client.shutdown();
        }
    }
}
