package com.jd.open.api.sdk.domain.jialilue.IOpenOrderService.response.syncOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String code;
   private boolean success;
   private String message;
   private DockOrderInfo dockOrderInfo;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

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

   @JsonProperty("dockOrderInfo")
   public void setDockOrderInfo(DockOrderInfo dockOrderInfo) {
      this.dockOrderInfo = dockOrderInfo;
   }

   @JsonProperty("dockOrderInfo")
   public DockOrderInfo getDockOrderInfo() {
      return this.dockOrderInfo;
   }
}
