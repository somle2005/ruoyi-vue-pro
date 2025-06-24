package com.jd.open.api.sdk.domain.im.RiskCtrlOpenApi.response.sensitiveWordCheck;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseHeader implements Serializable {
   private String returnCode;
   private String returnMsg;

   @JsonProperty("returnCode")
   public void setReturnCode(String returnCode) {
      this.returnCode = returnCode;
   }

   @JsonProperty("returnCode")
   public String getReturnCode() {
      return this.returnCode;
   }

   @JsonProperty("returnMsg")
   public void setReturnMsg(String returnMsg) {
      this.returnMsg = returnMsg;
   }

   @JsonProperty("returnMsg")
   public String getReturnMsg() {
      return this.returnMsg;
   }
}
