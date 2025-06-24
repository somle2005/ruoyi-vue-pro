package com.jd.open.api.sdk.domain.etms.GeneralWaybillQueryApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PackageAndWeightDTO implements Serializable {
   private String deliveryId;
   private Double weight;
   private Integer goodNumber;

   @JsonProperty("deliveryId")
   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   @JsonProperty("deliveryId")
   public String getDeliveryId() {
      return this.deliveryId;
   }

   @JsonProperty("weight")
   public void setWeight(Double weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public Double getWeight() {
      return this.weight;
   }

   @JsonProperty("goodNumber")
   public void setGoodNumber(Integer goodNumber) {
      this.goodNumber = goodNumber;
   }

   @JsonProperty("goodNumber")
   public Integer getGoodNumber() {
      return this.goodNumber;
   }
}
