package com.jd.open.api.sdk.domain.sku.IOaidService.response.decrypt;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResponseData implements Serializable {
   private int code;
   private String requestId;
   private String message;
   private List<OrderReceiverInfoModel> data;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
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
   public void setData(List<OrderReceiverInfoModel> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<OrderReceiverInfoModel> getData() {
      return this.data;
   }
}
