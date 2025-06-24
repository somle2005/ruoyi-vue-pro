package com.jd.open.api.sdk.domain.ydy.PullDataService.response.getTemplateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UserTemplateDTO implements Serializable {
   private List<String> keys;
   private String userStdTemplateUrl;
   private Integer userStdTemplateId;
   private String userStdTemplateName;

   @JsonProperty("keys")
   public void setKeys(List<String> keys) {
      this.keys = keys;
   }

   @JsonProperty("keys")
   public List<String> getKeys() {
      return this.keys;
   }

   @JsonProperty("userStdTemplateUrl")
   public void setUserStdTemplateUrl(String userStdTemplateUrl) {
      this.userStdTemplateUrl = userStdTemplateUrl;
   }

   @JsonProperty("userStdTemplateUrl")
   public String getUserStdTemplateUrl() {
      return this.userStdTemplateUrl;
   }

   @JsonProperty("userStdTemplateId")
   public void setUserStdTemplateId(Integer userStdTemplateId) {
      this.userStdTemplateId = userStdTemplateId;
   }

   @JsonProperty("userStdTemplateId")
   public Integer getUserStdTemplateId() {
      return this.userStdTemplateId;
   }

   @JsonProperty("userStdTemplateName")
   public void setUserStdTemplateName(String userStdTemplateName) {
      this.userStdTemplateName = userStdTemplateName;
   }

   @JsonProperty("userStdTemplateName")
   public String getUserStdTemplateName() {
      return this.userStdTemplateName;
   }
}
