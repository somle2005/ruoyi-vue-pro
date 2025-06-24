package com.jd.open.api.sdk.domain.directional;

public final class GetVoucherInfoRes {
   private String errorCode;
   private String errorMsg;
   private GetVoucherInfoResVo data;

   public String getErrorCode() {
      return this.errorCode;
   }

   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   public String getErrorMsg() {
      return this.errorMsg;
   }

   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   public GetVoucherInfoResVo getData() {
      return this.data;
   }

   public void setData(GetVoucherInfoResVo data) {
      this.data = data;
   }
}
