package com.xiaohongshu.fls.opensdk.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.exception.OpenSdkErrorCode;
import com.xiaohongshu.fls.opensdk.exception.OpenSdkException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import okhttp3.OkHttpClient;

public class Utils {
   public static final ObjectMapper objectMapper = new ObjectMapper();
   public static final OkHttpClient okHttpClient;

   public static <T> T objectFromJSONStr(String str, Class<T> type) {
      if (str != null && str.length() != 0) {
         try {
            return (T)objectMapper.readValue(str, type);
         } catch (Exception var3) {
            return null;
         }
      } else {
         return null;
      }
   }

   public static void addSign(BaseRequest request, String appSecret) {
      if (request.getVersion() != null && request.getTimestamp() != null && request.getAppId() != null && request.getMethod() != null && appSecret != null) {
         List<String> paramList = new ArrayList();
         paramList.add("appId=" + request.getAppId());
         paramList.add("timestamp=" + request.getTimestamp());
         paramList.add("version=" + request.getVersion());
         String method = request.getMethod();
         String queryStr = (String)sortQueryParams(paramList).stream().collect(Collectors.joining("&"));
         String signDecode = method + "?" + queryStr + appSecret;
         String md5 = encodeByMD5(signDecode);
         request.setSign(md5);
      } else {
         throw new OpenSdkException(OpenSdkErrorCode.getByCode(11), "参数缺失");
      }
   }

   private static List<String> sortQueryParams(List<String> paramList) {
      paramList.sort(new Comparator<String>() {
         public int compare(String o1, String o2) {
            String s1 = o1.toLowerCase();
            String s2 = o2.toLowerCase();
            return s1.compareTo(s2);
         }
      });
      return paramList;
   }

   public static String encodeByMD5(String originString) {
      if (originString != null) {
         try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(originString.getBytes());
            byte[] digest = md.digest();
            StringBuffer sb = new StringBuffer();

            for(byte b : digest) {
               sb.append(String.format("%02x", b & 255));
            }

            return sb.toString();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

      return null;
   }

   static {
      objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      okHttpClient = (new OkHttpClient.Builder()).readTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS).connectTimeout(5L, TimeUnit.SECONDS).retryOnConnectionFailure(true).build();
   }
}
