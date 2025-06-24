package com.jd.open.api.sdk.internal.util;

import java.security.MessageDigest;

public final class CodecUtil {
   private CodecUtil() {
      throw new UnsupportedOperationException();
   }

   public static String sign(String source, String sign_method) throws Exception {
      MessageDigest md = MessageDigest.getInstance(sign_method == null ? "MD5" : sign_method);
      byte[] bytes = md.digest(source.getBytes("utf-8"));
      return byte2hex(bytes);
   }

   private static String byte2hex(byte[] bytes) {
      StringBuilder sign = new StringBuilder();

      for(int i = 0; i < bytes.length; ++i) {
         String hex = Integer.toHexString(bytes[i] & 255);
         if (hex.length() == 1) {
            sign.append("0");
         }

         sign.append(hex.toUpperCase());
      }

      return sign.toString();
   }
}
