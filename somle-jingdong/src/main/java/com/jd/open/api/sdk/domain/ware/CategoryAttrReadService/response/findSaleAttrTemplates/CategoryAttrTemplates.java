package com.jd.open.api.sdk.domain.ware.CategoryAttrReadService.response.findSaleAttrTemplates;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CategoryAttrTemplates implements Serializable {
   private String templateType;
   private String templateData;

   @JsonProperty("templateType")
   public void setTemplateType(String templateType) {
      this.templateType = templateType;
   }

   @JsonProperty("templateType")
   public String getTemplateType() {
      return this.templateType;
   }

   @JsonProperty("templateData")
   public void setTemplateData(String templateData) {
      this.templateData = templateData;
   }

   @JsonProperty("templateData")
   public String getTemplateData() {
      return this.templateData;
   }
}
