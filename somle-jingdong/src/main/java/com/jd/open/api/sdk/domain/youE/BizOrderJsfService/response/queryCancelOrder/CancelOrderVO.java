package com.jd.open.api.sdk.domain.youE.BizOrderJsfService.response.queryCancelOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class CancelOrderVO implements Serializable {
   private String orderNo;
   private String cancelReason;
   private Date cancelDate;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("cancelReason")
   public void setCancelReason(String cancelReason) {
      this.cancelReason = cancelReason;
   }

   @JsonProperty("cancelReason")
   public String getCancelReason() {
      return this.cancelReason;
   }

   @JsonProperty("cancelDate")
   public void setCancelDate(Date cancelDate) {
      this.cancelDate = cancelDate;
   }

   @JsonProperty("cancelDate")
   public Date getCancelDate() {
      return this.cancelDate;
   }
}
