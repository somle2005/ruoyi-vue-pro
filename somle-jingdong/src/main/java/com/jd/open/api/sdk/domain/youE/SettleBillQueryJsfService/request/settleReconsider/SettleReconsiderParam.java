package com.jd.open.api.sdk.domain.youE.SettleBillQueryJsfService.request.settleReconsider;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SettleReconsiderParam implements Serializable {
   private Integer dealType;
   private String invoiceNo;
   private String dealRemark;
   private String settleNo;

   @JsonProperty("dealType")
   public void setDealType(Integer dealType) {
      this.dealType = dealType;
   }

   @JsonProperty("dealType")
   public Integer getDealType() {
      return this.dealType;
   }

   @JsonProperty("invoiceNo")
   public void setInvoiceNo(String invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   @JsonProperty("invoiceNo")
   public String getInvoiceNo() {
      return this.invoiceNo;
   }

   @JsonProperty("dealRemark")
   public void setDealRemark(String dealRemark) {
      this.dealRemark = dealRemark;
   }

   @JsonProperty("dealRemark")
   public String getDealRemark() {
      return this.dealRemark;
   }

   @JsonProperty("settleNo")
   public void setSettleNo(String settleNo) {
      this.settleNo = settleNo;
   }

   @JsonProperty("settleNo")
   public String getSettleNo() {
      return this.settleNo;
   }
}
