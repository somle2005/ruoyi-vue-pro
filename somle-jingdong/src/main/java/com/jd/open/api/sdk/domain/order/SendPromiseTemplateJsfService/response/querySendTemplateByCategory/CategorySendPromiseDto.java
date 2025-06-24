package com.jd.open.api.sdk.domain.order.SendPromiseTemplateJsfService.response.querySendTemplateByCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CategorySendPromiseDto implements Serializable {
   private Boolean supportFlag;
   private Boolean requiredFlag;
   private Integer bindType;
   private List<SendPromiseTemplateDto> promiseTemplateDtoList;

   @JsonProperty("supportFlag")
   public void setSupportFlag(Boolean supportFlag) {
      this.supportFlag = supportFlag;
   }

   @JsonProperty("supportFlag")
   public Boolean getSupportFlag() {
      return this.supportFlag;
   }

   @JsonProperty("requiredFlag")
   public void setRequiredFlag(Boolean requiredFlag) {
      this.requiredFlag = requiredFlag;
   }

   @JsonProperty("requiredFlag")
   public Boolean getRequiredFlag() {
      return this.requiredFlag;
   }

   @JsonProperty("bindType")
   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   @JsonProperty("bindType")
   public Integer getBindType() {
      return this.bindType;
   }

   @JsonProperty("promiseTemplateDtoList")
   public void setPromiseTemplateDtoList(List<SendPromiseTemplateDto> promiseTemplateDtoList) {
      this.promiseTemplateDtoList = promiseTemplateDtoList;
   }

   @JsonProperty("promiseTemplateDtoList")
   public List<SendPromiseTemplateDto> getPromiseTemplateDtoList() {
      return this.promiseTemplateDtoList;
   }
}
