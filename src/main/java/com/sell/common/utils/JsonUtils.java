package com.sell.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author WangWei
 * @Title: JsonUtils
 * @ProjectName common
 * @date 2018/12/13 15:29
 * @description:
 */
public class JsonUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 对象转为json字符串
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        }catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * json 转为对象
     * @param content
     * @param classType
     * @return
     */
    public static Object fromJson(String content, Class classType) {
        try {
            return objectMapper.readValue(content, classType);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     *  json 转换为对象
     * @param content
     * @param typeReference
     * @return
     */
    public static Object fromJson(String content, TypeReference typeReference) {
        try {
            return objectMapper.readValue(content, typeReference);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
