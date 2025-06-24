package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceAlltaskGetResponse extends AbstractResponse {
   private PublicResultObject5 publicResultObject5;

   @JsonProperty("publicResultObject5")
   public void setPublicResultObject5(PublicResultObject5 publicResultObject5) {
      this.publicResultObject5 = publicResultObject5;
   }

   @JsonProperty("publicResultObject5")
   public PublicResultObject5 getPublicResultObject5() {
      return this.publicResultObject5;
   }
}
