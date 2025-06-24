package com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.getdetailbyorderid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PurchaseWarePropertyDto implements Serializable {
   private Long wareId;
   private Double chest;
   private Double waistline;
   private Double hip;
   private Double dressLength;
   private Double height;
   private String color;

   @JsonProperty("ware_id")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("chest")
   public void setChest(Double chest) {
      this.chest = chest;
   }

   @JsonProperty("chest")
   public Double getChest() {
      return this.chest;
   }

   @JsonProperty("waistline")
   public void setWaistline(Double waistline) {
      this.waistline = waistline;
   }

   @JsonProperty("waistline")
   public Double getWaistline() {
      return this.waistline;
   }

   @JsonProperty("hip")
   public void setHip(Double hip) {
      this.hip = hip;
   }

   @JsonProperty("hip")
   public Double getHip() {
      return this.hip;
   }

   @JsonProperty("dress_length")
   public void setDressLength(Double dressLength) {
      this.dressLength = dressLength;
   }

   @JsonProperty("dress_length")
   public Double getDressLength() {
      return this.dressLength;
   }

   @JsonProperty("height")
   public void setHeight(Double height) {
      this.height = height;
   }

   @JsonProperty("height")
   public Double getHeight() {
      return this.height;
   }

   @JsonProperty("color")
   public void setColor(String color) {
      this.color = color;
   }

   @JsonProperty("color")
   public String getColor() {
      return this.color;
   }
}
