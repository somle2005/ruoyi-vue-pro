package com.jd.open.api.sdk.domain.compensate.AfsCompensateForJosService.response.queryCompensateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CompensateResult implements Serializable {
   private List<Map> result;
   private Boolean success;
   private String errorCode;
   private String errorMsg;

   @JsonProperty("result")
   public void setResult(List<Map> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<Map> getResult() {
      return this.result;
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
