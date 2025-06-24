package com.jd.open.api.sdk.domain.supplier.SalesReturnOrderQueryJosApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ReturnExecutionOrderSkuReportDetailDto implements Serializable {
   private Integer productFunctionStatus;
   private Integer productExteriorStatus;
   private String exceptionDesc;
   private Integer reportNum;
   private String productExteriorStatusDesc;
   private Integer receiptType;
   private String productFunctionStatusDesc;
   private String productPackStatusDesc;
   private String receiptTypeName;
   private Integer responsibilityCode;
   private List<VcFileInfoDto> skuPicList;
   private String isAnnexDesc;
   private String attachmentInfoDesc;
   private String responsibilityDesc;
   private String exceptionReasonDesc;
   private Integer isAnnex;
   private Integer exceptionReason;
   private Integer productPackStatus;

   @JsonProperty("productFunctionStatus")
   public void setProductFunctionStatus(Integer productFunctionStatus) {
      this.productFunctionStatus = productFunctionStatus;
   }

   @JsonProperty("productFunctionStatus")
   public Integer getProductFunctionStatus() {
      return this.productFunctionStatus;
   }

   @JsonProperty("productExteriorStatus")
   public void setProductExteriorStatus(Integer productExteriorStatus) {
      this.productExteriorStatus = productExteriorStatus;
   }

   @JsonProperty("productExteriorStatus")
   public Integer getProductExteriorStatus() {
      return this.productExteriorStatus;
   }

   @JsonProperty("exceptionDesc")
   public void setExceptionDesc(String exceptionDesc) {
      this.exceptionDesc = exceptionDesc;
   }

   @JsonProperty("exceptionDesc")
   public String getExceptionDesc() {
      return this.exceptionDesc;
   }

   @JsonProperty("reportNum")
   public void setReportNum(Integer reportNum) {
      this.reportNum = reportNum;
   }

   @JsonProperty("reportNum")
   public Integer getReportNum() {
      return this.reportNum;
   }

   @JsonProperty("productExteriorStatusDesc")
   public void setProductExteriorStatusDesc(String productExteriorStatusDesc) {
      this.productExteriorStatusDesc = productExteriorStatusDesc;
   }

   @JsonProperty("productExteriorStatusDesc")
   public String getProductExteriorStatusDesc() {
      return this.productExteriorStatusDesc;
   }

   @JsonProperty("receiptType")
   public void setReceiptType(Integer receiptType) {
      this.receiptType = receiptType;
   }

   @JsonProperty("receiptType")
   public Integer getReceiptType() {
      return this.receiptType;
   }

   @JsonProperty("productFunctionStatusDesc")
   public void setProductFunctionStatusDesc(String productFunctionStatusDesc) {
      this.productFunctionStatusDesc = productFunctionStatusDesc;
   }

   @JsonProperty("productFunctionStatusDesc")
   public String getProductFunctionStatusDesc() {
      return this.productFunctionStatusDesc;
   }

   @JsonProperty("productPackStatusDesc")
   public void setProductPackStatusDesc(String productPackStatusDesc) {
      this.productPackStatusDesc = productPackStatusDesc;
   }

   @JsonProperty("productPackStatusDesc")
   public String getProductPackStatusDesc() {
      return this.productPackStatusDesc;
   }

   @JsonProperty("receiptTypeName")
   public void setReceiptTypeName(String receiptTypeName) {
      this.receiptTypeName = receiptTypeName;
   }

   @JsonProperty("receiptTypeName")
   public String getReceiptTypeName() {
      return this.receiptTypeName;
   }

   @JsonProperty("responsibilityCode")
   public void setResponsibilityCode(Integer responsibilityCode) {
      this.responsibilityCode = responsibilityCode;
   }

   @JsonProperty("responsibilityCode")
   public Integer getResponsibilityCode() {
      return this.responsibilityCode;
   }

   @JsonProperty("skuPicList")
   public void setSkuPicList(List<VcFileInfoDto> skuPicList) {
      this.skuPicList = skuPicList;
   }

   @JsonProperty("skuPicList")
   public List<VcFileInfoDto> getSkuPicList() {
      return this.skuPicList;
   }

   @JsonProperty("isAnnexDesc")
   public void setIsAnnexDesc(String isAnnexDesc) {
      this.isAnnexDesc = isAnnexDesc;
   }

   @JsonProperty("isAnnexDesc")
   public String getIsAnnexDesc() {
      return this.isAnnexDesc;
   }

   @JsonProperty("attachmentInfoDesc")
   public void setAttachmentInfoDesc(String attachmentInfoDesc) {
      this.attachmentInfoDesc = attachmentInfoDesc;
   }

   @JsonProperty("attachmentInfoDesc")
   public String getAttachmentInfoDesc() {
      return this.attachmentInfoDesc;
   }

   @JsonProperty("responsibilityDesc")
   public void setResponsibilityDesc(String responsibilityDesc) {
      this.responsibilityDesc = responsibilityDesc;
   }

   @JsonProperty("responsibilityDesc")
   public String getResponsibilityDesc() {
      return this.responsibilityDesc;
   }

   @JsonProperty("exceptionReasonDesc")
   public void setExceptionReasonDesc(String exceptionReasonDesc) {
      this.exceptionReasonDesc = exceptionReasonDesc;
   }

   @JsonProperty("exceptionReasonDesc")
   public String getExceptionReasonDesc() {
      return this.exceptionReasonDesc;
   }

   @JsonProperty("isAnnex")
   public void setIsAnnex(Integer isAnnex) {
      this.isAnnex = isAnnex;
   }

   @JsonProperty("isAnnex")
   public Integer getIsAnnex() {
      return this.isAnnex;
   }

   @JsonProperty("exceptionReason")
   public void setExceptionReason(Integer exceptionReason) {
      this.exceptionReason = exceptionReason;
   }

   @JsonProperty("exceptionReason")
   public Integer getExceptionReason() {
      return this.exceptionReason;
   }

   @JsonProperty("productPackStatus")
   public void setProductPackStatus(Integer productPackStatus) {
      this.productPackStatus = productPackStatus;
   }

   @JsonProperty("productPackStatus")
   public Integer getProductPackStatus() {
      return this.productPackStatus;
   }
}
