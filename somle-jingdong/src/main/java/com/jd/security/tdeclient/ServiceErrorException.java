package com.jd.security.tdeclient;

public class ServiceErrorException extends Exception {
   public ServiceErrorException(String errMessage) {
      super(errMessage);
   }
}
