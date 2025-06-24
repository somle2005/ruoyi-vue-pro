package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class DeleteSkuV3Request extends BaseRequest {
   public List<String> skuIds;

   public List<String> getSkuIds() {
      return this.skuIds;
   }

   public void setSkuIds(List<String> skuIds) {
      this.skuIds = skuIds;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeleteSkuV3Request)) {
         return false;
      } else {
         DeleteSkuV3Request other = (DeleteSkuV3Request)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$skuIds = this.getSkuIds();
            Object other$skuIds = other.getSkuIds();
            if (this$skuIds == null) {
               if (other$skuIds != null) {
                  return false;
               }
            } else if (!this$skuIds.equals(other$skuIds)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof DeleteSkuV3Request;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $skuIds = this.getSkuIds();
      result = result * 59 + ($skuIds == null ? 43 : $skuIds.hashCode());
      return result;
   }

   public String toString() {
      return "DeleteSkuV3Request(skuIds=" + this.getSkuIds() + ")";
   }
}
