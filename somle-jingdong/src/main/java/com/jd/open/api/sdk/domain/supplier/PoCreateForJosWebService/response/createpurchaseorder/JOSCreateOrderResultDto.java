package com.jd.open.api.sdk.domain.supplier.PoCreateForJosWebService.response.createpurchaseorder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JOSCreateOrderResultDto implements Serializable {
   private List<Long> orderIdList;
   private boolean success;
   private String resultCode;
   private String resultMessage;

   @JsonProperty("order_id_list")
   public void setOrderIdList(List<Long> orderIdList) {
      this.orderIdList = orderIdList;
   }

   @JsonProperty("order_id_list")
   public List<Long> getOrderIdList() {
      return this.orderIdList;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("result_code")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("result_code")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("result_message")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("result_message")
   public String getResultMessage() {
      return this.resultMessage;
   }
}
