package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.setShopStockFixed;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ShopStockBaseResponse implements Serializable {
   private int responseCode;
   private String errMsg;
   private boolean success;
   private String requestId;

   @JsonProperty("responseCode")
   public void setResponseCode(int responseCode) {
      this.responseCode = responseCode;
   }

   @JsonProperty("responseCode")
   public int getResponseCode() {
      return this.responseCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }
}
