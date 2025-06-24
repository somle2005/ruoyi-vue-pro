package com.jd.open.api.sdk.domain.order.IOrderBusinessUploadService.response.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ApiSafResult implements Serializable {
   private boolean success;
   private String resultCode;
   private String resultDescribe;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultDescribe")
   public void setResultDescribe(String resultDescribe) {
      this.resultDescribe = resultDescribe;
   }

   @JsonProperty("resultDescribe")
   public String getResultDescribe() {
      return this.resultDescribe;
   }
}
