package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceServiceinfoGetResponse extends AbstractResponse {
   private PublicResultObject3 publicResultObject3;

   @JsonProperty("publicResultObject3")
   public void setPublicResultObject3(PublicResultObject3 publicResultObject3) {
      this.publicResultObject3 = publicResultObject3;
   }

   @JsonProperty("publicResultObject3")
   public PublicResultObject3 getPublicResultObject3() {
      return this.publicResultObject3;
   }
}
