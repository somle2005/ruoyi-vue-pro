package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BasicInfoDynamicFieldDto implements Serializable {
   private Long id;
   private Integer cid3;
   private String fieldId;
   private String fieldName;
   private String fieldLength;
   private String fieldValue;
   private Integer fieldType;
   private Integer isNecessary;
   private Integer isShow;
   private Integer offset;
   private Integer limit;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("cid3")
   public void setCid3(Integer cid3) {
      this.cid3 = cid3;
   }

   @JsonProperty("cid3")
   public Integer getCid3() {
      return this.cid3;
   }

   @JsonProperty("field_id")
   public void setFieldId(String fieldId) {
      this.fieldId = fieldId;
   }

   @JsonProperty("field_id")
   public String getFieldId() {
      return this.fieldId;
   }

   @JsonProperty("field_name")
   public void setFieldName(String fieldName) {
      this.fieldName = fieldName;
   }

   @JsonProperty("field_name")
   public String getFieldName() {
      return this.fieldName;
   }

   @JsonProperty("field_length")
   public void setFieldLength(String fieldLength) {
      this.fieldLength = fieldLength;
   }

   @JsonProperty("field_length")
   public String getFieldLength() {
      return this.fieldLength;
   }

   @JsonProperty("field_value")
   public void setFieldValue(String fieldValue) {
      this.fieldValue = fieldValue;
   }

   @JsonProperty("field_value")
   public String getFieldValue() {
      return this.fieldValue;
   }

   @JsonProperty("field_type")
   public void setFieldType(Integer fieldType) {
      this.fieldType = fieldType;
   }

   @JsonProperty("field_type")
   public Integer getFieldType() {
      return this.fieldType;
   }

   @JsonProperty("is_necessary")
   public void setIsNecessary(Integer isNecessary) {
      this.isNecessary = isNecessary;
   }

   @JsonProperty("is_necessary")
   public Integer getIsNecessary() {
      return this.isNecessary;
   }

   @JsonProperty("is_show")
   public void setIsShow(Integer isShow) {
      this.isShow = isShow;
   }

   @JsonProperty("is_show")
   public Integer getIsShow() {
      return this.isShow;
   }

   @JsonProperty("offset")
   public void setOffset(Integer offset) {
      this.offset = offset;
   }

   @JsonProperty("offset")
   public Integer getOffset() {
      return this.offset;
   }

   @JsonProperty("limit")
   public void setLimit(Integer limit) {
      this.limit = limit;
   }

   @JsonProperty("limit")
   public Integer getLimit() {
      return this.limit;
   }
}
