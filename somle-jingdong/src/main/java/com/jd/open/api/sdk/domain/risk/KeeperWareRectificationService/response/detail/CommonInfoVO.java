package com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class CommonInfoVO implements Serializable {
   private Set<String> reasons;
   private String fieldKey;
   private String before;
   private String after;
   private String fieldKeyName;

   @JsonProperty("reasons")
   public void setReasons(Set<String> reasons) {
      this.reasons = reasons;
   }

   @JsonProperty("reasons")
   public Set<String> getReasons() {
      return this.reasons;
   }

   @JsonProperty("fieldKey")
   public void setFieldKey(String fieldKey) {
      this.fieldKey = fieldKey;
   }

   @JsonProperty("fieldKey")
   public String getFieldKey() {
      return this.fieldKey;
   }

   @JsonProperty("before")
   public void setBefore(String before) {
      this.before = before;
   }

   @JsonProperty("before")
   public String getBefore() {
      return this.before;
   }

   @JsonProperty("after")
   public void setAfter(String after) {
      this.after = after;
   }

   @JsonProperty("after")
   public String getAfter() {
      return this.after;
   }

   @JsonProperty("fieldKeyName")
   public void setFieldKeyName(String fieldKeyName) {
      this.fieldKeyName = fieldKeyName;
   }

   @JsonProperty("fieldKeyName")
   public String getFieldKeyName() {
      return this.fieldKeyName;
   }
}
