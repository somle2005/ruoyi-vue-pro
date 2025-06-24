package com.jd.security.tde;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class DataEncryption {
   private static final String AES_CIPHERSUITE = "AES/CBC/PKCS5Padding";
   private SecretKeySpec dkey = null;
   private byte[] rawKey = null;
   private static final int IV_SIZE = 16;
   private byte[] ivsect = new byte[16];
   private static final SecureRandom ssr = new SecureRandom();
   private Random sr;

   public DataEncryption(int keySize) {
      this.sr = new Random(ssr.nextLong());
      this.rawKey = new byte[keySize];
      this.sr.nextBytes(this.rawKey);
      this.dkey = new SecretKeySpec(this.rawKey, "AES");
      this.sr.nextBytes(this.ivsect);
   }

   public DataEncryption(byte[] keyBytes) {
      this.sr = new Random(ssr.nextLong());
      this.rawKey = keyBytes;
      this.dkey = new SecretKeySpec(keyBytes, 0, 16, "AES");
      this.sr.nextBytes(this.ivsect);
   }

   public byte[] encrypt(byte[] pt) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
      IvParameterSpec iv = new IvParameterSpec(this.ivsect);
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      cipher.init(1, this.dkey, iv);
      byte[] ciphertext = cipher.doFinal(pt);
      byte[] ct = new byte[16 + ciphertext.length];
      System.arraycopy(this.ivsect, 0, ct, 0, 16);
      System.arraycopy(ciphertext, 0, ct, 16, ciphertext.length);
      return ct;
   }

   public byte[] decrypt(byte[] ct) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
      System.arraycopy(ct, 0, this.ivsect, 0, 16);
      IvParameterSpec iv = new IvParameterSpec(this.ivsect);
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      cipher.init(2, this.dkey, iv);
      return cipher.doFinal(ct, 16, ct.length - 16);
   }

   public byte[] exportKey() {
      return this.rawKey;
   }
}
