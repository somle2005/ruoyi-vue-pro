package com.jd.open.api.sdk.domain.order.LocOrderCodeSoaService.request.write;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LocFeatureJosParam implements Serializable {
   private Integer multiCouponUseTimes;
   private Integer consumeConfig;

   @JsonProperty("multiCouponUseTimes")
   public void setMultiCouponUseTimes(Integer multiCouponUseTimes) {
      this.multiCouponUseTimes = multiCouponUseTimes;
   }

   @JsonProperty("multiCouponUseTimes")
   public Integer getMultiCouponUseTimes() {
      return this.multiCouponUseTimes;
   }

   @JsonProperty("consumeConfig")
   public void setConsumeConfig(Integer consumeConfig) {
      this.consumeConfig = consumeConfig;
   }

   @JsonProperty("consumeConfig")
   public Integer getConsumeConfig() {
      return this.consumeConfig;
   }
}
