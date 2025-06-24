package com.jd.open.api.sdk.domain.ware.ProductPublishTemplateService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ComponentRulesVO implements Serializable {
   private List<PublishCompValidateRuleProtocolVO> validateRuleList;
   private String componentCode;
   private Boolean success;
   private String errorMsg;

   @JsonProperty("validateRuleList")
   public void setValidateRuleList(List<PublishCompValidateRuleProtocolVO> validateRuleList) {
      this.validateRuleList = validateRuleList;
   }

   @JsonProperty("validateRuleList")
   public List<PublishCompValidateRuleProtocolVO> getValidateRuleList() {
      return this.validateRuleList;
   }

   @JsonProperty("componentCode")
   public void setComponentCode(String componentCode) {
      this.componentCode = componentCode;
   }

   @JsonProperty("componentCode")
   public String getComponentCode() {
      return this.componentCode;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}
