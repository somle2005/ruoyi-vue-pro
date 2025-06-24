package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findWaitAuditApplys;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultExport implements Serializable {
   private int resultCode;
   private WaitAuditApplysPage data;
   private String errMsg;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("data")
   public void setData(WaitAuditApplysPage data) {
      this.data = data;
   }

   @JsonProperty("data")
   public WaitAuditApplysPage getData() {
      return this.data;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }
}
