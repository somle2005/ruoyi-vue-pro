package com.jd.open.api.sdk.domain.supplier.IDpsSearchSingleCustomOrderInterface.response.searchsingleorder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StoreInfo implements Serializable {
   private String storeId;
   private String storeName;
   private String storePhone;
   private String storeAddress;

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("storeName")
   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("storeName")
   public String getStoreName() {
      return this.storeName;
   }

   @JsonProperty("storePhone")
   public void setStorePhone(String storePhone) {
      this.storePhone = storePhone;
   }

   @JsonProperty("storePhone")
   public String getStorePhone() {
      return this.storePhone;
   }

   @JsonProperty("storeAddress")
   public void setStoreAddress(String storeAddress) {
      this.storeAddress = storeAddress;
   }

   @JsonProperty("storeAddress")
   public String getStoreAddress() {
      return this.storeAddress;
   }
}
