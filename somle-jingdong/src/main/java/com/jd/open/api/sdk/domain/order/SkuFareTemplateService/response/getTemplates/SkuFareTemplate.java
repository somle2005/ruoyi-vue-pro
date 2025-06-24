package com.jd.open.api.sdk.domain.order.SkuFareTemplateService.response.getTemplates;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuFareTemplate implements Serializable {
   private Long id;
   private Integer index;
   private String templateName;
   private Integer ruleType;
   private Integer isFree;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("index")
   public void setIndex(Integer index) {
      this.index = index;
   }

   @JsonProperty("index")
   public Integer getIndex() {
      return this.index;
   }

   @JsonProperty("template_name")
   public void setTemplateName(String templateName) {
      this.templateName = templateName;
   }

   @JsonProperty("template_name")
   public String getTemplateName() {
      return this.templateName;
   }

   @JsonProperty("rule_type")
   public void setRuleType(Integer ruleType) {
      this.ruleType = ruleType;
   }

   @JsonProperty("rule_type")
   public Integer getRuleType() {
      return this.ruleType;
   }

   @JsonProperty("is_free")
   public void setIsFree(Integer isFree) {
      this.isFree = isFree;
   }

   @JsonProperty("is_free")
   public Integer getIsFree() {
      return this.isFree;
   }
}
