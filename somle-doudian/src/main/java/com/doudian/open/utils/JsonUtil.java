package com.doudian.open.utils;


import com.doudian.open.gson.*;

public class JsonUtil {

    private static final Gson GSON = new GsonBuilder().create();
    private static final Gson GSON_WITH_NULL = new GsonBuilder().serializeNulls().create();

    public static String toJson(Object obj) {
        return GSON.toJson(obj);
    }

    public static String toJsonWithNull(Object obj){
        return GSON_WITH_NULL.toJson(obj);
    }

    public static <T> T fromJson(String jsonStr, Class<T> clazz)  {
        return GSON.fromJson(jsonStr, clazz);
    }

    public static JsonObject fromJsonAsJsonObject(String jsonStr) {
        return JsonParser.parseString(jsonStr).getAsJsonObject();
    }

    public static JsonArray fromJsonAsJsonArray(String jsonStr) {
        return JsonParser.parseString(jsonStr).getAsJsonArray();
    }
}
