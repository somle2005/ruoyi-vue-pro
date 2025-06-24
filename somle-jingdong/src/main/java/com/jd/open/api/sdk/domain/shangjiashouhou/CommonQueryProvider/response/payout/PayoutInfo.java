package com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.payout;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PayoutInfo implements Serializable {
   private Integer payoutId;
   private Integer billType;
   private String billTypeName;
   private Integer payoutType;
   private String payoutTypeName;
   private BigDecimal total;
   private Integer levelIReasonId;
   private String levelIReasonName;
   private Integer levelIiReasonId;
   private String levelIiReasonName;
   private Integer status;
   private String statusName;
   private Long orderId;
   private Integer orderType;
   private String orderTypeName;
   private Long skuId;
   private Long arbitId;
   private Date applyTime;
   private String applyPin;
   private String applyName;
   private String applyReason;
   private Date auditTime;
   private String auditPin;
   private String auditName;
   private String auditOpinion;
   private String customerPin;
   private Integer responsibleDeptId;
   private String responsibleDeptName;
   private Boolean complainFee;
   private List<PayoutDetailInfo> payoutDetailInfoList;
   private List<PayoutShareInfo> payoutShareInfoList;
   private String extJsonStr;

   @JsonProperty("payoutId")
   public void setPayoutId(Integer payoutId) {
      this.payoutId = payoutId;
   }

   @JsonProperty("payoutId")
   public Integer getPayoutId() {
      return this.payoutId;
   }

   @JsonProperty("billType")
   public void setBillType(Integer billType) {
      this.billType = billType;
   }

   @JsonProperty("billType")
   public Integer getBillType() {
      return this.billType;
   }

   @JsonProperty("billTypeName")
   public void setBillTypeName(String billTypeName) {
      this.billTypeName = billTypeName;
   }

   @JsonProperty("billTypeName")
   public String getBillTypeName() {
      return this.billTypeName;
   }

   @JsonProperty("payoutType")
   public void setPayoutType(Integer payoutType) {
      this.payoutType = payoutType;
   }

   @JsonProperty("payoutType")
   public Integer getPayoutType() {
      return this.payoutType;
   }

   @JsonProperty("payoutTypeName")
   public void setPayoutTypeName(String payoutTypeName) {
      this.payoutTypeName = payoutTypeName;
   }

   @JsonProperty("payoutTypeName")
   public String getPayoutTypeName() {
      return this.payoutTypeName;
   }

   @JsonProperty("total")
   public void setTotal(BigDecimal total) {
      this.total = total;
   }

   @JsonProperty("total")
   public BigDecimal getTotal() {
      return this.total;
   }

   @JsonProperty("levelIReasonId")
   public void setLevelIReasonId(Integer levelIReasonId) {
      this.levelIReasonId = levelIReasonId;
   }

   @JsonProperty("levelIReasonId")
   public Integer getLevelIReasonId() {
      return this.levelIReasonId;
   }

   @JsonProperty("levelIReasonName")
   public void setLevelIReasonName(String levelIReasonName) {
      this.levelIReasonName = levelIReasonName;
   }

   @JsonProperty("levelIReasonName")
   public String getLevelIReasonName() {
      return this.levelIReasonName;
   }

   @JsonProperty("levelIiReasonId")
   public void setLevelIiReasonId(Integer levelIiReasonId) {
      this.levelIiReasonId = levelIiReasonId;
   }

   @JsonProperty("levelIiReasonId")
   public Integer getLevelIiReasonId() {
      return this.levelIiReasonId;
   }

   @JsonProperty("levelIiReasonName")
   public void setLevelIiReasonName(String levelIiReasonName) {
      this.levelIiReasonName = levelIiReasonName;
   }

   @JsonProperty("levelIiReasonName")
   public String getLevelIiReasonName() {
      return this.levelIiReasonName;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("statusName")
   public void setStatusName(String statusName) {
      this.statusName = statusName;
   }

   @JsonProperty("statusName")
   public String getStatusName() {
      return this.statusName;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("orderTypeName")
   public void setOrderTypeName(String orderTypeName) {
      this.orderTypeName = orderTypeName;
   }

   @JsonProperty("orderTypeName")
   public String getOrderTypeName() {
      return this.orderTypeName;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("arbitId")
   public void setArbitId(Long arbitId) {
      this.arbitId = arbitId;
   }

   @JsonProperty("arbitId")
   public Long getArbitId() {
      return this.arbitId;
   }

   @JsonProperty("applyTime")
   public void setApplyTime(Date applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("applyTime")
   public Date getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("applyPin")
   public void setApplyPin(String applyPin) {
      this.applyPin = applyPin;
   }

   @JsonProperty("applyPin")
   public String getApplyPin() {
      return this.applyPin;
   }

   @JsonProperty("applyName")
   public void setApplyName(String applyName) {
      this.applyName = applyName;
   }

   @JsonProperty("applyName")
   public String getApplyName() {
      return this.applyName;
   }

   @JsonProperty("applyReason")
   public void setApplyReason(String applyReason) {
      this.applyReason = applyReason;
   }

   @JsonProperty("applyReason")
   public String getApplyReason() {
      return this.applyReason;
   }

   @JsonProperty("auditTime")
   public void setAuditTime(Date auditTime) {
      this.auditTime = auditTime;
   }

   @JsonProperty("auditTime")
   public Date getAuditTime() {
      return this.auditTime;
   }

   @JsonProperty("auditPin")
   public void setAuditPin(String auditPin) {
      this.auditPin = auditPin;
   }

   @JsonProperty("auditPin")
   public String getAuditPin() {
      return this.auditPin;
   }

   @JsonProperty("auditName")
   public void setAuditName(String auditName) {
      this.auditName = auditName;
   }

   @JsonProperty("auditName")
   public String getAuditName() {
      return this.auditName;
   }

   @JsonProperty("auditOpinion")
   public void setAuditOpinion(String auditOpinion) {
      this.auditOpinion = auditOpinion;
   }

   @JsonProperty("auditOpinion")
   public String getAuditOpinion() {
      return this.auditOpinion;
   }

   @JsonProperty("customerPin")
   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   @JsonProperty("customerPin")
   public String getCustomerPin() {
      return this.customerPin;
   }

   @JsonProperty("responsibleDeptId")
   public void setResponsibleDeptId(Integer responsibleDeptId) {
      this.responsibleDeptId = responsibleDeptId;
   }

   @JsonProperty("responsibleDeptId")
   public Integer getResponsibleDeptId() {
      return this.responsibleDeptId;
   }

   @JsonProperty("responsibleDeptName")
   public void setResponsibleDeptName(String responsibleDeptName) {
      this.responsibleDeptName = responsibleDeptName;
   }

   @JsonProperty("responsibleDeptName")
   public String getResponsibleDeptName() {
      return this.responsibleDeptName;
   }

   @JsonProperty("complainFee")
   public void setComplainFee(Boolean complainFee) {
      this.complainFee = complainFee;
   }

   @JsonProperty("complainFee")
   public Boolean getComplainFee() {
      return this.complainFee;
   }

   @JsonProperty("payoutDetailInfoList")
   public void setPayoutDetailInfoList(List<PayoutDetailInfo> payoutDetailInfoList) {
      this.payoutDetailInfoList = payoutDetailInfoList;
   }

   @JsonProperty("payoutDetailInfoList")
   public List<PayoutDetailInfo> getPayoutDetailInfoList() {
      return this.payoutDetailInfoList;
   }

   @JsonProperty("payoutShareInfoList")
   public void setPayoutShareInfoList(List<PayoutShareInfo> payoutShareInfoList) {
      this.payoutShareInfoList = payoutShareInfoList;
   }

   @JsonProperty("payoutShareInfoList")
   public List<PayoutShareInfo> getPayoutShareInfoList() {
      return this.payoutShareInfoList;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }
}
