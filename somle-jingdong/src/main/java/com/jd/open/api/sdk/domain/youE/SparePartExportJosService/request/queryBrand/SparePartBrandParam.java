package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.queryBrand;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartBrandParam implements Serializable {
   private Integer providerId;

   @JsonProperty("providerId")
   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   @JsonProperty("providerId")
   public Integer getProviderId() {
      return this.providerId;
   }
}
