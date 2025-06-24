package com.xiaohongshu.fls.opensdk.entity.inventory.response;

import java.util.List;

public class GetSkuStockV2Response {
   private Response response;
   private String apiVersion;
   private SkuStockInfo skuStockInfo;
   private List<SkuStockInfoWithWhcode> skuStockInfoWithWhcode;

   public Response getResponse() {
      return this.response;
   }

   public String getApiVersion() {
      return this.apiVersion;
   }

   public SkuStockInfo getSkuStockInfo() {
      return this.skuStockInfo;
   }

   public List<SkuStockInfoWithWhcode> getSkuStockInfoWithWhcode() {
      return this.skuStockInfoWithWhcode;
   }

   public void setResponse(Response response) {
      this.response = response;
   }

   public void setApiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
   }

   public void setSkuStockInfo(SkuStockInfo skuStockInfo) {
      this.skuStockInfo = skuStockInfo;
   }

   public void setSkuStockInfoWithWhcode(List<SkuStockInfoWithWhcode> skuStockInfoWithWhcode) {
      this.skuStockInfoWithWhcode = skuStockInfoWithWhcode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetSkuStockV2Response)) {
         return false;
      } else {
         GetSkuStockV2Response other = (GetSkuStockV2Response)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$response = this.getResponse();
            Object other$response = other.getResponse();
            if (this$response == null) {
               if (other$response != null) {
                  return false;
               }
            } else if (!this$response.equals(other$response)) {
               return false;
            }

            Object this$apiVersion = this.getApiVersion();
            Object other$apiVersion = other.getApiVersion();
            if (this$apiVersion == null) {
               if (other$apiVersion != null) {
                  return false;
               }
            } else if (!this$apiVersion.equals(other$apiVersion)) {
               return false;
            }

            Object this$skuStockInfo = this.getSkuStockInfo();
            Object other$skuStockInfo = other.getSkuStockInfo();
            if (this$skuStockInfo == null) {
               if (other$skuStockInfo != null) {
                  return false;
               }
            } else if (!this$skuStockInfo.equals(other$skuStockInfo)) {
               return false;
            }

            Object this$skuStockInfoWithWhcode = this.getSkuStockInfoWithWhcode();
            Object other$skuStockInfoWithWhcode = other.getSkuStockInfoWithWhcode();
            if (this$skuStockInfoWithWhcode == null) {
               if (other$skuStockInfoWithWhcode != null) {
                  return false;
               }
            } else if (!this$skuStockInfoWithWhcode.equals(other$skuStockInfoWithWhcode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetSkuStockV2Response;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $response = this.getResponse();
      result = result * 59 + ($response == null ? 43 : $response.hashCode());
      Object $apiVersion = this.getApiVersion();
      result = result * 59 + ($apiVersion == null ? 43 : $apiVersion.hashCode());
      Object $skuStockInfo = this.getSkuStockInfo();
      result = result * 59 + ($skuStockInfo == null ? 43 : $skuStockInfo.hashCode());
      Object $skuStockInfoWithWhcode = this.getSkuStockInfoWithWhcode();
      result = result * 59 + ($skuStockInfoWithWhcode == null ? 43 : $skuStockInfoWithWhcode.hashCode());
      return result;
   }

   public String toString() {
      return "GetSkuStockV2Response(response=" + this.getResponse() + ", apiVersion=" + this.getApiVersion() + ", skuStockInfo=" + this.getSkuStockInfo() + ", skuStockInfoWithWhcode=" + this.getSkuStockInfoWithWhcode() + ")";
   }

   public static class Response {
      private boolean success;
      private String msg;
      private int code;

      public boolean isSuccess() {
         return this.success;
      }

      public String getMsg() {
         return this.msg;
      }

      public int getCode() {
         return this.code;
      }

      public void setSuccess(boolean success) {
         this.success = success;
      }

      public void setMsg(String msg) {
         this.msg = msg;
      }

      public void setCode(int code) {
         this.code = code;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Response)) {
            return false;
         } else {
            Response other = (Response)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.isSuccess() != other.isSuccess()) {
               return false;
            } else if (this.getCode() != other.getCode()) {
               return false;
            } else {
               Object this$msg = this.getMsg();
               Object other$msg = other.getMsg();
               if (this$msg == null) {
                  if (other$msg != null) {
                     return false;
                  }
               } else if (!this$msg.equals(other$msg)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Response;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + (this.isSuccess() ? 79 : 97);
         result = result * 59 + this.getCode();
         Object $msg = this.getMsg();
         result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
         return result;
      }

      public String toString() {
         return "GetSkuStockV2Response.Response(success=" + this.isSuccess() + ", msg=" + this.getMsg() + ", code=" + this.getCode() + ")";
      }
   }

   public static class SkuStock {
      private long available;
      private long standalone;
      private long reserved;
      private long total;
      private long occupiedQuantity;
      private long productChannelQuantity;
      private long productChannelOccupiedQuantity;
      private long activityChannelQuantity;
      private long activityChannelOccupiedQuantity;

      public long getAvailable() {
         return this.available;
      }

      public long getStandalone() {
         return this.standalone;
      }

      public long getReserved() {
         return this.reserved;
      }

      public long getTotal() {
         return this.total;
      }

      public long getOccupiedQuantity() {
         return this.occupiedQuantity;
      }

      public long getProductChannelQuantity() {
         return this.productChannelQuantity;
      }

      public long getProductChannelOccupiedQuantity() {
         return this.productChannelOccupiedQuantity;
      }

      public long getActivityChannelQuantity() {
         return this.activityChannelQuantity;
      }

      public long getActivityChannelOccupiedQuantity() {
         return this.activityChannelOccupiedQuantity;
      }

      public void setAvailable(long available) {
         this.available = available;
      }

      public void setStandalone(long standalone) {
         this.standalone = standalone;
      }

      public void setReserved(long reserved) {
         this.reserved = reserved;
      }

      public void setTotal(long total) {
         this.total = total;
      }

      public void setOccupiedQuantity(long occupiedQuantity) {
         this.occupiedQuantity = occupiedQuantity;
      }

      public void setProductChannelQuantity(long productChannelQuantity) {
         this.productChannelQuantity = productChannelQuantity;
      }

      public void setProductChannelOccupiedQuantity(long productChannelOccupiedQuantity) {
         this.productChannelOccupiedQuantity = productChannelOccupiedQuantity;
      }

      public void setActivityChannelQuantity(long activityChannelQuantity) {
         this.activityChannelQuantity = activityChannelQuantity;
      }

      public void setActivityChannelOccupiedQuantity(long activityChannelOccupiedQuantity) {
         this.activityChannelOccupiedQuantity = activityChannelOccupiedQuantity;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SkuStock)) {
            return false;
         } else {
            SkuStock other = (SkuStock)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getAvailable() != other.getAvailable()) {
               return false;
            } else if (this.getStandalone() != other.getStandalone()) {
               return false;
            } else if (this.getReserved() != other.getReserved()) {
               return false;
            } else if (this.getTotal() != other.getTotal()) {
               return false;
            } else if (this.getOccupiedQuantity() != other.getOccupiedQuantity()) {
               return false;
            } else if (this.getProductChannelQuantity() != other.getProductChannelQuantity()) {
               return false;
            } else if (this.getProductChannelOccupiedQuantity() != other.getProductChannelOccupiedQuantity()) {
               return false;
            } else if (this.getActivityChannelQuantity() != other.getActivityChannelQuantity()) {
               return false;
            } else {
               return this.getActivityChannelOccupiedQuantity() == other.getActivityChannelOccupiedQuantity();
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SkuStock;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $available = this.getAvailable();
         result = result * 59 + (int)($available >>> 32 ^ $available);
         long $standalone = this.getStandalone();
         result = result * 59 + (int)($standalone >>> 32 ^ $standalone);
         long $reserved = this.getReserved();
         result = result * 59 + (int)($reserved >>> 32 ^ $reserved);
         long $total = this.getTotal();
         result = result * 59 + (int)($total >>> 32 ^ $total);
         long $occupiedQuantity = this.getOccupiedQuantity();
         result = result * 59 + (int)($occupiedQuantity >>> 32 ^ $occupiedQuantity);
         long $productChannelQuantity = this.getProductChannelQuantity();
         result = result * 59 + (int)($productChannelQuantity >>> 32 ^ $productChannelQuantity);
         long $productChannelOccupiedQuantity = this.getProductChannelOccupiedQuantity();
         result = result * 59 + (int)($productChannelOccupiedQuantity >>> 32 ^ $productChannelOccupiedQuantity);
         long $activityChannelQuantity = this.getActivityChannelQuantity();
         result = result * 59 + (int)($activityChannelQuantity >>> 32 ^ $activityChannelQuantity);
         long $activityChannelOccupiedQuantity = this.getActivityChannelOccupiedQuantity();
         result = result * 59 + (int)($activityChannelOccupiedQuantity >>> 32 ^ $activityChannelOccupiedQuantity);
         return result;
      }

      public String toString() {
         return "GetSkuStockV2Response.SkuStock(available=" + this.getAvailable() + ", standalone=" + this.getStandalone() + ", reserved=" + this.getReserved() + ", total=" + this.getTotal() + ", occupiedQuantity=" + this.getOccupiedQuantity() + ", productChannelQuantity=" + this.getProductChannelQuantity() + ", productChannelOccupiedQuantity=" + this.getProductChannelOccupiedQuantity() + ", activityChannelQuantity=" + this.getActivityChannelQuantity() + ", activityChannelOccupiedQuantity=" + this.getActivityChannelOccupiedQuantity() + ")";
      }
   }

   public static class SkuStockInfo {
      private String skuId;
      private SkuStock skuStockInfo;

      public String getSkuId() {
         return this.skuId;
      }

      public SkuStock getSkuStockInfo() {
         return this.skuStockInfo;
      }

      public void setSkuId(String skuId) {
         this.skuId = skuId;
      }

      public void setSkuStockInfo(SkuStock skuStockInfo) {
         this.skuStockInfo = skuStockInfo;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SkuStockInfo)) {
            return false;
         } else {
            SkuStockInfo other = (SkuStockInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$skuId = this.getSkuId();
               Object other$skuId = other.getSkuId();
               if (this$skuId == null) {
                  if (other$skuId != null) {
                     return false;
                  }
               } else if (!this$skuId.equals(other$skuId)) {
                  return false;
               }

               Object this$skuStockInfo = this.getSkuStockInfo();
               Object other$skuStockInfo = other.getSkuStockInfo();
               if (this$skuStockInfo == null) {
                  if (other$skuStockInfo != null) {
                     return false;
                  }
               } else if (!this$skuStockInfo.equals(other$skuStockInfo)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SkuStockInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         Object $skuStockInfo = this.getSkuStockInfo();
         result = result * 59 + ($skuStockInfo == null ? 43 : $skuStockInfo.hashCode());
         return result;
      }

      public String toString() {
         return "GetSkuStockV2Response.SkuStockInfo(skuId=" + this.getSkuId() + ", skuStockInfo=" + this.getSkuStockInfo() + ")";
      }
   }

   public static class SkuStockInfoWithWhcode {
      private String skuId;
      private String whcode;
      private SkuStock skuStockInfo;

      public String getSkuId() {
         return this.skuId;
      }

      public String getWhcode() {
         return this.whcode;
      }

      public SkuStock getSkuStockInfo() {
         return this.skuStockInfo;
      }

      public void setSkuId(String skuId) {
         this.skuId = skuId;
      }

      public void setWhcode(String whcode) {
         this.whcode = whcode;
      }

      public void setSkuStockInfo(SkuStock skuStockInfo) {
         this.skuStockInfo = skuStockInfo;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SkuStockInfoWithWhcode)) {
            return false;
         } else {
            SkuStockInfoWithWhcode other = (SkuStockInfoWithWhcode)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$skuId = this.getSkuId();
               Object other$skuId = other.getSkuId();
               if (this$skuId == null) {
                  if (other$skuId != null) {
                     return false;
                  }
               } else if (!this$skuId.equals(other$skuId)) {
                  return false;
               }

               Object this$whcode = this.getWhcode();
               Object other$whcode = other.getWhcode();
               if (this$whcode == null) {
                  if (other$whcode != null) {
                     return false;
                  }
               } else if (!this$whcode.equals(other$whcode)) {
                  return false;
               }

               Object this$skuStockInfo = this.getSkuStockInfo();
               Object other$skuStockInfo = other.getSkuStockInfo();
               if (this$skuStockInfo == null) {
                  if (other$skuStockInfo != null) {
                     return false;
                  }
               } else if (!this$skuStockInfo.equals(other$skuStockInfo)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SkuStockInfoWithWhcode;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         Object $whcode = this.getWhcode();
         result = result * 59 + ($whcode == null ? 43 : $whcode.hashCode());
         Object $skuStockInfo = this.getSkuStockInfo();
         result = result * 59 + ($skuStockInfo == null ? 43 : $skuStockInfo.hashCode());
         return result;
      }

      public String toString() {
         return "GetSkuStockV2Response.SkuStockInfoWithWhcode(skuId=" + this.getSkuId() + ", whcode=" + this.getWhcode() + ", skuStockInfo=" + this.getSkuStockInfo() + ")";
      }
   }
}
