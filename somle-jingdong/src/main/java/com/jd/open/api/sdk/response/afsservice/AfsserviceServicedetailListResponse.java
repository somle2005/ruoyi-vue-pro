package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceServicedetailListResponse extends AbstractResponse {
   private PublicResultList publicResultList;

   @JsonProperty("publicResultList")
   public void setPublicResultList(PublicResultList publicResultList) {
      this.publicResultList = publicResultList;
   }

   @JsonProperty("publicResultList")
   public PublicResultList getPublicResultList() {
      return this.publicResultList;
   }
}
