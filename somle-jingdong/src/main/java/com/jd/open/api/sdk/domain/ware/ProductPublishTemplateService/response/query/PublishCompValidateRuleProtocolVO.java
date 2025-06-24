package com.jd.open.api.sdk.domain.ware.ProductPublishTemplateService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublishCompValidateRuleProtocolVO implements Serializable {
   private String validateType;
   private Boolean distZhChar;
   private String validateValueType;
   private String validateTips;
   private Object validateRule;

   @JsonProperty("validateType")
   public void setValidateType(String validateType) {
      this.validateType = validateType;
   }

   @JsonProperty("validateType")
   public String getValidateType() {
      return this.validateType;
   }

   @JsonProperty("distZhChar")
   public void setDistZhChar(Boolean distZhChar) {
      this.distZhChar = distZhChar;
   }

   @JsonProperty("distZhChar")
   public Boolean getDistZhChar() {
      return this.distZhChar;
   }

   @JsonProperty("validateValueType")
   public void setValidateValueType(String validateValueType) {
      this.validateValueType = validateValueType;
   }

   @JsonProperty("validateValueType")
   public String getValidateValueType() {
      return this.validateValueType;
   }

   @JsonProperty("validateTips")
   public void setValidateTips(String validateTips) {
      this.validateTips = validateTips;
   }

   @JsonProperty("validateTips")
   public String getValidateTips() {
      return this.validateTips;
   }

   @JsonProperty("validateRule")
   public void setValidateRule(Object validateRule) {
      this.validateRule = validateRule;
   }

   @JsonProperty("validateRule")
   public Object getValidateRule() {
      return this.validateRule;
   }
}
