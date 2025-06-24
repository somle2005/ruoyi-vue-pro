package com.jd.open.api.sdk.domain.youE.OfflineSettleJsfService.response.offlineSettle;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseResultInfo implements Serializable {
   private String errMsg;
   private Integer resultCode;
   private String data;

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
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("data")
   public String getData() {
      return this.data;
   }
}
