package com.jd.security.tde;

public class InvalidKeyPermission extends Exception {
   public InvalidKeyPermission(String errMessage) {
      super(errMessage);
   }
}
