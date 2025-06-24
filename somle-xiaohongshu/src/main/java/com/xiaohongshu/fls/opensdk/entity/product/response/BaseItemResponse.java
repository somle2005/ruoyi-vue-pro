package com.xiaohongshu.fls.opensdk.entity.product.response;

import com.xiaohongshu.fls.opensdk.entity.product.ItemState;
import com.xiaohongshu.fls.opensdk.entity.product.ItemStatus;
import com.xiaohongshu.fls.opensdk.entity.product.UnionItemInfo;
import java.util.ArrayList;
import java.util.List;

public class BaseItemResponse {
   private String id;
   private String name;
   private String ename;
   private String skucode;
   private String spvId;
   private String spuId;
   private String splId;
   private ItemStatus status;
   private String barcode;
   private String barcodeType;
   private boolean buyable;
   private boolean available;
   private ItemState state;
   private long createTime;
   private long updateTime;
   private long stock;
   private boolean freeze;
   private PriceTax priceTax = new PriceTax();
   private String priceType;
   private String transitWhCode;
   private String logistics;
   private String customsCode;
   private String logisticsCompanyCode;
   private String logisticsPlanId;
   private double price;
   private double originalPrice;
   private String articleNo;
   private String clsType;
   private List<UnionItemInfo> unionItemDetails = new ArrayList();
   private String whcode;
   private String erpCode;
   private String logisticsDeclarationMode;

   public String getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public String getEname() {
      return this.ename;
   }

   public String getSkucode() {
      return this.skucode;
   }

   public String getSpvId() {
      return this.spvId;
   }

   public String getSpuId() {
      return this.spuId;
   }

   public String getSplId() {
      return this.splId;
   }

   public ItemStatus getStatus() {
      return this.status;
   }

   public String getBarcode() {
      return this.barcode;
   }

   public String getBarcodeType() {
      return this.barcodeType;
   }

   public boolean isBuyable() {
      return this.buyable;
   }

   public boolean isAvailable() {
      return this.available;
   }

   public ItemState getState() {
      return this.state;
   }

   public long getCreateTime() {
      return this.createTime;
   }

   public long getUpdateTime() {
      return this.updateTime;
   }

   public long getStock() {
      return this.stock;
   }

   public boolean isFreeze() {
      return this.freeze;
   }

   public PriceTax getPriceTax() {
      return this.priceTax;
   }

   public String getPriceType() {
      return this.priceType;
   }

   public String getTransitWhCode() {
      return this.transitWhCode;
   }

   public String getLogistics() {
      return this.logistics;
   }

   public String getCustomsCode() {
      return this.customsCode;
   }

   public String getLogisticsCompanyCode() {
      return this.logisticsCompanyCode;
   }

   public String getLogisticsPlanId() {
      return this.logisticsPlanId;
   }

   public double getPrice() {
      return this.price;
   }

   public double getOriginalPrice() {
      return this.originalPrice;
   }

   public String getArticleNo() {
      return this.articleNo;
   }

   public String getClsType() {
      return this.clsType;
   }

   public List<UnionItemInfo> getUnionItemDetails() {
      return this.unionItemDetails;
   }

   public String getWhcode() {
      return this.whcode;
   }

   public String getErpCode() {
      return this.erpCode;
   }

