package com.jd.open.api.sdk.domain.etms.GeneralWaybillQueryApi.response.querySignatureImage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SignatureImageDTO implements Serializable {
   private String deliveryId;
   private String orderId;
   private String signatureImage;

   @JsonProperty("deliveryId")
   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   @JsonProperty("deliveryId")
   public String getDeliveryId() {
      return this.deliveryId;
   }

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("signatureImage")
   public void setSignatureImage(String signatureImage) {
      this.signatureImage = signatureImage;
   }

   @JsonProperty("signatureImage")
   public String getSignatureImage() {
      return this.signatureImage;
   }
}
