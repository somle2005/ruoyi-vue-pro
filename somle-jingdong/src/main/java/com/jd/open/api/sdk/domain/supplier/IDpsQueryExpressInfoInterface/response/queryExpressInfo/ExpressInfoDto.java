package com.jd.open.api.sdk.domain.supplier.IDpsQueryExpressInfoInterface.response.queryExpressInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ExpressInfoDto implements Serializable {
   private String customOrderId;
   private String receiveName;
   private String deliveryId;

   @JsonProperty("customOrderId")
   public void setCustomOrderId(String customOrderId) {
      this.customOrderId = customOrderId;
   }

   @JsonProperty("customOrderId")
   public String getCustomOrderId() {
      return this.customOrderId;
   }

   @JsonProperty("receiveName")
   public void setReceiveName(String receiveName) {
      this.receiveName = receiveName;
   }

   @JsonProperty("receiveName")
   public String getReceiveName() {
      return this.receiveName;
   }

   @JsonProperty("deliveryId")
   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   @JsonProperty("deliveryId")
   public String getDeliveryId() {
      return this.deliveryId;
   }
}
