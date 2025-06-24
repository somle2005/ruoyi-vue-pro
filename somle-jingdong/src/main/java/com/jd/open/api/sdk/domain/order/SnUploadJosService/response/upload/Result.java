package com.jd.open.api.sdk.domain.order.SnUploadJosService.response.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private int code;
   private String message;
   private SnUploadResp snUploadResp;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
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

   @JsonProperty("snUploadResp")
   public void setSnUploadResp(SnUploadResp snUploadResp) {
      this.snUploadResp = snUploadResp;
   }

   @JsonProperty("snUploadResp")
   public SnUploadResp getSnUploadResp() {
      return this.snUploadResp;
   }
}
