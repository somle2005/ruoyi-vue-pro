package com.jd.open.api.sdk.domain.supplier.IDpsPartitionStockInterface.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VendorStoreInfo implements Serializable {
   private Integer[] vendorStoreId;
   private String[] vendorStoreName;

   @JsonProperty("vendorStoreId")
   public void setVendorStoreId(Integer[] vendorStoreId) {
      this.vendorStoreId = vendorStoreId;
   }

   @JsonProperty("vendorStoreId")
   public Integer[] getVendorStoreId() {
      return this.vendorStoreId;
   }

   @JsonProperty("vendorStoreName")
   public void setVendorStoreName(String[] vendorStoreName) {
      this.vendorStoreName = vendorStoreName;
   }

   @JsonProperty("vendorStoreName")
   public String[] getVendorStoreName() {
      return this.vendorStoreName;
   }
}
