package com.jd.open.api.sdk.domain.list.CategoryAttrValueReadService.response.findValuesByIdUnlimit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class CategoryAttrValueUnlimit implements Serializable {
   private Long id;
   private Long attId;
   private Long catId;
   private String name;
   private Integer orderSort;
   private Set<Feature> features;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("attId")
   public void setAttId(Long attId) {
      this.attId = attId;
   }

   @JsonProperty("attId")
   public Long getAttId() {
      return this.attId;
   }

   @JsonProperty("catId")
   public void setCatId(Long catId) {
      this.catId = catId;
   }

   @JsonProperty("catId")
   public Long getCatId() {
      return this.catId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("orderSort")
   public void setOrderSort(Integer orderSort) {
      this.orderSort = orderSort;
   }

   @JsonProperty("orderSort")
   public Integer getOrderSort() {
      return this.orderSort;
   }

   @JsonProperty("features")
   public void setFeatures(Set<Feature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<Feature> getFeatures() {
      return this.features;
   }
}
