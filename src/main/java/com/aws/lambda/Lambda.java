package com.aws.lambda;

import java.util.Map;
import java.util.function.Function;

public class Lambda implements Function<Map<String, String>, String> {

    @Override
    public String apply(Map<String, String> payload) {
        return payload.get("name");
    }
}
