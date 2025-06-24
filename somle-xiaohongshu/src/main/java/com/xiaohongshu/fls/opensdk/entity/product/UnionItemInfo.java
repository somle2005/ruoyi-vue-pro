package com.xiaohongshu.fls.opensdk.entity.product;

public class UnionItemInfo {
   public String id;
   public String name;
   public String skuCode;
   public String barcode;
   public int ipq;
   public String erpCode;

   public String getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public String getSkuCode() {
      return this.skuCode;
   }

   public String getBarcode() {
      return this.barcode;
   }

   public int getIpq() {
      return this.ipq;
   }

   public String getErpCode() {
      return this.erpCode;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setSkuCode(String skuCode) {
      this.skuCode = skuCode;
   }

   public void setBarcode(String barcode) {
      this.barcode = barcode;
   }

   public void setIpq(int ipq) {
      this.ipq = ipq;
   }

   public void setErpCode(String erpCode) {
      this.erpCode = erpCode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UnionItemInfo)) {
         return false;
      } else {
         UnionItemInfo other = (UnionItemInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getIpq() != other.getIpq()) {
            return false;
         } else {
            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
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

            Object this$skuCode = this.getSkuCode();
            Object other$skuCode = other.getSkuCode();
            if (this$skuCode == null) {
               if (other$skuCode != null) {
                  return false;
               }
            } else if (!this$skuCode.equals(other$skuCode)) {
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

            Object this$erpCode = this.getErpCode();
            Object other$erpCode = other.getErpCode();
            if (this$erpCode == null) {
               if (other$erpCode != null) {
                  return false;
               }
            } else if (!this$erpCode.equals(other$erpCode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UnionItemInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getIpq();
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $skuCode = this.getSkuCode();
      result = result * 59 + ($skuCode == null ? 43 : $skuCode.hashCode());
      Object $barcode = this.getBarcode();
      result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
      Object $erpCode = this.getErpCode();
      result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
      return result;
   }

   public String toString() {
      return "UnionItemInfo(id=" + this.getId() + ", name=" + this.getName() + ", skuCode=" + this.getSkuCode() + ", barcode=" + this.getBarcode() + ", ipq=" + this.getIpq() + ", erpCode=" + this.getErpCode() + ")";
   }
}
