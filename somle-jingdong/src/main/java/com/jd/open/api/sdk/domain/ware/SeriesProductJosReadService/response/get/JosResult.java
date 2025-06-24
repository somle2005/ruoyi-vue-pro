package com.jd.open.api.sdk.domain.ware.SeriesProductJosReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosResult implements Serializable {
   private Boolean success;
   private Integer errorCode;
   private String errorMsg;
   private SeriesProductVo data;
   private String traceId;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(Integer errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public Integer getErrorCode() {
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

   @JsonProperty("data")
   public void setData(SeriesProductVo data) {
      this.data = data;
   }

   @JsonProperty("data")
   public SeriesProductVo getData() {
      return this.data;
   }

   @JsonProperty("traceId")
   public void setTraceId(String traceId) {
      this.traceId = traceId;
   }

   @JsonProperty("traceId")
   public String getTraceId() {
      return this.traceId;
   }
}
