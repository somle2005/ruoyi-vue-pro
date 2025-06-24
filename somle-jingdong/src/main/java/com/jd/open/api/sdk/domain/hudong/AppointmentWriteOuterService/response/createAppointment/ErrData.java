package com.jd.open.api.sdk.domain.hudong.AppointmentWriteOuterService.response.createAppointment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ErrData implements Serializable {
   private Long skuId;
   private String message;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }
}
