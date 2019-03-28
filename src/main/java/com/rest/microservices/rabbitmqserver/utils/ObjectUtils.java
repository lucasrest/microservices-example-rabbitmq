package com.rest.microservices.rabbitmqserver.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;

public class ObjectUtils {


    @SneakyThrows
    public static String objectToJson(Object object) {
        ObjectMapper mapper = getMapper();
        mapper.writeValue(new File("target/object.json"), object);
        return mapper.writeValueAsString(object);
    }

    @SneakyThrows
    public static <T> T jsonToObject(String json, T object) {
        ObjectMapper mapper = getMapper();
        return mapper.readValue(json, new TypeReference<T>() {
        });
    }

    private static ObjectMapper getMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }
}
