package example.armeria.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "example.grpc.hello.HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hello",
      requestType = example.armeria.grpc.Hello.HelloRequest.class,
      responseType = example.armeria.grpc.Hello.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getHelloMethod() {
    io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply> getHelloMethod;
    if ((getHelloMethod = HelloServiceGrpc.getHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloMethod = HelloServiceGrpc.getHelloMethod) == null) {
          HelloServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("Hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getLazyHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LazyHello",
      requestType = example.armeria.grpc.Hello.HelloRequest.class,
      responseType = example.armeria.grpc.Hello.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getLazyHelloMethod() {
    io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply> getLazyHelloMethod;
    if ((getLazyHelloMethod = HelloServiceGrpc.getLazyHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getLazyHelloMethod = HelloServiceGrpc.getLazyHelloMethod) == null) {
          HelloServiceGrpc.getLazyHelloMethod = getLazyHelloMethod =
              io.grpc.MethodDescriptor.<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LazyHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("LazyHello"))
              .build();
        }
      }
    }
    return getLazyHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getBlockingHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockingHello",
      requestType = example.armeria.grpc.Hello.HelloRequest.class,
      responseType = example.armeria.grpc.Hello.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getBlockingHelloMethod() {
    io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply> getBlockingHelloMethod;
    if ((getBlockingHelloMethod = HelloServiceGrpc.getBlockingHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getBlockingHelloMethod = HelloServiceGrpc.getBlockingHelloMethod) == null) {
          HelloServiceGrpc.getBlockingHelloMethod = getBlockingHelloMethod =
              io.grpc.MethodDescriptor.<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockingHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("BlockingHello"))
              .build();
        }
      }
    }
    return getBlockingHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getLotsOfRepliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LotsOfReplies",
      requestType = example.armeria.grpc.Hello.HelloRequest.class,
      responseType = example.armeria.grpc.Hello.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getLotsOfRepliesMethod() {
    io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply> getLotsOfRepliesMethod;
    if ((getLotsOfRepliesMethod = HelloServiceGrpc.getLotsOfRepliesMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getLotsOfRepliesMethod = HelloServiceGrpc.getLotsOfRepliesMethod) == null) {
          HelloServiceGrpc.getLotsOfRepliesMethod = getLotsOfRepliesMethod =
              io.grpc.MethodDescriptor.<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LotsOfReplies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("LotsOfReplies"))
              .build();
        }
      }
    }
    return getLotsOfRepliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getLotsOfGreetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LotsOfGreetings",
      requestType = example.armeria.grpc.Hello.HelloRequest.class,
      responseType = example.armeria.grpc.Hello.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getLotsOfGreetingsMethod() {
    io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply> getLotsOfGreetingsMethod;
    if ((getLotsOfGreetingsMethod = HelloServiceGrpc.getLotsOfGreetingsMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getLotsOfGreetingsMethod = HelloServiceGrpc.getLotsOfGreetingsMethod) == null) {
          HelloServiceGrpc.getLotsOfGreetingsMethod = getLotsOfGreetingsMethod =
              io.grpc.MethodDescriptor.<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LotsOfGreetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("LotsOfGreetings"))
              .build();
        }
      }
    }
    return getLotsOfGreetingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getBidiHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidiHello",
      requestType = example.armeria.grpc.Hello.HelloRequest.class,
      responseType = example.armeria.grpc.Hello.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest,
      example.armeria.grpc.Hello.HelloReply> getBidiHelloMethod() {
    io.grpc.MethodDescriptor<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply> getBidiHelloMethod;
    if ((getBidiHelloMethod = HelloServiceGrpc.getBidiHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getBidiHelloMethod = HelloServiceGrpc.getBidiHelloMethod) == null) {
          HelloServiceGrpc.getBidiHelloMethod = getBidiHelloMethod =
              io.grpc.MethodDescriptor.<example.armeria.grpc.Hello.HelloRequest, example.armeria.grpc.Hello.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BidiHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.armeria.grpc.Hello.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("BidiHello"))
              .build();
        }
      }
    }
    return getBidiHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(example.armeria.grpc.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     */
    public void lazyHello(example.armeria.grpc.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLazyHelloMethod(), responseObserver);
    }

    /**
     */
    public void blockingHello(example.armeria.grpc.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockingHelloMethod(), responseObserver);
    }

    /**
     */
    public void lotsOfReplies(example.armeria.grpc.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLotsOfRepliesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloRequest> lotsOfGreetings(
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLotsOfGreetingsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloRequest> bidiHello(
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidiHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                example.armeria.grpc.Hello.HelloRequest,
                example.armeria.grpc.Hello.HelloReply>(
                  this, METHODID_HELLO)))
          .addMethod(
            getLazyHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                example.armeria.grpc.Hello.HelloRequest,
                example.armeria.grpc.Hello.HelloReply>(
                  this, METHODID_LAZY_HELLO)))
          .addMethod(
            getBlockingHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                example.armeria.grpc.Hello.HelloRequest,
                example.armeria.grpc.Hello.HelloReply>(
                  this, METHODID_BLOCKING_HELLO)))
          .addMethod(
            getLotsOfRepliesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                example.armeria.grpc.Hello.HelloRequest,
                example.armeria.grpc.Hello.HelloReply>(
                  this, METHODID_LOTS_OF_REPLIES)))
          .addMethod(
            getLotsOfGreetingsMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                example.armeria.grpc.Hello.HelloRequest,
                example.armeria.grpc.Hello.HelloReply>(
                  this, METHODID_LOTS_OF_GREETINGS)))
          .addMethod(
            getBidiHelloMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                example.armeria.grpc.Hello.HelloRequest,
                example.armeria.grpc.Hello.HelloReply>(
                  this, METHODID_BIDI_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(example.armeria.grpc.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lazyHello(example.armeria.grpc.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLazyHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void blockingHello(example.armeria.grpc.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlockingHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lotsOfReplies(example.armeria.grpc.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getLotsOfRepliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloRequest> lotsOfGreetings(
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getLotsOfGreetingsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloRequest> bidiHello(
        io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidiHelloMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.armeria.grpc.Hello.HelloReply hello(example.armeria.grpc.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.armeria.grpc.Hello.HelloReply lazyHello(example.armeria.grpc.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLazyHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.armeria.grpc.Hello.HelloReply blockingHello(example.armeria.grpc.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlockingHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<example.armeria.grpc.Hello.HelloReply> lotsOfReplies(
        example.armeria.grpc.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getLotsOfRepliesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.armeria.grpc.Hello.HelloReply> hello(
        example.armeria.grpc.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.armeria.grpc.Hello.HelloReply> lazyHello(
        example.armeria.grpc.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLazyHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.armeria.grpc.Hello.HelloReply> blockingHello(
        example.armeria.grpc.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlockingHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_LAZY_HELLO = 1;
  private static final int METHODID_BLOCKING_HELLO = 2;
  private static final int METHODID_LOTS_OF_REPLIES = 3;
  private static final int METHODID_LOTS_OF_GREETINGS = 4;
  private static final int METHODID_BIDI_HELLO = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((example.armeria.grpc.Hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply>) responseObserver);
          break;
        case METHODID_LAZY_HELLO:
          serviceImpl.lazyHello((example.armeria.grpc.Hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply>) responseObserver);
          break;
        case METHODID_BLOCKING_HELLO:
          serviceImpl.blockingHello((example.armeria.grpc.Hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply>) responseObserver);
          break;
        case METHODID_LOTS_OF_REPLIES:
          serviceImpl.lotsOfReplies((example.armeria.grpc.Hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply>) responseObserver);
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
        case METHODID_LOTS_OF_GREETINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.lotsOfGreetings(
              (io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply>) responseObserver);
        case METHODID_BIDI_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiHello(
              (io.grpc.stub.StreamObserver<example.armeria.grpc.Hello.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.armeria.grpc.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getLazyHelloMethod())
              .addMethod(getBlockingHelloMethod())
              .addMethod(getLotsOfRepliesMethod())
              .addMethod(getLotsOfGreetingsMethod())
              .addMethod(getBidiHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
