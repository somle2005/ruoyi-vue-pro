package com.jd.open.api.sdk.domain.order.OcsQueryJsfService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OcsCommonResult implements Serializable {
   private String reason;
   private String code;
   private List<OrderAmount> data;

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("data")
   public void setData(List<OrderAmount> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<OrderAmount> getData() {
      return this.data;
   }
}
