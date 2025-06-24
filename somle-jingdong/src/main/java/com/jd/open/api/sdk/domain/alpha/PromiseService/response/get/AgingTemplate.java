package com.jd.open.api.sdk.domain.alpha.PromiseService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AgingTemplate implements Serializable {
   private Long templateId;
   private String templateName;

   @JsonProperty("templateId")
   public void setTemplateId(Long templateId) {
      this.templateId = templateId;
   }

   @JsonProperty("templateId")
   public Long getTemplateId() {
      return this.templateId;
   }

   @JsonProperty("templateName")
   public void setTemplateName(String templateName) {
      this.templateName = templateName;
   }

   @JsonProperty("templateName")
   public String getTemplateName() {
      return this.templateName;
   }
}
