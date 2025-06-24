package com.jd.open.api.sdk.domain.afsservice.ServiceCommonProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class AfsRefundOut implements Serializable {
   private Long afsRefundId;
   private Long afsServiceId;
   private BigDecimal suggestAmount;
   private String mark;
   private String reason;
   private String payInfo;

   @JsonProperty("afsRefundId")
   public void setAfsRefundId(Long afsRefundId) {
      this.afsRefundId = afsRefundId;
   }

   @JsonProperty("afsRefundId")
   public Long getAfsRefundId() {
      return this.afsRefundId;
   }

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("suggestAmount")
   public void setSuggestAmount(BigDecimal suggestAmount) {
      this.suggestAmount = suggestAmount;
   }

   @JsonProperty("suggestAmount")
   public BigDecimal getSuggestAmount() {
      return this.suggestAmount;
   }

   @JsonProperty("mark")
   public void setMark(String mark) {
      this.mark = mark;
   }

   @JsonProperty("mark")
   public String getMark() {
      return this.mark;
   }

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("payInfo")
   public void setPayInfo(String payInfo) {
      this.payInfo = payInfo;
   }

   @JsonProperty("payInfo")
   public String getPayInfo() {
      return this.payInfo;
   }
}
