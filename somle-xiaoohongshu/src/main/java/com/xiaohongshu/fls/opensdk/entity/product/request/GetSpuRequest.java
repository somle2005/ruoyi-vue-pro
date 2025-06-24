package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class GetSpuRequest extends BaseRequest {
   public int pageNo;
   public int pageSize;
   public SpuSearchParam searchParam;

   public int getPageNo() {
      return this.pageNo;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public SpuSearchParam getSearchParam() {
      return this.searchParam;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setSearchParam(SpuSearchParam searchParam) {
      this.searchParam = searchParam;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetSpuRequest)) {
         return false;
      } else {
         GetSpuRequest other = (GetSpuRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getPageNo() != other.getPageNo()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else {
            Object this$searchParam = this.getSearchParam();
            Object other$searchParam = other.getSearchParam();
            if (this$searchParam == null) {
               if (other$searchParam != null) {
                  return false;
               }
            } else if (!this$searchParam.equals(other$searchParam)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetSpuRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getPageNo();
      result = result * 59 + this.getPageSize();
      Object $searchParam = this.getSearchParam();
      result = result * 59 + ($searchParam == null ? 43 : $searchParam.hashCode());
      return result;
   }

   public String toString() {
      return "GetSpuRequest(pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ", searchParam=" + this.getSearchParam() + ")";
   }

   public static class SpuSearchParam {
      public String keyword;
      public List<String> topCategoryIds;
      public List<String> lvl2CategoryIds;
      public List<String> lvl3CategoryIds;
      public List<String> lvl4CategoryIds;
      public Boolean buyable;
      public List<String> keywords;
      public List<String> logisticsPlanIds;
      public long createTimeFrom;
      public long createTimeTo;
      public String lastId;

      public String getKeyword() {
         return this.keyword;
      }

      public List<String> getTopCategoryIds() {
         return this.topCategoryIds;
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

      public Boolean getBuyable() {
         return this.buyable;
      }

      public List<String> getKeywords() {
         return this.keywords;
      }

      public List<String> getLogisticsPlanIds() {
         return this.logisticsPlanIds;
      }

      public long getCreateTimeFrom() {
         return this.createTimeFrom;
      }

      public long getCreateTimeTo() {
         return this.createTimeTo;
      }

      public String getLastId() {
         return this.lastId;
      }

      public void setKeyword(String keyword) {
         this.keyword = keyword;
      }

      public void setTopCategoryIds(List<String> topCategoryIds) {
         this.topCategoryIds = topCategoryIds;
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

      public void setBuyable(Boolean buyable) {
         this.buyable = buyable;
      }

      public void setKeywords(List<String> keywords) {
         this.keywords = keywords;
      }

      public void setLogisticsPlanIds(List<String> logisticsPlanIds) {
         this.logisticsPlanIds = logisticsPlanIds;
      }

      public void setCreateTimeFrom(long createTimeFrom) {
         this.createTimeFrom = createTimeFrom;
      }

      public void setCreateTimeTo(long createTimeTo) {
         this.createTimeTo = createTimeTo;
      }

      public void setLastId(String lastId) {
         this.lastId = lastId;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SpuSearchParam)) {
            return false;
         } else {
            SpuSearchParam other = (SpuSearchParam)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getCreateTimeFrom() != other.getCreateTimeFrom()) {
               return false;
            } else if (this.getCreateTimeTo() != other.getCreateTimeTo()) {
               return false;
            } else {
               Object this$buyable = this.getBuyable();
               Object other$buyable = other.getBuyable();
               if (this$buyable == null) {
                  if (other$buyable != null) {
                     return false;
                  }
               } else if (!this$buyable.equals(other$buyable)) {
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

               Object this$topCategoryIds = this.getTopCategoryIds();
               Object other$topCategoryIds = other.getTopCategoryIds();
               if (this$topCategoryIds == null) {
                  if (other$topCategoryIds != null) {
                     return false;
                  }
               } else if (!this$topCategoryIds.equals(other$topCategoryIds)) {
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

               Object this$keywords = this.getKeywords();
               Object other$keywords = other.getKeywords();
               if (this$keywords == null) {
                  if (other$keywords != null) {
                     return false;
                  }
               } else if (!this$keywords.equals(other$keywords)) {
                  return false;
               }

               Object this$logisticsPlanIds = this.getLogisticsPlanIds();
               Object other$logisticsPlanIds = other.getLogisticsPlanIds();
               if (this$logisticsPlanIds == null) {
                  if (other$logisticsPlanIds != null) {
                     return false;
                  }
               } else if (!this$logisticsPlanIds.equals(other$logisticsPlanIds)) {
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
         return other instanceof SpuSearchParam;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $createTimeFrom = this.getCreateTimeFrom();
         result = result * 59 + (int)($createTimeFrom >>> 32 ^ $createTimeFrom);
         long $createTimeTo = this.getCreateTimeTo();
         result = result * 59 + (int)($createTimeTo >>> 32 ^ $createTimeTo);
         Object $buyable = this.getBuyable();
         result = result * 59 + ($buyable == null ? 43 : $buyable.hashCode());
         Object $keyword = this.getKeyword();
         result = result * 59 + ($keyword == null ? 43 : $keyword.hashCode());
         Object $topCategoryIds = this.getTopCategoryIds();
         result = result * 59 + ($topCategoryIds == null ? 43 : $topCategoryIds.hashCode());
         Object $lvl2CategoryIds = this.getLvl2CategoryIds();
         result = result * 59 + ($lvl2CategoryIds == null ? 43 : $lvl2CategoryIds.hashCode());
         Object $lvl3CategoryIds = this.getLvl3CategoryIds();
         result = result * 59 + ($lvl3CategoryIds == null ? 43 : $lvl3CategoryIds.hashCode());
         Object $lvl4CategoryIds = this.getLvl4CategoryIds();
         result = result * 59 + ($lvl4CategoryIds == null ? 43 : $lvl4CategoryIds.hashCode());
         Object $keywords = this.getKeywords();
         result = result * 59 + ($keywords == null ? 43 : $keywords.hashCode());
         Object $logisticsPlanIds = this.getLogisticsPlanIds();
         result = result * 59 + ($logisticsPlanIds == null ? 43 : $logisticsPlanIds.hashCode());
         Object $lastId = this.getLastId();
         result = result * 59 + ($lastId == null ? 43 : $lastId.hashCode());
         return result;
      }

      public String toString() {
         return "GetSpuRequest.SpuSearchParam(keyword=" + this.getKeyword() + ", topCategoryIds=" + this.getTopCategoryIds() + ", lvl2CategoryIds=" + this.getLvl2CategoryIds() + ", lvl3CategoryIds=" + this.getLvl3CategoryIds() + ", lvl4CategoryIds=" + this.getLvl4CategoryIds() + ", buyable=" + this.getBuyable() + ", keywords=" + this.getKeywords() + ", logisticsPlanIds=" + this.getLogisticsPlanIds() + ", createTimeFrom=" + this.getCreateTimeFrom() + ", createTimeTo=" + this.getCreateTimeTo() + ", lastId=" + this.getLastId() + ")";
      }
   }
}
