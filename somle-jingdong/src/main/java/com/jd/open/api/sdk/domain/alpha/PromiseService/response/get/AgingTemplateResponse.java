package com.jd.open.api.sdk.domain.alpha.PromiseService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AgingTemplateResponse implements Serializable {
   private Integer resultCode;
   private String resultMsg;
   private List<AgingTemplate> agingTemplateList;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("agingTemplateList")
   public void setAgingTemplateList(List<AgingTemplate> agingTemplateList) {
      this.agingTemplateList = agingTemplateList;
   }

   @JsonProperty("agingTemplateList")
   public List<AgingTemplate> getAgingTemplateList() {
      return this.agingTemplateList;
   }
}
