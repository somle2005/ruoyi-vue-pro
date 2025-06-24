package com.jd.security.tde;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public interface TokenCipher {
   byte[] do_encrypt(byte[] var1) throws BadPaddingException, InvalidKeyException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidTokenException, NoSuchPaddingException, InvalidAlgorithmParameterException;

   byte[] do_decrypt(byte[] var1) throws NoSuchAlgorithmException, InvalidTokenException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalArgumentException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException;
}
