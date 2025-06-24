package com.jd.open.api.sdk.domain.youE.BizOrderDetailsJsfService.response.queryBizOrderDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ElectronicBillDTO implements Serializable {
   private String orderNo;
   private BigDecimal actuallyPayAmount;
   private Integer orderState;
   private Integer chargeFlag;
   private Integer flag;
   private BigDecimal subtotalAmount;
   private BigDecimal preferentialAmount;
   private List<ElectronicBillPreferentialDetailDTO> preferentialList;
   private List<ElectronicBillOrderDetailDTO> orderDetailList;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("actuallyPayAmount")
   public void setActuallyPayAmount(BigDecimal actuallyPayAmount) {
      this.actuallyPayAmount = actuallyPayAmount;
   }

   @JsonProperty("actuallyPayAmount")
   public BigDecimal getActuallyPayAmount() {
      return this.actuallyPayAmount;
   }

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }

   @JsonProperty("chargeFlag")
   public void setChargeFlag(Integer chargeFlag) {
      this.chargeFlag = chargeFlag;
   }

   @JsonProperty("chargeFlag")
   public Integer getChargeFlag() {
      return this.chargeFlag;
   }

   @JsonProperty("flag")
   public void setFlag(Integer flag) {
      this.flag = flag;
   }

   @JsonProperty("flag")
   public Integer getFlag() {
      return this.flag;
   }

   @JsonProperty("subtotalAmount")
   public void setSubtotalAmount(BigDecimal subtotalAmount) {
      this.subtotalAmount = subtotalAmount;
   }

   @JsonProperty("subtotalAmount")
   public BigDecimal getSubtotalAmount() {
      return this.subtotalAmount;
   }

   @JsonProperty("preferentialAmount")
   public void setPreferentialAmount(BigDecimal preferentialAmount) {
      this.preferentialAmount = preferentialAmount;
   }

   @JsonProperty("preferentialAmount")
   public BigDecimal getPreferentialAmount() {
      return this.preferentialAmount;
   }

   @JsonProperty("preferentialList")
   public void setPreferentialList(List<ElectronicBillPreferentialDetailDTO> preferentialList) {
      this.preferentialList = preferentialList;
   }

   @JsonProperty("preferentialList")
   public List<ElectronicBillPreferentialDetailDTO> getPreferentialList() {
      return this.preferentialList;
   }

   @JsonProperty("orderDetailList")
   public void setOrderDetailList(List<ElectronicBillOrderDetailDTO> orderDetailList) {
      this.orderDetailList = orderDetailList;
   }

   @JsonProperty("orderDetailList")
   public List<ElectronicBillOrderDetailDTO> getOrderDetailList() {
      return this.orderDetailList;
   }
}
