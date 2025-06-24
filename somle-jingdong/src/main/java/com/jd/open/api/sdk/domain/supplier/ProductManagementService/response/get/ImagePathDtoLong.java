package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ImagePathDtoLong implements Serializable {
   private Integer isPrimaryLong;
   private Integer orderSortLong;
   private String pathLong;
   private Integer isGgtLong;

   @JsonProperty("is_primary_long")
   public void setIsPrimaryLong(Integer isPrimaryLong) {
      this.isPrimaryLong = isPrimaryLong;
   }

   @JsonProperty("is_primary_long")
   public Integer getIsPrimaryLong() {
      return this.isPrimaryLong;
   }

   @JsonProperty("order_sort_long")
   public void setOrderSortLong(Integer orderSortLong) {
      this.orderSortLong = orderSortLong;
   }

   @JsonProperty("order_sort_long")
   public Integer getOrderSortLong() {
      return this.orderSortLong;
   }

   @JsonProperty("path_long")
   public void setPathLong(String pathLong) {
      this.pathLong = pathLong;
   }

   @JsonProperty("path_long")
   public String getPathLong() {
      return this.pathLong;
   }

   @JsonProperty("is_ggt_long")
   public void setIsGgtLong(Integer isGgtLong) {
      this.isGgtLong = isGgtLong;
   }

   @JsonProperty("is_ggt_long")
   public Integer getIsGgtLong() {
      return this.isGgtLong;
   }
}
