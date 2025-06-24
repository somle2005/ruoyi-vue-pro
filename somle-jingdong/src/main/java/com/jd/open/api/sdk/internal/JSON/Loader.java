package com.jd.open.api.sdk.internal.JSON;

import java.net.URL;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

class Loader {
   public static URL getResource(Class<?> loadClass, String name, boolean checkParents) throws ClassNotFoundException {
      URL url = null;

      for(ClassLoader loader = Thread.currentThread().getContextClassLoader(); url == null && loader != null; loader = url == null && checkParents ? loader.getParent() : null) {
         url = loader.getResource(name);
      }

      for(ClassLoader var5 = loadClass == null ? null : loadClass.getClassLoader(); url == null && var5 != null; var5 = url == null && checkParents ? var5.getParent() : null) {
         url = var5.getResource(name);
      }

      if (url == null) {
         url = ClassLoader.getSystemResource(name);
      }

      return url;
   }

   public static Class loadClass(Class loadClass, String name) throws ClassNotFoundException {
      return loadClass(loadClass, name, false);
   }

   public static Class loadClass(Class loadClass, String name, boolean checkParents) throws ClassNotFoundException {
      ClassNotFoundException ex = null;
      Class<?> c = null;

      for(ClassLoader loader = Thread.currentThread().getContextClassLoader(); c == null && loader != null; loader = c == null && checkParents ? loader.getParent() : null) {
         try {
            c = loader.loadClass(name);
         } catch (ClassNotFoundException e) {
            if (ex == null) {
               ex = e;
            }
         }
      }

      for(ClassLoader var10 = loadClass == null ? null : loadClass.getClassLoader(); c == null && var10 != null; var10 = c == null && checkParents ? var10.getParent() : null) {
         try {
            c = var10.loadClass(name);
         } catch (ClassNotFoundException e) {
            if (ex == null) {
               ex = e;
            }
         }
      }

      if (c == null) {
         try {
            c = Class.forName(name);
         } catch (ClassNotFoundException e) {
            if (ex == null) {
               ex = e;
            }
         }
      }

      if (c != null) {
         return c;
      } else {
         throw ex;
      }
   }

   public static ResourceBundle getResourceBundle(Class<?> loadClass, String name, boolean checkParents, Locale locale) throws MissingResourceException {
      MissingResourceException ex = null;
      ResourceBundle bundle = null;

      for(ClassLoader loader = Thread.currentThread().getContextClassLoader(); bundle == null && loader != null; loader = bundle == null && checkParents ? loader.getParent() : null) {
         try {
            bundle = ResourceBundle.getBundle(name, locale, loader);
         } catch (MissingResourceException e) {
            if (ex == null) {
               ex = e;
            }
         }
      }

      for(ClassLoader var11 = loadClass == null ? null : loadClass.getClassLoader(); bundle == null && var11 != null; var11 = bundle == null && checkParents ? var11.getParent() : null) {
         try {
            bundle = ResourceBundle.getBundle(name, locale, var11);
         } catch (MissingResourceException e) {
            if (ex == null) {
               ex = e;
            }
         }
      }

      if (bundle == null) {
         try {
            bundle = ResourceBundle.getBundle(name, locale);
         } catch (MissingResourceException e) {
            if (ex == null) {
               ex = e;
            }
         }
      }

      if (bundle != null) {
         return bundle;
      } else {
         throw ex;
      }
   }
}
