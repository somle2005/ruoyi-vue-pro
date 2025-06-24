package com.jd.open.api.sdk.domain.jinsuanpan.BillQueryServiceProvider.response.queryRefundBillChargeListByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RefundBillChargeMO implements Serializable {
   private String skuName;
   private Long orderId;
   private Date createTime;
   private Date docCreateTime;
   private Long venderId;
   private Long count;
   private Date docUpdateTime;
   private List<FeeMo> feeList;
   private String skuId;
   private Date returnTime;
   private Long serviceOrderId;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("docCreateTime")
   public void setDocCreateTime(Date docCreateTime) {
      this.docCreateTime = docCreateTime;
   }

   @JsonProperty("docCreateTime")
   public Date getDocCreateTime() {
      return this.docCreateTime;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("count")
   public void setCount(Long count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Long getCount() {
      return this.count;
   }

   @JsonProperty("docUpdateTime")
   public void setDocUpdateTime(Date docUpdateTime) {
      this.docUpdateTime = docUpdateTime;
   }

   @JsonProperty("docUpdateTime")
   public Date getDocUpdateTime() {
      return this.docUpdateTime;
   }

   @JsonProperty("feeList")
   public void setFeeList(List<FeeMo> feeList) {
      this.feeList = feeList;
   }

   @JsonProperty("feeList")
   public List<FeeMo> getFeeList() {
      return this.feeList;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("returnTime")
   public void setReturnTime(Date returnTime) {
      this.returnTime = returnTime;
   }

   @JsonProperty("returnTime")
   public Date getReturnTime() {
      return this.returnTime;
   }

   @JsonProperty("serviceOrderId")
   public void setServiceOrderId(Long serviceOrderId) {
      this.serviceOrderId = serviceOrderId;
   }

   @JsonProperty("serviceOrderId")
   public Long getServiceOrderId() {
      return this.serviceOrderId;
   }
}
