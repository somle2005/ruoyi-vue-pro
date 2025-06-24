package com.xiaohongshu.fls.opensdk.entity.product.response;

import com.xiaohongshu.fls.opensdk.entity.PageChunkV3;
import com.xiaohongshu.fls.opensdk.entity.product.ItemInfo;
import com.xiaohongshu.fls.opensdk.entity.product.SpuInfo;
import java.util.ArrayList;
import java.util.List;

public class GetDetailItemResponse extends PageChunkV3 {
   List<CreatItemResult> data;

   public GetDetailItemResponse(List<CreatItemResult> data, int currentPage, int pageSize, int total) {
      this.setData(data);
      this.setCurrentPage(currentPage);
      this.setPageSize(pageSize);
      this.setTotal(total);
   }

   public GetDetailItemResponse() {
      this.data = new ArrayList();
   }

   public List<CreatItemResult> getData() {
      return this.data;
   }

   public void setData(List<CreatItemResult> data) {
      this.data = data;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetDetailItemResponse)) {
         return false;
      } else {
         GetDetailItemResponse other = (GetDetailItemResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$data = this.getData();
            Object other$data = other.getData();
            if (this$data == null) {
               if (other$data != null) {
                  return false;
               }
            } else if (!this$data.equals(other$data)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetDetailItemResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $data = this.getData();
      result = result * 59 + ($data == null ? 43 : $data.hashCode());
      return result;
   }

   public String toString() {
      return "GetDetailItemResponse(data=" + this.getData() + ")";
   }

   public class CreatItemResult {
      public SpuInfo spuData = new SpuInfo();
      public ItemInfo itemData = new ItemInfo();

      public SpuInfo getSpuData() {
         return this.spuData;
      }

      public ItemInfo getItemData() {
         return this.itemData;
      }

      public void setSpuData(SpuInfo spuData) {
         this.spuData = spuData;
      }

      public void setItemData(ItemInfo itemData) {
         this.itemData = itemData;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof CreatItemResult)) {
            return false;
         } else {
            CreatItemResult other = (CreatItemResult)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$spuData = this.getSpuData();
               Object other$spuData = other.getSpuData();
               if (this$spuData == null) {
                  if (other$spuData != null) {
                     return false;
                  }
               } else if (!this$spuData.equals(other$spuData)) {
                  return false;
               }

               Object this$itemData = this.getItemData();
               Object other$itemData = other.getItemData();
               if (this$itemData == null) {
                  if (other$itemData != null) {
                     return false;
                  }
               } else if (!this$itemData.equals(other$itemData)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof CreatItemResult;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $spuData = this.getSpuData();
         result = result * 59 + ($spuData == null ? 43 : $spuData.hashCode());
         Object $itemData = this.getItemData();
         result = result * 59 + ($itemData == null ? 43 : $itemData.hashCode());
         return result;
      }

      public String toString() {
         return "GetDetailItemResponse.CreatItemResult(spuData=" + this.getSpuData() + ", itemData=" + this.getItemData() + ")";
      }
   }
}
