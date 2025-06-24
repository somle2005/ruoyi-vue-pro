package com.jd.open.api.sdk.domain.refundapply.RefundApplySoaService.response.queryById;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RefundApplyVo implements Serializable {
   private Long id;
   private String buyerId;
   private String buyerName;
   private String checkTime;
   private String applyTime;
   private Double applyRefundSum;
   private Long status;
   private String checkUserName;
   private String orderId;
   private String checkRemark;
   private String reason;
   private Integer systemId;
   private Long storeId;
   private List<RefundApplySkuVo> skuVoList;
   private Integer partRefundType;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("buyerId")
   public void setBuyerId(String buyerId) {
      this.buyerId = buyerId;
   }

   @JsonProperty("buyerId")
   public String getBuyerId() {
      return this.buyerId;
   }

   @JsonProperty("buyerName")
   public void setBuyerName(String buyerName) {
      this.buyerName = buyerName;
   }

   @JsonProperty("buyerName")
   public String getBuyerName() {
      return this.buyerName;
   }

   @JsonProperty("checkTime")
   public void setCheckTime(String checkTime) {
      this.checkTime = checkTime;
   }

   @JsonProperty("checkTime")
   public String getCheckTime() {
      return this.checkTime;
   }

   @JsonProperty("applyTime")
   public void setApplyTime(String applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("applyTime")
   public String getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("applyRefundSum")
   public void setApplyRefundSum(Double applyRefundSum) {
      this.applyRefundSum = applyRefundSum;
   }

   @JsonProperty("applyRefundSum")
   public Double getApplyRefundSum() {
      return this.applyRefundSum;
   }

   @JsonProperty("status")
   public void setStatus(Long status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Long getStatus() {
      return this.status;
   }

   @JsonProperty("checkUserName")
   public void setCheckUserName(String checkUserName) {
      this.checkUserName = checkUserName;
   }

   @JsonProperty("checkUserName")
   public String getCheckUserName() {
      return this.checkUserName;
   }

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("checkRemark")
   public void setCheckRemark(String checkRemark) {
      this.checkRemark = checkRemark;
   }

   @JsonProperty("checkRemark")
   public String getCheckRemark() {
      return this.checkRemark;
   }

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("systemId")
   public void setSystemId(Integer systemId) {
      this.systemId = systemId;
   }

   @JsonProperty("systemId")
   public Integer getSystemId() {
      return this.systemId;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
      return this.storeId;
   }

   @JsonProperty("skuVoList")
   public void setSkuVoList(List<RefundApplySkuVo> skuVoList) {
      this.skuVoList = skuVoList;
   }

   @JsonProperty("skuVoList")
   public List<RefundApplySkuVo> getSkuVoList() {
      return this.skuVoList;
   }

   @JsonProperty("partRefundType")
   public void setPartRefundType(Integer partRefundType) {
      this.partRefundType = partRefundType;
   }

   @JsonProperty("partRefundType")
   public Integer getPartRefundType() {
      return this.partRefundType;
   }
}
