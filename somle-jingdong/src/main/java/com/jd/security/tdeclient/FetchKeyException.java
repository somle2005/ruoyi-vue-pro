package com.jd.security.tdeclient;

public class FetchKeyException extends RuntimeException {
   public FetchKeyException(String message) {
      super(message);
   }

   public FetchKeyException(Throwable cause) {
      super(cause);
   }
}
