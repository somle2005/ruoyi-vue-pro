package com.jd.open.api.sdk.domain.supplier.SalesInfoJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosSalesInfoDto implements Serializable {
   private String[] vendorCode;
   private String[] deliverCenterCode;
   private String[] jdSku;
   private String[] salesVolume;
   private Integer days;

   @JsonProperty("vendorCode")
   public void setVendorCode(String[] vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String[] getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("deliverCenterCode")
   public void setDeliverCenterCode(String[] deliverCenterCode) {
      this.deliverCenterCode = deliverCenterCode;
   }

   @JsonProperty("deliverCenterCode")
   public String[] getDeliverCenterCode() {
      return this.deliverCenterCode;
   }

   @JsonProperty("jdSku")
   public void setJdSku(String[] jdSku) {
      this.jdSku = jdSku;
   }

   @JsonProperty("jdSku")
   public String[] getJdSku() {
      return this.jdSku;
   }

   @JsonProperty("salesVolume")
   public void setSalesVolume(String[] salesVolume) {
      this.salesVolume = salesVolume;
   }

   @JsonProperty("salesVolume")
   public String[] getSalesVolume() {
      return this.salesVolume;
   }

   @JsonProperty("days")
   public void setDays(Integer days) {
      this.days = days;
   }

   @JsonProperty("days")
   public Integer getDays() {
      return this.days;
   }
}
