package com.jd.open.api.sdk.domain.c2mdzkfpt.CustomOrderInfoOpenService.response.getOrderCustomInfos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CustomOrderInfoBatchResultEntity implements Serializable {
   private List<CustomOrderInfoEntity> result;
   private long total;
   private Boolean success;
   private String errorCode;
   private String errorMsg;

   @JsonProperty("result")
   public void setResult(List<CustomOrderInfoEntity> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<CustomOrderInfoEntity> getResult() {
      return this.result;
   }

   @JsonProperty("total")
   public void setTotal(long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public long getTotal() {
      return this.total;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}
