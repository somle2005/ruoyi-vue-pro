package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublicResultObject implements Serializable {
   private Integer resultCode;
   private PageResult afsLog;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("afsLog")
   public void setAfsLog(PageResult afsLog) {
      this.afsLog = afsLog;
   }

   @JsonProperty("afsLog")
   public PageResult getAfsLog() {
      return this.afsLog;
   }
}
