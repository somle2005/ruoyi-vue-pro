package com.jd.open.api.sdk.domain.youE.BizProgressJsfService.response.dispatchOrder2Engineer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private int resultCode;
   private String errMsg;
   private List<BizProgress> orderStateList;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
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

   @JsonProperty("orderStateList")
   public void setOrderStateList(List<BizProgress> orderStateList) {
      this.orderStateList = orderStateList;
   }

   @JsonProperty("orderStateList")
   public List<BizProgress> getOrderStateList() {
      return this.orderStateList;
   }
}
