package com.jd.open.api.sdk.domain.youE.OrderModuleExportService.request.receiveOrderParts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderPartsParam implements Serializable {
   private List<OrderPart> orderPartList;
   private String orderNo;

   @JsonProperty("orderPartList")
   public void setOrderPartList(List<OrderPart> orderPartList) {
      this.orderPartList = orderPartList;
   }

   @JsonProperty("orderPartList")
   public List<OrderPart> getOrderPartList() {
      return this.orderPartList;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }
}
