package com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.get;

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
   private String mainPictureLink;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
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

   @JsonProperty("dressLength")
   public void setDressLength(Double dressLength) {
      this.dressLength = dressLength;
   }

   @JsonProperty("dressLength")
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

   @JsonProperty("mainPictureLink")
   public void setMainPictureLink(String mainPictureLink) {
      this.mainPictureLink = mainPictureLink;
   }

   @JsonProperty("mainPictureLink")
   public String getMainPictureLink() {
      return this.mainPictureLink;
   }
}
