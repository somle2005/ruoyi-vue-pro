package com.jd.security.tde;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;

public class KeyEncryption {
   private static final int IV_SIZE = 16;
   private static Random r = new Random(System.currentTimeMillis());
   private static final IvParameterSpec zero_iv = new IvParameterSpec(new byte[16]);

   public static byte[] encrypt(MKey k, byte[] pt) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
      byte[] ivsect = new byte[16];
      r.nextBytes(ivsect);
      IvParameterSpec iv = new IvParameterSpec(ivsect);
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      cipher.init(1, k.getKey(), iv);
      byte[] ciphertext = cipher.doFinal(pt);
      byte[] ct = new byte[16 + ciphertext.length];
      System.arraycopy(ivsect, 0, ct, 0, 16);
      System.arraycopy(ciphertext, 0, ct, 16, ciphertext.length);
      return ct;
   }

   public static byte[] decrypt(MKey k, byte[] ct) throws NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
      IvParameterSpec iv = new IvParameterSpec(ct, 0, 16);
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      cipher.init(2, k.getKey(), iv);
      return cipher.doFinal(ct, 16, ct.length - 16);
   }

   public static byte[] wrap(MKey k, byte[] dkey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
      Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
      cipher.init(1, k.getKey(), zero_iv);
      return cipher.doFinal(dkey);
   }

   public static byte[] unwrap(MKey k, byte[] ct) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
      Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
      cipher.init(2, k.getKey(), zero_iv);
      return cipher.doFinal(ct);
   }
}
