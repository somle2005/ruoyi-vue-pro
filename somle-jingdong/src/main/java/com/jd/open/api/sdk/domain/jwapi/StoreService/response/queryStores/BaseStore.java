package com.jd.open.api.sdk.domain.jwapi.StoreService.response.queryStores;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseStore implements Serializable {
   private String storeCode;
   private String storeName;

   @JsonProperty("storeCode")
   public void setStoreCode(String storeCode) {
      this.storeCode = storeCode;
   }

   @JsonProperty("storeCode")
   public String getStoreCode() {
      return this.storeCode;
   }

   @JsonProperty("storeName")
   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("storeName")
   public String getStoreName() {
      return this.storeName;
   }
}
