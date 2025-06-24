package com.jd.open.api.sdk.domain.supplier.ProductConfigSdkService.response.set;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RpcResult implements Serializable {
   private boolean success;
   private String message;
   private List<ProductLowestBuyConfigRes> attribute2;

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

   @JsonProperty("attribute2")
   public void setAttribute2(List<ProductLowestBuyConfigRes> attribute2) {
      this.attribute2 = attribute2;
   }

   @JsonProperty("attribute2")
   public List<ProductLowestBuyConfigRes> getAttribute2() {
      return this.attribute2;
   }
}
