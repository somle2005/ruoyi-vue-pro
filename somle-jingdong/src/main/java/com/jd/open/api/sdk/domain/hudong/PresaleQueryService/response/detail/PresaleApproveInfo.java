package com.jd.open.api.sdk.domain.hudong.PresaleQueryService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PresaleApproveInfo implements Serializable {
   private boolean deal;
   private String approveName;

   @JsonProperty("deal")
   public void setDeal(boolean deal) {
      this.deal = deal;
   }

   @JsonProperty("deal")
   public boolean getDeal() {
      return this.deal;
   }

   @JsonProperty("approveName")
   public void setApproveName(String approveName) {
      this.approveName = approveName;
   }

   @JsonProperty("approveName")
   public String getApproveName() {
      return this.approveName;
   }
}
