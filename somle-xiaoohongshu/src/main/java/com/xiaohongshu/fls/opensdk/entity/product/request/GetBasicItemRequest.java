package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetBasicItemRequest extends BaseRequest {
   private String id;
   private Integer status;
   private Long createTimeFrom;
   private Long createTimeTo;
   private Long updateTimeFrom;
   private Long updateTimeTo;
   private Boolean buyable;
   private Integer stockGte;
   private Integer stockLte;
   private Integer pageNo;
   private Integer pageSize;
   private String barcode;
   private String skucode;
   private Boolean freeze;
   private Boolean singlePackOnly;
   private String lastId;
   private Boolean isChannel;

   public String getId() {
      return this.id;
   }

   public Integer getStatus() {
      return this.status;
   }

   public Long getCreateTimeFrom() {
      return this.createTimeFrom;
   }

   public Long getCreateTimeTo() {
      return this.createTimeTo;
   }

   public Long getUpdateTimeFrom() {
      return this.updateTimeFrom;
   }

   public Long getUpdateTimeTo() {
      return this.updateTimeTo;
   }

   public Boolean getBuyable() {
      return this.buyable;
   }

   public Integer getStockGte() {
      return this.stockGte;
   }

   public Integer getStockLte() {
      return this.stockLte;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getBarcode() {
      return this.barcode;
   }

   public String getSkucode() {
      return this.skucode;
   }

   public Boolean getFreeze() {
      return this.freeze;
   }

   public Boolean getSinglePackOnly() {
      return this.singlePackOnly;
   }

   public String getLastId() {
      return this.lastId;
   }

   public Boolean getIsChannel() {
      return this.isChannel;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public void setCreateTimeFrom(Long createTimeFrom) {
      this.createTimeFrom = createTimeFrom;
   }

   public void setCreateTimeTo(Long createTimeTo) {
      this.createTimeTo = createTimeTo;
   }

   public void setUpdateTimeFrom(Long updateTimeFrom) {
      this.updateTimeFrom = updateTimeFrom;
   }

   public void setUpdateTimeTo(Long updateTimeTo) {
      this.updateTimeTo = updateTimeTo;
   }

   public void setBuyable(Boolean buyable) {
      this.buyable = buyable;
   }

   public void setStockGte(Integer stockGte) {
      this.stockGte = stockGte;
   }

   public void setStockLte(Integer stockLte) {
      this.stockLte = stockLte;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public void setBarcode(String barcode) {
      this.barcode = barcode;
   }

   public void setSkucode(String skucode) {
      this.skucode = skucode;
   }

   public void setFreeze(Boolean freeze) {
      this.freeze = freeze;
   }

   public void setSinglePackOnly(Boolean singlePackOnly) {
      this.singlePackOnly = singlePackOnly;
   }

   public void setLastId(String lastId) {
      this.lastId = lastId;
   }

   public void setIsChannel(Boolean isChannel) {
      this.isChannel = isChannel;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetBasicItemRequest)) {
         return false;
      } else {
         GetBasicItemRequest other = (GetBasicItemRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$status = this.getStatus();
            Object other$status = other.getStatus();
            if (this$status == null) {
               if (other$status != null) {
                  return false;
               }
            } else if (!this$status.equals(other$status)) {
               return false;
            }

            Object this$createTimeFrom = this.getCreateTimeFrom();
            Object other$createTimeFrom = other.getCreateTimeFrom();
            if (this$createTimeFrom == null) {
               if (other$createTimeFrom != null) {
                  return false;
               }
            } else if (!this$createTimeFrom.equals(other$createTimeFrom)) {
               return false;
            }

            Object this$createTimeTo = this.getCreateTimeTo();
            Object other$createTimeTo = other.getCreateTimeTo();
            if (this$createTimeTo == null) {
               if (other$createTimeTo != null) {
                  return false;
               }
            } else if (!this$createTimeTo.equals(other$createTimeTo)) {
               return false;
            }

            Object this$updateTimeFrom = this.getUpdateTimeFrom();
            Object other$updateTimeFrom = other.getUpdateTimeFrom();
            if (this$updateTimeFrom == null) {
               if (other$updateTimeFrom != null) {
                  return false;
               }
            } else if (!this$updateTimeFrom.equals(other$updateTimeFrom)) {
               return false;
            }

            Object this$updateTimeTo = this.getUpdateTimeTo();
            Object other$updateTimeTo = other.getUpdateTimeTo();
            if (this$updateTimeTo == null) {
               if (other$updateTimeTo != null) {
                  return false;
               }
            } else if (!this$updateTimeTo.equals(other$updateTimeTo)) {
               return false;
            }

            Object this$buyable = this.getBuyable();
            Object other$buyable = other.getBuyable();
            if (this$buyable == null) {
               if (other$buyable != null) {
                  return false;
               }
            } else if (!this$buyable.equals(other$buyable)) {
               return false;
            }

            Object this$stockGte = this.getStockGte();
            Object other$stockGte = other.getStockGte();
            if (this$stockGte == null) {
               if (other$stockGte != null) {
                  return false;
               }
            } else if (!this$stockGte.equals(other$stockGte)) {
               return false;
            }

            Object this$stockLte = this.getStockLte();
            Object other$stockLte = other.getStockLte();
            if (this$stockLte == null) {
               if (other$stockLte != null) {
                  return false;
               }
            } else if (!this$stockLte.equals(other$stockLte)) {
               return false;
            }

            Object this$pageNo = this.getPageNo();
            Object other$pageNo = other.getPageNo();
            if (this$pageNo == null) {
               if (other$pageNo != null) {
                  return false;
               }
            } else if (!this$pageNo.equals(other$pageNo)) {
               return false;
            }

            Object this$pageSize = this.getPageSize();
            Object other$pageSize = other.getPageSize();
            if (this$pageSize == null) {
               if (other$pageSize != null) {
                  return false;
               }
            } else if (!this$pageSize.equals(other$pageSize)) {
               return false;
            }

            Object this$freeze = this.getFreeze();
            Object other$freeze = other.getFreeze();
            if (this$freeze == null) {
               if (other$freeze != null) {
                  return false;
               }
            } else if (!this$freeze.equals(other$freeze)) {
               return false;
            }

            Object this$singlePackOnly = this.getSinglePackOnly();
            Object other$singlePackOnly = other.getSinglePackOnly();
            if (this$singlePackOnly == null) {
               if (other$singlePackOnly != null) {
                  return false;
               }
            } else if (!this$singlePackOnly.equals(other$singlePackOnly)) {
               return false;
            }

            Object this$isChannel = this.getIsChannel();
            Object other$isChannel = other.getIsChannel();
            if (this$isChannel == null) {
               if (other$isChannel != null) {
                  return false;
               }
            } else if (!this$isChannel.equals(other$isChannel)) {
               return false;
            }

            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
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

            Object this$skucode = this.getSkucode();
            Object other$skucode = other.getSkucode();
            if (this$skucode == null) {
               if (other$skucode != null) {
                  return false;
               }
            } else if (!this$skucode.equals(other$skucode)) {
               return false;
            }

            Object this$lastId = this.getLastId();
            Object other$lastId = other.getLastId();
            if (this$lastId == null) {
               if (other$lastId != null) {
                  return false;
               }
            } else if (!this$lastId.equals(other$lastId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetBasicItemRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $createTimeFrom = this.getCreateTimeFrom();
      result = result * 59 + ($createTimeFrom == null ? 43 : $createTimeFrom.hashCode());
      Object $createTimeTo = this.getCreateTimeTo();
      result = result * 59 + ($createTimeTo == null ? 43 : $createTimeTo.hashCode());
      Object $updateTimeFrom = this.getUpdateTimeFrom();
      result = result * 59 + ($updateTimeFrom == null ? 43 : $updateTimeFrom.hashCode());
      Object $updateTimeTo = this.getUpdateTimeTo();
      result = result * 59 + ($updateTimeTo == null ? 43 : $updateTimeTo.hashCode());
      Object $buyable = this.getBuyable();
      result = result * 59 + ($buyable == null ? 43 : $buyable.hashCode());
      Object $stockGte = this.getStockGte();
      result = result * 59 + ($stockGte == null ? 43 : $stockGte.hashCode());
      Object $stockLte = this.getStockLte();
      result = result * 59 + ($stockLte == null ? 43 : $stockLte.hashCode());
      Object $pageNo = this.getPageNo();
      result = result * 59 + ($pageNo == null ? 43 : $pageNo.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      Object $freeze = this.getFreeze();
      result = result * 59 + ($freeze == null ? 43 : $freeze.hashCode());
      Object $singlePackOnly = this.getSinglePackOnly();
      result = result * 59 + ($singlePackOnly == null ? 43 : $singlePackOnly.hashCode());
      Object $isChannel = this.getIsChannel();
      result = result * 59 + ($isChannel == null ? 43 : $isChannel.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $barcode = this.getBarcode();
      result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
      Object $skucode = this.getSkucode();
      result = result * 59 + ($skucode == null ? 43 : $skucode.hashCode());
      Object $lastId = this.getLastId();
      result = result * 59 + ($lastId == null ? 43 : $lastId.hashCode());
      return result;
   }

   public String toString() {
      return "GetBasicItemRequest(id=" + this.getId() + ", status=" + this.getStatus() + ", createTimeFrom=" + this.getCreateTimeFrom() + ", createTimeTo=" + this.getCreateTimeTo() + ", updateTimeFrom=" + this.getUpdateTimeFrom() + ", updateTimeTo=" + this.getUpdateTimeTo() + ", buyable=" + this.getBuyable() + ", stockGte=" + this.getStockGte() + ", stockLte=" + this.getStockLte() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ", barcode=" + this.getBarcode() + ", skucode=" + this.getSkucode() + ", freeze=" + this.getFreeze() + ", singlePackOnly=" + this.getSinglePackOnly() + ", lastId=" + this.getLastId() + ", isChannel=" + this.getIsChannel() + ")";
   }
}
