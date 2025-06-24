package com.jd.open.api.sdk.domain.order.SkuFareTemplateService.response.getTemplates;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuFareTemplateResult implements Serializable {
   private String resultStr;
   private List<SkuFareTemplate> templateList;

   @JsonProperty("resultStr")
   public void setResultStr(String resultStr) {
      this.resultStr = resultStr;
   }

   @JsonProperty("resultStr")
   public String getResultStr() {
      return this.resultStr;
   }

   @JsonProperty("template_list")
   public void setTemplateList(List<SkuFareTemplate> templateList) {
      this.templateList = templateList;
   }

   @JsonProperty("template_list")
   public List<SkuFareTemplate> getTemplateList() {
      return this.templateList;
   }
}
