package com.jd.open.api.sdk.domain.youE.OrgJsfService.response.getCustomerOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BizOrderVo implements Serializable {
   private String cusState;
   private String orderNo;
   private String saleOrderNo;
   private List<BizServiceCustomerReplyVo> bizServiceCustomerReplyVoList;
   private Integer serviceTypeId;
   private String cusStateName;
   private Long id;
   private String serviceTypeName;
   private String orderStateName;
   private String cusOrderNo;
   private String orderState;
   private String customerTypeName;
   private String businessTypeName;
   private String businessTypeName2;

   @JsonProperty("cusState")
   public void setCusState(String cusState) {
      this.cusState = cusState;
   }

   @JsonProperty("cusState")
   public String getCusState() {
      return this.cusState;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("saleOrderNo")
   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   @JsonProperty("saleOrderNo")
   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   @JsonProperty("bizServiceCustomerReplyVoList")
   public void setBizServiceCustomerReplyVoList(List<BizServiceCustomerReplyVo> bizServiceCustomerReplyVoList) {
      this.bizServiceCustomerReplyVoList = bizServiceCustomerReplyVoList;
   }

   @JsonProperty("bizServiceCustomerReplyVoList")
   public List<BizServiceCustomerReplyVo> getBizServiceCustomerReplyVoList() {
      return this.bizServiceCustomerReplyVoList;
   }

   @JsonProperty("serviceTypeId")
   public void setServiceTypeId(Integer serviceTypeId) {
      this.serviceTypeId = serviceTypeId;
   }

   @JsonProperty("serviceTypeId")
   public Integer getServiceTypeId() {
      return this.serviceTypeId;
   }

   @JsonProperty("cusStateName")
   public void setCusStateName(String cusStateName) {
      this.cusStateName = cusStateName;
   }

   @JsonProperty("cusStateName")
   public String getCusStateName() {
      return this.cusStateName;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("serviceTypeName")
   public void setServiceTypeName(String serviceTypeName) {
      this.serviceTypeName = serviceTypeName;
   }

   @JsonProperty("serviceTypeName")
   public String getServiceTypeName() {
      return this.serviceTypeName;
   }

   @JsonProperty("orderStateName")
   public void setOrderStateName(String orderStateName) {
      this.orderStateName = orderStateName;
   }

   @JsonProperty("orderStateName")
   public String getOrderStateName() {
      return this.orderStateName;
   }

   @JsonProperty("cusOrderNo")
   public void setCusOrderNo(String cusOrderNo) {
      this.cusOrderNo = cusOrderNo;
   }

   @JsonProperty("cusOrderNo")
   public String getCusOrderNo() {
      return this.cusOrderNo;
   }

   @JsonProperty("orderState")
   public void setOrderState(String orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public String getOrderState() {
      return this.orderState;
   }

   @JsonProperty("customerTypeName")
   public void setCustomerTypeName(String customerTypeName) {
      this.customerTypeName = customerTypeName;
   }

   @JsonProperty("customerTypeName")
   public String getCustomerTypeName() {
      return this.customerTypeName;
   }

   @JsonProperty("businessTypeName")
   public void setBusinessTypeName(String businessTypeName) {
      this.businessTypeName = businessTypeName;
   }

   @JsonProperty("businessTypeName")
   public String getBusinessTypeName() {
      return this.businessTypeName;
   }

   @JsonProperty("businessTypeName2")
   public void setBusinessTypeName2(String businessTypeName2) {
      this.businessTypeName2 = businessTypeName2;
   }

   @JsonProperty("businessTypeName2")
   public String getBusinessTypeName2() {
      return this.businessTypeName2;
   }
}
