package com.jd.open.api.sdk.domain.hudong.PresaleQueryService.response.getControlTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PresaleTimeResult implements Serializable {
   private Long controlBeginTime;
   private Long controlEndTime;

   @JsonProperty("controlBeginTime")
   public void setControlBeginTime(Long controlBeginTime) {
      this.controlBeginTime = controlBeginTime;
   }

   @JsonProperty("controlBeginTime")
   public Long getControlBeginTime() {
      return this.controlBeginTime;
   }

   @JsonProperty("controlEndTime")
   public void setControlEndTime(Long controlEndTime) {
      this.controlEndTime = controlEndTime;
   }

   @JsonProperty("controlEndTime")
   public Long getControlEndTime() {
      return this.controlEndTime;
   }
}
