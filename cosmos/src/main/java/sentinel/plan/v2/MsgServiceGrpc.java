package sentinel.plan.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.3)",
    comments = "Source: sentinel/plan/v2/msg.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final String SERVICE_NAME = "sentinel.plan.v2.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgCreateRequest,
      sentinel.plan.v2.Msg.MsgCreateResponse> getMsgCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgCreate",
      requestType = sentinel.plan.v2.Msg.MsgCreateRequest.class,
      responseType = sentinel.plan.v2.Msg.MsgCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgCreateRequest,
      sentinel.plan.v2.Msg.MsgCreateResponse> getMsgCreateMethod() {
    io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgCreateRequest, sentinel.plan.v2.Msg.MsgCreateResponse> getMsgCreateMethod;
    if ((getMsgCreateMethod = MsgServiceGrpc.getMsgCreateMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgCreateMethod = MsgServiceGrpc.getMsgCreateMethod) == null) {
          MsgServiceGrpc.getMsgCreateMethod = getMsgCreateMethod =
              io.grpc.MethodDescriptor.<sentinel.plan.v2.Msg.MsgCreateRequest, sentinel.plan.v2.Msg.MsgCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.plan.v2.Msg.MsgCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.plan.v2.Msg.MsgCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgCreate"))
              .build();
        }
      }
    }
    return getMsgCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgUpdateStatusRequest,
      sentinel.plan.v2.Msg.MsgUpdateStatusResponse> getMsgUpdateStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgUpdateStatus",
      requestType = sentinel.plan.v2.Msg.MsgUpdateStatusRequest.class,
      responseType = sentinel.plan.v2.Msg.MsgUpdateStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgUpdateStatusRequest,
      sentinel.plan.v2.Msg.MsgUpdateStatusResponse> getMsgUpdateStatusMethod() {
    io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgUpdateStatusRequest, sentinel.plan.v2.Msg.MsgUpdateStatusResponse> getMsgUpdateStatusMethod;
    if ((getMsgUpdateStatusMethod = MsgServiceGrpc.getMsgUpdateStatusMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgUpdateStatusMethod = MsgServiceGrpc.getMsgUpdateStatusMethod) == null) {
          MsgServiceGrpc.getMsgUpdateStatusMethod = getMsgUpdateStatusMethod =
              io.grpc.MethodDescriptor.<sentinel.plan.v2.Msg.MsgUpdateStatusRequest, sentinel.plan.v2.Msg.MsgUpdateStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgUpdateStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.plan.v2.Msg.MsgUpdateStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.plan.v2.Msg.MsgUpdateStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgUpdateStatus"))
              .build();
        }
      }
    }
    return getMsgUpdateStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgLinkNodeRequest,
      sentinel.plan.v2.Msg.MsgLinkNodeResponse> getMsgLinkNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgLinkNode",
      requestType = sentinel.plan.v2.Msg.MsgLinkNodeRequest.class,
      responseType = sentinel.plan.v2.Msg.MsgLinkNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgLinkNodeRequest,
      sentinel.plan.v2.Msg.MsgLinkNodeResponse> getMsgLinkNodeMethod() {
    io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgLinkNodeRequest, sentinel.plan.v2.Msg.MsgLinkNodeResponse> getMsgLinkNodeMethod;
    if ((getMsgLinkNodeMethod = MsgServiceGrpc.getMsgLinkNodeMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgLinkNodeMethod = MsgServiceGrpc.getMsgLinkNodeMethod) == null) {
          MsgServiceGrpc.getMsgLinkNodeMethod = getMsgLinkNodeMethod =
              io.grpc.MethodDescriptor.<sentinel.plan.v2.Msg.MsgLinkNodeRequest, sentinel.plan.v2.Msg.MsgLinkNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgLinkNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.plan.v2.Msg.MsgLinkNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.plan.v2.Msg.MsgLinkNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgLinkNode"))
              .build();
        }
      }
    }
    return getMsgLinkNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgUnlinkNodeRequest,
      sentinel.plan.v2.Msg.MsgUnlinkNodeResponse> getMsgUnlinkNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgUnlinkNode",
      requestType = sentinel.plan.v2.Msg.MsgUnlinkNodeRequest.class,
      responseType = sentinel.plan.v2.Msg.MsgUnlinkNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgUnlinkNodeRequest,
      sentinel.plan.v2.Msg.MsgUnlinkNodeResponse> getMsgUnlinkNodeMethod() {
    io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgUnlinkNodeRequest, sentinel.plan.v2.Msg.MsgUnlinkNodeResponse> getMsgUnlinkNodeMethod;
    if ((getMsgUnlinkNodeMethod = MsgServiceGrpc.getMsgUnlinkNodeMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgUnlinkNodeMethod = MsgServiceGrpc.getMsgUnlinkNodeMethod) == null) {
          MsgServiceGrpc.getMsgUnlinkNodeMethod = getMsgUnlinkNodeMethod =
              io.grpc.MethodDescriptor.<sentinel.plan.v2.Msg.MsgUnlinkNodeRequest, sentinel.plan.v2.Msg.MsgUnlinkNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgUnlinkNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.plan.v2.Msg.MsgUnlinkNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.plan.v2.Msg.MsgUnlinkNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgUnlinkNode"))
              .build();
        }
      }
    }
    return getMsgUnlinkNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgSubscribeRequest,
      sentinel.plan.v2.Msg.MsgSubscribeResponse> getMsgSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgSubscribe",
      requestType = sentinel.plan.v2.Msg.MsgSubscribeRequest.class,
      responseType = sentinel.plan.v2.Msg.MsgSubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgSubscribeRequest,
      sentinel.plan.v2.Msg.MsgSubscribeResponse> getMsgSubscribeMethod() {
    io.grpc.MethodDescriptor<sentinel.plan.v2.Msg.MsgSubscribeRequest, sentinel.plan.v2.Msg.MsgSubscribeResponse> getMsgSubscribeMethod;
    if ((getMsgSubscribeMethod = MsgServiceGrpc.getMsgSubscribeMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgSubscribeMethod = MsgServiceGrpc.getMsgSubscribeMethod) == null) {
          MsgServiceGrpc.getMsgSubscribeMethod = getMsgSubscribeMethod =
              io.grpc.MethodDescriptor.<sentinel.plan.v2.Msg.MsgSubscribeRequest, sentinel.plan.v2.Msg.MsgSubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgSubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.plan.v2.Msg.MsgSubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.plan.v2.Msg.MsgSubscribeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgSubscribe"))
              .build();
        }
      }
    }
    return getMsgSubscribeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub>() {
        @java.lang.Override
        public MsgServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceStub(channel, callOptions);
        }
      };
    return MsgServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub>() {
        @java.lang.Override
        public MsgServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceBlockingStub(channel, callOptions);
        }
      };
    return MsgServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub>() {
        @java.lang.Override
        public MsgServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceFutureStub(channel, callOptions);
        }
      };
    return MsgServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void msgCreate(sentinel.plan.v2.Msg.MsgCreateRequest request,
        io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgCreateMethod(), responseObserver);
    }

    /**
     */
    default void msgUpdateStatus(sentinel.plan.v2.Msg.MsgUpdateStatusRequest request,
        io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgUpdateStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgUpdateStatusMethod(), responseObserver);
    }

    /**
     */
    default void msgLinkNode(sentinel.plan.v2.Msg.MsgLinkNodeRequest request,
        io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgLinkNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgLinkNodeMethod(), responseObserver);
    }

    /**
     */
    default void msgUnlinkNode(sentinel.plan.v2.Msg.MsgUnlinkNodeRequest request,
        io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgUnlinkNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgUnlinkNodeMethod(), responseObserver);
    }

    /**
     */
    default void msgSubscribe(sentinel.plan.v2.Msg.MsgSubscribeRequest request,
        io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgSubscribeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgSubscribeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MsgService.
   */
  public static abstract class MsgServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MsgService.
   */
  public static final class MsgServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MsgServiceStub> {
    private MsgServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceStub(channel, callOptions);
    }

    /**
     */
    public void msgCreate(sentinel.plan.v2.Msg.MsgCreateRequest request,
        io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgUpdateStatus(sentinel.plan.v2.Msg.MsgUpdateStatusRequest request,
        io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgUpdateStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgUpdateStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgLinkNode(sentinel.plan.v2.Msg.MsgLinkNodeRequest request,
        io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgLinkNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgLinkNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgUnlinkNode(sentinel.plan.v2.Msg.MsgUnlinkNodeRequest request,
        io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgUnlinkNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgUnlinkNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgSubscribe(sentinel.plan.v2.Msg.MsgSubscribeRequest request,
        io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgSubscribeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgSubscribeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MsgService.
   */
  public static final class MsgServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgServiceBlockingStub> {
    private MsgServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sentinel.plan.v2.Msg.MsgCreateResponse msgCreate(sentinel.plan.v2.Msg.MsgCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentinel.plan.v2.Msg.MsgUpdateStatusResponse msgUpdateStatus(sentinel.plan.v2.Msg.MsgUpdateStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgUpdateStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentinel.plan.v2.Msg.MsgLinkNodeResponse msgLinkNode(sentinel.plan.v2.Msg.MsgLinkNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgLinkNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentinel.plan.v2.Msg.MsgUnlinkNodeResponse msgUnlinkNode(sentinel.plan.v2.Msg.MsgUnlinkNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgUnlinkNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentinel.plan.v2.Msg.MsgSubscribeResponse msgSubscribe(sentinel.plan.v2.Msg.MsgSubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgSubscribeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MsgService.
   */
  public static final class MsgServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgServiceFutureStub> {
    private MsgServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.plan.v2.Msg.MsgCreateResponse> msgCreate(
        sentinel.plan.v2.Msg.MsgCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.plan.v2.Msg.MsgUpdateStatusResponse> msgUpdateStatus(
        sentinel.plan.v2.Msg.MsgUpdateStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgUpdateStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.plan.v2.Msg.MsgLinkNodeResponse> msgLinkNode(
        sentinel.plan.v2.Msg.MsgLinkNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgLinkNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.plan.v2.Msg.MsgUnlinkNodeResponse> msgUnlinkNode(
        sentinel.plan.v2.Msg.MsgUnlinkNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgUnlinkNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.plan.v2.Msg.MsgSubscribeResponse> msgSubscribe(
        sentinel.plan.v2.Msg.MsgSubscribeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgSubscribeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MSG_CREATE = 0;
  private static final int METHODID_MSG_UPDATE_STATUS = 1;
  private static final int METHODID_MSG_LINK_NODE = 2;
  private static final int METHODID_MSG_UNLINK_NODE = 3;
  private static final int METHODID_MSG_SUBSCRIBE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MSG_CREATE:
          serviceImpl.msgCreate((sentinel.plan.v2.Msg.MsgCreateRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgCreateResponse>) responseObserver);
          break;
        case METHODID_MSG_UPDATE_STATUS:
          serviceImpl.msgUpdateStatus((sentinel.plan.v2.Msg.MsgUpdateStatusRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgUpdateStatusResponse>) responseObserver);
          break;
        case METHODID_MSG_LINK_NODE:
          serviceImpl.msgLinkNode((sentinel.plan.v2.Msg.MsgLinkNodeRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgLinkNodeResponse>) responseObserver);
          break;
        case METHODID_MSG_UNLINK_NODE:
          serviceImpl.msgUnlinkNode((sentinel.plan.v2.Msg.MsgUnlinkNodeRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgUnlinkNodeResponse>) responseObserver);
          break;
        case METHODID_MSG_SUBSCRIBE:
          serviceImpl.msgSubscribe((sentinel.plan.v2.Msg.MsgSubscribeRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.plan.v2.Msg.MsgSubscribeResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMsgCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.plan.v2.Msg.MsgCreateRequest,
              sentinel.plan.v2.Msg.MsgCreateResponse>(
                service, METHODID_MSG_CREATE)))
        .addMethod(
          getMsgUpdateStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.plan.v2.Msg.MsgUpdateStatusRequest,
              sentinel.plan.v2.Msg.MsgUpdateStatusResponse>(
                service, METHODID_MSG_UPDATE_STATUS)))
        .addMethod(
          getMsgLinkNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.plan.v2.Msg.MsgLinkNodeRequest,
              sentinel.plan.v2.Msg.MsgLinkNodeResponse>(
                service, METHODID_MSG_LINK_NODE)))
        .addMethod(
          getMsgUnlinkNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.plan.v2.Msg.MsgUnlinkNodeRequest,
              sentinel.plan.v2.Msg.MsgUnlinkNodeResponse>(
                service, METHODID_MSG_UNLINK_NODE)))
        .addMethod(
          getMsgSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.plan.v2.Msg.MsgSubscribeRequest,
              sentinel.plan.v2.Msg.MsgSubscribeResponse>(
                service, METHODID_MSG_SUBSCRIBE)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sentinel.plan.v2.Msg.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MsgService");
    }
  }

  private static final class MsgServiceFileDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier {
    MsgServiceFileDescriptorSupplier() {}
  }

  private static final class MsgServiceMethodDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgServiceFileDescriptorSupplier())
              .addMethod(getMsgCreateMethod())
              .addMethod(getMsgUpdateStatusMethod())
              .addMethod(getMsgLinkNodeMethod())
              .addMethod(getMsgUnlinkNodeMethod())
              .addMethod(getMsgSubscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
