package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class ServiceFinanceDetailInfoExport implements Serializable {
   private int[] refundWay;
   private String[] refundWayName;
   private int[] status;
   private String[] statusName;
   private BigDecimal[] refundPrice;

   @JsonProperty("refundWay")
   public void setRefundWay(int[] refundWay) {
      this.refundWay = refundWay;
   }

   @JsonProperty("refundWay")
   public int[] getRefundWay() {
      return this.refundWay;
   }

   @JsonProperty("refundWayName")
   public void setRefundWayName(String[] refundWayName) {
      this.refundWayName = refundWayName;
   }

   @JsonProperty("refundWayName")
   public String[] getRefundWayName() {
      return this.refundWayName;
   }

   @JsonProperty("status")
   public void setStatus(int[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int[] getStatus() {
      return this.status;
   }

   @JsonProperty("statusName")
   public void setStatusName(String[] statusName) {
      this.statusName = statusName;
   }

   @JsonProperty("statusName")
   public String[] getStatusName() {
      return this.statusName;
   }

   @JsonProperty("refundPrice")
   public void setRefundPrice(BigDecimal[] refundPrice) {
      this.refundPrice = refundPrice;
   }

   @JsonProperty("refundPrice")
   public BigDecimal[] getRefundPrice() {
      return this.refundPrice;
   }
}
