package com.jd.open.api.sdk.domain.ydy.PullDataService.response.getTemplateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StandardTemplate implements Serializable {
   private String cpCode;
   private List<StandardTemplateDTO> standardTemplates;

   @JsonProperty("cpCode")
   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   @JsonProperty("cpCode")
   public String getCpCode() {
      return this.cpCode;
   }

   @JsonProperty("standardTemplates")
   public void setStandardTemplates(List<StandardTemplateDTO> standardTemplates) {
      this.standardTemplates = standardTemplates;
   }

   @JsonProperty("standardTemplates")
   public List<StandardTemplateDTO> getStandardTemplates() {
      return this.standardTemplates;
   }
}
