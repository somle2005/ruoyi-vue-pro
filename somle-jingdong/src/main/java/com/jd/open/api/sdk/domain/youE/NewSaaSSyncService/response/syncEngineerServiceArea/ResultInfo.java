package com.jd.open.api.sdk.domain.youE.NewSaaSSyncService.response.syncEngineerServiceArea;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultInfo implements Serializable {
   private int resultCode;
   private String errMsg;
   private Boolean result;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("result")
   public void setResult(Boolean result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Boolean getResult() {
      return this.result;
   }
}
