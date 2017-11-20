package com.ecreditpal.chain.bare.common.serialize;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

/**
 * @author lifeng
 * @version 1.0 on 2017/10/9.
 */
public class JsonUtil {
    private static Gson gson = new Gson();

    public static String toJson(Object obj) {
        if (obj == null) return null;
        return JSON.toJSONString(obj, SerializerFeature.WriteDateUseDateFormat);
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        if (json == null) return null;
       return JSON.parseObject(json,clazz);
    }

    /**
     * 将json转换为map
     * @param json json字符串
     * @param typeReference new TypeReference<Map<K,V>>() {}
     * @param <K> key
     * @param <V> value
     * @return
     */
    public static <K,V> Map<K, V> json2Map(String json,TypeReference<Map<K,V>> typeReference) {
        return JSON.parseObject(json, typeReference);
    }

    public static <T> List<T> json2Array(String json,TypeReference<List<T>> typeReference) {
        return JSON.parseObject(json,typeReference);
    }

}
