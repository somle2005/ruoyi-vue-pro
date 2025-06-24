package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.queryProvider;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartProviderInfo implements Serializable {
   private Integer providerId;
   private String providerName;

   @JsonProperty("providerId")
   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   @JsonProperty("providerId")
   public Integer getProviderId() {
      return this.providerId;
   }

   @JsonProperty("providerName")
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   @JsonProperty("providerName")
   public String getProviderName() {
      return this.providerName;
   }
}
