package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.customerDeliveryStoreApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OperatorInfoReq implements Serializable {
   private String operatorPin;
   private String operatorNick;
   private Integer platformSrc;

   @JsonProperty("operatorPin")
   public void setOperatorPin(String operatorPin) {
      this.operatorPin = operatorPin;
   }

   @JsonProperty("operatorPin")
   public String getOperatorPin() {
      return this.operatorPin;
   }

   @JsonProperty("operatorNick")
   public void setOperatorNick(String operatorNick) {
      this.operatorNick = operatorNick;
   }

   @JsonProperty("operatorNick")
   public String getOperatorNick() {
      return this.operatorNick;
   }

   @JsonProperty("platformSrc")
   public void setPlatformSrc(Integer platformSrc) {
      this.platformSrc = platformSrc;
   }

   @JsonProperty("platformSrc")
   public Integer getPlatformSrc() {
      return this.platformSrc;
   }
}
