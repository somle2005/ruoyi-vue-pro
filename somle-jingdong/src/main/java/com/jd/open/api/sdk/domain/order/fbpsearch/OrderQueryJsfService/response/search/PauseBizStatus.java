package com.jd.open.api.sdk.domain.order.fbpsearch.OrderQueryJsfService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PauseBizStatus implements Serializable {
   private Integer bizType;
   private Integer bizStatus;

   @JsonProperty("bizType")
   public void setBizType(Integer bizType) {
      this.bizType = bizType;
   }

   @JsonProperty("bizType")
   public Integer getBizType() {
      return this.bizType;
   }

   @JsonProperty("bizStatus")
   public void setBizStatus(Integer bizStatus) {
      this.bizStatus = bizStatus;
   }

   @JsonProperty("bizStatus")
   public Integer getBizStatus() {
      return this.bizStatus;
   }
}
