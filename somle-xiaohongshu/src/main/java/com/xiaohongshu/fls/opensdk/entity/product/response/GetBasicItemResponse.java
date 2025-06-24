package com.xiaohongshu.fls.opensdk.entity.product.response;

import com.xiaohongshu.fls.opensdk.entity.PageChunkV3;
import java.util.ArrayList;
import java.util.List;

public class GetBasicItemResponse extends PageChunkV3 {
   List<ItemBasicV3> hits = new ArrayList();

   public List<ItemBasicV3> getHits() {
      return this.hits;
   }

   public void setHits(List<ItemBasicV3> hits) {
      this.hits = hits;
   }

   public class ItemBasicV3 {
      private String itemId;
      private String name;
      private String splId;
      private String spvId;
      private String spuId;
      private double price;
      private String skucode;
      private boolean buyable;
      private String barcode;
      private long stock;
      private int status;
      private boolean freeze;
      private long createTime;
      private long updateTime;

      public String getItemId() {
         return this.itemId;
      }

      public String getName() {
         return this.name;
      }

      public String getSplId() {
         return this.splId;
      }

      public String getSpvId() {
         return this.spvId;
      }

      public String getSpuId() {
         return this.spuId;
      }

      public double getPrice() {
         return this.price;
      }

      public String getSkucode() {
         return this.skucode;
      }

      public boolean isBuyable() {
         return this.buyable;
      }

      public String getBarcode() {
         return this.barcode;
      }

      public long getStock() {
         return this.stock;
      }

      public int getStatus() {
         return this.status;
      }

      public boolean isFreeze() {
         return this.freeze;
      }

      public long getCreateTime() {
         return this.createTime;
      }

      public long getUpdateTime() {
         return this.updateTime;
      }

      public void setItemId(String itemId) {
         this.itemId = itemId;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setSplId(String splId) {
         this.splId = splId;
      }

      public void setSpvId(String spvId) {
         this.spvId = spvId;
      }

      public void setSpuId(String spuId) {
         this.spuId = spuId;
      }

      public void setPrice(double price) {
         this.price = price;
      }

      public void setSkucode(String skucode) {
         this.skucode = skucode;
      }

      public void setBuyable(boolean buyable) {
         this.buyable = buyable;
      }

      public void setBarcode(String barcode) {
         this.barcode = barcode;
      }

      public void setStock(long stock) {
         this.stock = stock;
      }

      public void setStatus(int status) {
         this.status = status;
      }

      public void setFreeze(boolean freeze) {
         this.freeze = freeze;
      }

      public void setCreateTime(long createTime) {
         this.createTime = createTime;
      }

      public void setUpdateTime(long updateTime) {
         this.updateTime = updateTime;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ItemBasicV3)) {
            return false;
         } else {
            ItemBasicV3 other = (ItemBasicV3)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (Double.compare(this.getPrice(), other.getPrice()) != 0) {
               return false;
            } else if (this.isBuyable() != other.isBuyable()) {
               return false;
            } else if (this.getStock() != other.getStock()) {
               return false;
            } else if (this.getStatus() != other.getStatus()) {
               return false;
            } else if (this.isFreeze() != other.isFreeze()) {
               return false;
            } else if (this.getCreateTime() != other.getCreateTime()) {
               return false;
            } else if (this.getUpdateTime() != other.getUpdateTime()) {
               return false;
            } else {
               Object this$itemId = this.getItemId();
               Object other$itemId = other.getItemId();
               if (this$itemId == null) {
                  if (other$itemId != null) {
                     return false;
                  }
               } else if (!this$itemId.equals(other$itemId)) {
                  return false;
               }

               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name != null) {
                     return false;
                  }
               } else if (!this$name.equals(other$name)) {
                  return false;
               }

               Object this$splId = this.getSplId();
               Object other$splId = other.getSplId();
               if (this$splId == null) {
                  if (other$splId != null) {
                     return false;
                  }
               } else if (!this$splId.equals(other$splId)) {
                  return false;
               }

               Object this$spvId = this.getSpvId();
               Object other$spvId = other.getSpvId();
               if (this$spvId == null) {
                  if (other$spvId != null) {
                     return false;
                  }
               } else if (!this$spvId.equals(other$spvId)) {
                  return false;
               }

               Object this$spuId = this.getSpuId();
               Object other$spuId = other.getSpuId();
               if (this$spuId == null) {
                  if (other$spuId != null) {
                     return false;
                  }
               } else if (!this$spuId.equals(other$spuId)) {
                  return false;
               }

               Object this$skucode = this.getSkucode();
               Object other$skucode = other.getSkucode();
               if (this$skucode == null) {
                  if (other$skucode != null) {
                     return false;
                  }
               } else if (!this$skucode.equals(other$skucode)) {
                  return false;
               }

               Object this$barcode = this.getBarcode();
               Object other$barcode = other.getBarcode();
               if (this$barcode == null) {
                  if (other$barcode != null) {
                     return false;
                  }
               } else if (!this$barcode.equals(other$barcode)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ItemBasicV3;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $price = Double.doubleToLongBits(this.getPrice());
         result = result * 59 + (int)($price >>> 32 ^ $price);
         result = result * 59 + (this.isBuyable() ? 79 : 97);
         long $stock = this.getStock();
         result = result * 59 + (int)($stock >>> 32 ^ $stock);
         result = result * 59 + this.getStatus();
         result = result * 59 + (this.isFreeze() ? 79 : 97);
         long $createTime = this.getCreateTime();
         result = result * 59 + (int)($createTime >>> 32 ^ $createTime);
         long $updateTime = this.getUpdateTime();
         result = result * 59 + (int)($updateTime >>> 32 ^ $updateTime);
         Object $itemId = this.getItemId();
         result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $splId = this.getSplId();
         result = result * 59 + ($splId == null ? 43 : $splId.hashCode());
         Object $spvId = this.getSpvId();
         result = result * 59 + ($spvId == null ? 43 : $spvId.hashCode());
         Object $spuId = this.getSpuId();
         result = result * 59 + ($spuId == null ? 43 : $spuId.hashCode());
         Object $skucode = this.getSkucode();
         result = result * 59 + ($skucode == null ? 43 : $skucode.hashCode());
         Object $barcode = this.getBarcode();
         result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
         return result;
      }

      public String toString() {
         return "GetBasicItemResponse.ItemBasicV3(itemId=" + this.getItemId() + ", name=" + this.getName() + ", splId=" + this.getSplId() + ", spvId=" + this.getSpvId() + ", spuId=" + this.getSpuId() + ", price=" + this.getPrice() + ", skucode=" + this.getSkucode() + ", buyable=" + this.isBuyable() + ", barcode=" + this.getBarcode() + ", stock=" + this.getStock() + ", status=" + this.getStatus() + ", freeze=" + this.isFreeze() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ")";
      }
   }
}
