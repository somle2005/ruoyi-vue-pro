package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class FlsGetDetailSkuRequest extends BaseRequest {
   private String id;
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
   private String scSkucode;
   private Boolean singlePackOnly;
   private Boolean showDeleted;
   private String lastId;
   private Boolean isChannel;
   public List<String> categoryIds;
   public List<String> lvl1CategoryIds;
   public List<String> lvl2CategoryIds;
   public List<String> lvl3CategoryIds;
   public List<String> lvl4CategoryIds;
   public List<String> lvl5CategoryIds;
   public String keyword;
   public String keywords;
   public String wholeKeyword;

   public String getId() {
      return this.id;
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

   public String getScSkucode() {
      return this.scSkucode;
   }

   public Boolean getSinglePackOnly() {
      return this.singlePackOnly;
   }

   public Boolean getShowDeleted() {
      return this.showDeleted;
   }

   public String getLastId() {
      return this.lastId;
   }

   public Boolean getIsChannel() {
      return this.isChannel;
   }

   public List<String> getCategoryIds() {
      return this.categoryIds;
   }

   public List<String> getLvl1CategoryIds() {
      return this.lvl1CategoryIds;
   }

   public List<String> getLvl2CategoryIds() {
      return this.lvl2CategoryIds;
   }

   public List<String> getLvl3CategoryIds() {
      return this.lvl3CategoryIds;
   }

   public List<String> getLvl4CategoryIds() {
      return this.lvl4CategoryIds;
   }

   public List<String> getLvl5CategoryIds() {
      return this.lvl5CategoryIds;
   }

   public String getKeyword() {
      return this.keyword;
   }

   public String getKeywords() {
      return this.keywords;
   }

   public String getWholeKeyword() {
      return this.wholeKeyword;
   }

   public void setId(String id) {
      this.id = id;
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

   public void setScSkucode(String scSkucode) {
      this.scSkucode = scSkucode;
   }

   public void setSinglePackOnly(Boolean singlePackOnly) {
      this.singlePackOnly = singlePackOnly;
   }

   public void setShowDeleted(Boolean showDeleted) {
      this.showDeleted = showDeleted;
   }

   public void setLastId(String lastId) {
      this.lastId = lastId;
   }

   public void setIsChannel(Boolean isChannel) {
      this.isChannel = isChannel;
   }

   public void setCategoryIds(List<String> categoryIds) {
      this.categoryIds = categoryIds;
   }

   public void setLvl1CategoryIds(List<String> lvl1CategoryIds) {
      this.lvl1CategoryIds = lvl1CategoryIds;
   }

   public void setLvl2CategoryIds(List<String> lvl2CategoryIds) {
      this.lvl2CategoryIds = lvl2CategoryIds;
   }

   public void setLvl3CategoryIds(List<String> lvl3CategoryIds) {
      this.lvl3CategoryIds = lvl3CategoryIds;
   }

   public void setLvl4CategoryIds(List<String> lvl4CategoryIds) {
      this.lvl4CategoryIds = lvl4CategoryIds;
   }

   public void setLvl5CategoryIds(List<String> lvl5CategoryIds) {
      this.lvl5CategoryIds = lvl5CategoryIds;
   }

   public void setKeyword(String keyword) {
      this.keyword = keyword;
   }

   public void setKeywords(String keywords) {
      this.keywords = keywords;
   }

   public void setWholeKeyword(String wholeKeyword) {
      this.wholeKeyword = wholeKeyword;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof FlsGetDetailSkuRequest)) {
         return false;
      } else {
         FlsGetDetailSkuRequest other = (FlsGetDetailSkuRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
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

            Object this$singlePackOnly = this.getSinglePackOnly();
            Object other$singlePackOnly = other.getSinglePackOnly();
            if (this$singlePackOnly == null) {
               if (other$singlePackOnly != null) {
                  return false;
               }
            } else if (!this$singlePackOnly.equals(other$singlePackOnly)) {
               return false;
            }

            Object this$showDeleted = this.getShowDeleted();
            Object other$showDeleted = other.getShowDeleted();
            if (this$showDeleted == null) {
               if (other$showDeleted != null) {
                  return false;
               }
            } else if (!this$showDeleted.equals(other$showDeleted)) {
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

            Object this$scSkucode = this.getScSkucode();
            Object other$scSkucode = other.getScSkucode();
            if (this$scSkucode == null) {
               if (other$scSkucode != null) {
                  return false;
               }
            } else if (!this$scSkucode.equals(other$scSkucode)) {
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

            Object this$categoryIds = this.getCategoryIds();
            Object other$categoryIds = other.getCategoryIds();
            if (this$categoryIds == null) {
               if (other$categoryIds != null) {
                  return false;
               }
            } else if (!this$categoryIds.equals(other$categoryIds)) {
               return false;
            }

            Object this$lvl1CategoryIds = this.getLvl1CategoryIds();
            Object other$lvl1CategoryIds = other.getLvl1CategoryIds();
            if (this$lvl1CategoryIds == null) {
               if (other$lvl1CategoryIds != null) {
                  return false;
               }
            } else if (!this$lvl1CategoryIds.equals(other$lvl1CategoryIds)) {
               return false;
            }

            Object this$lvl2CategoryIds = this.getLvl2CategoryIds();
            Object other$lvl2CategoryIds = other.getLvl2CategoryIds();
            if (this$lvl2CategoryIds == null) {
               if (other$lvl2CategoryIds != null) {
                  return false;
               }
            } else if (!this$lvl2CategoryIds.equals(other$lvl2CategoryIds)) {
               return false;
            }

            Object this$lvl3CategoryIds = this.getLvl3CategoryIds();
            Object other$lvl3CategoryIds = other.getLvl3CategoryIds();
            if (this$lvl3CategoryIds == null) {
               if (other$lvl3CategoryIds != null) {
                  return false;
               }
            } else if (!this$lvl3CategoryIds.equals(other$lvl3CategoryIds)) {
               return false;
            }

            Object this$lvl4CategoryIds = this.getLvl4CategoryIds();
            Object other$lvl4CategoryIds = other.getLvl4CategoryIds();
            if (this$lvl4CategoryIds == null) {
               if (other$lvl4CategoryIds != null) {
                  return false;
               }
            } else if (!this$lvl4CategoryIds.equals(other$lvl4CategoryIds)) {
               return false;
            }

            Object this$lvl5CategoryIds = this.getLvl5CategoryIds();
            Object other$lvl5CategoryIds = other.getLvl5CategoryIds();
            if (this$lvl5CategoryIds == null) {
               if (other$lvl5CategoryIds != null) {
                  return false;
               }
            } else if (!this$lvl5CategoryIds.equals(other$lvl5CategoryIds)) {
               return false;
            }

            Object this$keyword = this.getKeyword();
            Object other$keyword = other.getKeyword();
            if (this$keyword == null) {
               if (other$keyword != null) {
                  return false;
               }
            } else if (!this$keyword.equals(other$keyword)) {
               return false;
            }

            Object this$keywords = this.getKeywords();
            Object other$keywords = other.getKeywords();
            if (this$keywords == null) {
               if (other$keywords != null) {
                  return false;
               }
            } else if (!this$keywords.equals(other$keywords)) {
               return false;
            }

            Object this$wholeKeyword = this.getWholeKeyword();
            Object other$wholeKeyword = other.getWholeKeyword();
            if (this$wholeKeyword == null) {
               if (other$wholeKeyword != null) {
                  return false;
               }
            } else if (!this$wholeKeyword.equals(other$wholeKeyword)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof FlsGetDetailSkuRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
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
      Object $singlePackOnly = this.getSinglePackOnly();
      result = result * 59 + ($singlePackOnly == null ? 43 : $singlePackOnly.hashCode());
      Object $showDeleted = this.getShowDeleted();
      result = result * 59 + ($showDeleted == null ? 43 : $showDeleted.hashCode());
      Object $isChannel = this.getIsChannel();
      result = result * 59 + ($isChannel == null ? 43 : $isChannel.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $barcode = this.getBarcode();
      result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
      Object $scSkucode = this.getScSkucode();
      result = result * 59 + ($scSkucode == null ? 43 : $scSkucode.hashCode());
      Object $lastId = this.getLastId();
      result = result * 59 + ($lastId == null ? 43 : $lastId.hashCode());
      Object $categoryIds = this.getCategoryIds();
      result = result * 59 + ($categoryIds == null ? 43 : $categoryIds.hashCode());
      Object $lvl1CategoryIds = this.getLvl1CategoryIds();
      result = result * 59 + ($lvl1CategoryIds == null ? 43 : $lvl1CategoryIds.hashCode());
      Object $lvl2CategoryIds = this.getLvl2CategoryIds();
      result = result * 59 + ($lvl2CategoryIds == null ? 43 : $lvl2CategoryIds.hashCode());
      Object $lvl3CategoryIds = this.getLvl3CategoryIds();
      result = result * 59 + ($lvl3CategoryIds == null ? 43 : $lvl3CategoryIds.hashCode());
      Object $lvl4CategoryIds = this.getLvl4CategoryIds();
      result = result * 59 + ($lvl4CategoryIds == null ? 43 : $lvl4CategoryIds.hashCode());
      Object $lvl5CategoryIds = this.getLvl5CategoryIds();
      result = result * 59 + ($lvl5CategoryIds == null ? 43 : $lvl5CategoryIds.hashCode());
      Object $keyword = this.getKeyword();
      result = result * 59 + ($keyword == null ? 43 : $keyword.hashCode());
      Object $keywords = this.getKeywords();
      result = result * 59 + ($keywords == null ? 43 : $keywords.hashCode());
      Object $wholeKeyword = this.getWholeKeyword();
      result = result * 59 + ($wholeKeyword == null ? 43 : $wholeKeyword.hashCode());
      return result;
   }

   public String toString() {
      return "FlsGetDetailSkuRequest(id=" + this.getId() + ", createTimeFrom=" + this.getCreateTimeFrom() + ", createTimeTo=" + this.getCreateTimeTo() + ", updateTimeFrom=" + this.getUpdateTimeFrom() + ", updateTimeTo=" + this.getUpdateTimeTo() + ", buyable=" + this.getBuyable() + ", stockGte=" + this.getStockGte() + ", stockLte=" + this.getStockLte() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ", barcode=" + this.getBarcode() + ", scSkucode=" + this.getScSkucode() + ", singlePackOnly=" + this.getSinglePackOnly() + ", showDeleted=" + this.getShowDeleted() + ", lastId=" + this.getLastId() + ", isChannel=" + this.getIsChannel() + ", categoryIds=" + this.getCategoryIds() + ", lvl1CategoryIds=" + this.getLvl1CategoryIds() + ", lvl2CategoryIds=" + this.getLvl2CategoryIds() + ", lvl3CategoryIds=" + this.getLvl3CategoryIds() + ", lvl4CategoryIds=" + this.getLvl4CategoryIds() + ", lvl5CategoryIds=" + this.getLvl5CategoryIds() + ", keyword=" + this.getKeyword() + ", keywords=" + this.getKeywords() + ", wholeKeyword=" + this.getWholeKeyword() + ")";
   }
}
