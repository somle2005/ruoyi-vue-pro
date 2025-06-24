package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareAddResponse extends AbstractResponse {
   private long wareId;
   private List<SkuInfo> skuInfo;
   private String created;

   @JsonProperty("skus")
   public List<SkuInfo> getSkuInfo() {
      return this.skuInfo;
   }

   @JsonProperty("skus")
   public void setSkuInfo(List<SkuInfo> skuInfo) {
      this.skuInfo = skuInfo;
   }

   @JsonProperty("ware_id")
   public long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(long wareId) {
      this.wareId = wareId;
   }

   public String getCreated() {
      return this.created;
   }

   public void setCreated(String created) {
      this.created = created;
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
