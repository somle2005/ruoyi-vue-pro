package com.jd.open.api.sdk.domain.vopdz.QueryAddressOpenProvider.response.queryJdAreaIdList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OpenRpcResult implements Serializable {
   private String resultCode;
   private String resultMessage;
   private boolean success;
   private QueryJdAreaIdListOpenResp result;

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("result")
   public void setResult(QueryJdAreaIdListOpenResp result) {
      this.result = result;
   }

   @JsonProperty("result")
   public QueryJdAreaIdListOpenResp getResult() {
      return this.result;
   }
}
