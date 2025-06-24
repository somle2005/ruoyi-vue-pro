package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderPackage implements Serializable {
   private String[] packageNo;
   private Double[] packWeight;
   private String wayBill;
   private Double packVolume;

   @JsonProperty("packageNo")
   public void setPackageNo(String[] packageNo) {
      this.packageNo = packageNo;
   }

   @JsonProperty("packageNo")
   public String[] getPackageNo() {
      return this.packageNo;
   }

   @JsonProperty("packWeight")
   public void setPackWeight(Double[] packWeight) {
      this.packWeight = packWeight;
   }

   @JsonProperty("packWeight")
   public Double[] getPackWeight() {
      return this.packWeight;
   }

   @JsonProperty("wayBill")
   public void setWayBill(String wayBill) {
      this.wayBill = wayBill;
   }

   @JsonProperty("wayBill")
   public String getWayBill() {
      return this.wayBill;
   }

   @JsonProperty("packVolume")
   public void setPackVolume(Double packVolume) {
      this.packVolume = packVolume;
   }

   @JsonProperty("packVolume")
   public Double getPackVolume() {
      return this.packVolume;
   }
}
