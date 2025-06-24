package com.jd.open.api.sdk.domain.iopsp.QueryGoodsOpenProvider.response.getSkuStateListForSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BaseRpcResponse implements Serializable {
   private String code;
   private boolean success;
   private String message;
   private List<GetSkuStateGoodsResp> data;

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

   @JsonProperty("data")
   public void setData(List<GetSkuStateGoodsResp> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<GetSkuStateGoodsResp> getData() {
      return this.data;
   }
}
