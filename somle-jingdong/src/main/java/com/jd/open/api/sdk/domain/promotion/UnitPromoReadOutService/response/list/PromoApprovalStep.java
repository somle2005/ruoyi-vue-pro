package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromoApprovalStep implements Serializable {
   private Boolean deal;
   private String approvalName;

   @JsonProperty("deal")
   public void setDeal(Boolean deal) {
      this.deal = deal;
   }

   @JsonProperty("deal")
   public Boolean getDeal() {
      return this.deal;
   }

   @JsonProperty("approvalName")
   public void setApprovalName(String approvalName) {
      this.approvalName = approvalName;
   }

   @JsonProperty("approvalName")
   public String getApprovalName() {
      return this.approvalName;
   }
}
