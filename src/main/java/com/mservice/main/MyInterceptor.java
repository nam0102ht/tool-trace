package com.mservice.main;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;

public class MyInterceptor implements ServerInterceptor {

    @Override
    public <Q, A> ServerCall.Listener<Q> interceptCall(
            ServerCall<Q, A> call, Metadata headers, ServerCallHandler<Q, A> next) {
        // do something hard and update the metadata, for example
        return next.startCall(call, headers);
    }

}