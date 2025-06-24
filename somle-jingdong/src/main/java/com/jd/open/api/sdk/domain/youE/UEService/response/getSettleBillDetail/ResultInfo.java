package com.jd.open.api.sdk.domain.youE.UEService.response.getSettleBillDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private Integer resultCode;
   private String errMsg;
   private Integer pageSize;
   private String settleNo;
   private List<SettleBill> settleBills;
   private Integer opstatus;
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

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
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

   @JsonProperty("settleBillDetails")
   public void setSettleBillDetails(List<SettleBillDetail> settleBillDetails) {
      this.settleBillDetails = settleBillDetails;
   }

   @JsonProperty("settleBillDetails")
   public List<SettleBillDetail> getSettleBillDetails() {
      return this.settleBillDetails;
   }
}
