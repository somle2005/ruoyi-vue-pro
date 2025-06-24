package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublicResultObject1 implements Serializable {
   private Integer resultCode;
   private AfsFreightOut result;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("result")
   public void setResult(AfsFreightOut result) {
      this.result = result;
   }

   @JsonProperty("result")
   public AfsFreightOut getResult() {
      return this.result;
   }
}
