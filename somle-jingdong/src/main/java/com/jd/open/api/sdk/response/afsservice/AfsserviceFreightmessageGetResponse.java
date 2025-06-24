package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceFreightmessageGetResponse extends AbstractResponse {
   private PublicResultObject1 publicResultObject;

   @JsonProperty("publicResultObject")
   public void setPublicResultObject(PublicResultObject1 publicResultObject) {
      this.publicResultObject = publicResultObject;
   }

   @JsonProperty("publicResultObject")
   public PublicResultObject1 getPublicResultObject() {
      return this.publicResultObject;
   }
}
