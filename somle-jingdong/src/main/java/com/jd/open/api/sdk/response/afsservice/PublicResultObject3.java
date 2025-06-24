package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublicResultObject3 implements Serializable {
   private Integer resultCode;
   private AfsServiceOut afsServiceOut;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("afsServiceOut")
   public void setAfsServiceOut(AfsServiceOut afsServiceOut) {
      this.afsServiceOut = afsServiceOut;
   }

   @JsonProperty("afsServiceOut")
   public AfsServiceOut getAfsServiceOut() {
      return this.afsServiceOut;
   }
}
