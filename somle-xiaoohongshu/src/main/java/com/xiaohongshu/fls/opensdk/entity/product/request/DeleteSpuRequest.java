package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class DeleteSpuRequest extends BaseRequest {
   private String id;

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeleteSpuRequest)) {
         return false;
      } else {
         DeleteSpuRequest other = (DeleteSpuRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
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
      return other instanceof DeleteSpuRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      return result;
   }

   public String toString() {
      return "DeleteSpuRequest(id=" + this.getId() + ")";
   }
}
