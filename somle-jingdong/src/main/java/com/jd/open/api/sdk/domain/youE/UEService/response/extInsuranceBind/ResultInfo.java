package com.jd.open.api.sdk.domain.youE.UEService.response.extInsuranceBind;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultInfo implements Serializable {
   private Integer resultCode;
   private String errMsg;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }
}
