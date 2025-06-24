package com.jd.open.api.sdk.internal.util.sign.impl;

import com.jd.open.api.sdk.internal.util.sign.AbstractSign;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HMacSha256SignImpl extends AbstractSign {
   protected byte[] handler(String secret, String preSignStr) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
      SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
      Mac sha256HMAC = Mac.getInstance(secretKey.getAlgorithm());
      sha256HMAC.init(secretKey);
      return sha256HMAC.doFinal(preSignStr.getBytes());
   }

   protected void appendPrefix(StringBuilder preSignStr, String secret) {
   }

   protected void appendSuffix(StringBuilder preSignStr, String secret) {
   }
}
