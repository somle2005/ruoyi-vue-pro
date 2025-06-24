package com.jd.open.api.sdk.internal.util.sign.impl;

import com.jd.open.api.sdk.internal.util.sign.AbstractSign;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5SignImpl extends AbstractSign {
   protected byte[] handler(String secret, String preSignStr) throws NoSuchAlgorithmException, UnsupportedEncodingException {
      MessageDigest md5 = MessageDigest.getInstance("MD5");
      return md5.digest(preSignStr.getBytes("utf-8"));
   }

   protected void appendPrefix(StringBuilder preSignStr, String secret) {
      preSignStr.append(secret);
   }

   protected void appendSuffix(StringBuilder preSignStr, String secret) {
      preSignStr.append(secret);
   }
}
