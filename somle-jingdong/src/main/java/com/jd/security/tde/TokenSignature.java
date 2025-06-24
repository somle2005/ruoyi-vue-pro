package com.jd.security.tde;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public interface TokenSignature {
   byte[] do_sign(byte[] var1) throws InvalidTokenException, InvalidKeyException, NoSuchAlgorithmException;

   boolean do_verify(byte[] var1, byte[] var2) throws InvalidTokenException, InvalidKeyException, NoSuchAlgorithmException;
}
