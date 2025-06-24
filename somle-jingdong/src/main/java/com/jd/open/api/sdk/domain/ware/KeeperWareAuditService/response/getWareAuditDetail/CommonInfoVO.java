package com.jd.open.api.sdk.domain.ware.KeeperWareAuditService.response.getWareAuditDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CommonInfoVO implements Serializable {
   private String fieldKey;
   private ViolationInfo violationInfo;
   private Integer fieldValueType;
   private String fieldKeyName;
   private List<FieldValueInfoVO> fieldValueInfoVOList;

   @JsonProperty("fieldKey")
   public void setFieldKey(String fieldKey) {
      this.fieldKey = fieldKey;
   }

   @JsonProperty("fieldKey")
   public String getFieldKey() {
      return this.fieldKey;
   }

   @JsonProperty("violationInfo")
   public void setViolationInfo(ViolationInfo violationInfo) {
      this.violationInfo = violationInfo;
   }

   @JsonProperty("violationInfo")
   public ViolationInfo getViolationInfo() {
      return this.violationInfo;
   }

   @JsonProperty("fieldValueType")
   public void setFieldValueType(Integer fieldValueType) {
      this.fieldValueType = fieldValueType;
   }

   @JsonProperty("fieldValueType")
   public Integer getFieldValueType() {
      return this.fieldValueType;
   }

   @JsonProperty("fieldKeyName")
   public void setFieldKeyName(String fieldKeyName) {
      this.fieldKeyName = fieldKeyName;
   }

   @JsonProperty("fieldKeyName")
   public String getFieldKeyName() {
      return this.fieldKeyName;
   }

   @JsonProperty("fieldValueInfoVOList")
   public void setFieldValueInfoVOList(List<FieldValueInfoVO> fieldValueInfoVOList) {
      this.fieldValueInfoVOList = fieldValueInfoVOList;
   }

   @JsonProperty("fieldValueInfoVOList")
   public List<FieldValueInfoVO> getFieldValueInfoVOList() {
      return this.fieldValueInfoVOList;
   }
}
