package com.jd.open.api.sdk.domain.list.BrandReadService.request.getBrandByIds;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class GetBrandByIdsParam implements Serializable {
   private Set<Integer> brandIds;
   private ClientInfo clientInfo;

   @JsonProperty("brandIds")
   public void setBrandIds(Set<Integer> brandIds) {
      this.brandIds = brandIds;
   }

   @JsonProperty("brandIds")
   public Set<Integer> getBrandIds() {
      return this.brandIds;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }
}
