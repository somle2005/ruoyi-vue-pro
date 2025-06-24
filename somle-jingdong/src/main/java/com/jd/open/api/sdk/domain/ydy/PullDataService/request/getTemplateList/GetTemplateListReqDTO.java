package com.jd.open.api.sdk.domain.ydy.PullDataService.request.getTemplateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GetTemplateListReqDTO implements Serializable {
   private String templateId;
   private String templateType;
   private String wayTempleteType;
   private String cpCode;
   private String isvResourceType;

   @JsonProperty("templateId")
   public void setTemplateId(String templateId) {
      this.templateId = templateId;
   }

   @JsonProperty("templateId")
   public String getTemplateId() {
      return this.templateId;
   }

   @JsonProperty("templateType")
   public void setTemplateType(String templateType) {
      this.templateType = templateType;
   }

   @JsonProperty("templateType")
   public String getTemplateType() {
      return this.templateType;
   }

   @JsonProperty("wayTempleteType")
   public void setWayTempleteType(String wayTempleteType) {
      this.wayTempleteType = wayTempleteType;
   }

   @JsonProperty("wayTempleteType")
   public String getWayTempleteType() {
      return this.wayTempleteType;
   }

   @JsonProperty("cpCode")
   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   @JsonProperty("cpCode")
   public String getCpCode() {
      return this.cpCode;
   }

   @JsonProperty("isvResourceType")
   public void setIsvResourceType(String isvResourceType) {
      this.isvResourceType = isvResourceType;
   }

   @JsonProperty("isvResourceType")
   public String getIsvResourceType() {
      return this.isvResourceType;
   }
}
