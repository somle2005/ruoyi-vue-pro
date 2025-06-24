package com.jd.security.tde;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class KeyDerivation {
   public static byte[] kdf(SecretKeySpec key, String identifier, int version) throws NoSuchAlgorithmException, InvalidKeyException, IllegalStateException, MalformedException {
      if (version < 0) {
         throw new MalformedException("key version should be zero or positive number");
      } else {
         String id = identifier + ":" + version;
         Mac mac = Mac.getInstance("HmacSHA256");
         mac.init(key);
         return mac.doFinal(id.getBytes());
      }
   }

   public static byte[] keyid(String identifier, int version) throws NoSuchAlgorithmException, MalformedException {
      if (version < 0) {
         throw new MalformedException("key version should be zero or positive number");
      } else {
         String id = identifier + ":" + version;
         MessageDigest md = MessageDigest.getInstance("MD5");
         return md.digest(id.getBytes());
      }
   }
}
