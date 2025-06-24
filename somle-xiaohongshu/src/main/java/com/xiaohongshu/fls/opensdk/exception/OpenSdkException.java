package com.xiaohongshu.fls.opensdk.exception;

public class OpenSdkException extends RuntimeException {
   protected BaseErrorCode error;
   private String customMsg;

   public OpenSdkException() {
   }

   public OpenSdkException(BaseErrorCode error) {
      this.error = error;
   }

   public OpenSdkException(BaseErrorCode error, String customMsg) {
      this.error = error;
      this.customMsg = customMsg;
   }

   public int getErrorCode() {
      return this.getError() != null ? this.getError().getErrorCode() : 0;
   }

   public String getErrorMsg() {
      if (this.getError() != null) {
         return this.customMsg != null ? this.getError().getErrorMsg() + ":" + this.customMsg : this.getError().getErrorMsg();
      } else {
         return null;
      }
   }

   public BaseErrorCode getError() {
      return this.error;
   }

   public void setError(BaseErrorCode error) {
      this.error = error;
   }

   public String toString() {
      if (this.error != null) {
         return this.customMsg != null ? this.error.toString() + ":" + this.customMsg : this.error.toString();
      } else {
         return super.toString();
      }
   }
}
