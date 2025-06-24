package com.jd.open.api.sdk.domain.alpha.AlphaJOSService.response.getVenderCarrier;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StandardGenericResponse implements Serializable {
   private Integer resultCode;
   private String resultMsg;
   private VenderRelationCarrierResult result;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("result")
   public void setResult(VenderRelationCarrierResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public VenderRelationCarrierResult getResult() {
      return this.result;
   }
}
