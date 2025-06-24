package com.jd.open.api.sdk.domain.ware.JOSTextMaterialService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private Integer code;
   private Boolean success;
   private String message;
   private QueryTextMaterialResult data;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
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
   public void setData(QueryTextMaterialResult data) {
      this.data = data;
   }

   @JsonProperty("data")
   public QueryTextMaterialResult getData() {
      return this.data;
   }
}
