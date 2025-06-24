package com.jd.open.api.sdk.domain.youE.BizOrderJxfwJsfService.response.getShippingInformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultInfo implements Serializable {
   private int resultCode;
   private String errMsg;
   private ShippingInformationVO result;

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
   public void setResult(ShippingInformationVO result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ShippingInformationVO getResult() {
      return this.result;
   }
}
