package com.jd.open.api.sdk.domain.supplier.ProductConfigSdkService.response.setProductConfig;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RpcResult implements Serializable {
   private boolean success;
   private String message;
   private List<ProductConfigRes> data;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
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
   public void setData(List<ProductConfigRes> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<ProductConfigRes> getData() {
      return this.data;
   }
}
