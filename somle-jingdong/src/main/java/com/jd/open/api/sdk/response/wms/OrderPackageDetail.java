package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderPackageDetail implements Serializable {
   private String weight;
   private String deliveryNo;
   private String carriersId;
   private String carriersName;

   @JsonProperty("weight")
   public void setWeight(String weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public String getWeight() {
      return this.weight;
   }

   @JsonProperty("delivery_no")
   public void setDeliveryNo(String deliveryNo) {
      this.deliveryNo = deliveryNo;
   }

   @JsonProperty("delivery_no")
   public String getDeliveryNo() {
      return this.deliveryNo;
   }

   @JsonProperty("carriers_id")
   public void setCarriersId(String carriersId) {
      this.carriersId = carriersId;
   }

   @JsonProperty("carriers_id")
   public String getCarriersId() {
      return this.carriersId;
   }

   @JsonProperty("carriers_name")
   public void setCarriersName(String carriersName) {
      this.carriersName = carriersName;
   }

   @JsonProperty("carriers_name")
   public String getCarriersName() {
      return this.carriersName;
   }
}
