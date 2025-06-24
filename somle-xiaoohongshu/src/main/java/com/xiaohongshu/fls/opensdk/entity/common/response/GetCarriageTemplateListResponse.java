package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.ArrayList;
import java.util.List;

public class GetCarriageTemplateListResponse {
   public List<CarriageTemplate> carriageTemplateList = new ArrayList();
   public Long totalCount;

   public List<CarriageTemplate> getCarriageTemplateList() {
      return this.carriageTemplateList;
   }

   public Long getTotalCount() {
      return this.totalCount;
   }

   public void setCarriageTemplateList(List<CarriageTemplate> carriageTemplateList) {
      this.carriageTemplateList = carriageTemplateList;
   }

   public void setTotalCount(Long totalCount) {
      this.totalCount = totalCount;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetCarriageTemplateListResponse)) {
         return false;
      } else {
         GetCarriageTemplateListResponse other = (GetCarriageTemplateListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$totalCount = this.getTotalCount();
            Object other$totalCount = other.getTotalCount();
            if (this$totalCount == null) {
               if (other$totalCount != null) {
                  return false;
               }
            } else if (!this$totalCount.equals(other$totalCount)) {
               return false;
            }

            Object this$carriageTemplateList = this.getCarriageTemplateList();
            Object other$carriageTemplateList = other.getCarriageTemplateList();
            if (this$carriageTemplateList == null) {
               if (other$carriageTemplateList != null) {
                  return false;
               }
            } else if (!this$carriageTemplateList.equals(other$carriageTemplateList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetCarriageTemplateListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $totalCount = this.getTotalCount();
      result = result * 59 + ($totalCount == null ? 43 : $totalCount.hashCode());
      Object $carriageTemplateList = this.getCarriageTemplateList();
      result = result * 59 + ($carriageTemplateList == null ? 43 : $carriageTemplateList.hashCode());
      return result;
   }

   public String toString() {
      return "GetCarriageTemplateListResponse(carriageTemplateList=" + this.getCarriageTemplateList() + ", totalCount=" + this.getTotalCount() + ")";
   }
}
