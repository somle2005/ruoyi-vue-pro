package com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.queryUlOrderByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UlItemBatchResult implements Serializable {
   private String orderLine;
   private Integer realQty;
   private String batchNo;
   private List<UlItemBatchRefResult> batchRefResultList;

   @JsonProperty("orderLine")
   public void setOrderLine(String orderLine) {
      this.orderLine = orderLine;
   }

   @JsonProperty("orderLine")
   public String getOrderLine() {
      return this.orderLine;
   }

   @JsonProperty("realQty")
   public void setRealQty(Integer realQty) {
      this.realQty = realQty;
   }

   @JsonProperty("realQty")
   public Integer getRealQty() {
      return this.realQty;
   }

   @JsonProperty("batchNo")
   public void setBatchNo(String batchNo) {
      this.batchNo = batchNo;
   }

   @JsonProperty("batchNo")
   public String getBatchNo() {
      return this.batchNo;
   }

   @JsonProperty("batchRefResultList")
   public void setBatchRefResultList(List<UlItemBatchRefResult> batchRefResultList) {
      this.batchRefResultList = batchRefResultList;
   }

   @JsonProperty("batchRefResultList")
   public List<UlItemBatchRefResult> getBatchRefResultList() {
      return this.batchRefResultList;
   }
}
