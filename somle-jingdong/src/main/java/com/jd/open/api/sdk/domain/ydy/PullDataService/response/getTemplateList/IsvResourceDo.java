package com.jd.open.api.sdk.domain.ydy.PullDataService.response.getTemplateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class IsvResourceDo implements Serializable {
   private String resourceContent;
   private Integer resourceId;
   private String resourceName;
   private String resourceType;
   private String resourceUrl;

   @JsonProperty("resourceContent")
   public void setResourceContent(String resourceContent) {
      this.resourceContent = resourceContent;
   }

   @JsonProperty("resourceContent")
   public String getResourceContent() {
      return this.resourceContent;
   }

   @JsonProperty("resourceId")
   public void setResourceId(Integer resourceId) {
      this.resourceId = resourceId;
   }

   @JsonProperty("resourceId")
   public Integer getResourceId() {
      return this.resourceId;
   }

   @JsonProperty("resourceName")
   public void setResourceName(String resourceName) {
      this.resourceName = resourceName;
   }

   @JsonProperty("resourceName")
   public String getResourceName() {
      return this.resourceName;
   }

   @JsonProperty("resourceType")
   public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
   }

   @JsonProperty("resourceType")
   public String getResourceType() {
      return this.resourceType;
   }

   @JsonProperty("resourceUrl")
   public void setResourceUrl(String resourceUrl) {
      this.resourceUrl = resourceUrl;
   }

   @JsonProperty("resourceUrl")
   public String getResourceUrl() {
      return this.resourceUrl;
   }
}
