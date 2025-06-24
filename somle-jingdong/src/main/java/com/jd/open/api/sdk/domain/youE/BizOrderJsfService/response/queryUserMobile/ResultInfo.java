package com.jd.open.api.sdk.domain.youE.BizOrderJsfService.response.queryUserMobile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultInfo implements Serializable {
   private int resultCode;
   private String errMsg;
   private PhoneBindVO result;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("result")
   public void setResult(PhoneBindVO result) {
      this.result = result;
   }

   @JsonProperty("result")
   public PhoneBindVO getResult() {
      return this.result;
   }
}
