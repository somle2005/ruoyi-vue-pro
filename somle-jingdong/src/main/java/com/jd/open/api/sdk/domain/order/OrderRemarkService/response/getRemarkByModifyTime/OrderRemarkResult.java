package com.jd.open.api.sdk.domain.order.OrderRemarkService.response.getRemarkByModifyTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderRemarkResult implements Serializable {
   private Integer resultCode;
   private String errorMsg;
   private Long totleNum;
   private List<OrderRemark> remarkList;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("totleNum")
   public void setTotleNum(Long totleNum) {
      this.totleNum = totleNum;
   }

   @JsonProperty("totleNum")
   public Long getTotleNum() {
      return this.totleNum;
   }

   @JsonProperty("remarkList")
   public void setRemarkList(List<OrderRemark> remarkList) {
      this.remarkList = remarkList;
   }

   @JsonProperty("remarkList")
   public List<OrderRemark> getRemarkList() {
      return this.remarkList;
   }
}
