package com.jd.open.api.sdk.domain.order.IGlobalOrderProduceServiceForJos.request.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OneGlobalOrderModelNoLogistic implements Serializable {
   private Boolean noCheckLogistics;
   private Long takeAddressId;
   private Long orderId;
   private String guaranteeValue;

   @JsonProperty("noCheckLogistics")
   public void setNoCheckLogistics(Boolean noCheckLogistics) {
      this.noCheckLogistics = noCheckLogistics;
   }

   @JsonProperty("noCheckLogistics")
   public Boolean getNoCheckLogistics() {
      return this.noCheckLogistics;
   }

   @JsonProperty("takeAddressId")
   public void setTakeAddressId(Long takeAddressId) {
      this.takeAddressId = takeAddressId;
   }

   @JsonProperty("takeAddressId")
   public Long getTakeAddressId() {
      return this.takeAddressId;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("guaranteeValue")
   public void setGuaranteeValue(String guaranteeValue) {
      this.guaranteeValue = guaranteeValue;
   }

   @JsonProperty("guaranteeValue")
   public String getGuaranteeValue() {
      return this.guaranteeValue;
   }
}
