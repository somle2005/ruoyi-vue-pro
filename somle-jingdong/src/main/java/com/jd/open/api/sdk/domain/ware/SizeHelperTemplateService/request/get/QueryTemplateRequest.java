package com.jd.open.api.sdk.domain.ware.SizeHelperTemplateService.request.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QueryTemplateRequest implements Serializable {
   private Long templateId;
   private Integer userType;

   @JsonProperty("templateId")
   public void setTemplateId(Long templateId) {
      this.templateId = templateId;
   }

   @JsonProperty("templateId")
   public Long getTemplateId() {
      return this.templateId;
   }

   @JsonProperty("userType")
   public void setUserType(Integer userType) {
      this.userType = userType;
   }

   @JsonProperty("userType")
   public Integer getUserType() {
      return this.userType;
   }
}
