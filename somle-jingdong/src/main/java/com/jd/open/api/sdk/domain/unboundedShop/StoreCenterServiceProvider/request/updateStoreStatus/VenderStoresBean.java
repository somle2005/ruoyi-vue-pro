package com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.request.updateStoreStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderStoresBean implements Serializable {
   private Integer storeStatus;
   private Long id;

   @JsonProperty("storeStatus")
   public void setStoreStatus(Integer storeStatus) {
      this.storeStatus = storeStatus;
   }

   @JsonProperty("storeStatus")
   public Integer getStoreStatus() {
      return this.storeStatus;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }
}
