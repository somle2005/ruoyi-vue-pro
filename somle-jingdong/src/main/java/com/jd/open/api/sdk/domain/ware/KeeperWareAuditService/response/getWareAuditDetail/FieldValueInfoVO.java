package com.jd.open.api.sdk.domain.ware.KeeperWareAuditService.response.getWareAuditDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FieldValueInfoVO implements Serializable {
   private ViolationInfo violationInfo;
   private String fieldValueName;
   private String fieldValue;

   @JsonProperty("violationInfo")
   public void setViolationInfo(ViolationInfo violationInfo) {
      this.violationInfo = violationInfo;
   }

   @JsonProperty("violationInfo")
   public ViolationInfo getViolationInfo() {
      return this.violationInfo;
   }

   @JsonProperty("fieldValueName")
   public void setFieldValueName(String fieldValueName) {
      this.fieldValueName = fieldValueName;
   }

   @JsonProperty("fieldValueName")
   public String getFieldValueName() {
      return this.fieldValueName;
   }

   @JsonProperty("fieldValue")
   public void setFieldValue(String fieldValue) {
      this.fieldValue = fieldValue;
   }

   @JsonProperty("fieldValue")
   public String getFieldValue() {
      return this.fieldValue;
   }
}
