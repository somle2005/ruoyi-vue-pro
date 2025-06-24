package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.getSupplierSkuInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class SupplierSkuInfoResp implements Serializable {
   private Map<String, String> result;
   private Long total;
   private int code;
   private String message;
   private String requestId;

   @JsonProperty("result")
   public void setResult(Map<String, String> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Map<String, String> getResult() {
      return this.result;
   }

   @JsonProperty("total")
   public void setTotal(Long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Long getTotal() {
      return this.total;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
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
