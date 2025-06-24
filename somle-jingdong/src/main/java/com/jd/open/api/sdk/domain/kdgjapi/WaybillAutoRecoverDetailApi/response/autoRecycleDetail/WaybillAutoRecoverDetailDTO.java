package com.jd.open.api.sdk.domain.kdgjapi.WaybillAutoRecoverDetailApi.response.autoRecycleDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class WaybillAutoRecoverDetailDTO implements Serializable {
   private String providerCode;
   private String waybillCode;
   private String branchCode;
   private String vendorCode;
   private String vendorName;
   private Date recoverTime;
   private String recoverReason;
   private Date orderTime;

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("branchCode")
   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   @JsonProperty("branchCode")
   public String getBranchCode() {
      return this.branchCode;
   }

   @JsonProperty("vendorCode")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("vendorName")
   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   @JsonProperty("vendorName")
   public String getVendorName() {
      return this.vendorName;
   }

   @JsonProperty("recoverTime")
   public void setRecoverTime(Date recoverTime) {
      this.recoverTime = recoverTime;
   }

   @JsonProperty("recoverTime")
   public Date getRecoverTime() {
      return this.recoverTime;
   }

   @JsonProperty("recoverReason")
   public void setRecoverReason(String recoverReason) {
      this.recoverReason = recoverReason;
   }

   @JsonProperty("recoverReason")
   public String getRecoverReason() {
      return this.recoverReason;
   }

   @JsonProperty("orderTime")
   public void setOrderTime(Date orderTime) {
      this.orderTime = orderTime;
   }

   @JsonProperty("orderTime")
   public Date getOrderTime() {
      return this.orderTime;
   }
}
