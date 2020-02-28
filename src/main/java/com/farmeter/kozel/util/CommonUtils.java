package com.farmeter.kozel.util;

import lombok.Getter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author jung.mh (jung.mh@navercorp.com)
 */
public class CommonUtils {
    private static ObjectMapper mapper = new ObjectMapper();

    public static String toJson(Object object) {
        try {
            return object == null ? mapper.writeValueAsString(object) : null;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
