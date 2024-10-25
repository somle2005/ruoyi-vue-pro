package com.somle.kingdee.util;

import com.somle.kingdee.model.KingdeeToken;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.springframework.http.HttpHeaders;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @className: SignatureUtils
 * @author: Wqh
 * @date: 2024/10/23 15:01
 * @Version: 1.0
 * @description: 签名工具类
 */
public class SignatureUtils {
    private SignatureUtils(){}
    public static final String GET = "GET";
    public static final String POST = "POST";
    private final static String HMACSHA256 = "HmacSHA256";
    private static final String CLIENT_SECRET = "b5639a677545e611a297d6537f2b444c";
    public static final String CLIENT_ID = "240474";
    public static final String BASE_HOST = "https://api.kingdee.com";
    public static final String PUR_REQUEST = "/jdy/v2/scm/pur_request";







    public static byte[] hmac256(String secret, String data) {
        try {
            // Create a new SecretKeySpec
            SecretKeySpec secretKeySpec = new SecretKeySpec(secret.getBytes(), HMACSHA256);
            // Get an instance of Mac and initialize with the secret key
            Mac mac = Mac.getInstance(HMACSHA256);
            mac.init(secretKeySpec);
            // Compute the HMAC SHA-256
            return mac.doFinal(data.getBytes());
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate HMACSHA256", e);
        }
    }

    public static String urlEncode(String str) {
        // log.debug(str);
        return URLEncoder.encode(str, StandardCharsets.UTF_8);
    }

//    请求方式（POST、GET、DELETE等均为大写）
//    请求地址的path部分（示例：https://api.kingdee.com/jdyconnector/app_management/kingdee_auth_token，取红色部分，进行url编码）
//    params请求参数（进行两次url编码（编码后字母应是大写，下同），加密时按参数名ASCII码升序顺序进行排序，实际请求参数顺序必须一致）
//    headers请求参数（只需要x-api-nonce、x-api-timestamp参与加密，必须小写）
//    拼接得到签名原文，每段签名字符拼接均需要换行符（x-api-timestamp时间戳后需要换行符）
    public static String getApiString(String reqMtd, String urlPath, Map<String, String> params, String nonce,
                                      String timestamp) {
        String paramsStr = params.entrySet()
                .stream()
                .map(entry -> entry.getKey() + "=" + urlEncode(urlEncode(entry.getValue())))
                .collect(Collectors.joining("&"));
        return String.format("%s\n%s\n%s\nx-api-nonce:%s\nx-api-timestamp:%s\n",
                reqMtd, urlEncode(urlPath), paramsStr, nonce, timestamp);
    }

    public static String getApiSignature(String reqMtd, String urlPath, Map<String, String> params, String timestamp) {
        return getApiSignature(reqMtd, urlPath, params, timestamp, timestamp);
    }

    public static String getApiSignature(String reqMtd, String urlPath, Map<String, String> params, String nonce,
                                         String timestamp) {
        String apiString = getApiString(reqMtd, urlPath, params, nonce, timestamp);
        String apiStringToHmac256EnHex = Hex.encodeHexString(hmac256(CLIENT_SECRET, apiString));
        return Base64.encodeBase64String(apiStringToHmac256EnHex.getBytes());
    }

    public static String getAppSignature(KingdeeToken token) {
        String appSecret = token.getAppSecret();
        String appKey = token.getAppKey();
        String appKeyToHmac256EnHex = Hex.encodeHexString(hmac256(appSecret, appKey));
        return Base64.encodeBase64String(appKeyToHmac256EnHex.getBytes());
    }

    public static Map<String,String> getAuthHeaders(String ctime, String apiSignature) {
        return Map.of(
                "Content-Type", "application/json",
                "X-Api-Auth-Version", "2.0",
                "X-Api-ClientID", CLIENT_ID,
                "X-Api-Nonce", ctime,
                "X-Api-SignHeaders", "X-Api-TimeStamp,X-Api-Nonce",
                "X-Api-Signature", apiSignature,
                "X-Api-TimeStamp", ctime
        );
    }

    public static Map<String,String> getApiHeaders(String cts , String signature,String appToken) {
        return Map.of(
                "Content-Type", "application/json;charset=utf-8",
                "X-Api-ClientID", CLIENT_ID,
                "X-Api-Auth-Version", "2.0",
                "X-Api-TimeStamp", cts,
                "X-Api-SignHeaders", "X-Api-TimeStamp,X-Api-Nonce",
                "X-Api-Nonce", cts,
                "X-Api-Signature", signature,
                "app-token", appToken,
                "X-GW-Router-Addr", "https://tf.jdy.com"
        );
    }

    public static HttpHeaders getAuthRestHeaders(String ctime,String apiSignature) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("X-Api-Auth-Version", "2.0");
        headers.set("X-Api-ClientID", CLIENT_ID);
        headers.set("X-Api-Nonce", ctime);
        headers.set("X-Api-SignHeaders", "X-Api-TimeStamp,X-Api-Nonce");
        headers.set("X-Api-Signature", apiSignature);
        headers.set("X-Api-TimeStamp", ctime);
        return headers;
    }


    public static HttpHeaders getApiRestHeaders(String ctime,String signature,String appToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("X-Api-ClientID", CLIENT_ID);
        headers.set("X-Api-Auth-Version", "2.0");
        headers.set("X-Api-TimeStamp", ctime);
        headers.set("X-Api-SignHeaders", "X-Api-TimeStamp,X-Api-Nonce");
        headers.set("X-Api-Nonce", ctime);
        headers.set("X-Api-Signature", signature);
        headers.set("app-token", appToken);
        headers.set("X-GW-Router-Addr", "https://tf.jdy.com");
        return headers;
    }

}
