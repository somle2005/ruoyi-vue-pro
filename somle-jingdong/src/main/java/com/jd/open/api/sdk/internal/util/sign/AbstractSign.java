package com.jd.open.api.sdk.internal.util.sign;

import com.jd.open.api.sdk.internal.util.StringUtil;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

public abstract class AbstractSign implements Sign {
   public String calculateSignature(String secret, Map<String, String> paramMap) {
      try {
         return byte2hex(this.handler(secret, this.buildPreSignStr(paramMap, secret)));
      } catch (Exception var4) {
         throw new RuntimeException("sign error !");
      }
   }

   protected abstract byte[] handler(String var1, String var2) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException;

   protected abstract void appendPrefix(StringBuilder var1, String var2);

   protected abstract void appendSuffix(StringBuilder var1, String var2);

   private String buildPreSignStr(Map<String, String> paramMap, String secret) {
      return this.signature4Jos(paramMap, secret);
   }

   protected String signature4Jos(Map<String, String> paramsMap, String secret) {
      StringBuilder preSignStr = new StringBuilder();
      this.appendPrefix(preSignStr, secret);

      for(Map.Entry<String, String> entry : paramsMap.entrySet()) {
         String name = (String)entry.getKey();
         String value = (String)entry.getValue();
         if (StringUtil.areNotEmpty(name, value)) {
            preSignStr.append(name).append(value);
         }
      }

      this.appendSuffix(preSignStr, secret);
      return preSignStr.toString();
   }

   private static String byte2hex(byte[] b) {
      StringBuffer hs = new StringBuffer();
      String stmp = "";

      for(int n = 0; n < b.length; ++n) {
         stmp = Integer.toHexString(b[n] & 255);
         if (stmp.length() == 1) {
            hs.append("0").append(stmp);
         } else {
            hs.append(stmp);
         }
      }

      return hs.toString().toUpperCase();
   }
}
