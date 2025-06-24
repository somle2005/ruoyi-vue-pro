package com.jd.open.api.sdk.domain.ydy.PullDataService.response.getTemplateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StandardTemplateDTO implements Serializable {
   private Integer standardTemplateId;
   private String standardTemplateName;
   private String standardTemplateUrl;
   private String standardWaybillType;

   @JsonProperty("standardTemplateId")
   public void setStandardTemplateId(Integer standardTemplateId) {
      this.standardTemplateId = standardTemplateId;
   }

   @JsonProperty("standardTemplateId")
   public Integer getStandardTemplateId() {
      return this.standardTemplateId;
   }

   @JsonProperty("standardTemplateName")
   public void setStandardTemplateName(String standardTemplateName) {
      this.standardTemplateName = standardTemplateName;
   }

   @JsonProperty("standardTemplateName")
   public String getStandardTemplateName() {
      return this.standardTemplateName;
   }

   @JsonProperty("standardTemplateUrl")
   public void setStandardTemplateUrl(String standardTemplateUrl) {
      this.standardTemplateUrl = standardTemplateUrl;
   }

   @JsonProperty("standardTemplateUrl")
   public String getStandardTemplateUrl() {
      return this.standardTemplateUrl;
   }

   @JsonProperty("standardWaybillType")
   public void setStandardWaybillType(String standardWaybillType) {
      this.standardWaybillType = standardWaybillType;
   }

   @JsonProperty("standardWaybillType")
   public String getStandardWaybillType() {
      return this.standardWaybillType;
   }
}
