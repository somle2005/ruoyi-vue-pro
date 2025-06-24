package com.jd.security.tde.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class UtilTools {
   private static final int maxLines = 3;

   private static String extractString(StackTraceElement[] eles) {
      StringBuilder s = new StringBuilder();
      int line = 0;

      for(StackTraceElement e : eles) {
         s.append(e.toString()).append(' ');
         if (line >= 3) {
            break;
         }

         ++line;
      }

      return s.toString();
   }

   public static String extractStackTrace(Exception ex) {
      return extractString(ex.getStackTrace());
   }

   public static String extractStackTrace(Throwable ex) {
      return extractString(ex.getStackTrace());
   }

   public static void closeQuietly(InputStream input) {
      try {
         if (input != null) {
            input.close();
         }
      } catch (IOException var2) {
      }

   }

   public static void closeQuietly(Reader reader) {
      try {
         if (reader != null) {
            reader.close();
         }
      } catch (IOException var2) {
      }

   }

   public static void closeQuietly(FileChannel channel) {
      try {
         if (channel != null) {
            channel.close();
         }
      } catch (IOException var2) {
      }

   }

   public static void releaseQuietly(FileLock lock) {
      try {
         if (lock != null) {
            lock.release();
         }
      } catch (IOException var2) {
      }

   }

   public static void closeQuietly(OutputStream output) {
      try {
         if (output != null) {
            output.close();
         }
      } catch (IOException var2) {
      }

   }
}
