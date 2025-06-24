package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.transportReverseLasWaybill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CoResult implements Serializable {
   private String wbNo;
   private int resultCode;
   private String resultMsg;
   private String lwbNo;

   @JsonProperty("wbNo")
   public void setWbNo(String wbNo) {
      this.wbNo = wbNo;
   }

   @JsonProperty("wbNo")
   public String getWbNo() {
      return this.wbNo;
   }

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

   @JsonProperty("lwbNo")
   public void setLwbNo(String lwbNo) {
      this.lwbNo = lwbNo;
   }

   @JsonProperty("lwbNo")
   public String getLwbNo() {
      return this.lwbNo;
   }
}
