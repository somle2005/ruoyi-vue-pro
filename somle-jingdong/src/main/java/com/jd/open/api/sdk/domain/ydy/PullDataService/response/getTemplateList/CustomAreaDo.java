package com.jd.open.api.sdk.domain.ydy.PullDataService.response.getTemplateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CustomAreaDo implements Serializable {
   private Integer customAreaId;
   private String customAreaUrl;
   private List<String> keys;
   private String customAreaName;
   private String cpCode;
   private String standardTemplateUrl;
   private String standardTemplateId;
   private String standardTemplateName;
   private List<CustomAreaKeyResult> customAreaKeys;

   @JsonProperty("customAreaId")
   public void setCustomAreaId(Integer customAreaId) {
      this.customAreaId = customAreaId;
   }

   @JsonProperty("customAreaId")
   public Integer getCustomAreaId() {
      return this.customAreaId;
   }

   @JsonProperty("customAreaUrl")
   public void setCustomAreaUrl(String customAreaUrl) {
      this.customAreaUrl = customAreaUrl;
   }

   @JsonProperty("customAreaUrl")
   public String getCustomAreaUrl() {
      return this.customAreaUrl;
   }

   @JsonProperty("keys")
   public void setKeys(List<String> keys) {
      this.keys = keys;
   }

   @JsonProperty("keys")
   public List<String> getKeys() {
      return this.keys;
   }

   @JsonProperty("customAreaName")
   public void setCustomAreaName(String customAreaName) {
      this.customAreaName = customAreaName;
   }

   @JsonProperty("customAreaName")
   public String getCustomAreaName() {
      return this.customAreaName;
   }

   @JsonProperty("cpCode")
   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   @JsonProperty("cpCode")
   public String getCpCode() {
      return this.cpCode;
   }

   @JsonProperty("standardTemplateUrl")
   public void setStandardTemplateUrl(String standardTemplateUrl) {
      this.standardTemplateUrl = standardTemplateUrl;
   }

   @JsonProperty("standardTemplateUrl")
   public String getStandardTemplateUrl() {
      return this.standardTemplateUrl;
   }

   @JsonProperty("standardTemplateId")
   public void setStandardTemplateId(String standardTemplateId) {
      this.standardTemplateId = standardTemplateId;
   }

   @JsonProperty("standardTemplateId")
   public String getStandardTemplateId() {
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

   @JsonProperty("customAreaKeys")
   public void setCustomAreaKeys(List<CustomAreaKeyResult> customAreaKeys) {
      this.customAreaKeys = customAreaKeys;
   }

   @JsonProperty("customAreaKeys")
   public List<CustomAreaKeyResult> getCustomAreaKeys() {
      return this.customAreaKeys;
   }
}
