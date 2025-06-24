package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import java.util.List;

public class UpdateItemAndSkuRequest extends CreateItemAndSkuRequest {
   private List<Sku> updateSkuList;
   private List<String> deleteSkuIdList;
   private String itemId;

   public List<Sku> getUpdateSkuList() {
      return this.updateSkuList;
   }

   public List<String> getDeleteSkuIdList() {
      return this.deleteSkuIdList;
   }

   public String getItemId() {
      return this.itemId;
   }

   public void setUpdateSkuList(List<Sku> updateSkuList) {
      this.updateSkuList = updateSkuList;
   }

   public void setDeleteSkuIdList(List<String> deleteSkuIdList) {
      this.deleteSkuIdList = deleteSkuIdList;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateItemAndSkuRequest)) {
         return false;
      } else {
         UpdateItemAndSkuRequest other = (UpdateItemAndSkuRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$updateSkuList = this.getUpdateSkuList();
            Object other$updateSkuList = other.getUpdateSkuList();
            if (this$updateSkuList == null) {
               if (other$updateSkuList != null) {
                  return false;
               }
            } else if (!this$updateSkuList.equals(other$updateSkuList)) {
               return false;
            }

            Object this$deleteSkuIdList = this.getDeleteSkuIdList();
            Object other$deleteSkuIdList = other.getDeleteSkuIdList();
            if (this$deleteSkuIdList == null) {
               if (other$deleteSkuIdList != null) {
                  return false;
               }
            } else if (!this$deleteSkuIdList.equals(other$deleteSkuIdList)) {
               return false;
            }

            Object this$itemId = this.getItemId();
            Object other$itemId = other.getItemId();
            if (this$itemId == null) {
               if (other$itemId != null) {
                  return false;
               }
            } else if (!this$itemId.equals(other$itemId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateItemAndSkuRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $updateSkuList = this.getUpdateSkuList();
      result = result * 59 + ($updateSkuList == null ? 43 : $updateSkuList.hashCode());
      Object $deleteSkuIdList = this.getDeleteSkuIdList();
      result = result * 59 + ($deleteSkuIdList == null ? 43 : $deleteSkuIdList.hashCode());
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateItemAndSkuRequest(updateSkuList=" + this.getUpdateSkuList() + ", deleteSkuIdList=" + this.getDeleteSkuIdList() + ", itemId=" + this.getItemId() + ")";
   }
}
