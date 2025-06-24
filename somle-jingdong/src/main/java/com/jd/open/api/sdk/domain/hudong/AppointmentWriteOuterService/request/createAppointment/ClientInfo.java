package com.jd.open.api.sdk.domain.hudong.AppointmentWriteOuterService.request.createAppointment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ClientInfo implements Serializable {
   private String appName;
   private String appId;

   @JsonProperty("appName")
   public void setAppName(String appName) {
      this.appName = appName;
   }

   @JsonProperty("appName")
   public String getAppName() {
      return this.appName;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }
}
