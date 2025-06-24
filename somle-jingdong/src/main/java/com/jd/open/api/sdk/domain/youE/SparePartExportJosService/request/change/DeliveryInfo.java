package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.change;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DeliveryInfo implements Serializable {
   private String purchaserId;
   private Integer partsOrderState;
   private String partsOrderNo;
   private Integer channelId;
   private String deliveryCode;

   @JsonProperty("purchaserId")
   public void setPurchaserId(String purchaserId) {
      this.purchaserId = purchaserId;
   }

   @JsonProperty("purchaserId")
   public String getPurchaserId() {
      return this.purchaserId;
   }

   @JsonProperty("partsOrderState")
   public void setPartsOrderState(Integer partsOrderState) {
      this.partsOrderState = partsOrderState;
   }

   @JsonProperty("partsOrderState")
   public Integer getPartsOrderState() {
      return this.partsOrderState;
   }

   @JsonProperty("partsOrderNo")
   public void setPartsOrderNo(String partsOrderNo) {
      this.partsOrderNo = partsOrderNo;
   }

   @JsonProperty("partsOrderNo")
   public String getPartsOrderNo() {
      return this.partsOrderNo;
   }

   @JsonProperty("channelId")
   public void setChannelId(Integer channelId) {
      this.channelId = channelId;
   }

   @JsonProperty("channelId")
   public Integer getChannelId() {
      return this.channelId;
   }

   @JsonProperty("deliveryCode")
   public void setDeliveryCode(String deliveryCode) {
      this.deliveryCode = deliveryCode;
   }

   @JsonProperty("deliveryCode")
   public String getDeliveryCode() {
      return this.deliveryCode;
   }
}
