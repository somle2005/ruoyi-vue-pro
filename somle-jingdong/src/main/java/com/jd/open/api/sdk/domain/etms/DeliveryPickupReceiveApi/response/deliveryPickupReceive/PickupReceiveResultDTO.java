package com.jd.open.api.sdk.domain.etms.DeliveryPickupReceiveApi.response.deliveryPickupReceive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PickupReceiveResultDTO implements Serializable {
   private String waybillCode;
   private String pickupCode;
   private PackageTagInfoDTO packageTagInfo;

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("pickupCode")
   public void setPickupCode(String pickupCode) {
      this.pickupCode = pickupCode;
   }

   @JsonProperty("pickupCode")
   public String getPickupCode() {
      return this.pickupCode;
   }

   @JsonProperty("packageTagInfo")
   public void setPackageTagInfo(PackageTagInfoDTO packageTagInfo) {
      this.packageTagInfo = packageTagInfo;
   }

   @JsonProperty("packageTagInfo")
   public PackageTagInfoDTO getPackageTagInfo() {
      return this.packageTagInfo;
   }
}
