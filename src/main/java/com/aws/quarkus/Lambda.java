package com.aws.quarkus;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import jdk.jfr.Name;

import java.util.Map;

@Name("lambda")
public class Lambda implements RequestHandler<Map<String, String>, String> {

    @Override
    public String handleRequest(Map<String, String> payload, Context context) {
        return payload.get("name");
    }
}
