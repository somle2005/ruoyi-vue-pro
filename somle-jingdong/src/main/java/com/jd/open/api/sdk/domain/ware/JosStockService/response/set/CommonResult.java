package com.jd.open.api.sdk.domain.ware.JosStockService.response.set;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CommonResult implements Serializable {
   private Boolean success;
   private String errorMessage;
   private JosUpdateStockVo obj;

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

   @JsonProperty("obj")
   public void setObj(JosUpdateStockVo obj) {
      this.obj = obj;
   }

   @JsonProperty("obj")
   public JosUpdateStockVo getObj() {
      return this.obj;
   }
}
