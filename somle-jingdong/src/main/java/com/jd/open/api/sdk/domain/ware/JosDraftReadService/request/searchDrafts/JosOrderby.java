package com.jd.open.api.sdk.domain.ware.JosDraftReadService.request.searchDrafts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosOrderby implements Serializable {
   private String orderField;
   private String orderType;

   @JsonProperty("orderField")
   public void setOrderField(String orderField) {
      this.orderField = orderField;
   }

   @JsonProperty("orderField")
   public String getOrderField() {
      return this.orderField;
   }

   @JsonProperty("orderType")
   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public String getOrderType() {
      return this.orderType;
   }
}
