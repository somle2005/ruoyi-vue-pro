package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceServicelogGetResponse extends AbstractResponse {
   private PublicResultObject publicResultObject;

   @JsonProperty("publicResultObject")
   public void setPublicResultObject(PublicResultObject publicResultObject) {
      this.publicResultObject = publicResultObject;
   }

   @JsonProperty("publicResultObject")
   public PublicResultObject getPublicResultObject() {
      return this.publicResultObject;
   }
}
