package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Image implements Serializable {
   private Long id;
   private Long skuId;
   private String path;
   private Integer yn;
   private Integer isPrimary;
   private Integer orderSort;
   private Integer position;
   private Integer type;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("path")
   public void setPath(String path) {
      this.path = path;
   }

   @JsonProperty("path")
   public String getPath() {
      return this.path;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("is_primary")
   public void setIsPrimary(Integer isPrimary) {
      this.isPrimary = isPrimary;
   }

   @JsonProperty("is_primary")
   public Integer getIsPrimary() {
      return this.isPrimary;
   }

   @JsonProperty("orderSort")
   public void setOrderSort(Integer orderSort) {
      this.orderSort = orderSort;
   }

   @JsonProperty("orderSort")
   public Integer getOrderSort() {
      return this.orderSort;
   }

   @JsonProperty("position")
   public void setPosition(Integer position) {
      this.position = position;
   }

   @JsonProperty("position")
   public Integer getPosition() {
      return this.position;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }
}
