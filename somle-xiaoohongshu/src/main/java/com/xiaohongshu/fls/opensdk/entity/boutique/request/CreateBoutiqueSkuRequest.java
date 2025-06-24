package com.xiaohongshu.fls.opensdk.entity.boutique.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.boutique.BoutiqueMode;
import com.xiaohongshu.fls.opensdk.entity.boutique.OperationType;
import java.util.List;

public class CreateBoutiqueSkuRequest extends BaseRequest {
   public String itemId;
   public List<BoutiqueMode> boutiqueModes;
   public boolean withSkuDetail;
   public OperationType operationType;

   public String getItemId() {
      return this.itemId;
   }

   public List<BoutiqueMode> getBoutiqueModes() {
      return this.boutiqueModes;
   }

   public boolean isWithSkuDetail() {
      return this.withSkuDetail;
   }

   public OperationType getOperationType() {
      return this.operationType;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public void setBoutiqueModes(List<BoutiqueMode> boutiqueModes) {
      this.boutiqueModes = boutiqueModes;
   }

   public void setWithSkuDetail(boolean withSkuDetail) {
      this.withSkuDetail = withSkuDetail;
   }

   public void setOperationType(OperationType operationType) {
      this.operationType = operationType;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CreateBoutiqueSkuRequest)) {
         return false;
      } else {
         CreateBoutiqueSkuRequest other = (CreateBoutiqueSkuRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.isWithSkuDetail() != other.isWithSkuDetail()) {
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
      return other instanceof CreateBoutiqueSkuRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + (this.isWithSkuDetail() ? 79 : 97);
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      Object $boutiqueModes = this.getBoutiqueModes();
      result = result * 59 + ($boutiqueModes == null ? 43 : $boutiqueModes.hashCode());
      Object $operationType = this.getOperationType();
      result = result * 59 + ($operationType == null ? 43 : $operationType.hashCode());
      return result;
   }

   public String toString() {
      return "CreateBoutiqueSkuRequest(itemId=" + this.getItemId() + ", boutiqueModes=" + this.getBoutiqueModes() + ", withSkuDetail=" + this.isWithSkuDetail() + ", operationType=" + this.getOperationType() + ")";
   }
}
