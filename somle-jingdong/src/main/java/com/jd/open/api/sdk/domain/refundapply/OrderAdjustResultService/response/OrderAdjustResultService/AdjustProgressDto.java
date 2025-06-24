package com.jd.open.api.sdk.domain.refundapply.OrderAdjustResultService.response.OrderAdjustResultService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class AdjustProgressDto implements Serializable {
   private Long orderId;
   private Long requestId;
   private Integer handleStatus;
   private String remark;
   private Date adjustedTime;
   private List<AdjustSkuLineDto> adjustSkuLineDtoList;
   private BigDecimal payableAmount;
   private Integer adjustSource;
   private BigDecimal refundAmount;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("requestId")
   public void setRequestId(Long requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public Long getRequestId() {
      return this.requestId;
   }

   @JsonProperty("handleStatus")
   public void setHandleStatus(Integer handleStatus) {
      this.handleStatus = handleStatus;
   }

   @JsonProperty("handleStatus")
   public Integer getHandleStatus() {
      return this.handleStatus;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("adjustedTime")
   public void setAdjustedTime(Date adjustedTime) {
      this.adjustedTime = adjustedTime;
   }

   @JsonProperty("adjustedTime")
   public Date getAdjustedTime() {
      return this.adjustedTime;
   }

   @JsonProperty("adjustSkuLineDtoList")
   public void setAdjustSkuLineDtoList(List<AdjustSkuLineDto> adjustSkuLineDtoList) {
      this.adjustSkuLineDtoList = adjustSkuLineDtoList;
   }

   @JsonProperty("adjustSkuLineDtoList")
   public List<AdjustSkuLineDto> getAdjustSkuLineDtoList() {
      return this.adjustSkuLineDtoList;
   }

   @JsonProperty("payableAmount")
   public void setPayableAmount(BigDecimal payableAmount) {
      this.payableAmount = payableAmount;
   }

   @JsonProperty("payableAmount")
   public BigDecimal getPayableAmount() {
      return this.payableAmount;
   }

   @JsonProperty("adjustSource")
   public void setAdjustSource(Integer adjustSource) {
      this.adjustSource = adjustSource;
   }

   @JsonProperty("adjustSource")
   public Integer getAdjustSource() {
      return this.adjustSource;
   }

   @JsonProperty("refundAmount")
   public void setRefundAmount(BigDecimal refundAmount) {
      this.refundAmount = refundAmount;
   }

   @JsonProperty("refundAmount")
   public BigDecimal getRefundAmount() {
      return this.refundAmount;
   }
}
