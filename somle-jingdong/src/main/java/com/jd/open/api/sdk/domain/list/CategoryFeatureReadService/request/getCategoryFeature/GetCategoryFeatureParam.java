package com.jd.open.api.sdk.domain.list.CategoryFeatureReadService.request.getCategoryFeature;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class GetCategoryFeatureParam implements Serializable {
   private ClientInfo clientInfo;
   private Set<Integer> categoryIds;

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("categoryIds")
   public void setCategoryIds(Set<Integer> categoryIds) {
      this.categoryIds = categoryIds;
   }

   @JsonProperty("categoryIds")
   public Set<Integer> getCategoryIds() {
      return this.categoryIds;
   }
}
