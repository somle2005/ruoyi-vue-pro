package com.jd.open.api.sdk.internal.util.sign.impl;

import com.jd.open.api.sdk.internal.util.sign.AbstractSign;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class HMacMD5SignImpl extends AbstractSign {
   protected byte[] handler(String secret, String preSignStr) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
      SecretKey secretKey = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacMD5");
      Mac hMac = Mac.getInstance(secretKey.getAlgorithm());
      hMac.init(secretKey);
      return hMac.doFinal(preSignStr.getBytes("UTF-8"));
   }

   protected void appendPrefix(StringBuilder preSignStr, String secret) {
   }

   protected void appendSuffix(StringBuilder preSignStr, String secret) {
   }
}
