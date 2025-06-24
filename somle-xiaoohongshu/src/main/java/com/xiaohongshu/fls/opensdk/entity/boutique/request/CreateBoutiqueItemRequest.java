package com.xiaohongshu.fls.opensdk.entity.boutique.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.boutique.BoutiqueMode;
import com.xiaohongshu.fls.opensdk.entity.boutique.OperationType;
import java.util.List;

public class CreateBoutiqueItemRequest extends BaseRequest {
   public String spuId;
   public List<BoutiqueMode> boutiqueModes;
   public boolean withItemDetail;
   public OperationType operationType;

   public String getSpuId() {
      return this.spuId;
   }

   public List<BoutiqueMode> getBoutiqueModes() {
      return this.boutiqueModes;
   }

   public boolean isWithItemDetail() {
      return this.withItemDetail;
   }

   public OperationType getOperationType() {
      return this.operationType;
   }

   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   public void setBoutiqueModes(List<BoutiqueMode> boutiqueModes) {
      this.boutiqueModes = boutiqueModes;
   }

   public void setWithItemDetail(boolean withItemDetail) {
      this.withItemDetail = withItemDetail;
   }

   public void setOperationType(OperationType operationType) {
      this.operationType = operationType;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CreateBoutiqueItemRequest)) {
         return false;
      } else {
         CreateBoutiqueItemRequest other = (CreateBoutiqueItemRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.isWithItemDetail() != other.isWithItemDetail()) {
            return false;
         } else {
            Object this$spuId = this.getSpuId();
            Object other$spuId = other.getSpuId();
            if (this$spuId == null) {
               if (other$spuId != null) {
                  return false;
               }
            } else if (!this$spuId.equals(other$spuId)) {
               return false;
            }

            Object this$boutiqueModes = this.getBoutiqueModes();
            Object other$boutiqueModes = other.getBoutiqueModes();
            if (this$boutiqueModes == null) {
               if (other$boutiqueModes != null) {
                  return false;
               }
            } else if (!this$boutiqueModes.equals(other$boutiqueModes)) {
               return false;
            }

            Object this$operationType = this.getOperationType();
            Object other$operationType = other.getOperationType();
            if (this$operationType == null) {
               if (other$operationType != null) {
                  return false;
               }
            } else if (!this$operationType.equals(other$operationType)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CreateBoutiqueItemRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + (this.isWithItemDetail() ? 79 : 97);
      Object $spuId = this.getSpuId();
      result = result * 59 + ($spuId == null ? 43 : $spuId.hashCode());
      Object $boutiqueModes = this.getBoutiqueModes();
      result = result * 59 + ($boutiqueModes == null ? 43 : $boutiqueModes.hashCode());
      Object $operationType = this.getOperationType();
      result = result * 59 + ($operationType == null ? 43 : $operationType.hashCode());
      return result;
   }

   public String toString() {
      return "CreateBoutiqueItemRequest(spuId=" + this.getSpuId() + ", boutiqueModes=" + this.getBoutiqueModes() + ", withItemDetail=" + this.isWithItemDetail() + ", operationType=" + this.getOperationType() + ")";
   }
}
