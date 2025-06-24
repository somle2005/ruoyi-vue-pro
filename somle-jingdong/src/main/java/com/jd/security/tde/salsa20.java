package com.jd.security.tde;

public class salsa20 {
   final int crypto_core_salsa20_ref_OUTPUTBYTES = 64;
   final int crypto_core_salsa20_ref_INPUTBYTES = 16;
   final int crypto_core_salsa20_ref_KEYBYTES = 32;
   final int crypto_core_salsa20_ref_CONSTBYTES = 16;
   final int crypto_stream_salsa20_ref_KEYBYTES = 32;
   final int crypto_stream_salsa20_ref_NONCEBYTES = 8;
   static final int ROUNDS = 20;

   static long rotate(int u, int c) {
      return (long)(u << c | u >>> 32 - c);
   }

   static int load_littleendian(byte[] x, int offset) {
      return x[offset] & 255 | (x[offset + 1] & 255) << 8 | (x[offset + 2] & 255) << 16 | (x[offset + 3] & 255) << 24;
   }

   static void store_littleendian(byte[] x, int offset, int u) {
      x[offset] = (byte)u;
      u >>>= 8;
      x[offset + 1] = (byte)u;
      u >>>= 8;
      x[offset + 2] = (byte)u;
      u >>>= 8;
      x[offset + 3] = (byte)u;
   }

   public static int crypto_core(byte[] outv, byte[] inv, byte[] k, byte[] c) {
      int x0;
      int j0 = x0 = load_littleendian(c, 0);
      int x1;
      int j1 = x1 = load_littleendian(k, 0);
      int x2;
      int j2 = x2 = load_littleendian(k, 4);
      int x3;
      int j3 = x3 = load_littleendian(k, 8);
      int x4;
      int j4 = x4 = load_littleendian(k, 12);
      int x5;
      int j5 = x5 = load_littleendian(c, 4);
      int x6;
      int j6 = x6 = load_littleendian(inv, 0);
      int x7;
      int j7 = x7 = load_littleendian(inv, 4);
      int x8;
      int j8 = x8 = load_littleendian(inv, 8);
      int x9;
      int j9 = x9 = load_littleendian(inv, 12);
      int x10;
      int j10 = x10 = load_littleendian(c, 8);
      int x11;
      int j11 = x11 = load_littleendian(k, 16);
      int x12;
      int j12 = x12 = load_littleendian(k, 20);
      int x13;
      int j13 = x13 = load_littleendian(k, 24);
      int x14;
      int j14 = x14 = load_littleendian(k, 28);
      int x15;
      int j15 = x15 = load_littleendian(c, 12);

      for(int i = 20; i > 0; i -= 2) {
         int var45 = (int)((long)x4 ^ rotate(x0 + x12, 7));
         int var53 = (int)((long)x8 ^ rotate(var45 + x0, 9));
         int var61 = (int)((long)x12 ^ rotate(var53 + var45, 13));
         x0 = (int)((long)x0 ^ rotate(var61 + var53, 18));
         int var55 = (int)((long)x9 ^ rotate(x5 + x1, 7));
         int var63 = (int)((long)x13 ^ rotate(var55 + x5, 9));
         int var39 = (int)((long)x1 ^ rotate(var63 + var55, 13));
         x5 = (int)((long)x5 ^ rotate(var39 + var63, 18));
         int var65 = (int)((long)x14 ^ rotate(x10 + x6, 7));
         int var41 = (int)((long)x2 ^ rotate(var65 + x10, 9));
         int var49 = (int)((long)x6 ^ rotate(var41 + var65, 13));
         x10 = (int)((long)x10 ^ rotate(var49 + var41, 18));
         int var43 = (int)((long)x3 ^ rotate(x15 + x11, 7));
         int var51 = (int)((long)x7 ^ rotate(var43 + x15, 9));
         int var59 = (int)((long)x11 ^ rotate(var51 + var43, 13));
         x15 = (int)((long)x15 ^ rotate(var59 + var51, 18));
         x1 = (int)((long)var39 ^ rotate(x0 + var43, 7));
         x2 = (int)((long)var41 ^ rotate(x1 + x0, 9));
         x3 = (int)((long)var43 ^ rotate(x2 + x1, 13));
         x0 = (int)((long)x0 ^ rotate(x3 + x2, 18));
         x6 = (int)((long)var49 ^ rotate(x5 + var45, 7));
         x7 = (int)((long)var51 ^ rotate(x6 + x5, 9));
         x4 = (int)((long)var45 ^ rotate(x7 + x6, 13));
         x5 = (int)((long)x5 ^ rotate(x4 + x7, 18));
         x11 = (int)((long)var59 ^ rotate(x10 + var55, 7));
         x8 = (int)((long)var53 ^ rotate(x11 + x10, 9));
         x9 = (int)((long)var55 ^ rotate(x8 + x11, 13));
         x10 = (int)((long)x10 ^ rotate(x9 + x8, 18));
         x12 = (int)((long)var61 ^ rotate(x15 + var65, 7));
         x13 = (int)((long)var63 ^ rotate(x12 + x15, 9));
         x14 = (int)((long)var65 ^ rotate(x13 + x12, 13));
         x15 = (int)((long)x15 ^ rotate(x14 + x13, 18));
      }

      x0 += j0;
      x1 += j1;
      x2 += j2;
      x3 += j3;
      x4 += j4;
      x5 += j5;
      x6 += j6;
      x7 += j7;
      x8 += j8;
      x9 += j9;
      x10 += j10;
      x11 += j11;
      x12 += j12;
      x13 += j13;
      x14 += j14;
      x15 += j15;
      store_littleendian(outv, 0, x0);
      store_littleendian(outv, 4, x1);
      store_littleendian(outv, 8, x2);
      store_littleendian(outv, 12, x3);
      store_littleendian(outv, 16, x4);
      store_littleendian(outv, 20, x5);
      store_littleendian(outv, 24, x6);
      store_littleendian(outv, 28, x7);
      store_littleendian(outv, 32, x8);
      store_littleendian(outv, 36, x9);
      store_littleendian(outv, 40, x10);
      store_littleendian(outv, 44, x11);
      store_littleendian(outv, 48, x12);
      store_littleendian(outv, 52, x13);
      store_littleendian(outv, 56, x14);
      store_littleendian(outv, 60, x15);
      return 0;
   }

