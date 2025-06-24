package com.jd.security.tdeclient;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

public class IndexCalculationHelper {
   private static final CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
   private static String LONG_PLACEHOLDER = generatePlaceholderForNonAscii();

   public static String generatePlaceholderForNonAscii() {
      StringBuffer buffer = new StringBuffer();

      for(int i = 0; i < 6; ++i) {
         buffer.append(WildcardPattern.ASCII.placeholder);
      }

      return buffer.toString();
   }

   public static String formatPlaintext(String plaintext) {
      return unicodeEncode(plaintext);
   }

   public static String formatQueryKeyword(String keyword) {
      return formatQueryKeyword(unicodeEncode(keyword), WildcardPattern.NON_ASCII.placeholder);
   }

   public static String formatQueryKeyword(String keyword, char placeholderForNonAscii) {
      if (!keyword.contains(String.valueOf(placeholderForNonAscii))) {
         return keyword;
      } else {
         StringBuffer buffer = new StringBuffer();
         int i = 0;

         for(int len = keyword.length(); i < len; ++i) {
            if (keyword.charAt(i) == placeholderForNonAscii) {
               buffer.append(LONG_PLACEHOLDER);
            } else {
               if (keyword.charAt(i) != WildcardPattern.ASCII.placeholder) {
                  buffer.append(keyword.substring(i, keyword.length()));
                  break;
               }

               buffer.append(keyword.charAt(i));
            }
         }

         return buffer.toString();
      }
   }

   public static String unicodeEncode(String data) {
      if (isPureAscii(data)) {
         return data;
      } else {
         char[] utfBytes = data.toCharArray();
         StringBuffer buffer = new StringBuffer();
         int byteIndex = 0;

         for(int len = utfBytes.length; byteIndex < len; ++byteIndex) {
            if (isPureAscii(utfBytes[byteIndex])) {
               buffer.append(utfBytes[byteIndex]);
            } else {
               String hexB = Integer.toHexString(utfBytes[byteIndex]);
               if (hexB.length() <= 2) {
                  hexB = "00" + hexB;
               }

               buffer.append("\\u").append(hexB);
            }
         }

         return buffer.toString();
      }
   }

   public static String unicodeDecode(String data) {
      StringBuffer buffer = new StringBuffer();
      String charStr = "";
      int i = 0;
      int len = data.length();

      while(i < len) {
         int offset = data.indexOf("\\u", i);
         if (offset != -1 && offset + 6 <= data.length()) {
            buffer.append(data.substring(i, offset));
            charStr = data.substring(offset + 2, offset + 6);
            char letter = (char)Integer.parseInt(charStr, 16);
            buffer.append((new Character(letter)).toString());
            i = offset + 6;
         } else {
            charStr = data.substring(i, data.length());
            buffer.append(charStr);
            i = data.length();
         }
      }

      return buffer.toString();
   }

   public static boolean isPureAscii(char c) {
      return encoder.canEncode(c);
   }

   public static boolean isPureAscii(String s) {
      return encoder.canEncode(s);
   }

   public static String generateWildcardKeyword(String keyword, int asciiCharPrefixNumber, int nonAsciiCharPrefixNumber) {
      int length = asciiCharPrefixNumber + nonAsciiCharPrefixNumber * 6;
      if (length == 0) {
         return keyword;
      } else {
         StringBuffer buffer = new StringBuffer();
         char[] prefix = new char[length];
         Arrays.fill(prefix, WildcardPattern.ASCII.placeholder);
         return buffer.append(prefix).append(keyword).toString();
      }
   }

   public static enum WildcardPattern {
      ASCII((byte)0, '*'),
      NON_ASCII((byte)1, '#');

      byte id;
      char placeholder;

      private WildcardPattern(byte i, char p) {
         this.id = i;
         this.placeholder = p;
      }
   }
}
