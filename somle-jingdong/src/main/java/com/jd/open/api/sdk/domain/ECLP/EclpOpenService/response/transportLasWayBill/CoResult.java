package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.transportLasWayBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class CoResult implements Serializable {
   private String wbNo;
   private String lwbNo;
   private int resultCode;
   private String resultMsg;
   private Map<String, String> resultData;
   private String lrtnNo;
   private String mjWayBillNo;

   @JsonProperty("wbNo")
   public void setWbNo(String wbNo) {
      this.wbNo = wbNo;
   }

   @JsonProperty("wbNo")
   public String getWbNo() {
      return this.wbNo;
   }

   @JsonProperty("lwbNo")
   public void setLwbNo(String lwbNo) {
      this.lwbNo = lwbNo;
   }

   @JsonProperty("lwbNo")
   public String getLwbNo() {
      return this.lwbNo;
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

   @JsonProperty("resultData")
   public void setResultData(Map<String, String> resultData) {
      this.resultData = resultData;
   }

   @JsonProperty("resultData")
   public Map<String, String> getResultData() {
      return this.resultData;
   }

   @JsonProperty("lrtnNo")
   public void setLrtnNo(String lrtnNo) {
      this.lrtnNo = lrtnNo;
   }

   @JsonProperty("lrtnNo")
   public String getLrtnNo() {
      return this.lrtnNo;
   }

   @JsonProperty("mjWayBillNo")
   public void setMjWayBillNo(String mjWayBillNo) {
      this.mjWayBillNo = mjWayBillNo;
   }

   @JsonProperty("mjWayBillNo")
   public String getMjWayBillNo() {
      return this.mjWayBillNo;
   }
}
