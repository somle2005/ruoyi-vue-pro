package com.jd.open.api.sdk.domain.youE.PaymentFailedListJsfService.response.paymentFailed;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BaseResultInfo implements Serializable {
   private String errMsg;
   private Integer resultCode;
   private List<PaymentFailedOrder> data;

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("data")
   public void setData(List<PaymentFailedOrder> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<PaymentFailedOrder> getData() {
      return this.data;
   }
}
