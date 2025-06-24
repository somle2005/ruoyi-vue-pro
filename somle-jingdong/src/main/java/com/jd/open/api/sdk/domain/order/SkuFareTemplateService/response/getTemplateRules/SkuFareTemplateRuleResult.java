package com.jd.open.api.sdk.domain.order.SkuFareTemplateService.response.getTemplateRules;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuFareTemplateRuleResult implements Serializable {
   private String resultStr;
   private List<String> types;

   @JsonProperty("resultStr")
   public void setResultStr(String resultStr) {
      this.resultStr = resultStr;
   }

   @JsonProperty("resultStr")
   public String getResultStr() {
      return this.resultStr;
   }

   @JsonProperty("types")
   public void setTypes(List<String> types) {
      this.types = types;
   }

   @JsonProperty("types")
   public List<String> getTypes() {
      return this.types;
   }
}
