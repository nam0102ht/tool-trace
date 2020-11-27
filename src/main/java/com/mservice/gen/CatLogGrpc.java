package com.mservice.gen;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: log.proto")
public final class CatLogGrpc {

  private CatLogGrpc() {}

  private static <T> io.grpc.stub.StreamObserver<T> toObserver(final io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) {
    return new io.grpc.stub.StreamObserver<T>() {
      private volatile boolean resolved = false;
      @Override
      public void onNext(T value) {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.succeededFuture(value));
        }
      }

      @Override
      public void onError(Throwable t) {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.failedFuture(t));
        }
      }

      @Override
      public void onCompleted() {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.succeededFuture());
        }
      }
    };
  }

  public static final String SERVICE_NAME = "com.mservice.gen.CatLog";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand148Method;

  public static io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand148Method() {
    io.grpc.MethodDescriptor<com.mservice.gen.Command, com.mservice.gen.Log> getCommand148Method;
    if ((getCommand148Method = CatLogGrpc.getCommand148Method) == null) {
      synchronized (CatLogGrpc.class) {
        if ((getCommand148Method = CatLogGrpc.getCommand148Method) == null) {
          CatLogGrpc.getCommand148Method = getCommand148Method = 
              io.grpc.MethodDescriptor.<com.mservice.gen.Command, com.mservice.gen.Log>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.mservice.gen.CatLog", "Command148"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Command.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Log.getDefaultInstance()))
                  .setSchemaDescriptor(new CatLogMethodDescriptorSupplier("Command148"))
                  .build();
          }
        }
     }
     return getCommand148Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand218Method;

  public static io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand218Method() {
    io.grpc.MethodDescriptor<com.mservice.gen.Command, com.mservice.gen.Log> getCommand218Method;
    if ((getCommand218Method = CatLogGrpc.getCommand218Method) == null) {
      synchronized (CatLogGrpc.class) {
        if ((getCommand218Method = CatLogGrpc.getCommand218Method) == null) {
          CatLogGrpc.getCommand218Method = getCommand218Method = 
              io.grpc.MethodDescriptor.<com.mservice.gen.Command, com.mservice.gen.Log>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.mservice.gen.CatLog", "Command218"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Command.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Log.getDefaultInstance()))
                  .setSchemaDescriptor(new CatLogMethodDescriptorSupplier("Command218"))
                  .build();
          }
        }
     }
     return getCommand218Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand232Method;

  public static io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand232Method() {
    io.grpc.MethodDescriptor<com.mservice.gen.Command, com.mservice.gen.Log> getCommand232Method;
    if ((getCommand232Method = CatLogGrpc.getCommand232Method) == null) {
      synchronized (CatLogGrpc.class) {
        if ((getCommand232Method = CatLogGrpc.getCommand232Method) == null) {
          CatLogGrpc.getCommand232Method = getCommand232Method = 
              io.grpc.MethodDescriptor.<com.mservice.gen.Command, com.mservice.gen.Log>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.mservice.gen.CatLog", "Command232"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Command.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Log.getDefaultInstance()))
                  .setSchemaDescriptor(new CatLogMethodDescriptorSupplier("Command232"))
                  .build();
          }
        }
     }
     return getCommand232Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand108Method;

  public static io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand108Method() {
    io.grpc.MethodDescriptor<com.mservice.gen.Command, com.mservice.gen.Log> getCommand108Method;
    if ((getCommand108Method = CatLogGrpc.getCommand108Method) == null) {
      synchronized (CatLogGrpc.class) {
        if ((getCommand108Method = CatLogGrpc.getCommand108Method) == null) {
          CatLogGrpc.getCommand108Method = getCommand108Method = 
              io.grpc.MethodDescriptor.<com.mservice.gen.Command, com.mservice.gen.Log>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.mservice.gen.CatLog", "Command108"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Command.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Log.getDefaultInstance()))
                  .setSchemaDescriptor(new CatLogMethodDescriptorSupplier("Command108"))
                  .build();
          }
        }
     }
     return getCommand108Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand102Method;

  public static io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand102Method() {
    io.grpc.MethodDescriptor<com.mservice.gen.Command, com.mservice.gen.Log> getCommand102Method;
    if ((getCommand102Method = CatLogGrpc.getCommand102Method) == null) {
      synchronized (CatLogGrpc.class) {
        if ((getCommand102Method = CatLogGrpc.getCommand102Method) == null) {
          CatLogGrpc.getCommand102Method = getCommand102Method = 
              io.grpc.MethodDescriptor.<com.mservice.gen.Command, com.mservice.gen.Log>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.mservice.gen.CatLog", "Command102"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Command.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Log.getDefaultInstance()))
                  .setSchemaDescriptor(new CatLogMethodDescriptorSupplier("Command102"))
                  .build();
          }
        }
     }
     return getCommand102Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand12Method;

  public static io.grpc.MethodDescriptor<com.mservice.gen.Command,
      com.mservice.gen.Log> getCommand12Method() {
    io.grpc.MethodDescriptor<com.mservice.gen.Command, com.mservice.gen.Log> getCommand12Method;
    if ((getCommand12Method = CatLogGrpc.getCommand12Method) == null) {
      synchronized (CatLogGrpc.class) {
        if ((getCommand12Method = CatLogGrpc.getCommand12Method) == null) {
          CatLogGrpc.getCommand12Method = getCommand12Method = 
              io.grpc.MethodDescriptor.<com.mservice.gen.Command, com.mservice.gen.Log>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.mservice.gen.CatLog", "Command12"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Command.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mservice.gen.Log.getDefaultInstance()))
                  .setSchemaDescriptor(new CatLogMethodDescriptorSupplier("Command12"))
                  .build();
          }
        }
     }
     return getCommand12Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CatLogStub newStub(io.grpc.Channel channel) {
    return new CatLogStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CatLogBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CatLogBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CatLogFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CatLogFutureStub(channel);
  }

  /**
   * Creates a new vertx stub that supports all call types for the service
   */
  public static CatLogVertxStub newVertxStub(io.grpc.Channel channel) {
    return new CatLogVertxStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class CatLogImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a command get log 148
     * </pre>
     */
    public void command148(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncUnimplementedUnaryCall(getCommand148Method(), responseObserver);
    }

    /**
     * <pre>
     * Sends a command get log 218
     * </pre>
     */
    public void command218(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncUnimplementedUnaryCall(getCommand218Method(), responseObserver);
    }

    /**
     * <pre>
     * Sends a command get log 232
     * </pre>
     */
    public void command232(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncUnimplementedUnaryCall(getCommand232Method(), responseObserver);
    }

    /**
     * <pre>
     * Send a command get log 108
     * </pre>
     */
    public void command108(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncUnimplementedUnaryCall(getCommand108Method(), responseObserver);
    }

    /**
     * <pre>
     * Send a command get log 102
     * </pre>
     */
    public void command102(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncUnimplementedUnaryCall(getCommand102Method(), responseObserver);
    }

    /**
     * <pre>
     * Send a command get log 13.12
     * </pre>
     */
    public void command12(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncUnimplementedUnaryCall(getCommand12Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCommand148Method(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND148)))
          .addMethod(
            getCommand218Method(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND218)))
          .addMethod(
            getCommand232Method(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND232)))
          .addMethod(
            getCommand108Method(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND108)))
          .addMethod(
            getCommand102Method(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND102)))
          .addMethod(
            getCommand12Method(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND12)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CatLogStub extends io.grpc.stub.AbstractStub<CatLogStub> {
    public CatLogStub(io.grpc.Channel channel) {
      super(channel);
    }

    public CatLogStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatLogStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatLogStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a command get log 148
     * </pre>
     */
    public void command148(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCommand148Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends a command get log 218
     * </pre>
     */
    public void command218(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCommand218Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends a command get log 232
     * </pre>
     */
    public void command232(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCommand232Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a command get log 108
     * </pre>
     */
    public void command108(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCommand108Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a command get log 102
     * </pre>
     */
    public void command102(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCommand102Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a command get log 13.12
     * </pre>
     */
    public void command12(com.mservice.gen.Command request,
        io.grpc.stub.StreamObserver<com.mservice.gen.Log> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCommand12Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CatLogBlockingStub extends io.grpc.stub.AbstractStub<CatLogBlockingStub> {
    public CatLogBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    public CatLogBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatLogBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatLogBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a command get log 148
     * </pre>
     */
    public java.util.Iterator<com.mservice.gen.Log> command148(
        com.mservice.gen.Command request) {
      return blockingServerStreamingCall(
          getChannel(), getCommand148Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends a command get log 218
     * </pre>
     */
    public java.util.Iterator<com.mservice.gen.Log> command218(
        com.mservice.gen.Command request) {
      return blockingServerStreamingCall(
          getChannel(), getCommand218Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends a command get log 232
     * </pre>
     */
    public java.util.Iterator<com.mservice.gen.Log> command232(
        com.mservice.gen.Command request) {
      return blockingServerStreamingCall(
          getChannel(), getCommand232Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a command get log 108
     * </pre>
     */
    public java.util.Iterator<com.mservice.gen.Log> command108(
        com.mservice.gen.Command request) {
      return blockingServerStreamingCall(
          getChannel(), getCommand108Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a command get log 102
     * </pre>
     */
    public java.util.Iterator<com.mservice.gen.Log> command102(
        com.mservice.gen.Command request) {
      return blockingServerStreamingCall(
          getChannel(), getCommand102Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a command get log 13.12
     * </pre>
     */
    public java.util.Iterator<com.mservice.gen.Log> command12(
        com.mservice.gen.Command request) {
      return blockingServerStreamingCall(
          getChannel(), getCommand12Method(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CatLogFutureStub extends io.grpc.stub.AbstractStub<CatLogFutureStub> {
    public CatLogFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    public CatLogFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatLogFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatLogFutureStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class CatLogVertxImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a command get log 148
     * </pre>
     */
    public void command148(com.mservice.gen.Command request,
        io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log> response) {
      asyncUnimplementedUnaryCall(getCommand148Method(), response.writeObserver());
    }

    /**
     * <pre>
     * Sends a command get log 218
     * </pre>
     */
    public void command218(com.mservice.gen.Command request,
        io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log> response) {
      asyncUnimplementedUnaryCall(getCommand218Method(), response.writeObserver());
    }

    /**
     * <pre>
     * Sends a command get log 232
     * </pre>
     */
    public void command232(com.mservice.gen.Command request,
        io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log> response) {
      asyncUnimplementedUnaryCall(getCommand232Method(), response.writeObserver());
    }

    /**
     * <pre>
     * Send a command get log 108
     * </pre>
     */
    public void command108(com.mservice.gen.Command request,
        io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log> response) {
      asyncUnimplementedUnaryCall(getCommand108Method(), response.writeObserver());
    }

    /**
     * <pre>
     * Send a command get log 102
     * </pre>
     */
    public void command102(com.mservice.gen.Command request,
        io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log> response) {
      asyncUnimplementedUnaryCall(getCommand102Method(), response.writeObserver());
    }

    /**
     * <pre>
     * Send a command get log 13.12
     * </pre>
     */
    public void command12(com.mservice.gen.Command request,
        io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log> response) {
      asyncUnimplementedUnaryCall(getCommand12Method(), response.writeObserver());
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCommand148Method(),
            asyncServerStreamingCall(
              new VertxMethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND148)))
          .addMethod(
            getCommand218Method(),
            asyncServerStreamingCall(
              new VertxMethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND218)))
          .addMethod(
            getCommand232Method(),
            asyncServerStreamingCall(
              new VertxMethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND232)))
          .addMethod(
            getCommand108Method(),
            asyncServerStreamingCall(
              new VertxMethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND108)))
          .addMethod(
            getCommand102Method(),
            asyncServerStreamingCall(
              new VertxMethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND102)))
          .addMethod(
            getCommand12Method(),
            asyncServerStreamingCall(
              new VertxMethodHandlers<
                com.mservice.gen.Command,
                com.mservice.gen.Log>(
                  this, METHODID_COMMAND12)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CatLogVertxStub extends io.grpc.stub.AbstractStub<CatLogVertxStub> {
    public CatLogVertxStub(io.grpc.Channel channel) {
      super(channel);
    }

    public CatLogVertxStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatLogVertxStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatLogVertxStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a command get log 148
     * </pre>
     */
    public void command148(com.mservice.gen.Command request,
        io.vertx.core.Handler<io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log>> handler) {
      final io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log> readStream =
          io.vertx.grpc.GrpcReadStream.<com.mservice.gen.Log>create();

      handler.handle(readStream);
      asyncServerStreamingCall(
          getChannel().newCall(getCommand148Method(), getCallOptions()), request, readStream.readObserver());
    }

    /**
     * <pre>
     * Sends a command get log 218
     * </pre>
     */
    public void command218(com.mservice.gen.Command request,
        io.vertx.core.Handler<io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log>> handler) {
      final io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log> readStream =
          io.vertx.grpc.GrpcReadStream.<com.mservice.gen.Log>create();

      handler.handle(readStream);
      asyncServerStreamingCall(
          getChannel().newCall(getCommand218Method(), getCallOptions()), request, readStream.readObserver());
    }

    /**
     * <pre>
     * Sends a command get log 232
     * </pre>
     */
    public void command232(com.mservice.gen.Command request,
        io.vertx.core.Handler<io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log>> handler) {
      final io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log> readStream =
          io.vertx.grpc.GrpcReadStream.<com.mservice.gen.Log>create();

      handler.handle(readStream);
      asyncServerStreamingCall(
          getChannel().newCall(getCommand232Method(), getCallOptions()), request, readStream.readObserver());
    }

    /**
     * <pre>
     * Send a command get log 108
     * </pre>
     */
    public void command108(com.mservice.gen.Command request,
        io.vertx.core.Handler<io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log>> handler) {
      final io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log> readStream =
          io.vertx.grpc.GrpcReadStream.<com.mservice.gen.Log>create();

      handler.handle(readStream);
      asyncServerStreamingCall(
          getChannel().newCall(getCommand108Method(), getCallOptions()), request, readStream.readObserver());
    }

    /**
     * <pre>
     * Send a command get log 102
     * </pre>
     */
    public void command102(com.mservice.gen.Command request,
        io.vertx.core.Handler<io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log>> handler) {
      final io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log> readStream =
          io.vertx.grpc.GrpcReadStream.<com.mservice.gen.Log>create();

      handler.handle(readStream);
      asyncServerStreamingCall(
          getChannel().newCall(getCommand102Method(), getCallOptions()), request, readStream.readObserver());
    }

    /**
     * <pre>
     * Send a command get log 13.12
     * </pre>
     */
    public void command12(com.mservice.gen.Command request,
        io.vertx.core.Handler<io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log>> handler) {
      final io.vertx.grpc.GrpcReadStream<com.mservice.gen.Log> readStream =
          io.vertx.grpc.GrpcReadStream.<com.mservice.gen.Log>create();

      handler.handle(readStream);
      asyncServerStreamingCall(
          getChannel().newCall(getCommand12Method(), getCallOptions()), request, readStream.readObserver());
    }
  }

  private static final int METHODID_COMMAND148 = 0;
  private static final int METHODID_COMMAND218 = 1;
  private static final int METHODID_COMMAND232 = 2;
  private static final int METHODID_COMMAND108 = 3;
  private static final int METHODID_COMMAND102 = 4;
  private static final int METHODID_COMMAND12 = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CatLogImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CatLogImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMAND148:
          serviceImpl.command148((com.mservice.gen.Command) request,
              (io.grpc.stub.StreamObserver<com.mservice.gen.Log>) responseObserver);
          break;
        case METHODID_COMMAND218:
          serviceImpl.command218((com.mservice.gen.Command) request,
              (io.grpc.stub.StreamObserver<com.mservice.gen.Log>) responseObserver);
          break;
        case METHODID_COMMAND232:
          serviceImpl.command232((com.mservice.gen.Command) request,
              (io.grpc.stub.StreamObserver<com.mservice.gen.Log>) responseObserver);
          break;
        case METHODID_COMMAND108:
          serviceImpl.command108((com.mservice.gen.Command) request,
              (io.grpc.stub.StreamObserver<com.mservice.gen.Log>) responseObserver);
          break;
        case METHODID_COMMAND102:
          serviceImpl.command102((com.mservice.gen.Command) request,
              (io.grpc.stub.StreamObserver<com.mservice.gen.Log>) responseObserver);
          break;
        case METHODID_COMMAND12:
          serviceImpl.command12((com.mservice.gen.Command) request,
              (io.grpc.stub.StreamObserver<com.mservice.gen.Log>) responseObserver);
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

  private static final class VertxMethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CatLogVertxImplBase serviceImpl;
    private final int methodId;

    VertxMethodHandlers(CatLogVertxImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMAND148:
          serviceImpl.command148((com.mservice.gen.Command) request,
              (io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log>) io.vertx.grpc.GrpcWriteStream.create(responseObserver));
          break;
        case METHODID_COMMAND218:
          serviceImpl.command218((com.mservice.gen.Command) request,
              (io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log>) io.vertx.grpc.GrpcWriteStream.create(responseObserver));
          break;
        case METHODID_COMMAND232:
          serviceImpl.command232((com.mservice.gen.Command) request,
              (io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log>) io.vertx.grpc.GrpcWriteStream.create(responseObserver));
          break;
        case METHODID_COMMAND108:
          serviceImpl.command108((com.mservice.gen.Command) request,
              (io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log>) io.vertx.grpc.GrpcWriteStream.create(responseObserver));
          break;
        case METHODID_COMMAND102:
          serviceImpl.command102((com.mservice.gen.Command) request,
              (io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log>) io.vertx.grpc.GrpcWriteStream.create(responseObserver));
          break;
        case METHODID_COMMAND12:
          serviceImpl.command12((com.mservice.gen.Command) request,
              (io.vertx.grpc.GrpcWriteStream<com.mservice.gen.Log>) io.vertx.grpc.GrpcWriteStream.create(responseObserver));
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

  private static abstract class CatLogBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CatLogBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mservice.gen.GrpcServer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CatLog");
    }
  }

  private static final class CatLogFileDescriptorSupplier
      extends CatLogBaseDescriptorSupplier {
    CatLogFileDescriptorSupplier() {}
  }

  private static final class CatLogMethodDescriptorSupplier
      extends CatLogBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CatLogMethodDescriptorSupplier(String methodName) {
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
      synchronized (CatLogGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CatLogFileDescriptorSupplier())
              .addMethod(getCommand148Method())
              .addMethod(getCommand218Method())
              .addMethod(getCommand232Method())
              .addMethod(getCommand108Method())
              .addMethod(getCommand102Method())
              .addMethod(getCommand12Method())
              .build();
        }
      }
    }
    return result;
  }
}
