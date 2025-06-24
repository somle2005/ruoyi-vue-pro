package com.jd.open.api.sdk.domain.youE.OrderConfirmExportService.request.orderConfirm;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderStatusConfirmParam implements Serializable {
   private List<String> orderNos;
   private String opType;

   @JsonProperty("orderNos")
   public void setOrderNos(List<String> orderNos) {
      this.orderNos = orderNos;
   }

   @JsonProperty("orderNos")
   public List<String> getOrderNos() {
      return this.orderNos;
   }

   @JsonProperty("opType")
   public void setOpType(String opType) {
      this.opType = opType;
   }

   @JsonProperty("opType")
   public String getOpType() {
      return this.opType;
   }
}
