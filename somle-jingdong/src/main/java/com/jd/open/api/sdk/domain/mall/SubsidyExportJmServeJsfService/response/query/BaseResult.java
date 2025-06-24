package com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseResult implements Serializable {
   private String code;
   private String message;
   private SubsidyImgDto data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("data")
   public void setData(SubsidyImgDto data) {
      this.data = data;
   }

   @JsonProperty("data")
   public SubsidyImgDto getData() {
      return this.data;
   }
}
