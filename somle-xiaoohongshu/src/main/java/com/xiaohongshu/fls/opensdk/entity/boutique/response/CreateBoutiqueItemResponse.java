package com.xiaohongshu.fls.opensdk.entity.boutique.response;

import com.xiaohongshu.fls.opensdk.entity.boutique.BasicBoutiqueItemData;
import java.util.List;
import java.util.Map;

public class CreateBoutiqueItemResponse {
   public List<String> origItemIds;
   public Map<String, List<String>> boutiqueItemRelations;
   public List<BasicBoutiqueItemData> basicItemInfos;

   public List<String> getOrigItemIds() {
      return this.origItemIds;
   }

   public Map<String, List<String>> getBoutiqueItemRelations() {
      return this.boutiqueItemRelations;
   }

   public List<BasicBoutiqueItemData> getBasicItemInfos() {
      return this.basicItemInfos;
   }

   public void setOrigItemIds(List<String> origItemIds) {
      this.origItemIds = origItemIds;
   }

   public void setBoutiqueItemRelations(Map<String, List<String>> boutiqueItemRelations) {
      this.boutiqueItemRelations = boutiqueItemRelations;
   }

   public void setBasicItemInfos(List<BasicBoutiqueItemData> basicItemInfos) {
      this.basicItemInfos = basicItemInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CreateBoutiqueItemResponse)) {
         return false;
      } else {
         CreateBoutiqueItemResponse other = (CreateBoutiqueItemResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$origItemIds = this.getOrigItemIds();
            Object other$origItemIds = other.getOrigItemIds();
            if (this$origItemIds == null) {
               if (other$origItemIds != null) {
                  return false;
               }
            } else if (!this$origItemIds.equals(other$origItemIds)) {
               return false;
            }

            Object this$boutiqueItemRelations = this.getBoutiqueItemRelations();
            Object other$boutiqueItemRelations = other.getBoutiqueItemRelations();
            if (this$boutiqueItemRelations == null) {
               if (other$boutiqueItemRelations != null) {
                  return false;
               }
            } else if (!this$boutiqueItemRelations.equals(other$boutiqueItemRelations)) {
               return false;
            }

            Object this$basicItemInfos = this.getBasicItemInfos();
            Object other$basicItemInfos = other.getBasicItemInfos();
            if (this$basicItemInfos == null) {
               if (other$basicItemInfos != null) {
                  return false;
               }
            } else if (!this$basicItemInfos.equals(other$basicItemInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CreateBoutiqueItemResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $origItemIds = this.getOrigItemIds();
      result = result * 59 + ($origItemIds == null ? 43 : $origItemIds.hashCode());
      Object $boutiqueItemRelations = this.getBoutiqueItemRelations();
      result = result * 59 + ($boutiqueItemRelations == null ? 43 : $boutiqueItemRelations.hashCode());
      Object $basicItemInfos = this.getBasicItemInfos();
      result = result * 59 + ($basicItemInfos == null ? 43 : $basicItemInfos.hashCode());
      return result;
   }

   public String toString() {
      return "CreateBoutiqueItemResponse(origItemIds=" + this.getOrigItemIds() + ", boutiqueItemRelations=" + this.getBoutiqueItemRelations() + ", basicItemInfos=" + this.getBasicItemInfos() + ")";
   }
}
