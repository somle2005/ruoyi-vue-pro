package com.jd.open.api.sdk.domain.ydy.PullDataService.response.getTemplateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UserTemplate implements Serializable {
   private String cpCode;
   private List<UserTemplateDTO> userStdTemplates;

   @JsonProperty("cpCode")
   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   @JsonProperty("cpCode")
   public String getCpCode() {
      return this.cpCode;
   }

   @JsonProperty("userStdTemplates")
   public void setUserStdTemplates(List<UserTemplateDTO> userStdTemplates) {
      this.userStdTemplates = userStdTemplates;
   }

   @JsonProperty("userStdTemplates")
   public List<UserTemplateDTO> getUserStdTemplates() {
      return this.userStdTemplates;
   }
}
