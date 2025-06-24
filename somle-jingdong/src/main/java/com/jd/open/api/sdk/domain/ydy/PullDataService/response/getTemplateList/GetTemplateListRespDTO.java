package com.jd.open.api.sdk.domain.ydy.PullDataService.response.getTemplateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GetTemplateListRespDTO implements Serializable {
   private String message;
   private String code;
   private TemplateDTO datas;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("datas")
   public void setDatas(TemplateDTO datas) {
      this.datas = datas;
   }

   @JsonProperty("datas")
   public TemplateDTO getDatas() {
      return this.datas;
   }
}