   public String getLogisticsDeclarationMode() {
      return this.logisticsDeclarationMode;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setEname(String ename) {
      this.ename = ename;
   }

   public void setSkucode(String skucode) {
      this.skucode = skucode;
   }

   public void setSpvId(String spvId) {
      this.spvId = spvId;
   }

   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   public void setSplId(String splId) {
      this.splId = splId;
   }

   public void setStatus(ItemStatus status) {
      this.status = status;
   }

   public void setBarcode(String barcode) {
      this.barcode = barcode;
   }

   public void setBarcodeType(String barcodeType) {
      this.barcodeType = barcodeType;
   }

   public void setBuyable(boolean buyable) {
      this.buyable = buyable;
   }

   public void setAvailable(boolean available) {
      this.available = available;
   }

   public void setState(ItemState state) {
      this.state = state;
   }

   public void setCreateTime(long createTime) {
      this.createTime = createTime;
   }

   public void setUpdateTime(long updateTime) {
      this.updateTime = updateTime;
   }

   public void setStock(long stock) {
      this.stock = stock;
   }

   public void setFreeze(boolean freeze) {
      this.freeze = freeze;
   }

   public void setPriceTax(PriceTax priceTax) {
      this.priceTax = priceTax;
   }

   public void setPriceType(String priceType) {
      this.priceType = priceType;
   }

   public void setTransitWhCode(String transitWhCode) {
      this.transitWhCode = transitWhCode;
   }

   public void setLogistics(String logistics) {
      this.logistics = logistics;
   }

   public void setCustomsCode(String customsCode) {
      this.customsCode = customsCode;
   }

   public void setLogisticsCompanyCode(String logisticsCompanyCode) {
      this.logisticsCompanyCode = logisticsCompanyCode;
   }

   public void setLogisticsPlanId(String logisticsPlanId) {
      this.logisticsPlanId = logisticsPlanId;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public void setOriginalPrice(double originalPrice) {
      this.originalPrice = originalPrice;
   }

   public void setArticleNo(String articleNo) {
      this.articleNo = articleNo;
   }

   public void setClsType(String clsType) {
      this.clsType = clsType;
   }

   public void setUnionItemDetails(List<UnionItemInfo> unionItemDetails) {
      this.unionItemDetails = unionItemDetails;
   }

   public void setWhcode(String whcode) {
      this.whcode = whcode;
   }

   public void setErpCode(String erpCode) {
      this.erpCode = erpCode;
   }

   public void setLogisticsDeclarationMode(String logisticsDeclarationMode) {
      this.logisticsDeclarationMode = logisticsDeclarationMode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BaseItemResponse)) {
         return false;
      } else {
         BaseItemResponse other = (BaseItemResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.isBuyable() != other.isBuyable()) {
            return false;
         } else if (this.isAvailable() != other.isAvailable()) {
            return false;
         } else if (this.getCreateTime() != other.getCreateTime()) {
            return false;
         } else if (this.getUpdateTime() != other.getUpdateTime()) {
            return false;
         } else if (this.getStock() != other.getStock()) {
            return false;
         } else if (this.isFreeze() != other.isFreeze()) {
            return false;
         } else if (Double.compare(this.getPrice(), other.getPrice()) != 0) {
            return false;
         } else if (Double.compare(this.getOriginalPrice(), other.getOriginalPrice()) != 0) {
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

            Object this$ename = this.getEname();
            Object other$ename = other.getEname();
            if (this$ename == null) {
               if (other$ename != null) {
                  return false;
               }
            } else if (!this$ename.equals(other$ename)) {
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

            Object this$splId = this.getSplId();
            Object other$splId = other.getSplId();
            if (this$splId == null) {
               if (other$splId != null) {
                  return false;
               }
            } else if (!this$splId.equals(other$splId)) {
               return false;
            }

            Object this$status = this.getStatus();
            Object other$status = other.getStatus();
            if (this$status == null) {
               if (other$status != null) {
                  return false;
               }
            } else if (!this$status.equals(other$status)) {
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

            Object this$barcodeType = this.getBarcodeType();
            Object other$barcodeType = other.getBarcodeType();
            if (this$barcodeType == null) {
               if (other$barcodeType != null) {
                  return false;
               }
            } else if (!this$barcodeType.equals(other$barcodeType)) {
               return false;
            }

            Object this$state = this.getState();
            Object other$state = other.getState();
            if (this$state == null) {
               if (other$state != null) {
                  return false;
               }
            } else if (!this$state.equals(other$state)) {
               return false;
            }

            Object this$priceTax = this.getPriceTax();
            Object other$priceTax = other.getPriceTax();
            if (this$priceTax == null) {
               if (other$priceTax != null) {
                  return false;
               }
            } else if (!this$priceTax.equals(other$priceTax)) {
               return false;
            }

            Object this$priceType = this.getPriceType();
            Object other$priceType = other.getPriceType();
            if (this$priceType == null) {
               if (other$priceType != null) {
                  return false;
               }
            } else if (!this$priceType.equals(other$priceType)) {
               return false;
            }

            Object this$transitWhCode = this.getTransitWhCode();
            Object other$transitWhCode = other.getTransitWhCode();
            if (this$transitWhCode == null) {
               if (other$transitWhCode != null) {
                  return false;
               }
            } else if (!this$transitWhCode.equals(other$transitWhCode)) {
               return false;
            }

            Object this$logistics = this.getLogistics();
            Object other$logistics = other.getLogistics();
            if (this$logistics == null) {
               if (other$logistics != null) {
                  return false;
               }
            } else if (!this$logistics.equals(other$logistics)) {
               return false;
            }

            Object this$customsCode = this.getCustomsCode();
            Object other$customsCode = other.getCustomsCode();
            if (this$customsCode == null) {
               if (other$customsCode != null) {
                  return false;
               }
            } else if (!this$customsCode.equals(other$customsCode)) {
               return false;
            }

            Object this$logisticsCompanyCode = this.getLogisticsCompanyCode();
            Object other$logisticsCompanyCode = other.getLogisticsCompanyCode();
            if (this$logisticsCompanyCode == null) {
               if (other$logisticsCompanyCode != null) {
                  return false;
               }
            } else if (!this$logisticsCompanyCode.equals(other$logisticsCompanyCode)) {
               return false;
            }

            Object this$logisticsPlanId = this.getLogisticsPlanId();
            Object other$logisticsPlanId = other.getLogisticsPlanId();
            if (this$logisticsPlanId == null) {
               if (other$logisticsPlanId != null) {
                  return false;
               }
            } else if (!this$logisticsPlanId.equals(other$logisticsPlanId)) {
               return false;
            }

            Object this$articleNo = this.getArticleNo();
            Object other$articleNo = other.getArticleNo();
            if (this$articleNo == null) {
               if (other$articleNo != null) {
                  return false;
               }
            } else if (!this$articleNo.equals(other$articleNo)) {
               return false;
            }

            Object this$clsType = this.getClsType();
            Object other$clsType = other.getClsType();
            if (this$clsType == null) {
               if (other$clsType != null) {
                  return false;
               }
            } else if (!this$clsType.equals(other$clsType)) {
               return false;
            }

            Object this$unionItemDetails = this.getUnionItemDetails();
            Object other$unionItemDetails = other.getUnionItemDetails();
            if (this$unionItemDetails == null) {
               if (other$unionItemDetails != null) {
                  return false;
               }
            } else if (!this$unionItemDetails.equals(other$unionItemDetails)) {
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

            Object this$erpCode = this.getErpCode();
            Object other$erpCode = other.getErpCode();
            if (this$erpCode == null) {
               if (other$erpCode != null) {
                  return false;
               }
            } else if (!this$erpCode.equals(other$erpCode)) {
               return false;
            }

            Object this$logisticsDeclarationMode = this.getLogisticsDeclarationMode();
            Object other$logisticsDeclarationMode = other.getLogisticsDeclarationMode();
            if (this$logisticsDeclarationMode == null) {
               if (other$logisticsDeclarationMode != null) {
                  return false;
               }
            } else if (!this$logisticsDeclarationMode.equals(other$logisticsDeclarationMode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BaseItemResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + (this.isBuyable() ? 79 : 97);
      result = result * 59 + (this.isAvailable() ? 79 : 97);
      long $createTime = this.getCreateTime();
      result = result * 59 + (int)($createTime >>> 32 ^ $createTime);
      long $updateTime = this.getUpdateTime();
      result = result * 59 + (int)($updateTime >>> 32 ^ $updateTime);
      long $stock = this.getStock();
      result = result * 59 + (int)($stock >>> 32 ^ $stock);
      result = result * 59 + (this.isFreeze() ? 79 : 97);
      long $price = Double.doubleToLongBits(this.getPrice());
      result = result * 59 + (int)($price >>> 32 ^ $price);
      long $originalPrice = Double.doubleToLongBits(this.getOriginalPrice());
      result = result * 59 + (int)($originalPrice >>> 32 ^ $originalPrice);
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $ename = this.getEname();
      result = result * 59 + ($ename == null ? 43 : $ename.hashCode());
      Object $skucode = this.getSkucode();
      result = result * 59 + ($skucode == null ? 43 : $skucode.hashCode());
      Object $spvId = this.getSpvId();
      result = result * 59 + ($spvId == null ? 43 : $spvId.hashCode());
      Object $spuId = this.getSpuId();
      result = result * 59 + ($spuId == null ? 43 : $spuId.hashCode());
      Object $splId = this.getSplId();
      result = result * 59 + ($splId == null ? 43 : $splId.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $barcode = this.getBarcode();
      result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
      Object $barcodeType = this.getBarcodeType();
      result = result * 59 + ($barcodeType == null ? 43 : $barcodeType.hashCode());
      Object $state = this.getState();
      result = result * 59 + ($state == null ? 43 : $state.hashCode());
      Object $priceTax = this.getPriceTax();
      result = result * 59 + ($priceTax == null ? 43 : $priceTax.hashCode());
      Object $priceType = this.getPriceType();
      result = result * 59 + ($priceType == null ? 43 : $priceType.hashCode());
      Object $transitWhCode = this.getTransitWhCode();
      result = result * 59 + ($transitWhCode == null ? 43 : $transitWhCode.hashCode());
      Object $logistics = this.getLogistics();
      result = result * 59 + ($logistics == null ? 43 : $logistics.hashCode());
      Object $customsCode = this.getCustomsCode();
      result = result * 59 + ($customsCode == null ? 43 : $customsCode.hashCode());
      Object $logisticsCompanyCode = this.getLogisticsCompanyCode();
      result = result * 59 + ($logisticsCompanyCode == null ? 43 : $logisticsCompanyCode.hashCode());
      Object $logisticsPlanId = this.getLogisticsPlanId();
      result = result * 59 + ($logisticsPlanId == null ? 43 : $logisticsPlanId.hashCode());
      Object $articleNo = this.getArticleNo();
      result = result * 59 + ($articleNo == null ? 43 : $articleNo.hashCode());
      Object $clsType = this.getClsType();
      result = result * 59 + ($clsType == null ? 43 : $clsType.hashCode());
      Object $unionItemDetails = this.getUnionItemDetails();
      result = result * 59 + ($unionItemDetails == null ? 43 : $unionItemDetails.hashCode());
      Object $whcode = this.getWhcode();
      result = result * 59 + ($whcode == null ? 43 : $whcode.hashCode());
      Object $erpCode = this.getErpCode();
      result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
      Object $logisticsDeclarationMode = this.getLogisticsDeclarationMode();
      result = result * 59 + ($logisticsDeclarationMode == null ? 43 : $logisticsDeclarationMode.hashCode());
      return result;
   }

   public String toString() {
      return "BaseItemResponse(id=" + this.getId() + ", name=" + this.getName() + ", ename=" + this.getEname() + ", skucode=" + this.getSkucode() + ", spvId=" + this.getSpvId() + ", spuId=" + this.getSpuId() + ", splId=" + this.getSplId() + ", status=" + this.getStatus() + ", barcode=" + this.getBarcode() + ", barcodeType=" + this.getBarcodeType() + ", buyable=" + this.isBuyable() + ", available=" + this.isAvailable() + ", state=" + this.getState() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", stock=" + this.getStock() + ", freeze=" + this.isFreeze() + ", priceTax=" + this.getPriceTax() + ", priceType=" + this.getPriceType() + ", transitWhCode=" + this.getTransitWhCode() + ", logistics=" + this.getLogistics() + ", customsCode=" + this.getCustomsCode() + ", logisticsCompanyCode=" + this.getLogisticsCompanyCode() + ", logisticsPlanId=" + this.getLogisticsPlanId() + ", price=" + this.getPrice() + ", originalPrice=" + this.getOriginalPrice() + ", articleNo=" + this.getArticleNo() + ", clsType=" + this.getClsType() + ", unionItemDetails=" + this.getUnionItemDetails() + ", whcode=" + this.getWhcode() + ", erpCode=" + this.getErpCode() + ", logisticsDeclarationMode=" + this.getLogisticsDeclarationMode() + ")";
   }

   public static class PriceTax {
      private double preTax;
      private double postTax;
      private double tax;
      private double tax_rate;

      public double getPreTax() {
         return this.preTax;
      }

      public double getPostTax() {
         return this.postTax;
      }

      public double getTax() {
         return this.tax;
      }

      public double getTax_rate() {
         return this.tax_rate;
      }

      public void setPreTax(double preTax) {
         this.preTax = preTax;
      }

      public void setPostTax(double postTax) {
         this.postTax = postTax;
      }

      public void setTax(double tax) {
         this.tax = tax;
      }

      public void setTax_rate(double tax_rate) {
         this.tax_rate = tax_rate;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof PriceTax)) {
            return false;
         } else {
            PriceTax other = (PriceTax)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (Double.compare(this.getPreTax(), other.getPreTax()) != 0) {
               return false;
            } else if (Double.compare(this.getPostTax(), other.getPostTax()) != 0) {
               return false;
            } else if (Double.compare(this.getTax(), other.getTax()) != 0) {
               return false;
            } else {
               return Double.compare(this.getTax_rate(), other.getTax_rate()) == 0;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof PriceTax;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $preTax = Double.doubleToLongBits(this.getPreTax());
         result = result * 59 + (int)($preTax >>> 32 ^ $preTax);
         long $postTax = Double.doubleToLongBits(this.getPostTax());
         result = result * 59 + (int)($postTax >>> 32 ^ $postTax);
         long $tax = Double.doubleToLongBits(this.getTax());
         result = result * 59 + (int)($tax >>> 32 ^ $tax);
         long $tax_rate = Double.doubleToLongBits(this.getTax_rate());
         result = result * 59 + (int)($tax_rate >>> 32 ^ $tax_rate);
         return result;
      }

      public String toString() {
         return "BaseItemResponse.PriceTax(preTax=" + this.getPreTax() + ", postTax=" + this.getPostTax() + ", tax=" + this.getTax() + ", tax_rate=" + this.getTax_rate() + ")";
      }
   }
}
