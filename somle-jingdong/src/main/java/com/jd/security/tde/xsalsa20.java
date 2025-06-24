package com.jd.security.tde;

public class xsalsa20 {
   final int crypto_stream_xsalsa20_ref_KEYBYTES = 32;
   final int crypto_stream_xsalsa20_ref_NONCEBYTES = 24;
   public static final byte[] sigma = new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107};

   public static int crypto_stream(byte[] c, int clen, byte[] n, byte[] k) {
      byte[] subkey = new byte[32];
      hsalsa20.crypto_core(subkey, n, k, sigma);
      return salsa20.crypto_stream(c, clen, n, 16, subkey);
   }

   public static int crypto_stream_xor(byte[] c, byte[] m, long mlen, byte[] n, byte[] k) {
      byte[] subkey = new byte[32];
      hsalsa20.crypto_core(subkey, n, k, sigma);
      return salsa20.crypto_stream_xor(c, 0, m, (int)mlen, n, 16, subkey);
   }

   public static int crypto_stream_xor(byte[] c, int offset, byte[] m, long mlen, byte[] n, byte[] k) {
      byte[] subkey = new byte[32];
      hsalsa20.crypto_core(subkey, n, k, sigma);
      return salsa20.crypto_stream_xor(c, offset, m, (int)mlen, n, 16, subkey);
   }
}
