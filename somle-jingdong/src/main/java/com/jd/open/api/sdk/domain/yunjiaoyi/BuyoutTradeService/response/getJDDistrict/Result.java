package com.jd.open.api.sdk.domain.yunjiaoyi.BuyoutTradeService.response.getJDDistrict;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private int resultCode;
   private String resultMsg;
   private Address data;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("data")
   public void setData(Address data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Address getData() {
      return this.data;
   }
}