   public static int crypto_stream(byte[] c, int clen, byte[] n, int noffset, byte[] k) {
      byte[] inv = new byte[16];
      byte[] block = new byte[64];
      int coffset = 0;
      if (clen == 0) {
         return 0;
      } else {
         for(int i = 0; i < 8; ++i) {
            inv[i] = n[noffset + i];
         }

         for(int i = 8; i < 16; ++i) {
            inv[i] = 0;
         }

         while(clen >= 64) {
            crypto_core(c, inv, k, xsalsa20.sigma);
            int u = 1;

            for(int i = 8; i < 16; ++i) {
               u += inv[i] & 255;
               inv[i] = (byte)u;
               u >>>= 8;
            }

            clen -= 64;
            coffset += 64;
         }

         if (clen != 0) {
            crypto_core(block, inv, k, xsalsa20.sigma);

            for(int i = 0; i < clen; ++i) {
               c[coffset + i] = block[i];
            }
         }

         return 0;
      }
   }

   public static int crypto_stream_xor(byte[] c, int offset, byte[] m, int mlen, byte[] n, int noffset, byte[] k) {
      byte[] inv = new byte[16];
      byte[] block = new byte[64];
      int coffset = offset;
      int moffset = 0;
      if (mlen == 0) {
         return 0;
      } else {
         for(int i = 0; i < 8; ++i) {
            inv[i] = n[noffset + i];
         }

         for(int i = 8; i < 16; ++i) {
            inv[i] = 0;
         }

         while(mlen >= 64) {
            crypto_core(block, inv, k, xsalsa20.sigma);

            for(int i = 0; i < 64; ++i) {
               c[coffset + i] = (byte)(m[moffset + i] ^ block[i]);
            }

            int u = 1;

            for(int i = 8; i < 16; ++i) {
               u += inv[i] & 255;
               inv[i] = (byte)u;
               u >>>= 8;
            }

            mlen -= 64;
            coffset += 64;
            moffset += 64;
         }

         if (mlen != 0) {
            crypto_core(block, inv, k, xsalsa20.sigma);

            for(int i = 0; i < mlen; ++i) {
               c[coffset + i] = (byte)(m[moffset + i] ^ block[i]);
            }
         }

         return 0;
      }
   }
}
