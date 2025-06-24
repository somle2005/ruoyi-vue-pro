package com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.response.setStoreGisFenceInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GisFenceInfoTo implements Serializable {
   private Long intersectsStoreId;

   @JsonProperty("intersectsStoreId")
   public void setIntersectsStoreId(Long intersectsStoreId) {
      this.intersectsStoreId = intersectsStoreId;
   }

   @JsonProperty("intersectsStoreId")
   public Long getIntersectsStoreId() {
      return this.intersectsStoreId;
   }
}
