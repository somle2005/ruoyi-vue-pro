package com.jd.open.api.sdk.domain.order.StoreCenterServiceProvider.response.getStagepayBusinessByOrderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StagepayBusinessTO implements Serializable {
   private Long id;
   private Long businessNo;
   private int status;
   private int stageNum;
   private Long venderId;
   private Long storeId;
   private int payStatus;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("businessNo")
   public void setBusinessNo(Long businessNo) {
      this.businessNo = businessNo;
   }

   @JsonProperty("businessNo")
   public Long getBusinessNo() {
      return this.businessNo;
   }

   @JsonProperty("status")
   public void setStatus(int status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int getStatus() {
      return this.status;
   }

   @JsonProperty("stageNum")
   public void setStageNum(int stageNum) {
      this.stageNum = stageNum;
   }

   @JsonProperty("stageNum")
   public int getStageNum() {
      return this.stageNum;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
      return this.storeId;
   }

   @JsonProperty("payStatus")
   public void setPayStatus(int payStatus) {
      this.payStatus = payStatus;
   }

   @JsonProperty("payStatus")
   public int getPayStatus() {
      return this.payStatus;
   }
}
