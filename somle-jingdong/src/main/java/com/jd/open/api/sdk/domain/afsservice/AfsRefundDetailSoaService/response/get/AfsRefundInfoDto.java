package com.jd.open.api.sdk.domain.afsservice.AfsRefundDetailSoaService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AfsRefundInfoDto implements Serializable {
   private Long orderId;
   private AfsActualRefundDetailDto afsActualRefundDetail;
   private AfsEstimateRefundDetailDto afsEstimateRefundDetail;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("afsActualRefundDetail")
   public void setAfsActualRefundDetail(AfsActualRefundDetailDto afsActualRefundDetail) {
      this.afsActualRefundDetail = afsActualRefundDetail;
   }

   @JsonProperty("afsActualRefundDetail")
   public AfsActualRefundDetailDto getAfsActualRefundDetail() {
      return this.afsActualRefundDetail;
   }

   @JsonProperty("afsEstimateRefundDetail")
   public void setAfsEstimateRefundDetail(AfsEstimateRefundDetailDto afsEstimateRefundDetail) {
      this.afsEstimateRefundDetail = afsEstimateRefundDetail;
   }

   @JsonProperty("afsEstimateRefundDetail")
   public AfsEstimateRefundDetailDto getAfsEstimateRefundDetail() {
      return this.afsEstimateRefundDetail;
   }
}
