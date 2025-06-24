package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class DeleteItemRequest extends BaseRequest {
   private String spuId;
   private String id;

   public String getSpuId() {
      return this.spuId;
   }

   public String getId() {
      return this.id;
   }

   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   public void setId(String id) {
      this.id = id;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeleteItemRequest)) {
         return false;
      } else {
         DeleteItemRequest other = (DeleteItemRequest)o;
         if (!other.canEqual(this)) {
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

            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof DeleteItemRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $spuId = this.getSpuId();
      result = result * 59 + ($spuId == null ? 43 : $spuId.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      return result;
   }

   public String toString() {
      return "DeleteItemRequest(spuId=" + this.getSpuId() + ", id=" + this.getId() + ")";
   }
}
