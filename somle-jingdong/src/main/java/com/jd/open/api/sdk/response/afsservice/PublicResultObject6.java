package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublicResultObject6 implements Serializable {
   private Integer resultCode;
   private PageResult waitReceiveAfsService;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("waitReceiveAfsService")
   public void setWaitReceiveAfsService(PageResult waitReceiveAfsService) {
      this.waitReceiveAfsService = waitReceiveAfsService;
   }

   @JsonProperty("waitReceiveAfsService")
   public PageResult getWaitReceiveAfsService() {
      return this.waitReceiveAfsService;
   }
}
