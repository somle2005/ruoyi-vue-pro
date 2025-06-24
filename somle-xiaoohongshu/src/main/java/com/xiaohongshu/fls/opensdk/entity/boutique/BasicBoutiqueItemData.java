package com.xiaohongshu.fls.opensdk.entity.boutique;

public class BasicBoutiqueItemData {
   public String itemId;
   public String name;
   public double price;
   public String skucode;
   public boolean buyable;
   public String barcode;
   public String whcode;
   public long stock;
   public BoutiqueMode boutiqueMode;
   public String boutiqueModeName;
   public String vendorCode;
   public String boutiqueBatchId;
   public long createTime;
   public long updateTime;

   public String getItemId() {
      return this.itemId;
   }

   public String getName() {
      return this.name;
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

   public String getWhcode() {
      return this.whcode;
   }

   public long getStock() {
      return this.stock;
   }

   public BoutiqueMode getBoutiqueMode() {
      return this.boutiqueMode;
   }

   public String getBoutiqueModeName() {
      return this.boutiqueModeName;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getBoutiqueBatchId() {
      return this.boutiqueBatchId;
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

   public void setWhcode(String whcode) {
      this.whcode = whcode;
   }

   public void setStock(long stock) {
      this.stock = stock;
   }

   public void setBoutiqueMode(BoutiqueMode boutiqueMode) {
      this.boutiqueMode = boutiqueMode;
   }

   public void setBoutiqueModeName(String boutiqueModeName) {
      this.boutiqueModeName = boutiqueModeName;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public void setBoutiqueBatchId(String boutiqueBatchId) {
      this.boutiqueBatchId = boutiqueBatchId;
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
      } else if (!(o instanceof BasicBoutiqueItemData)) {
         return false;
      } else {
         BasicBoutiqueItemData other = (BasicBoutiqueItemData)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (Double.compare(this.getPrice(), other.getPrice()) != 0) {
            return false;
         } else if (this.isBuyable() != other.isBuyable()) {
            return false;
         } else if (this.getStock() != other.getStock()) {
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

            Object this$whcode = this.getWhcode();
            Object other$whcode = other.getWhcode();
            if (this$whcode == null) {
               if (other$whcode != null) {
                  return false;
               }
            } else if (!this$whcode.equals(other$whcode)) {
               return false;
            }

            Object this$boutiqueMode = this.getBoutiqueMode();
            Object other$boutiqueMode = other.getBoutiqueMode();
            if (this$boutiqueMode == null) {
               if (other$boutiqueMode != null) {
                  return false;
               }
            } else if (!this$boutiqueMode.equals(other$boutiqueMode)) {
               return false;
            }

            Object this$boutiqueModeName = this.getBoutiqueModeName();
            Object other$boutiqueModeName = other.getBoutiqueModeName();
            if (this$boutiqueModeName == null) {
               if (other$boutiqueModeName != null) {
                  return false;
               }
            } else if (!this$boutiqueModeName.equals(other$boutiqueModeName)) {
               return false;
            }

            Object this$vendorCode = this.getVendorCode();
            Object other$vendorCode = other.getVendorCode();
            if (this$vendorCode == null) {
               if (other$vendorCode != null) {
                  return false;
               }
            } else if (!this$vendorCode.equals(other$vendorCode)) {
               return false;
            }

            Object this$boutiqueBatchId = this.getBoutiqueBatchId();
            Object other$boutiqueBatchId = other.getBoutiqueBatchId();
            if (this$boutiqueBatchId == null) {
               if (other$boutiqueBatchId != null) {
                  return false;
               }
            } else if (!this$boutiqueBatchId.equals(other$boutiqueBatchId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BasicBoutiqueItemData;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $price = Double.doubleToLongBits(this.getPrice());
      result = result * 59 + (int)($price >>> 32 ^ $price);
      result = result * 59 + (this.isBuyable() ? 79 : 97);
      long $stock = this.getStock();
      result = result * 59 + (int)($stock >>> 32 ^ $stock);
      long $createTime = this.getCreateTime();
      result = result * 59 + (int)($createTime >>> 32 ^ $createTime);
      long $updateTime = this.getUpdateTime();
      result = result * 59 + (int)($updateTime >>> 32 ^ $updateTime);
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $skucode = this.getSkucode();
      result = result * 59 + ($skucode == null ? 43 : $skucode.hashCode());
      Object $barcode = this.getBarcode();
      result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
      Object $whcode = this.getWhcode();
      result = result * 59 + ($whcode == null ? 43 : $whcode.hashCode());
      Object $boutiqueMode = this.getBoutiqueMode();
      result = result * 59 + ($boutiqueMode == null ? 43 : $boutiqueMode.hashCode());
      Object $boutiqueModeName = this.getBoutiqueModeName();
      result = result * 59 + ($boutiqueModeName == null ? 43 : $boutiqueModeName.hashCode());
      Object $vendorCode = this.getVendorCode();
      result = result * 59 + ($vendorCode == null ? 43 : $vendorCode.hashCode());
      Object $boutiqueBatchId = this.getBoutiqueBatchId();
      result = result * 59 + ($boutiqueBatchId == null ? 43 : $boutiqueBatchId.hashCode());
      return result;
   }

   public String toString() {
      return "BasicBoutiqueItemData(itemId=" + this.getItemId() + ", name=" + this.getName() + ", price=" + this.getPrice() + ", skucode=" + this.getSkucode() + ", buyable=" + this.isBuyable() + ", barcode=" + this.getBarcode() + ", whcode=" + this.getWhcode() + ", stock=" + this.getStock() + ", boutiqueMode=" + this.getBoutiqueMode() + ", boutiqueModeName=" + this.getBoutiqueModeName() + ", vendorCode=" + this.getVendorCode() + ", boutiqueBatchId=" + this.getBoutiqueBatchId() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ")";
   }
}
