package com.jd.open.api.sdk.domain.supplier.SalesReturnOrderQueryJosApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ReturnExecutionOrderSkuDetailDto implements Serializable {
   private Integer serviceType;
   private String serviceTypeDesc;
   private String skuCidFirstName;
   private String skuUuid;
   private Long orderId;
   private Integer refundNum;
   private String returnExecutionOrderId;
   private String skuCidSecondName;
   private Integer skuType;
   private Integer skuCidFirst;
   private List<ReturnExecutionOrderSkuReportDetailDto> skuReportDetailList;
   private String skuName;
   private String skuTypeDesc;
   private Integer confirmNum;
   private Long afterSaleOrderId;
   private Integer skuCid;
   private String skuCidName;
   private Integer skuCidSecond;
   private Long skuId;
   private String purchaseOrderId;

   @JsonProperty("serviceType")
   public void setServiceType(Integer serviceType) {
      this.serviceType = serviceType;
   }

   @JsonProperty("serviceType")
   public Integer getServiceType() {
      return this.serviceType;
   }

   @JsonProperty("serviceTypeDesc")
   public void setServiceTypeDesc(String serviceTypeDesc) {
      this.serviceTypeDesc = serviceTypeDesc;
   }

   @JsonProperty("serviceTypeDesc")
   public String getServiceTypeDesc() {
      return this.serviceTypeDesc;
   }

   @JsonProperty("skuCidFirstName")
   public void setSkuCidFirstName(String skuCidFirstName) {
      this.skuCidFirstName = skuCidFirstName;
   }

   @JsonProperty("skuCidFirstName")
   public String getSkuCidFirstName() {
      return this.skuCidFirstName;
   }

   @JsonProperty("skuUuid")
   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String getSkuUuid() {
      return this.skuUuid;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("refundNum")
   public void setRefundNum(Integer refundNum) {
      this.refundNum = refundNum;
   }

   @JsonProperty("refundNum")
   public Integer getRefundNum() {
      return this.refundNum;
   }

   @JsonProperty("returnExecutionOrderId")
   public void setReturnExecutionOrderId(String returnExecutionOrderId) {
      this.returnExecutionOrderId = returnExecutionOrderId;
   }

   @JsonProperty("returnExecutionOrderId")
   public String getReturnExecutionOrderId() {
      return this.returnExecutionOrderId;
   }

   @JsonProperty("skuCidSecondName")
   public void setSkuCidSecondName(String skuCidSecondName) {
      this.skuCidSecondName = skuCidSecondName;
   }

   @JsonProperty("skuCidSecondName")
   public String getSkuCidSecondName() {
      return this.skuCidSecondName;
   }

   @JsonProperty("skuType")
   public void setSkuType(Integer skuType) {
      this.skuType = skuType;
   }

   @JsonProperty("skuType")
   public Integer getSkuType() {
      return this.skuType;
   }

   @JsonProperty("skuCidFirst")
   public void setSkuCidFirst(Integer skuCidFirst) {
      this.skuCidFirst = skuCidFirst;
   }

   @JsonProperty("skuCidFirst")
   public Integer getSkuCidFirst() {
      return this.skuCidFirst;
   }

   @JsonProperty("skuReportDetailList")
   public void setSkuReportDetailList(List<ReturnExecutionOrderSkuReportDetailDto> skuReportDetailList) {
      this.skuReportDetailList = skuReportDetailList;
   }

   @JsonProperty("skuReportDetailList")
   public List<ReturnExecutionOrderSkuReportDetailDto> getSkuReportDetailList() {
      return this.skuReportDetailList;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("skuTypeDesc")
   public void setSkuTypeDesc(String skuTypeDesc) {
      this.skuTypeDesc = skuTypeDesc;
   }

   @JsonProperty("skuTypeDesc")
   public String getSkuTypeDesc() {
      return this.skuTypeDesc;
   }

   @JsonProperty("confirmNum")
   public void setConfirmNum(Integer confirmNum) {
      this.confirmNum = confirmNum;
   }

   @JsonProperty("confirmNum")
   public Integer getConfirmNum() {
      return this.confirmNum;
   }

   @JsonProperty("afterSaleOrderId")
   public void setAfterSaleOrderId(Long afterSaleOrderId) {
      this.afterSaleOrderId = afterSaleOrderId;
   }

   @JsonProperty("afterSaleOrderId")
   public Long getAfterSaleOrderId() {
      return this.afterSaleOrderId;
   }

   @JsonProperty("skuCid")
   public void setSkuCid(Integer skuCid) {
      this.skuCid = skuCid;
   }

   @JsonProperty("skuCid")
   public Integer getSkuCid() {
      return this.skuCid;
   }

   @JsonProperty("skuCidName")
   public void setSkuCidName(String skuCidName) {
      this.skuCidName = skuCidName;
   }

   @JsonProperty("skuCidName")
   public String getSkuCidName() {
      return this.skuCidName;
   }

   @JsonProperty("skuCidSecond")
   public void setSkuCidSecond(Integer skuCidSecond) {
      this.skuCidSecond = skuCidSecond;
   }

   @JsonProperty("skuCidSecond")
   public Integer getSkuCidSecond() {
      return this.skuCidSecond;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("purchaseOrderId")
   public void setPurchaseOrderId(String purchaseOrderId) {
      this.purchaseOrderId = purchaseOrderId;
   }

   @JsonProperty("purchaseOrderId")
   public String getPurchaseOrderId() {
      return this.purchaseOrderId;
   }
}
