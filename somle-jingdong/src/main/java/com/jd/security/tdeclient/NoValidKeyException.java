package com.jd.security.tdeclient;

public class NoValidKeyException extends Exception {
   public NoValidKeyException(String errMessage) {
      super(errMessage);
   }
}
