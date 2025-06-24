package com.doudian.open.utils;

import com.doudian.open.exception.DoudianOpException;
import com.doudian.open.gson.JsonArray;
import com.doudian.open.gson.JsonObject;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class SignUtil {
    private static final Logger LOG = Logger.getLogger(SignUtil.class);
    private static final Integer SIGN_METHOD_MD5 = 1;
    private static final Integer SIGN_METHOD_HMAC_SHA256 = 2;

    public static String sign(String appKey, String appSecret, String method, String timestamp, String paramJson, String v) {
        JsonObject jsonObject = JsonUtil.fromJsonAsJsonObject(paramJson);
        LinkedHashMap<String, Object> sortedMap = sortParamJson(jsonObject);
        String sortedParamStr = null;
        if (sortedMap != null) {
            sortedParamStr = JsonUtil.toJsonWithNull(sortedMap);
        } else {
            sortedParamStr = "{}";
        }
        String signPattern = appSecret+"app_key" + appKey + "method" + method + "param_json" + sortedParamStr +"timestamp" + timestamp +"v2"+appSecret;
        //LOG.info("sign pattern: %s", signPattern);
        return stringToMD5(signPattern);
    }

    public static String spiSign(String appKey, String appSecret, String timestamp, String paramJson, Integer signMethod) {
        String sortedParamStr = "";
        if (StringUtil.isNotEmpty(paramJson)) {
            JsonObject jsonObject = JsonUtil.fromJsonAsJsonObject(paramJson);
            LinkedHashMap<String, Object> sortedMap = sortParamJson(jsonObject);
            if (sortedMap != null) {
                sortedParamStr = JsonUtil.toJsonWithNull(sortedMap);
            }
        }
        String signPattern = appSecret + "app_key" + appKey + "param_json" + sortedParamStr +"timestamp" + timestamp + appSecret;
        if (SIGN_METHOD_HMAC_SHA256.equals(signMethod)) {
            return stringToHmac(signPattern, appSecret);
        }
        return stringToMD5(signPattern);
    }

    private static LinkedHashMap<String, Object> sortParamJson(JsonObject paramJsonObject) {
        if (paramJsonObject == null) {
            return null;
        }
        if (paramJsonObject.size() == 0) {
            return new LinkedHashMap<>();
        }

        List<String> keys = new ArrayList<>(paramJsonObject.keySet());
        Collections.sort(keys);
        LinkedHashMap<String, Object> retMap = new LinkedHashMap<>();
        for (String key : keys) {
            Object valueObj = paramJsonObject.get(key);
            if (valueObj instanceof JsonObject) {
                retMap.put(key, sortParamJson((JsonObject) valueObj));
            } else if(valueObj instanceof JsonArray) {
                JsonArray arrayObj = (JsonArray) valueObj;
                if (arrayObj.size() > 0 && arrayObj.get(0) instanceof JsonObject) {
                    List<LinkedHashMap<String, Object>> newList = new ArrayList<>();
                    for(Object obj : arrayObj) {
                        if (obj instanceof JsonObject) {
                            newList.add(sortParamJson((JsonObject) obj));
                        }
                    }
                    retMap.put(key, newList);
                } else {
                    retMap.put(key, paramJsonObject.get(key));
                }
            }
            else {
                retMap.put(key, paramJsonObject.get(key));
            }
        }
        return retMap;
    }

    public static String stringToMD5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            throw new DoudianOpException(DoudianOpException.Code.CALC_MD5_ERROR, e);
        }
        StringBuilder md5code = new StringBuilder(new BigInteger(1, secretBytes).toString(16));
        while (md5code.length() < 32) {
            md5code.insert(0, "0");
        }
        return md5code.toString();
    }

    public static String stringToHmac(String plainText, String appSecret) {
        Mac mac;
        try {
            byte[] secret = appSecret.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec keySpec = new SecretKeySpec(secret, "HmacSHA256");

            mac = Mac.getInstance("HmacSHA256");
            mac.init(keySpec);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new DoudianOpException(DoudianOpException.Code.CALC_HMAC_ERROR);
        }

        byte[] plainBytes = plainText.getBytes(StandardCharsets.UTF_8);
        byte[] digest = mac.doFinal(plainBytes);
        StringBuilder sb = new StringBuilder();
        for (byte b: digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
