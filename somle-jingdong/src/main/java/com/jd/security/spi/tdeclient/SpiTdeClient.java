package com.jd.security.spi.tdeclient;

import com.jd.security.spi.tde.SpiContents;
import com.jd.security.tde.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SpiTdeClient {
   public static String encrypt(String sSrc, String sKey) throws Exception {
      if (sSrc == null) {
         return null;
      } else if (sKey == null) {
         return null;
      } else {
         byte[] enCodeFormat = getSecretKey(sKey);
         SecretKeySpec skeySpec = new SecretKeySpec(enCodeFormat, SpiContents.SECRET_ALGO_AES);
         IvParameterSpec iv = new IvParameterSpec(SpiContents.CBC_IV_KEY.getBytes());
         Cipher cipher = Cipher.getInstance(SpiContents.SECRET_ALGO_AES_CIPHER);
         cipher.init(1, skeySpec, iv);
         byte[] encrypted = cipher.doFinal(sSrc.getBytes());
         return Base64.encodeToString(encrypted);
      }
   }

   public static String decrypt(String sSrc, String sKey) throws Exception {
      if (sSrc != null && sSrc.length() != 0) {
         if (sKey == null) {
            return sSrc;
         } else {
            try {
               byte[] deCodeFormat = getSecretKey(sKey);
               SecretKeySpec skeySpec = new SecretKeySpec(deCodeFormat, SpiContents.SECRET_ALGO_AES);
               IvParameterSpec iv = new IvParameterSpec(SpiContents.CBC_IV_KEY.getBytes());
               Cipher cipher = Cipher.getInstance(SpiContents.SECRET_ALGO_AES_CIPHER);
               cipher.init(2, skeySpec, iv);
               byte[] encrypted1 = Base64.decode(sSrc);
               byte[] original = cipher.doFinal(encrypted1);
               return new String(original);
            } catch (Exception var8) {
               return sSrc;
            }
         }
      } else {
         return sSrc;
      }
   }

   private static byte[] getSecretKey(String sKey) throws NoSuchAlgorithmException, UnsupportedEncodingException {
      KeyGenerator kgen = KeyGenerator.getInstance(SpiContents.SECRET_ALGO_AES);
      SecureRandom random = SecureRandom.getInstance(SpiContents.SECURE_RANDOM_ALGO_SHA);
      random.setSeed(sKey.getBytes("ASCII"));
      kgen.init(128, random);
      SecretKey secretKey = kgen.generateKey();
      return secretKey.getEncoded();
   }

   public static String parseByte2HexStr(byte[] buf) {
      StringBuffer sb = new StringBuffer();

      for(int i = 0; i < buf.length; ++i) {
         String hex = Integer.toHexString(buf[i] & 255);
         if (hex.length() == 1) {
            hex = '0' + hex;
         }

         sb.append(hex.toUpperCase());
      }

      return sb.toString();
   }

   public static byte[] parseHexStr2Byte(String hexStr) {
      if (hexStr.length() < 1) {
         return null;
      } else {
         byte[] result = new byte[hexStr.length() / 2];

         for(int i = 0; i < hexStr.length() / 2; ++i) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte)(high * 16 + low);
         }

         return result;
      }
   }
}
