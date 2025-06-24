package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ImagePathDtoGuide implements Serializable {
   private String pathGuide;
   private Integer operationType;
   private Integer orderSortGuide;

   @JsonProperty("path_guide")
   public void setPathGuide(String pathGuide) {
      this.pathGuide = pathGuide;
   }

   @JsonProperty("path_guide")
   public String getPathGuide() {
      return this.pathGuide;
   }

   @JsonProperty("operation_type")
   public void setOperationType(Integer operationType) {
      this.operationType = operationType;
   }

   @JsonProperty("operation_type")
   public Integer getOperationType() {
      return this.operationType;
   }

   @JsonProperty("order_sort_guide")
   public void setOrderSortGuide(Integer orderSortGuide) {
      this.orderSortGuide = orderSortGuide;
   }

   @JsonProperty("order_sort_guide")
   public Integer getOrderSortGuide() {
      return this.orderSortGuide;
   }
}
