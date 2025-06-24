package com.jd.open.api.sdk.domain.jinsuanpan.BillQueryServiceProvider.response.queryRefundBillChargeListByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RpcResponse implements Serializable {
   private boolean success;
   private String resultCode;
   private String message;
   private List<RefundBillChargeMO> value;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("value")
   public void setValue(List<RefundBillChargeMO> value) {
      this.value = value;
   }

   @JsonProperty("value")
   public List<RefundBillChargeMO> getValue() {
      return this.value;
   }
}
