package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class CategorySaleAttrValueTemplateDto implements Serializable {
   private Integer isRequired;
   private Integer orderSort;
   private Integer type;
   private Long valueTemplateId;
   private List<CategorySaleAttrValueTemplateValueDto> categorySaleAttrValueTemplateValues;
   private Integer isLock;
   private Integer exclusive;
   private String attName;
   private String prompts;
   private String attId;
   private Map<String, String> features;

   @JsonProperty("isRequired")
   public void setIsRequired(Integer isRequired) {
      this.isRequired = isRequired;
   }

   @JsonProperty("isRequired")
   public Integer getIsRequired() {
      return this.isRequired;
   }

   @JsonProperty("orderSort")
   public void setOrderSort(Integer orderSort) {
      this.orderSort = orderSort;
   }

   @JsonProperty("orderSort")
   public Integer getOrderSort() {
      return this.orderSort;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("valueTemplateId")
   public void setValueTemplateId(Long valueTemplateId) {
      this.valueTemplateId = valueTemplateId;
   }

   @JsonProperty("valueTemplateId")
   public Long getValueTemplateId() {
      return this.valueTemplateId;
   }

   @JsonProperty("categorySaleAttrValueTemplateValues")
   public void setCategorySaleAttrValueTemplateValues(List<CategorySaleAttrValueTemplateValueDto> categorySaleAttrValueTemplateValues) {
      this.categorySaleAttrValueTemplateValues = categorySaleAttrValueTemplateValues;
   }

   @JsonProperty("categorySaleAttrValueTemplateValues")
   public List<CategorySaleAttrValueTemplateValueDto> getCategorySaleAttrValueTemplateValues() {
      return this.categorySaleAttrValueTemplateValues;
   }

   @JsonProperty("isLock")
   public void setIsLock(Integer isLock) {
      this.isLock = isLock;
   }

   @JsonProperty("isLock")
   public Integer getIsLock() {
      return this.isLock;
   }

   @JsonProperty("exclusive")
   public void setExclusive(Integer exclusive) {
      this.exclusive = exclusive;
   }

   @JsonProperty("exclusive")
   public Integer getExclusive() {
      return this.exclusive;
   }

   @JsonProperty("attName")
   public void setAttName(String attName) {
      this.attName = attName;
   }

   @JsonProperty("attName")
   public String getAttName() {
      return this.attName;
   }

   @JsonProperty("prompts")
   public void setPrompts(String prompts) {
      this.prompts = prompts;
   }

   @JsonProperty("prompts")
   public String getPrompts() {
      return this.prompts;
   }

   @JsonProperty("attId")
   public void setAttId(String attId) {
      this.attId = attId;
   }

   @JsonProperty("attId")
   public String getAttId() {
      return this.attId;
   }

   @JsonProperty("features")
   public void setFeatures(Map<String, String> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Map<String, String> getFeatures() {
      return this.features;
   }
}
