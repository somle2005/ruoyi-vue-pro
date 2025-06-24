package com.xiaohongshu.fls.opensdk.exception;

public enum OpenSdkErrorCode implements BaseErrorCode {
   SYSTEM_ERROR(10001, "系统异常");

   private int errorCode;
   private String errorDesc;

   private OpenSdkErrorCode(int errorCode, String errorDesc) {
      this.errorCode = errorCode;
      this.errorDesc = errorDesc;
   }

   public static OpenSdkErrorCode getByCode(int code) {
      for(OpenSdkErrorCode value : values()) {
         if (value.getErrorCode() == code) {
            return value;
         }
      }

      return null;
   }

   public int getErrorCode() {
      return this.errorCode;
   }

   public String getErrorMsg() {
      return this.errorDesc;
   }

   public String toString() {
      return "OpenSdkErrorCode{errorCode='" + this.errorCode + '\'' + ", errorDesc='" + '\'' + this.errorDesc + "} ";
   }
}
