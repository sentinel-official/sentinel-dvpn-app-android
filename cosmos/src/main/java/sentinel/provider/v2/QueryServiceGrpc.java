package sentinel.provider.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.3)",
    comments = "Source: sentinel/provider/v2/querier.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final String SERVICE_NAME = "sentinel.provider.v2.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sentinel.provider.v2.Querier.QueryProvidersRequest,
      sentinel.provider.v2.Querier.QueryProvidersResponse> getQueryProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryProviders",
      requestType = sentinel.provider.v2.Querier.QueryProvidersRequest.class,
      responseType = sentinel.provider.v2.Querier.QueryProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.provider.v2.Querier.QueryProvidersRequest,
      sentinel.provider.v2.Querier.QueryProvidersResponse> getQueryProvidersMethod() {
    io.grpc.MethodDescriptor<sentinel.provider.v2.Querier.QueryProvidersRequest, sentinel.provider.v2.Querier.QueryProvidersResponse> getQueryProvidersMethod;
    if ((getQueryProvidersMethod = QueryServiceGrpc.getQueryProvidersMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryProvidersMethod = QueryServiceGrpc.getQueryProvidersMethod) == null) {
          QueryServiceGrpc.getQueryProvidersMethod = getQueryProvidersMethod =
              io.grpc.MethodDescriptor.<sentinel.provider.v2.Querier.QueryProvidersRequest, sentinel.provider.v2.Querier.QueryProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.provider.v2.Querier.QueryProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.provider.v2.Querier.QueryProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryProviders"))
              .build();
        }
      }
    }
    return getQueryProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sentinel.provider.v2.Querier.QueryProviderRequest,
      sentinel.provider.v2.Querier.QueryProviderResponse> getQueryProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryProvider",
      requestType = sentinel.provider.v2.Querier.QueryProviderRequest.class,
      responseType = sentinel.provider.v2.Querier.QueryProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.provider.v2.Querier.QueryProviderRequest,
      sentinel.provider.v2.Querier.QueryProviderResponse> getQueryProviderMethod() {
    io.grpc.MethodDescriptor<sentinel.provider.v2.Querier.QueryProviderRequest, sentinel.provider.v2.Querier.QueryProviderResponse> getQueryProviderMethod;
    if ((getQueryProviderMethod = QueryServiceGrpc.getQueryProviderMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryProviderMethod = QueryServiceGrpc.getQueryProviderMethod) == null) {
          QueryServiceGrpc.getQueryProviderMethod = getQueryProviderMethod =
              io.grpc.MethodDescriptor.<sentinel.provider.v2.Querier.QueryProviderRequest, sentinel.provider.v2.Querier.QueryProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.provider.v2.Querier.QueryProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.provider.v2.Querier.QueryProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryProvider"))
              .build();
        }
      }
    }
    return getQueryProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sentinel.provider.v2.Querier.QueryParamsRequest,
      sentinel.provider.v2.Querier.QueryParamsResponse> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryParams",
      requestType = sentinel.provider.v2.Querier.QueryParamsRequest.class,
      responseType = sentinel.provider.v2.Querier.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sentinel.provider.v2.Querier.QueryParamsRequest,
      sentinel.provider.v2.Querier.QueryParamsResponse> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<sentinel.provider.v2.Querier.QueryParamsRequest, sentinel.provider.v2.Querier.QueryParamsResponse> getQueryParamsMethod;
    if ((getQueryParamsMethod = QueryServiceGrpc.getQueryParamsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryParamsMethod = QueryServiceGrpc.getQueryParamsMethod) == null) {
          QueryServiceGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<sentinel.provider.v2.Querier.QueryParamsRequest, sentinel.provider.v2.Querier.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.provider.v2.Querier.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentinel.provider.v2.Querier.QueryParamsResponse.getDefaultInstance()))
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
    default void queryProviders(sentinel.provider.v2.Querier.QueryProvidersRequest request,
        io.grpc.stub.StreamObserver<sentinel.provider.v2.Querier.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryProvidersMethod(), responseObserver);
    }

    /**
     */
    default void queryProvider(sentinel.provider.v2.Querier.QueryProviderRequest request,
        io.grpc.stub.StreamObserver<sentinel.provider.v2.Querier.QueryProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryProviderMethod(), responseObserver);
    }

    /**
     */
    default void queryParams(sentinel.provider.v2.Querier.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<sentinel.provider.v2.Querier.QueryParamsResponse> responseObserver) {
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
    public void queryProviders(sentinel.provider.v2.Querier.QueryProvidersRequest request,
        io.grpc.stub.StreamObserver<sentinel.provider.v2.Querier.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryProvider(sentinel.provider.v2.Querier.QueryProviderRequest request,
        io.grpc.stub.StreamObserver<sentinel.provider.v2.Querier.QueryProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryParams(sentinel.provider.v2.Querier.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<sentinel.provider.v2.Querier.QueryParamsResponse> responseObserver) {
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
    public sentinel.provider.v2.Querier.QueryProvidersResponse queryProviders(sentinel.provider.v2.Querier.QueryProvidersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryProvidersMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentinel.provider.v2.Querier.QueryProviderResponse queryProvider(sentinel.provider.v2.Querier.QueryProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentinel.provider.v2.Querier.QueryParamsResponse queryParams(sentinel.provider.v2.Querier.QueryParamsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<sentinel.provider.v2.Querier.QueryProvidersResponse> queryProviders(
        sentinel.provider.v2.Querier.QueryProvidersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryProvidersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.provider.v2.Querier.QueryProviderResponse> queryProvider(
        sentinel.provider.v2.Querier.QueryProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentinel.provider.v2.Querier.QueryParamsResponse> queryParams(
        sentinel.provider.v2.Querier.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_PROVIDERS = 0;
  private static final int METHODID_QUERY_PROVIDER = 1;
  private static final int METHODID_QUERY_PARAMS = 2;

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
        case METHODID_QUERY_PROVIDERS:
          serviceImpl.queryProviders((sentinel.provider.v2.Querier.QueryProvidersRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.provider.v2.Querier.QueryProvidersResponse>) responseObserver);
          break;
        case METHODID_QUERY_PROVIDER:
          serviceImpl.queryProvider((sentinel.provider.v2.Querier.QueryProviderRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.provider.v2.Querier.QueryProviderResponse>) responseObserver);
          break;
        case METHODID_QUERY_PARAMS:
          serviceImpl.queryParams((sentinel.provider.v2.Querier.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<sentinel.provider.v2.Querier.QueryParamsResponse>) responseObserver);
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
          getQueryProvidersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.provider.v2.Querier.QueryProvidersRequest,
              sentinel.provider.v2.Querier.QueryProvidersResponse>(
                service, METHODID_QUERY_PROVIDERS)))
        .addMethod(
          getQueryProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.provider.v2.Querier.QueryProviderRequest,
              sentinel.provider.v2.Querier.QueryProviderResponse>(
                service, METHODID_QUERY_PROVIDER)))
        .addMethod(
          getQueryParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sentinel.provider.v2.Querier.QueryParamsRequest,
              sentinel.provider.v2.Querier.QueryParamsResponse>(
                service, METHODID_QUERY_PARAMS)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sentinel.provider.v2.Querier.getDescriptor();
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
              .addMethod(getQueryProvidersMethod())
              .addMethod(getQueryProviderMethod())
              .addMethod(getQueryParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
