package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class TransItemRequest extends BaseRequest {
   public String origItemId;
   public String destItemId;
   public List<String> transSkuIds;
   public double originalPrice;

   public String getOrigItemId() {
      return this.origItemId;
   }

   public String getDestItemId() {
      return this.destItemId;
   }

   public List<String> getTransSkuIds() {
      return this.transSkuIds;
   }

   public double getOriginalPrice() {
      return this.originalPrice;
   }

   public void setOrigItemId(String origItemId) {
      this.origItemId = origItemId;
   }

   public void setDestItemId(String destItemId) {
      this.destItemId = destItemId;
   }

   public void setTransSkuIds(List<String> transSkuIds) {
      this.transSkuIds = transSkuIds;
   }

   public void setOriginalPrice(double originalPrice) {
      this.originalPrice = originalPrice;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof TransItemRequest)) {
         return false;
      } else {
         TransItemRequest other = (TransItemRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (Double.compare(this.getOriginalPrice(), other.getOriginalPrice()) != 0) {
            return false;
         } else {
            Object this$origItemId = this.getOrigItemId();
            Object other$origItemId = other.getOrigItemId();
            if (this$origItemId == null) {
               if (other$origItemId != null) {
                  return false;
               }
            } else if (!this$origItemId.equals(other$origItemId)) {
               return false;
            }

            Object this$destItemId = this.getDestItemId();
            Object other$destItemId = other.getDestItemId();
            if (this$destItemId == null) {
               if (other$destItemId != null) {
                  return false;
               }
            } else if (!this$destItemId.equals(other$destItemId)) {
               return false;
            }

            Object this$transSkuIds = this.getTransSkuIds();
            Object other$transSkuIds = other.getTransSkuIds();
            if (this$transSkuIds == null) {
               if (other$transSkuIds != null) {
                  return false;
               }
            } else if (!this$transSkuIds.equals(other$transSkuIds)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof TransItemRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $originalPrice = Double.doubleToLongBits(this.getOriginalPrice());
      result = result * 59 + (int)($originalPrice >>> 32 ^ $originalPrice);
      Object $origItemId = this.getOrigItemId();
      result = result * 59 + ($origItemId == null ? 43 : $origItemId.hashCode());
      Object $destItemId = this.getDestItemId();
      result = result * 59 + ($destItemId == null ? 43 : $destItemId.hashCode());
      Object $transSkuIds = this.getTransSkuIds();
      result = result * 59 + ($transSkuIds == null ? 43 : $transSkuIds.hashCode());
      return result;
   }

   public String toString() {
      return "TransItemRequest(origItemId=" + this.getOrigItemId() + ", destItemId=" + this.getDestItemId() + ", transSkuIds=" + this.getTransSkuIds() + ", originalPrice=" + this.getOriginalPrice() + ")";
   }
}
