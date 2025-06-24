package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareUpdateResponse extends AbstractResponse {
   private String modified;
   private String wareId;
   private List<SkuInfo> skuInfo;

   @JsonProperty("skus")
   public List<SkuInfo> getSkuInfo() {
      return this.skuInfo;
   }

   @JsonProperty("skus")
   public void setSkuInfo(List<SkuInfo> skuInfo) {
      this.skuInfo = skuInfo;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("ware_id")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public static class SkuInfo {
      private long skuId;
      private String attribute;

      @JsonProperty("sku_id")
      public long getSkuId() {
         return this.skuId;
      }

      @JsonProperty("sku_id")
      public void setSkuId(long skuId) {
         this.skuId = skuId;
      }

      @JsonProperty("attribute")
      public String getAttribute() {
         return this.attribute;
      }

      @JsonProperty("attribute")
      public void setAttribute(String attribute) {
         this.attribute = attribute;
      }
   }
}
