package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ImagePathDto implements Serializable {
   private Integer isPrimary;
   private Integer orderSort;
   private String path;
   private Integer isGgt;

   @JsonProperty("is_primary")
   public void setIsPrimary(Integer isPrimary) {
      this.isPrimary = isPrimary;
   }

   @JsonProperty("is_primary")
   public Integer getIsPrimary() {
      return this.isPrimary;
   }

   @JsonProperty("order_sort")
   public void setOrderSort(Integer orderSort) {
      this.orderSort = orderSort;
   }

   @JsonProperty("order_sort")
   public Integer getOrderSort() {
      return this.orderSort;
   }

   @JsonProperty("path")
   public void setPath(String path) {
      this.path = path;
   }

   @JsonProperty("path")
   public String getPath() {
      return this.path;
   }

   @JsonProperty("is_ggt")
   public void setIsGgt(Integer isGgt) {
      this.isGgt = isGgt;
   }

   @JsonProperty("is_ggt")
   public Integer getIsGgt() {
      return this.isGgt;
   }
}
