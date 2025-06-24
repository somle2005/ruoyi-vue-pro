package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublicResultObject5 implements Serializable {
   private Integer resultCode;
   private PageResult allAfsService;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("allAfsService")
   public void setAllAfsService(PageResult allAfsService) {
      this.allAfsService = allAfsService;
   }

   @JsonProperty("allAfsService")
   public PageResult getAllAfsService() {
      return this.allAfsService;
   }
}
