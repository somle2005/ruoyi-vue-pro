package com.jd.open.api.sdk.domain.aqyzzx.SafeAuthenticationService.response.userUnifiedAuthentication;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AuthMethodVo implements Serializable {
   private String validateName;
   private String riskRule;
   private Integer validateType;

   @JsonProperty("validateName")
   public void setValidateName(String validateName) {
      this.validateName = validateName;
   }

   @JsonProperty("validateName")
   public String getValidateName() {
      return this.validateName;
   }

   @JsonProperty("riskRule")
   public void setRiskRule(String riskRule) {
      this.riskRule = riskRule;
   }

   @JsonProperty("riskRule")
   public String getRiskRule() {
      return this.riskRule;
   }

   @JsonProperty("validateType")
   public void setValidateType(Integer validateType) {
      this.validateType = validateType;
   }

   @JsonProperty("validateType")
   public Integer getValidateType() {
      return this.validateType;
   }
}
