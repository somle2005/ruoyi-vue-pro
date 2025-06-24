package com.jd.open.api.sdk.domain.ThreePL.AICheckBillService.request.submitAICheckBillRealtime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AppInfo implements Serializable {
   private String appCode;

   @JsonProperty("appCode")
   public void setAppCode(String appCode) {
      this.appCode = appCode;
   }

   @JsonProperty("appCode")
   public String getAppCode() {
      return this.appCode;
   }
}
