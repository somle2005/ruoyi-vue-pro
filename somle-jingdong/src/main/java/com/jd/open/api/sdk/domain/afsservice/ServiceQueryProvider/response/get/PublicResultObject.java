package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublicResultObject implements Serializable {
   private Integer resultCode;
   private String resultErrorMsg;
   private PageResult waitAudit;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultErrorMsg")
   public void setResultErrorMsg(String resultErrorMsg) {
      this.resultErrorMsg = resultErrorMsg;
   }

   @JsonProperty("resultErrorMsg")
   public String getResultErrorMsg() {
      return this.resultErrorMsg;
   }

   @JsonProperty("waitAudit")
   public void setWaitAudit(PageResult waitAudit) {
      this.waitAudit = waitAudit;
   }

   @JsonProperty("waitAudit")
   public PageResult getWaitAudit() {
      return this.waitAudit;
   }
}
