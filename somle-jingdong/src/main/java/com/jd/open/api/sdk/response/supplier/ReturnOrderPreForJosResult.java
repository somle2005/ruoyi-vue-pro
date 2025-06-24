package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ReturnOrderPreForJosResult implements Serializable {
   private Long id;
   private Long customOrderId;
   private BigDecimal roApplyFee;
   private Date roApplyDate;
   private Date orderCreateDate;
   private Date modifiedDate;
   private Integer approvalState;
   private Integer orderState;
   private Integer operatorState;
   private Long roPreNo;
   private String roAccount;
   private String roReason;
   private String approvalSuggestion;
   private List<ReturnOrderDetailForJos> orderDetailList;
   private Integer vendorStoreId;
   private String vendorStoreName;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("customOrderId")
   public void setCustomOrderId(Long customOrderId) {
      this.customOrderId = customOrderId;
   }

   @JsonProperty("customOrderId")
   public Long getCustomOrderId() {
      return this.customOrderId;
   }

   @JsonProperty("roApplyFee")
   public void setRoApplyFee(BigDecimal roApplyFee) {
      this.roApplyFee = roApplyFee;
   }

   @JsonProperty("roApplyFee")
   public BigDecimal getRoApplyFee() {
      return this.roApplyFee;
   }

   @JsonProperty("roApplyDate")
   public void setRoApplyDate(Date roApplyDate) {
      this.roApplyDate = roApplyDate;
   }

   @JsonProperty("roApplyDate")
   public Date getRoApplyDate() {
      return this.roApplyDate;
   }

   @JsonProperty("orderCreateDate")
   public void setOrderCreateDate(Date orderCreateDate) {
      this.orderCreateDate = orderCreateDate;
   }

   @JsonProperty("orderCreateDate")
   public Date getOrderCreateDate() {
      return this.orderCreateDate;
   }

   @JsonProperty("modifiedDate")
   public void setModifiedDate(Date modifiedDate) {
      this.modifiedDate = modifiedDate;
   }

   @JsonProperty("modifiedDate")
   public Date getModifiedDate() {
      return this.modifiedDate;
   }

   @JsonProperty("approvalState")
   public void setApprovalState(Integer approvalState) {
      this.approvalState = approvalState;
   }

   @JsonProperty("approvalState")
   public Integer getApprovalState() {
      return this.approvalState;
   }

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }

   @JsonProperty("operatorState")
   public void setOperatorState(Integer operatorState) {
      this.operatorState = operatorState;
   }

   @JsonProperty("operatorState")
   public Integer getOperatorState() {
      return this.operatorState;
   }

   @JsonProperty("roPreNo")
   public void setRoPreNo(Long roPreNo) {
      this.roPreNo = roPreNo;
   }

   @JsonProperty("roPreNo")
   public Long getRoPreNo() {
      return this.roPreNo;
   }

   @JsonProperty("roAccount")
   public void setRoAccount(String roAccount) {
      this.roAccount = roAccount;
   }

   @JsonProperty("roAccount")
   public String getRoAccount() {
      return this.roAccount;
   }

   @JsonProperty("roReason")
   public void setRoReason(String roReason) {
      this.roReason = roReason;
   }

   @JsonProperty("roReason")
   public String getRoReason() {
      return this.roReason;
   }

   @JsonProperty("approvalSuggestion")
   public void setApprovalSuggestion(String approvalSuggestion) {
      this.approvalSuggestion = approvalSuggestion;
   }

   @JsonProperty("approvalSuggestion")
   public String getApprovalSuggestion() {
      return this.approvalSuggestion;
   }

   @JsonProperty("orderDetailList")
   public void setOrderDetailList(List<ReturnOrderDetailForJos> orderDetailList) {
      this.orderDetailList = orderDetailList;
   }

   @JsonProperty("orderDetailList")
   public List<ReturnOrderDetailForJos> getOrderDetailList() {
      return this.orderDetailList;
   }

   @JsonProperty("vendorStoreId")
   public void setVendorStoreId(Integer vendorStoreId) {
      this.vendorStoreId = vendorStoreId;
   }

   @JsonProperty("vendorStoreId")
   public Integer getVendorStoreId() {
      return this.vendorStoreId;
   }

   @JsonProperty("vendorStoreName")
   public void setVendorStoreName(String vendorStoreName) {
      this.vendorStoreName = vendorStoreName;
   }

   @JsonProperty("vendorStoreName")
   public String getVendorStoreName() {
      return this.vendorStoreName;
   }
}
