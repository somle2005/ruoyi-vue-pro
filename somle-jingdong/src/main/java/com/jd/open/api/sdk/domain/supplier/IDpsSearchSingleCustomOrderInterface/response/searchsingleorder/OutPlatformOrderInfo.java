package com.jd.open.api.sdk.domain.supplier.IDpsSearchSingleCustomOrderInterface.response.searchsingleorder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OutPlatformOrderInfo implements Serializable {
   private String outPlatformOrderId;
   private String outPlatformParentOrderId;
   private String outPlatformShopId;
   private String whereEnc;
   private String nameEnc;
   private String mobileEnc;

   @JsonProperty("outPlatformOrderId")
   public void setOutPlatformOrderId(String outPlatformOrderId) {
      this.outPlatformOrderId = outPlatformOrderId;
   }

   @JsonProperty("outPlatformOrderId")
   public String getOutPlatformOrderId() {
      return this.outPlatformOrderId;
   }

   @JsonProperty("outPlatformParentOrderId")
   public void setOutPlatformParentOrderId(String outPlatformParentOrderId) {
      this.outPlatformParentOrderId = outPlatformParentOrderId;
   }

   @JsonProperty("outPlatformParentOrderId")
   public String getOutPlatformParentOrderId() {
      return this.outPlatformParentOrderId;
   }

   @JsonProperty("outPlatformShopId")
   public void setOutPlatformShopId(String outPlatformShopId) {
      this.outPlatformShopId = outPlatformShopId;
   }

   @JsonProperty("outPlatformShopId")
   public String getOutPlatformShopId() {
      return this.outPlatformShopId;
   }

   @JsonProperty("whereEnc")
   public void setWhereEnc(String whereEnc) {
      this.whereEnc = whereEnc;
   }

   @JsonProperty("whereEnc")
   public String getWhereEnc() {
      return this.whereEnc;
   }

   @JsonProperty("nameEnc")
   public void setNameEnc(String nameEnc) {
      this.nameEnc = nameEnc;
   }

   @JsonProperty("nameEnc")
   public String getNameEnc() {
      return this.nameEnc;
   }

   @JsonProperty("mobileEnc")
   public void setMobileEnc(String mobileEnc) {
      this.mobileEnc = mobileEnc;
   }

   @JsonProperty("mobileEnc")
   public String getMobileEnc() {
      return this.mobileEnc;
   }
}
