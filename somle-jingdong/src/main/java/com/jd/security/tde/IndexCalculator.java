package com.jd.security.tde;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class IndexCalculator {
   public static byte[] sha256Index(byte[] input, byte[] salt) throws NoSuchAlgorithmException, InsufficientSaltLengthException {
      if (input == null) {
         throw new NullPointerException("Input is null for sha256Index function.");
      } else if (salt != null && salt.length >= 16) {
         ByteBuffer bio = ByteBuffer.allocate(input.length + salt.length);
         bio.put(input);
         bio.put(salt);
         return MessageDigest.getInstance("SHA-256").digest(bio.array());
      } else {
         throw new InsufficientSaltLengthException("Salt length is too short.");
      }
   }
}
