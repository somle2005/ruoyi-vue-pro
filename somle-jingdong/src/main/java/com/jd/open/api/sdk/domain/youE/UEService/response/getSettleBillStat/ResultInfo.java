package com.jd.open.api.sdk.domain.youE.UEService.response.getSettleBillStat;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private Integer resultCode;
   private String errMsg;
   private List<FwTast> fwTastList;
   private Integer pageSize;
   private List<ColseOrder> closeOrderList;
   private String settleNo;
   private List<SettleBill> settleBills;
   private Integer opstatus;
   private List<DeliverInfo> deliverInfoList;
   private List<SettleBillDetail> settleBillDetails;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("fwTastList")
   public void setFwTastList(List<FwTast> fwTastList) {
      this.fwTastList = fwTastList;
   }

   @JsonProperty("fwTastList")
   public List<FwTast> getFwTastList() {
      return this.fwTastList;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("closeOrderList")
   public void setCloseOrderList(List<ColseOrder> closeOrderList) {
      this.closeOrderList = closeOrderList;
   }

   @JsonProperty("closeOrderList")
   public List<ColseOrder> getCloseOrderList() {
      return this.closeOrderList;
   }

   @JsonProperty("settleNo")
   public void setSettleNo(String settleNo) {
      this.settleNo = settleNo;
   }

   @JsonProperty("settleNo")
   public String getSettleNo() {
      return this.settleNo;
   }

   @JsonProperty("settleBills")
   public void setSettleBills(List<SettleBill> settleBills) {
      this.settleBills = settleBills;
   }

   @JsonProperty("settleBills")
   public List<SettleBill> getSettleBills() {
      return this.settleBills;
   }

   @JsonProperty("opstatus")
   public void setOpstatus(Integer opstatus) {
      this.opstatus = opstatus;
   }

   @JsonProperty("opstatus")
   public Integer getOpstatus() {
      return this.opstatus;
   }

   @JsonProperty("deliverInfoList")
   public void setDeliverInfoList(List<DeliverInfo> deliverInfoList) {
      this.deliverInfoList = deliverInfoList;
   }

   @JsonProperty("deliverInfoList")
   public List<DeliverInfo> getDeliverInfoList() {
      return this.deliverInfoList;
   }

   @JsonProperty("settleBillDetails")
   public void setSettleBillDetails(List<SettleBillDetail> settleBillDetails) {
      this.settleBillDetails = settleBillDetails;
   }

   @JsonProperty("settleBillDetails")
   public List<SettleBillDetail> getSettleBillDetails() {
      return this.settleBillDetails;
   }
}
