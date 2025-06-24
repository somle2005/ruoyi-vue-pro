package com.jd.open.api.sdk.domain.innertest.OperatePayResource.response.OperatePayResource;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private Boolean success;
   private String code;
   private String info;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("info")
   public void setInfo(String info) {
      this.info = info;
   }

   @JsonProperty("info")
   public String getInfo() {
      return this.info;
   }
}
