package com.jd.open.api.sdk.domain.customsglobalAPI.ServiceProviderJsfService.response.queryOrderByParam;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceProviderResultHead implements Serializable {
   private String resultStatus;
   private String resultMsg;

   @JsonProperty("resultStatus")
   public void setResultStatus(String resultStatus) {
      this.resultStatus = resultStatus;
   }

   @JsonProperty("resultStatus")
   public String getResultStatus() {
      return this.resultStatus;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }
}
