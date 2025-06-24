package com.jd.security.tde;

public class hsalsa20 {
   static final int ROUNDS = 20;

   static int rotate(int u, int c) {
      return u << c | u >>> 32 - c;
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
      int x7;
      int x8;
      int x9;
      int j6;
      int j7;
      int j8;
      int j9;
      if (inv != null) {
         j6 = x6 = load_littleendian(inv, 0);
         j7 = x7 = load_littleendian(inv, 4);
         j8 = x8 = load_littleendian(inv, 8);
         j9 = x9 = load_littleendian(inv, 12);
      } else {
         x9 = 0;
         j9 = 0;
         x8 = 0;
         j8 = 0;
         x7 = 0;
         j7 = 0;
         x6 = 0;
         j6 = 0;
      }

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
         int var43 = x4 ^ rotate(x0 + x12, 7);
         int var51 = x8 ^ rotate(var43 + x0, 9);
         int var59 = x12 ^ rotate(var51 + var43, 13);
         x0 ^= rotate(var59 + var51, 18);
         int var53 = x9 ^ rotate(x5 + x1, 7);
         int var60 = x13 ^ rotate(var53 + x5, 9);
         int var40 = x1 ^ rotate(var60 + var53, 13);
         x5 ^= rotate(var40 + var60, 18);
         int var61 = x14 ^ rotate(x10 + x6, 7);
         int var41 = x2 ^ rotate(var61 + x10, 9);
         int var47 = x6 ^ rotate(var41 + var61, 13);
         x10 ^= rotate(var47 + var41, 18);
         int var42 = x3 ^ rotate(x15 + x11, 7);
         int var49 = x7 ^ rotate(var42 + x15, 9);
         int var58 = x11 ^ rotate(var49 + var42, 13);
         x15 ^= rotate(var58 + var49, 18);
         x1 = var40 ^ rotate(x0 + var42, 7);
         x2 = var41 ^ rotate(x1 + x0, 9);
         x3 = var42 ^ rotate(x2 + x1, 13);
         x0 ^= rotate(x3 + x2, 18);
         x6 = var47 ^ rotate(x5 + var43, 7);
         x7 = var49 ^ rotate(x6 + x5, 9);
         x4 = var43 ^ rotate(x7 + x6, 13);
         x5 ^= rotate(x4 + x7, 18);
         x11 = var58 ^ rotate(x10 + var53, 7);
         x8 = var51 ^ rotate(x11 + x10, 9);
         x9 = var53 ^ rotate(x8 + x11, 13);
         x10 ^= rotate(x9 + x8, 18);
         x12 = var59 ^ rotate(x15 + var61, 7);
         x13 = var60 ^ rotate(x12 + x15, 9);
         x14 = var61 ^ rotate(x13 + x12, 13);
         x15 ^= rotate(x14 + x13, 18);
      }

      x0 += j0;
      int var10000 = x1 + j1;
      var10000 = x2 + j2;
      var10000 = x3 + j3;
      var10000 = x4 + j4;
      x5 += j5;
      x6 += j6;
      x7 += j7;
      x8 += j8;
      x9 += j9;
      x10 += j10;
      var10000 = x11 + j11;
      var10000 = x12 + j12;
      var10000 = x13 + j13;
      var10000 = x14 + j14;
      x15 += j15;
      x0 -= load_littleendian(c, 0);
      x5 -= load_littleendian(c, 4);
      x10 -= load_littleendian(c, 8);
      x15 -= load_littleendian(c, 12);
      if (inv != null) {
         x6 -= load_littleendian(inv, 0);
         x7 -= load_littleendian(inv, 4);
         x8 -= load_littleendian(inv, 8);
         x9 -= load_littleendian(inv, 12);
      }

      store_littleendian(outv, 0, x0);
      store_littleendian(outv, 4, x5);
      store_littleendian(outv, 8, x10);
      store_littleendian(outv, 12, x15);
      store_littleendian(outv, 16, x6);
      store_littleendian(outv, 20, x7);
      store_littleendian(outv, 24, x8);
      store_littleendian(outv, 28, x9);
      return 0;
   }
}
