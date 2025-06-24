package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.afsservice.ServiceCommonProvider.response.get.PublicResultObject4;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceRefundinfoGetResponse extends AbstractResponse {
   private PublicResultObject4 publicResultObject4;

   @JsonProperty("publicResultObject4")
   public void setPublicResultObject4(PublicResultObject4 publicResultObject4) {
      this.publicResultObject4 = publicResultObject4;
   }

   @JsonProperty("publicResultObject4")
   public PublicResultObject4 getPublicResultObject4() {
      return this.publicResultObject4;
   }
}
