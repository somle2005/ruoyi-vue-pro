package com.jd.security.tde;

public class RequestVoucherException extends RuntimeException {
   public RequestVoucherException(String message) {
      super(message);
   }

   public RequestVoucherException(Throwable cause) {
      super(cause);
   }
}
