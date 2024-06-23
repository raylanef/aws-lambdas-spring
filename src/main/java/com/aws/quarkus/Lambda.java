package com.aws.quarkus;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import jakarta.inject.Named;


@Named("Lambda")
public class Lambda implements RequestHandler<Request, Response> {
    private final LambdaHandler handler;
    public Lambda(LambdaHandler handler) {
        this.handler = handler;
    }

    @Override
    public Response handleRequest(Request payload, Context context) {
        return handler.apply(payload);
    }
}
