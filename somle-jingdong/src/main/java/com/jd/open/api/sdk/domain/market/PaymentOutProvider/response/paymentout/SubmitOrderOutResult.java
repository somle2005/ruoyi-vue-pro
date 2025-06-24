package com.jd.open.api.sdk.domain.market.PaymentOutProvider.response.paymentout;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SubmitOrderOutResult implements Serializable {
   private String requestId;
   private String settlementUrl;
   private Long orderId;
   private Integer resultPageType;

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("settlementUrl")
   public void setSettlementUrl(String settlementUrl) {
      this.settlementUrl = settlementUrl;
   }

   @JsonProperty("settlementUrl")
   public String getSettlementUrl() {
      return this.settlementUrl;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("resultPageType")
   public void setResultPageType(Integer resultPageType) {
      this.resultPageType = resultPageType;
   }

   @JsonProperty("resultPageType")
   public Integer getResultPageType() {
      return this.resultPageType;
   }
}
