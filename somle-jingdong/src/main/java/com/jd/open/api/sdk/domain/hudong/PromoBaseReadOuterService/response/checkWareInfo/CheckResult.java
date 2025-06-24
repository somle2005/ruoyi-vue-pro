package com.jd.open.api.sdk.domain.hudong.PromoBaseReadOuterService.response.checkWareInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CheckResult implements Serializable {
   private String attendMessage;
   private Long skuId;
   private Boolean attendResult;

   @JsonProperty("attendMessage")
   public void setAttendMessage(String attendMessage) {
      this.attendMessage = attendMessage;
   }

   @JsonProperty("attendMessage")
   public String getAttendMessage() {
      return this.attendMessage;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("attendResult")
   public void setAttendResult(Boolean attendResult) {
      this.attendResult = attendResult;
   }

   @JsonProperty("attendResult")
   public Boolean getAttendResult() {
      return this.attendResult;
   }
}
