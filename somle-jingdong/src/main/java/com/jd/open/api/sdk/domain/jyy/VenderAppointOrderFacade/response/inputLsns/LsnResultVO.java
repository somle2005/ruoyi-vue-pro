package com.jd.open.api.sdk.domain.jyy.VenderAppointOrderFacade.response.inputLsns;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LsnResultVO implements Serializable {
   private String appointOrderId;
   private String failReason;

   @JsonProperty("appointOrderId")
   public void setAppointOrderId(String appointOrderId) {
      this.appointOrderId = appointOrderId;
   }

   @JsonProperty("appointOrderId")
   public String getAppointOrderId() {
      return this.appointOrderId;
   }

   @JsonProperty("failReason")
   public void setFailReason(String failReason) {
      this.failReason = failReason;
   }

   @JsonProperty("failReason")
   public String getFailReason() {
      return this.failReason;
   }
}
