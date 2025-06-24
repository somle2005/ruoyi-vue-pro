package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.createWbOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CoCreateLwbResultForCreateWbOrder implements Serializable {
   private int resultCode;
   private String resultMsg;
   private String wbNo;
   private String lwbNo;
   private Byte deliveryMthd;
   private String providerName;
   private String thrOrderId;
   private String providerCode;
   private List<ResultForLwbMain> resultForLwbMainList;

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

   @JsonProperty("deliveryMthd")
   public void setDeliveryMthd(Byte deliveryMthd) {
      this.deliveryMthd = deliveryMthd;
   }

   @JsonProperty("deliveryMthd")
   public Byte getDeliveryMthd() {
      return this.deliveryMthd;
   }

   @JsonProperty("providerName")
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   @JsonProperty("providerName")
   public String getProviderName() {
      return this.providerName;
   }

   @JsonProperty("thrOrderId")
   public void setThrOrderId(String thrOrderId) {
      this.thrOrderId = thrOrderId;
   }

   @JsonProperty("thrOrderId")
   public String getThrOrderId() {
      return this.thrOrderId;
   }

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("resultForLwbMainList")
   public void setResultForLwbMainList(List<ResultForLwbMain> resultForLwbMainList) {
      this.resultForLwbMainList = resultForLwbMainList;
   }

   @JsonProperty("resultForLwbMainList")
   public List<ResultForLwbMain> getResultForLwbMainList() {
      return this.resultForLwbMainList;
   }
}
