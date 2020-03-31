package com.farmeter.kozel.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author jung.mh (jung.mh@navercorp.com)
 */
public class CommonUtils {
    private static ObjectMapper mapper = new ObjectMapper();

    public static String toJson(Object object) {
        //FIXME
//        try {
//            return object != null ? mapper.writeValueAsString(object) : null;
//        } catch (JsonProcessingException e) {
//            log.error("CommonUtils.mapper error : {}", e.getMessage());
//        }
        return null;
    }
}
