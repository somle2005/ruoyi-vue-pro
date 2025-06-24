package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CategorySaleAttrValueTemplateValueDto implements Serializable {
   private Integer orderSort;
   private Long fatherTemplateId;
   private String fatherTemplateName;
   private Long templateStandardId;
   private String name;
   private String id;
   private String value;

   @JsonProperty("orderSort")
   public void setOrderSort(Integer orderSort) {
      this.orderSort = orderSort;
   }

   @JsonProperty("orderSort")
   public Integer getOrderSort() {
      return this.orderSort;
   }

   @JsonProperty("fatherTemplateId")
   public void setFatherTemplateId(Long fatherTemplateId) {
      this.fatherTemplateId = fatherTemplateId;
   }

   @JsonProperty("fatherTemplateId")
   public Long getFatherTemplateId() {
      return this.fatherTemplateId;
   }

   @JsonProperty("fatherTemplateName")
   public void setFatherTemplateName(String fatherTemplateName) {
      this.fatherTemplateName = fatherTemplateName;
   }

   @JsonProperty("fatherTemplateName")
   public String getFatherTemplateName() {
      return this.fatherTemplateName;
   }

   @JsonProperty("templateStandardId")
   public void setTemplateStandardId(Long templateStandardId) {
      this.templateStandardId = templateStandardId;
   }

   @JsonProperty("templateStandardId")
   public Long getTemplateStandardId() {
      return this.templateStandardId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("value")
   public void setValue(String value) {
      this.value = value;
   }

   @JsonProperty("value")
   public String getValue() {
      return this.value;
   }
}
