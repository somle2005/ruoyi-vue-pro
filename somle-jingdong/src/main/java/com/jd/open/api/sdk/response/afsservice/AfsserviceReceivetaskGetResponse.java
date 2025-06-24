package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceReceivetaskGetResponse extends AbstractResponse {
   private PublicResultObject6 publicResultObject6;

   @JsonProperty("publicResultObject6")
   public void setPublicResultObject6(PublicResultObject6 publicResultObject6) {
      this.publicResultObject6 = publicResultObject6;
   }

   @JsonProperty("publicResultObject6")
   public PublicResultObject6 getPublicResultObject6() {
      return this.publicResultObject6;
   }
}
