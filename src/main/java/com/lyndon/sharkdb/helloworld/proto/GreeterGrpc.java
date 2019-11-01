package com.lyndon.sharkdb.helloworld.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.1)",
    comments = "Source: helloworld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest,
      com.lyndon.sharkdb.helloworld.proto.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.lyndon.sharkdb.helloworld.proto.HelloRequest.class,
      responseType = com.lyndon.sharkdb.helloworld.proto.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest,
      com.lyndon.sharkdb.helloworld.proto.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest, com.lyndon.sharkdb.helloworld.proto.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.lyndon.sharkdb.helloworld.proto.HelloRequest, com.lyndon.sharkdb.helloworld.proto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lyndon.sharkdb.helloworld.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lyndon.sharkdb.helloworld.proto.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest,
      com.lyndon.sharkdb.helloworld.proto.HelloReply> getSayHelloAgainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloAgain",
      requestType = com.lyndon.sharkdb.helloworld.proto.HelloRequest.class,
      responseType = com.lyndon.sharkdb.helloworld.proto.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest,
      com.lyndon.sharkdb.helloworld.proto.HelloReply> getSayHelloAgainMethod() {
    io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest, com.lyndon.sharkdb.helloworld.proto.HelloReply> getSayHelloAgainMethod;
    if ((getSayHelloAgainMethod = GreeterGrpc.getSayHelloAgainMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloAgainMethod = GreeterGrpc.getSayHelloAgainMethod) == null) {
          GreeterGrpc.getSayHelloAgainMethod = getSayHelloAgainMethod =
              io.grpc.MethodDescriptor.<com.lyndon.sharkdb.helloworld.proto.HelloRequest, com.lyndon.sharkdb.helloworld.proto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloAgain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lyndon.sharkdb.helloworld.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lyndon.sharkdb.helloworld.proto.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloAgain"))
              .build();
        }
      }
    }
    return getSayHelloAgainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest,
      com.lyndon.sharkdb.helloworld.proto.StudentResponse> getSayListMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayListMessage",
      requestType = com.lyndon.sharkdb.helloworld.proto.HelloRequest.class,
      responseType = com.lyndon.sharkdb.helloworld.proto.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest,
      com.lyndon.sharkdb.helloworld.proto.StudentResponse> getSayListMessageMethod() {
    io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest, com.lyndon.sharkdb.helloworld.proto.StudentResponse> getSayListMessageMethod;
    if ((getSayListMessageMethod = GreeterGrpc.getSayListMessageMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayListMessageMethod = GreeterGrpc.getSayListMessageMethod) == null) {
          GreeterGrpc.getSayListMessageMethod = getSayListMessageMethod =
              io.grpc.MethodDescriptor.<com.lyndon.sharkdb.helloworld.proto.HelloRequest, com.lyndon.sharkdb.helloworld.proto.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayListMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lyndon.sharkdb.helloworld.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lyndon.sharkdb.helloworld.proto.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayListMessage"))
              .build();
        }
      }
    }
    return getSayListMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest,
      com.lyndon.sharkdb.helloworld.proto.StudentResponseList> getSayHelloListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloList",
      requestType = com.lyndon.sharkdb.helloworld.proto.HelloRequest.class,
      responseType = com.lyndon.sharkdb.helloworld.proto.StudentResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest,
      com.lyndon.sharkdb.helloworld.proto.StudentResponseList> getSayHelloListMethod() {
    io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.HelloRequest, com.lyndon.sharkdb.helloworld.proto.StudentResponseList> getSayHelloListMethod;
    if ((getSayHelloListMethod = GreeterGrpc.getSayHelloListMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloListMethod = GreeterGrpc.getSayHelloListMethod) == null) {
          GreeterGrpc.getSayHelloListMethod = getSayHelloListMethod =
              io.grpc.MethodDescriptor.<com.lyndon.sharkdb.helloworld.proto.HelloRequest, com.lyndon.sharkdb.helloworld.proto.StudentResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lyndon.sharkdb.helloworld.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lyndon.sharkdb.helloworld.proto.StudentResponseList.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloList"))
              .build();
        }
      }
    }
    return getSayHelloListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.StreamRequest,
      com.lyndon.sharkdb.helloworld.proto.StreamRequest> getBiTalkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BiTalk",
      requestType = com.lyndon.sharkdb.helloworld.proto.StreamRequest.class,
      responseType = com.lyndon.sharkdb.helloworld.proto.StreamRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.StreamRequest,
      com.lyndon.sharkdb.helloworld.proto.StreamRequest> getBiTalkMethod() {
    io.grpc.MethodDescriptor<com.lyndon.sharkdb.helloworld.proto.StreamRequest, com.lyndon.sharkdb.helloworld.proto.StreamRequest> getBiTalkMethod;
    if ((getBiTalkMethod = GreeterGrpc.getBiTalkMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getBiTalkMethod = GreeterGrpc.getBiTalkMethod) == null) {
          GreeterGrpc.getBiTalkMethod = getBiTalkMethod =
              io.grpc.MethodDescriptor.<com.lyndon.sharkdb.helloworld.proto.StreamRequest, com.lyndon.sharkdb.helloworld.proto.StreamRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BiTalk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lyndon.sharkdb.helloworld.proto.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lyndon.sharkdb.helloworld.proto.StreamRequest.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("BiTalk"))
              .build();
        }
      }
    }
    return getBiTalkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.lyndon.sharkdb.helloworld.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void sayHelloAgain(com.lyndon.sharkdb.helloworld.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloAgainMethod(), responseObserver);
    }

    /**
     */
    public void sayListMessage(com.lyndon.sharkdb.helloworld.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSayListMessageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.HelloRequest> sayHelloList(
        io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StudentResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(getSayHelloListMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StreamRequest> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiTalkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lyndon.sharkdb.helloworld.proto.HelloRequest,
                com.lyndon.sharkdb.helloworld.proto.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloAgainMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lyndon.sharkdb.helloworld.proto.HelloRequest,
                com.lyndon.sharkdb.helloworld.proto.HelloReply>(
                  this, METHODID_SAY_HELLO_AGAIN)))
          .addMethod(
            getSayListMessageMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.lyndon.sharkdb.helloworld.proto.HelloRequest,
                com.lyndon.sharkdb.helloworld.proto.StudentResponse>(
                  this, METHODID_SAY_LIST_MESSAGE)))
          .addMethod(
            getSayHelloListMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.lyndon.sharkdb.helloworld.proto.HelloRequest,
                com.lyndon.sharkdb.helloworld.proto.StudentResponseList>(
                  this, METHODID_SAY_HELLO_LIST)))
          .addMethod(
            getBiTalkMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.lyndon.sharkdb.helloworld.proto.StreamRequest,
                com.lyndon.sharkdb.helloworld.proto.StreamRequest>(
                  this, METHODID_BI_TALK)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.lyndon.sharkdb.helloworld.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloAgain(com.lyndon.sharkdb.helloworld.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloAgainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayListMessage(com.lyndon.sharkdb.helloworld.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StudentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSayListMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.HelloRequest> sayHelloList(
        io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StudentResponseList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSayHelloListMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StreamRequest> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiTalkMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.lyndon.sharkdb.helloworld.proto.HelloReply sayHello(com.lyndon.sharkdb.helloworld.proto.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lyndon.sharkdb.helloworld.proto.HelloReply sayHelloAgain(com.lyndon.sharkdb.helloworld.proto.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloAgainMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.lyndon.sharkdb.helloworld.proto.StudentResponse> sayListMessage(
        com.lyndon.sharkdb.helloworld.proto.HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSayListMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lyndon.sharkdb.helloworld.proto.HelloReply> sayHello(
        com.lyndon.sharkdb.helloworld.proto.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lyndon.sharkdb.helloworld.proto.HelloReply> sayHelloAgain(
        com.lyndon.sharkdb.helloworld.proto.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloAgainMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_AGAIN = 1;
  private static final int METHODID_SAY_LIST_MESSAGE = 2;
  private static final int METHODID_SAY_HELLO_LIST = 3;
  private static final int METHODID_BI_TALK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.lyndon.sharkdb.helloworld.proto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_AGAIN:
          serviceImpl.sayHelloAgain((com.lyndon.sharkdb.helloworld.proto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_LIST_MESSAGE:
          serviceImpl.sayListMessage((com.lyndon.sharkdb.helloworld.proto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StudentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO_LIST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloList(
              (io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StudentResponseList>) responseObserver);
        case METHODID_BI_TALK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biTalk(
              (io.grpc.stub.StreamObserver<com.lyndon.sharkdb.helloworld.proto.StreamRequest>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lyndon.sharkdb.helloworld.proto.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloAgainMethod())
              .addMethod(getSayListMessageMethod())
              .addMethod(getSayHelloListMethod())
              .addMethod(getBiTalkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
