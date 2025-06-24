package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ImagePathDtoLucency implements Serializable {
   private Integer isPrimaryLucency;
   private Integer orderSortLucency;
   private String pathLucency;

   @JsonProperty("is_primary_lucency")
   public void setIsPrimaryLucency(Integer isPrimaryLucency) {
      this.isPrimaryLucency = isPrimaryLucency;
   }

   @JsonProperty("is_primary_lucency")
   public Integer getIsPrimaryLucency() {
      return this.isPrimaryLucency;
   }

   @JsonProperty("order_sort_lucency")
   public void setOrderSortLucency(Integer orderSortLucency) {
      this.orderSortLucency = orderSortLucency;
   }

   @JsonProperty("order_sort_lucency")
   public Integer getOrderSortLucency() {
      return this.orderSortLucency;
   }

   @JsonProperty("path_lucency")
   public void setPathLucency(String pathLucency) {
      this.pathLucency = pathLucency;
   }

   @JsonProperty("path_lucency")
   public String getPathLucency() {
      return this.pathLucency;
   }
}
