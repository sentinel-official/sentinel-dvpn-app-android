package cosmos.auth.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.3)",
    comments = "Source: cosmos/auth/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.auth.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest,
      cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse> getAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Accounts",
      requestType = cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest.class,
      responseType = cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest,
      cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse> getAccountsMethod() {
    io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest, cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse> getAccountsMethod;
    if ((getAccountsMethod = QueryGrpc.getAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountsMethod = QueryGrpc.getAccountsMethod) == null) {
          QueryGrpc.getAccountsMethod = getAccountsMethod =
              io.grpc.MethodDescriptor.<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest, cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Accounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Accounts"))
              .build();
        }
      }
    }
    return getAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest,
      cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse> getAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Account",
      requestType = cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest.class,
      responseType = cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest,
      cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse> getAccountMethod() {
    io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest, cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse> getAccountMethod;
    if ((getAccountMethod = QueryGrpc.getAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountMethod = QueryGrpc.getAccountMethod) == null) {
          QueryGrpc.getAccountMethod = getAccountMethod =
              io.grpc.MethodDescriptor.<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest, cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Account"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Account"))
              .build();
        }
      }
    }
    return getAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest,
      cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest.class,
      responseType = cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest,
      cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest, cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest, cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest,
      cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse> getModuleAccountByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleAccountByName",
      requestType = cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest.class,
      responseType = cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest,
      cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse> getModuleAccountByNameMethod() {
    io.grpc.MethodDescriptor<cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest, cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse> getModuleAccountByNameMethod;
    if ((getModuleAccountByNameMethod = QueryGrpc.getModuleAccountByNameMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleAccountByNameMethod = QueryGrpc.getModuleAccountByNameMethod) == null) {
          QueryGrpc.getModuleAccountByNameMethod = getModuleAccountByNameMethod =
              io.grpc.MethodDescriptor.<cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest, cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleAccountByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleAccountByName"))
              .build();
        }
      }
    }
    return getModuleAccountByNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Accounts returns all the existing accounts
     * Since: cosmos-sdk 0.43
     * </pre>
     */
    default void accounts(cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest request,
        io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Account returns account details based on address.
     * </pre>
     */
    default void account(cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest request,
        io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    default void params(cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ModuleAccountByName returns the module account info by module name
     * </pre>
     */
    default void moduleAccountByName(cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest request,
        io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleAccountByNameMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accounts returns all the existing accounts
     * Since: cosmos-sdk 0.43
     * </pre>
     */
    public void accounts(cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest request,
        io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Account returns account details based on address.
     * </pre>
     */
    public void account(cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest request,
        io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ModuleAccountByName returns the module account info by module name
     * </pre>
     */
    public void moduleAccountByName(cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest request,
        io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleAccountByNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accounts returns all the existing accounts
     * Since: cosmos-sdk 0.43
     * </pre>
     */
    public cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse accounts(cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Account returns account details based on address.
     * </pre>
     */
    public cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse account(cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse params(cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ModuleAccountByName returns the module account info by module name
     * </pre>
     */
    public cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse moduleAccountByName(cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleAccountByNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accounts returns all the existing accounts
     * Since: cosmos-sdk 0.43
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse> accounts(
        cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Account returns account details based on address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse> account(
        cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse> params(
        cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ModuleAccountByName returns the module account info by module name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse> moduleAccountByName(
        cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleAccountByNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNTS = 0;
  private static final int METHODID_ACCOUNT = 1;
  private static final int METHODID_PARAMS = 2;
  private static final int METHODID_MODULE_ACCOUNT_BY_NAME = 3;

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
        case METHODID_ACCOUNTS:
          serviceImpl.accounts((cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT:
          serviceImpl.account((cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_MODULE_ACCOUNT_BY_NAME:
          serviceImpl.moduleAccountByName((cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse>) responseObserver);
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
          getAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsRequest,
              cosmos.auth.v1beta1.QueryOuterClass.QueryAccountsResponse>(
                service, METHODID_ACCOUNTS)))
        .addMethod(
          getAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest,
              cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse>(
                service, METHODID_ACCOUNT)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.auth.v1beta1.QueryOuterClass.QueryParamsRequest,
              cosmos.auth.v1beta1.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getModuleAccountByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameRequest,
              cosmos.auth.v1beta1.QueryOuterClass.QueryModuleAccountByNameResponse>(
                service, METHODID_MODULE_ACCOUNT_BY_NAME)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmos.auth.v1beta1.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getAccountsMethod())
              .addMethod(getAccountMethod())
              .addMethod(getParamsMethod())
              .addMethod(getModuleAccountByNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
