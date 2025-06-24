package com.jd.open.api.sdk.domain.ware.ProductPublishTemplateService.request.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ComponentRulesRequest implements Serializable {
   private Long lastCategoryId;
   private Long category3Id;
   private List<String> componentCodeList;
   private Long brandId;
   private String wareModel;
   private String scene;
   private Map<String, String> extra;

   @JsonProperty("lastCategoryId")
   public void setLastCategoryId(Long lastCategoryId) {
      this.lastCategoryId = lastCategoryId;
   }

   @JsonProperty("lastCategoryId")
   public Long getLastCategoryId() {
      return this.lastCategoryId;
   }

   @JsonProperty("category3Id")
   public void setCategory3Id(Long category3Id) {
      this.category3Id = category3Id;
   }

   @JsonProperty("category3Id")
   public Long getCategory3Id() {
      return this.category3Id;
   }

   @JsonProperty("componentCodeList")
   public void setComponentCodeList(List<String> componentCodeList) {
      this.componentCodeList = componentCodeList;
   }

   @JsonProperty("componentCodeList")
   public List<String> getComponentCodeList() {
      return this.componentCodeList;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("wareModel")
   public void setWareModel(String wareModel) {
      this.wareModel = wareModel;
   }

   @JsonProperty("wareModel")
   public String getWareModel() {
      return this.wareModel;
   }

   @JsonProperty("scene")
   public void setScene(String scene) {
      this.scene = scene;
   }

   @JsonProperty("scene")
   public String getScene() {
      return this.scene;
   }

   @JsonProperty("extra")
   public void setExtra(Map<String, String> extra) {
      this.extra = extra;
   }

   @JsonProperty("extra")
   public Map<String, String> getExtra() {
      return this.extra;
   }
}
