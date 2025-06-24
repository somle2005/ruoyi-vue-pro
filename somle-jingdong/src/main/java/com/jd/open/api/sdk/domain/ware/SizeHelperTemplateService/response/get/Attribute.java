package com.jd.open.api.sdk.domain.ware.SizeHelperTemplateService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Attribute implements Serializable {
   private Long id;
   private Long templateType;
   private String attrName;
   private Integer isDefault;
   private String isSize;
   private Integer isRequired;
   private Integer inputType;
   private String values;
   private Integer index;
   private String note;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("templateType")
   public void setTemplateType(Long templateType) {
      this.templateType = templateType;
   }

   @JsonProperty("templateType")
   public Long getTemplateType() {
      return this.templateType;
   }

   @JsonProperty("attrName")
   public void setAttrName(String attrName) {
      this.attrName = attrName;
   }

   @JsonProperty("attrName")
   public String getAttrName() {
      return this.attrName;
   }

   @JsonProperty("isDefault")
   public void setIsDefault(Integer isDefault) {
      this.isDefault = isDefault;
   }

   @JsonProperty("isDefault")
   public Integer getIsDefault() {
      return this.isDefault;
   }

   @JsonProperty("isSize")
   public void setIsSize(String isSize) {
      this.isSize = isSize;
   }

   @JsonProperty("isSize")
   public String getIsSize() {
      return this.isSize;
   }

   @JsonProperty("isRequired")
   public void setIsRequired(Integer isRequired) {
      this.isRequired = isRequired;
   }

   @JsonProperty("isRequired")
   public Integer getIsRequired() {
      return this.isRequired;
   }

   @JsonProperty("inputType")
   public void setInputType(Integer inputType) {
      this.inputType = inputType;
   }

   @JsonProperty("inputType")
   public Integer getInputType() {
      return this.inputType;
   }

   @JsonProperty("values")
   public void setValues(String values) {
      this.values = values;
   }

   @JsonProperty("values")
   public String getValues() {
      return this.values;
   }

   @JsonProperty("index")
   public void setIndex(Integer index) {
      this.index = index;
   }

   @JsonProperty("index")
   public Integer getIndex() {
      return this.index;
   }

   @JsonProperty("note")
   public void setNote(String note) {
      this.note = note;
   }

   @JsonProperty("note")
   public String getNote() {
      return this.note;
   }
}
