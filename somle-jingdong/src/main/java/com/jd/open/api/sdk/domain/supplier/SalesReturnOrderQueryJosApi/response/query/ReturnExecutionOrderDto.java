package com.jd.open.api.sdk.domain.supplier.SalesReturnOrderQueryJosApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ReturnExecutionOrderDto implements Serializable {
   private String cpCode;
   private String returnSceneCode;
   private Date shippedTime;
   private Integer isInvoice;
   private String cpName;
   private String returnExecutionOrderId;
   private List<ReturnExecutionOrderSkuDetailDto> returnExecutionOrderSkuDetailList;
   private String flowDesc;
   private Integer returnExecutionStatus;
   private Date createTime;
   private String returnExecutionStatusDesc;
   private String waybillCode;
   private String returnSceneCodeDesc;
   private String isInvoiceDesc;

   @JsonProperty("cpCode")
   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   @JsonProperty("cpCode")
   public String getCpCode() {
      return this.cpCode;
   }

   @JsonProperty("returnSceneCode")
   public void setReturnSceneCode(String returnSceneCode) {
      this.returnSceneCode = returnSceneCode;
   }

   @JsonProperty("returnSceneCode")
   public String getReturnSceneCode() {
      return this.returnSceneCode;
   }

   @JsonProperty("shippedTime")
   public void setShippedTime(Date shippedTime) {
      this.shippedTime = shippedTime;
   }

   @JsonProperty("shippedTime")
   public Date getShippedTime() {
      return this.shippedTime;
   }

   @JsonProperty("isInvoice")
   public void setIsInvoice(Integer isInvoice) {
      this.isInvoice = isInvoice;
   }

   @JsonProperty("isInvoice")
   public Integer getIsInvoice() {
      return this.isInvoice;
   }

   @JsonProperty("cpName")
   public void setCpName(String cpName) {
      this.cpName = cpName;
   }

   @JsonProperty("cpName")
   public String getCpName() {
      return this.cpName;
   }

   @JsonProperty("returnExecutionOrderId")
   public void setReturnExecutionOrderId(String returnExecutionOrderId) {
      this.returnExecutionOrderId = returnExecutionOrderId;
   }

   @JsonProperty("returnExecutionOrderId")
   public String getReturnExecutionOrderId() {
      return this.returnExecutionOrderId;
   }

   @JsonProperty("returnExecutionOrderSkuDetailList")
   public void setReturnExecutionOrderSkuDetailList(List<ReturnExecutionOrderSkuDetailDto> returnExecutionOrderSkuDetailList) {
      this.returnExecutionOrderSkuDetailList = returnExecutionOrderSkuDetailList;
   }

   @JsonProperty("returnExecutionOrderSkuDetailList")
   public List<ReturnExecutionOrderSkuDetailDto> getReturnExecutionOrderSkuDetailList() {
      return this.returnExecutionOrderSkuDetailList;
   }

   @JsonProperty("flowDesc")
   public void setFlowDesc(String flowDesc) {
      this.flowDesc = flowDesc;
   }

   @JsonProperty("flowDesc")
   public String getFlowDesc() {
      return this.flowDesc;
   }

   @JsonProperty("returnExecutionStatus")
   public void setReturnExecutionStatus(Integer returnExecutionStatus) {
      this.returnExecutionStatus = returnExecutionStatus;
   }

   @JsonProperty("returnExecutionStatus")
   public Integer getReturnExecutionStatus() {
      return this.returnExecutionStatus;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("returnExecutionStatusDesc")
   public void setReturnExecutionStatusDesc(String returnExecutionStatusDesc) {
      this.returnExecutionStatusDesc = returnExecutionStatusDesc;
   }

   @JsonProperty("returnExecutionStatusDesc")
   public String getReturnExecutionStatusDesc() {
      return this.returnExecutionStatusDesc;
   }

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("returnSceneCodeDesc")
   public void setReturnSceneCodeDesc(String returnSceneCodeDesc) {
      this.returnSceneCodeDesc = returnSceneCodeDesc;
   }

   @JsonProperty("returnSceneCodeDesc")
   public String getReturnSceneCodeDesc() {
      return this.returnSceneCodeDesc;
   }

   @JsonProperty("isInvoiceDesc")
   public void setIsInvoiceDesc(String isInvoiceDesc) {
      this.isInvoiceDesc = isInvoiceDesc;
   }

   @JsonProperty("isInvoiceDesc")
   public String getIsInvoiceDesc() {
      return this.isInvoiceDesc;
   }
}
