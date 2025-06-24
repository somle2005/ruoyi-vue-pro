package com.jd.open.api.sdk.domain.hudong.SuitPromoInitOuterService.response.SuitPromoInitOuterService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ElementConfig implements Serializable {
   private List<Boolean> data;
   private List<Boolean> defaultValues;
   private boolean check;
   private boolean required;
   private String status;
   private Boolean defaultValue;

   @JsonProperty("data")
   public void setData(List<Boolean> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<Boolean> getData() {
      return this.data;
   }

   @JsonProperty("defaultValues")
   public void setDefaultValues(List<Boolean> defaultValues) {
      this.defaultValues = defaultValues;
   }

   @JsonProperty("defaultValues")
   public List<Boolean> getDefaultValues() {
      return this.defaultValues;
   }

   @JsonProperty("check")
   public void setCheck(boolean check) {
      this.check = check;
   }

   @JsonProperty("check")
   public boolean getCheck() {
      return this.check;
   }

   @JsonProperty("required")
   public void setRequired(boolean required) {
      this.required = required;
   }

   @JsonProperty("required")
   public boolean getRequired() {
      return this.required;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("defaultValue")
   public void setDefaultValue(Boolean defaultValue) {
      this.defaultValue = defaultValue;
   }

   @JsonProperty("defaultValue")
   public Boolean getDefaultValue() {
      return this.defaultValue;
   }
}
