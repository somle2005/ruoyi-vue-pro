package com.jd.open.api.sdk.domain.ware.ImageReadJosService.response.findTerminalImages;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosResult implements Serializable {
   private Boolean success;
   private String errorMessage;
   private String errorCode;
   private List<JosTerminalImage> obj;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorMessage")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("errorMessage")
   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("obj")
   public void setObj(List<JosTerminalImage> obj) {
      this.obj = obj;
   }

   @JsonProperty("obj")
   public List<JosTerminalImage> getObj() {
      return this.obj;
   }
}
