package com.jd.open.api.sdk.domain.order.SendPromiseTemplateJsfService.response.querySendTemplateByCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SendPromiseTemplateDto implements Serializable {
   private Long templateId;
   private String templateName;
   private Boolean recommendFlag;

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

   @JsonProperty("recommendFlag")
   public void setRecommendFlag(Boolean recommendFlag) {
      this.recommendFlag = recommendFlag;
   }

   @JsonProperty("recommendFlag")
   public Boolean getRecommendFlag() {
      return this.recommendFlag;
   }
}
