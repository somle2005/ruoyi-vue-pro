package com.jd.open.api.sdk.domain.jinsuanpan.BillQueryServiceProvider.response.queryBillChargeListByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BillChargeMO implements Serializable {
   private Long orderId;
   private Long venderId;
   private Date completed;
   private Date createTime;
   private Date docCreateTime;
   private Date docUpdateTime;
   private String rfBusiType;
   private List<SkuMo> feeList;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("completed")
   public void setCompleted(Date completed) {
      this.completed = completed;
   }

   @JsonProperty("completed")
   public Date getCompleted() {
      return this.completed;
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

   @JsonProperty("docUpdateTime")
   public void setDocUpdateTime(Date docUpdateTime) {
      this.docUpdateTime = docUpdateTime;
   }

   @JsonProperty("docUpdateTime")
   public Date getDocUpdateTime() {
      return this.docUpdateTime;
   }

   @JsonProperty("rfBusiType")
   public void setRfBusiType(String rfBusiType) {
      this.rfBusiType = rfBusiType;
   }

   @JsonProperty("rfBusiType")
   public String getRfBusiType() {
      return this.rfBusiType;
   }

   @JsonProperty("feeList")
   public void setFeeList(List<SkuMo> feeList) {
      this.feeList = feeList;
   }

   @JsonProperty("feeList")
   public List<SkuMo> getFeeList() {
      return this.feeList;
   }
}
