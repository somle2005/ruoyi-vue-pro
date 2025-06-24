package com.jd.security.tde;

public class InvalidTokenException extends Exception {
   public InvalidTokenException(String errMessage) {
      super(errMessage);
   }
}
