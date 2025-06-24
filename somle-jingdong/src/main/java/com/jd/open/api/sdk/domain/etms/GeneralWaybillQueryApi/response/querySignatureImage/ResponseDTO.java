package com.jd.open.api.sdk.domain.etms.GeneralWaybillQueryApi.response.querySignatureImage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseDTO implements Serializable {
   private Integer statusCode;
   private String statusMessage;
   private SignatureImageDTO data;

   @JsonProperty("statusCode")
   public void setStatusCode(Integer statusCode) {
      this.statusCode = statusCode;
   }

   @JsonProperty("statusCode")
   public Integer getStatusCode() {
      return this.statusCode;
   }

   @JsonProperty("statusMessage")
   public void setStatusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
   }

   @JsonProperty("statusMessage")
   public String getStatusMessage() {
      return this.statusMessage;
   }

   @JsonProperty("data")
   public void setData(SignatureImageDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public SignatureImageDTO getData() {
      return this.data;
   }
}
