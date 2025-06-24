package com.jd.security.tde;

public class InsufficientSaltLengthException extends Exception {
   public InsufficientSaltLengthException(String errMessage) {
      super(errMessage);
   }
}
