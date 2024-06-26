package sentinel.node.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.3)",
    comments = "Source: sentinel/node/v2/querier.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final String SERVICE_NAME = "sentinel.node.v2.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryNodesRequest,
      sentinel.node.v2.Querier.QueryNodesResponse> getQueryNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryNodes",
      requestType = sentinel.node.v2.Querier.QueryNodesRequest.class,
      responseType = sentinel.node.v2.Querier.QueryNodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryNodesRequest,
      sentinel.node.v2.Querier.QueryNodesResponse> getQueryNodesMethod() {
    io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryNodesRequest, sentinel.node.v2.Querier.QueryNodesResponse> getQueryNodesMethod;
    if ((getQueryNodesMethod = QueryServiceGrpc.getQueryNodesMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryNodesMethod = QueryServiceGrpc.getQueryNodesMethod) == null) {
          QueryServiceGrpc.getQueryNodesMethod = getQueryNodesMethod =
              io.grpc.MethodDescriptor.<sentinel.node.v2.Querier.QueryNodesRequest, sentinel.node.v2.Querier.QueryNodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.node.v2.Querier.QueryNodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.node.v2.Querier.QueryNodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryNodes"))
              .build();
        }
      }
    }
    return getQueryNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryNodesForPlanRequest,
      sentinel.node.v2.Querier.QueryNodesForPlanResponse> getQueryNodesForPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryNodesForPlan",
      requestType = sentinel.node.v2.Querier.QueryNodesForPlanRequest.class,
      responseType = sentinel.node.v2.Querier.QueryNodesForPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryNodesForPlanRequest,
      sentinel.node.v2.Querier.QueryNodesForPlanResponse> getQueryNodesForPlanMethod() {
    io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryNodesForPlanRequest, sentinel.node.v2.Querier.QueryNodesForPlanResponse> getQueryNodesForPlanMethod;
    if ((getQueryNodesForPlanMethod = QueryServiceGrpc.getQueryNodesForPlanMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryNodesForPlanMethod = QueryServiceGrpc.getQueryNodesForPlanMethod) == null) {
          QueryServiceGrpc.getQueryNodesForPlanMethod = getQueryNodesForPlanMethod =
              io.grpc.MethodDescriptor.<sentinel.node.v2.Querier.QueryNodesForPlanRequest, sentinel.node.v2.Querier.QueryNodesForPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryNodesForPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.node.v2.Querier.QueryNodesForPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.node.v2.Querier.QueryNodesForPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryNodesForPlan"))
              .build();
        }
      }
    }
    return getQueryNodesForPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryNodeRequest,
      sentinel.node.v2.Querier.QueryNodeResponse> getQueryNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryNode",
      requestType = sentinel.node.v2.Querier.QueryNodeRequest.class,
      responseType = sentinel.node.v2.Querier.QueryNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryNodeRequest,
      sentinel.node.v2.Querier.QueryNodeResponse> getQueryNodeMethod() {
    io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryNodeRequest, sentinel.node.v2.Querier.QueryNodeResponse> getQueryNodeMethod;
    if ((getQueryNodeMethod = QueryServiceGrpc.getQueryNodeMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryNodeMethod = QueryServiceGrpc.getQueryNodeMethod) == null) {
          QueryServiceGrpc.getQueryNodeMethod = getQueryNodeMethod =
              io.grpc.MethodDescriptor.<sentinel.node.v2.Querier.QueryNodeRequest, sentinel.node.v2.Querier.QueryNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.node.v2.Querier.QueryNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.node.v2.Querier.QueryNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryNode"))
              .build();
        }
      }
    }
    return getQueryNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryParamsRequest,
      sentinel.node.v2.Querier.QueryParamsResponse> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryParams",
      requestType = sentinel.node.v2.Querier.QueryParamsRequest.class,
      responseType = sentinel.node.v2.Querier.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryParamsRequest,
      sentinel.node.v2.Querier.QueryParamsResponse> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<sentinel.node.v2.Querier.QueryParamsRequest, sentinel.node.v2.Querier.QueryParamsResponse> getQueryParamsMethod;
    if ((getQueryParamsMethod = QueryServiceGrpc.getQueryParamsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryParamsMethod = QueryServiceGrpc.getQueryParamsMethod) == null) {
          QueryServiceGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<sentinel.node.v2.Querier.QueryParamsRequest, sentinel.node.v2.Querier.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.node.v2.Querier.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.node.v2.Querier.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryParams"))
              .build();
        }
      }
    }
    return getQueryParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub>() {
        @java.lang.Override
        public QueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceStub(channel, callOptions);
        }
      };
    return QueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub>() {
        @java.lang.Override
        public QueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceBlockingStub(channel, callOptions);
        }
      };
    return QueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub>() {
        @java.lang.Override
        public QueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceFutureStub(channel, callOptions);
        }
      };
    return QueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void queryNodes(sentinel.node.v2.Querier.QueryNodesRequest request,
        io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryNodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryNodesMethod(), responseObserver);
    }

    /**
     */
    default void queryNodesForPlan(sentinel.node.v2.Querier.QueryNodesForPlanRequest request,
        io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryNodesForPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryNodesForPlanMethod(), responseObserver);
    }

    /**
     */
    default void queryNode(sentinel.node.v2.Querier.QueryNodeRequest request,
        io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryNodeMethod(), responseObserver);
    }

    /**
     */
    default void queryParams(sentinel.node.v2.Querier.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryService.
   */
  public static abstract class QueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryService.
   */
  public static final class QueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QueryServiceStub> {
    private QueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryNodes(sentinel.node.v2.Querier.QueryNodesRequest request,
        io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryNodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryNodesForPlan(sentinel.node.v2.Querier.QueryNodesForPlanRequest request,
        io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryNodesForPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryNodesForPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryNode(sentinel.node.v2.Querier.QueryNodeRequest request,
        io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryParams(sentinel.node.v2.Querier.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryService.
   */
  public static final class QueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryServiceBlockingStub> {
    private QueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sentinel.node.v2.Querier.QueryNodesResponse queryNodes(sentinel.node.v2.Querier.QueryNodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentinel.node.v2.Querier.QueryNodesForPlanResponse queryNodesForPlan(sentinel.node.v2.Querier.QueryNodesForPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryNodesForPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentinel.node.v2.Querier.QueryNodeResponse queryNode(sentinel.node.v2.Querier.QueryNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentinel.node.v2.Querier.QueryParamsResponse queryParams(sentinel.node.v2.Querier.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryService.
   */
  public static final class QueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryServiceFutureStub> {
    private QueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.node.v2.Querier.QueryNodesResponse> queryNodes(
        sentinel.node.v2.Querier.QueryNodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.node.v2.Querier.QueryNodesForPlanResponse> queryNodesForPlan(
        sentinel.node.v2.Querier.QueryNodesForPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryNodesForPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.node.v2.Querier.QueryNodeResponse> queryNode(
        sentinel.node.v2.Querier.QueryNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.node.v2.Querier.QueryParamsResponse> queryParams(
        sentinel.node.v2.Querier.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_NODES = 0;
  private static final int METHODID_QUERY_NODES_FOR_PLAN = 1;
  private static final int METHODID_QUERY_NODE = 2;
  private static final int METHODID_QUERY_PARAMS = 3;

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
        case METHODID_QUERY_NODES:
          serviceImpl.queryNodes((sentinel.node.v2.Querier.QueryNodesRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryNodesResponse>) responseObserver);
          break;
        case METHODID_QUERY_NODES_FOR_PLAN:
          serviceImpl.queryNodesForPlan((sentinel.node.v2.Querier.QueryNodesForPlanRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryNodesForPlanResponse>) responseObserver);
          break;
        case METHODID_QUERY_NODE:
          serviceImpl.queryNode((sentinel.node.v2.Querier.QueryNodeRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryNodeResponse>) responseObserver);
          break;
        case METHODID_QUERY_PARAMS:
          serviceImpl.queryParams((sentinel.node.v2.Querier.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.node.v2.Querier.QueryParamsResponse>) responseObserver);
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
          getQueryNodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.node.v2.Querier.QueryNodesRequest,
              sentinel.node.v2.Querier.QueryNodesResponse>(
                service, METHODID_QUERY_NODES)))
        .addMethod(
          getQueryNodesForPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.node.v2.Querier.QueryNodesForPlanRequest,
              sentinel.node.v2.Querier.QueryNodesForPlanResponse>(
                service, METHODID_QUERY_NODES_FOR_PLAN)))
        .addMethod(
          getQueryNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.node.v2.Querier.QueryNodeRequest,
              sentinel.node.v2.Querier.QueryNodeResponse>(
                service, METHODID_QUERY_NODE)))
        .addMethod(
          getQueryParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.node.v2.Querier.QueryParamsRequest,
              sentinel.node.v2.Querier.QueryParamsResponse>(
                service, METHODID_QUERY_PARAMS)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sentinel.node.v2.Querier.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService");
    }
  }

  private static final class QueryServiceFileDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier {
    QueryServiceFileDescriptorSupplier() {}
  }

  private static final class QueryServiceMethodDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryServiceFileDescriptorSupplier())
              .addMethod(getQueryNodesMethod())
              .addMethod(getQueryNodesForPlanMethod())
              .addMethod(getQueryNodeMethod())
              .addMethod(getQueryParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
