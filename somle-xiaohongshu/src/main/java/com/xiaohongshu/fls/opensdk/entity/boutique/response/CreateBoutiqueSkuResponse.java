package com.xiaohongshu.fls.opensdk.entity.boutique.response;

import java.util.List;
import java.util.Map;

public class CreateBoutiqueSkuResponse {
   public List<String> origSkuIds;
   public Map<String, List<String>> boutiqueSkuRelations;
   public List<BasicBoutiqueSkuData> basicSkuInfos;

   public List<String> getOrigSkuIds() {
      return this.origSkuIds;
   }

   public Map<String, List<String>> getBoutiqueSkuRelations() {
      return this.boutiqueSkuRelations;
   }

   public List<BasicBoutiqueSkuData> getBasicSkuInfos() {
      return this.basicSkuInfos;
   }

   public void setOrigSkuIds(List<String> origSkuIds) {
      this.origSkuIds = origSkuIds;
   }

   public void setBoutiqueSkuRelations(Map<String, List<String>> boutiqueSkuRelations) {
      this.boutiqueSkuRelations = boutiqueSkuRelations;
   }

   public void setBasicSkuInfos(List<BasicBoutiqueSkuData> basicSkuInfos) {
      this.basicSkuInfos = basicSkuInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CreateBoutiqueSkuResponse)) {
         return false;
      } else {
         CreateBoutiqueSkuResponse other = (CreateBoutiqueSkuResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$origSkuIds = this.getOrigSkuIds();
            Object other$origSkuIds = other.getOrigSkuIds();
            if (this$origSkuIds == null) {
               if (other$origSkuIds != null) {
                  return false;
               }
            } else if (!this$origSkuIds.equals(other$origSkuIds)) {
               return false;
            }

            Object this$boutiqueSkuRelations = this.getBoutiqueSkuRelations();
            Object other$boutiqueSkuRelations = other.getBoutiqueSkuRelations();
            if (this$boutiqueSkuRelations == null) {
               if (other$boutiqueSkuRelations != null) {
                  return false;
               }
            } else if (!this$boutiqueSkuRelations.equals(other$boutiqueSkuRelations)) {
               return false;
            }

            Object this$basicSkuInfos = this.getBasicSkuInfos();
            Object other$basicSkuInfos = other.getBasicSkuInfos();
            if (this$basicSkuInfos == null) {
               if (other$basicSkuInfos != null) {
                  return false;
               }
            } else if (!this$basicSkuInfos.equals(other$basicSkuInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CreateBoutiqueSkuResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $origSkuIds = this.getOrigSkuIds();
      result = result * 59 + ($origSkuIds == null ? 43 : $origSkuIds.hashCode());
      Object $boutiqueSkuRelations = this.getBoutiqueSkuRelations();
      result = result * 59 + ($boutiqueSkuRelations == null ? 43 : $boutiqueSkuRelations.hashCode());
      Object $basicSkuInfos = this.getBasicSkuInfos();
      result = result * 59 + ($basicSkuInfos == null ? 43 : $basicSkuInfos.hashCode());
      return result;
   }

   public String toString() {
      return "CreateBoutiqueSkuResponse(origSkuIds=" + this.getOrigSkuIds() + ", boutiqueSkuRelations=" + this.getBoutiqueSkuRelations() + ", basicSkuInfos=" + this.getBasicSkuInfos() + ")";
   }
}
