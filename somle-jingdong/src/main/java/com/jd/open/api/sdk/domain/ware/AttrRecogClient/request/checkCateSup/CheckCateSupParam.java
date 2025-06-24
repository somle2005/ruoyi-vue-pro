package com.jd.open.api.sdk.domain.ware.AttrRecogClient.request.checkCateSup;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class CheckCateSupParam implements Serializable {
   private Set<String> lastCateIdSet;
   private String requestId;

   @JsonProperty("lastCateIdSet")
   public void setLastCateIdSet(Set<String> lastCateIdSet) {
      this.lastCateIdSet = lastCateIdSet;
   }

   @JsonProperty("lastCateIdSet")
   public Set<String> getLastCateIdSet() {
      return this.lastCateIdSet;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }
}
