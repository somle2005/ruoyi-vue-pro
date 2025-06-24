package com.xiaohongshu.fls.opensdk.entity.inventory.response;

import java.util.List;

public class SkuStockResponse {
   private String skuId;
   private SkuStock skuStock = new SkuStock();
   private List<SkuStockWithWarehouseCode> skuStockInfoWithWhcode;
   private String apiVersion;
   private Response response;

   public String getSkuId() {
      return this.skuId;
   }

   public SkuStock getSkuStock() {
      return this.skuStock;
   }

   public List<SkuStockWithWarehouseCode> getSkuStockInfoWithWhcode() {
      return this.skuStockInfoWithWhcode;
   }

   public String getApiVersion() {
      return this.apiVersion;
   }

   public Response getResponse() {
      return this.response;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public void setSkuStock(SkuStock skuStock) {
      this.skuStock = skuStock;
   }

   public void setSkuStockInfoWithWhcode(List<SkuStockWithWarehouseCode> skuStockInfoWithWhcode) {
      this.skuStockInfoWithWhcode = skuStockInfoWithWhcode;
   }

   public void setApiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
   }

   public void setResponse(Response response) {
      this.response = response;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SkuStockResponse)) {
         return false;
      } else {
         SkuStockResponse other = (SkuStockResponse)o;
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

            Object this$skuStock = this.getSkuStock();
            Object other$skuStock = other.getSkuStock();
            if (this$skuStock == null) {
               if (other$skuStock != null) {
                  return false;
               }
            } else if (!this$skuStock.equals(other$skuStock)) {
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

            Object this$apiVersion = this.getApiVersion();
            Object other$apiVersion = other.getApiVersion();
            if (this$apiVersion == null) {
               if (other$apiVersion != null) {
                  return false;
               }
            } else if (!this$apiVersion.equals(other$apiVersion)) {
               return false;
            }

            Object this$response = this.getResponse();
            Object other$response = other.getResponse();
            if (this$response == null) {
               if (other$response != null) {
                  return false;
               }
            } else if (!this$response.equals(other$response)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SkuStockResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $skuId = this.getSkuId();
      result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
      Object $skuStock = this.getSkuStock();
      result = result * 59 + ($skuStock == null ? 43 : $skuStock.hashCode());
      Object $skuStockInfoWithWhcode = this.getSkuStockInfoWithWhcode();
      result = result * 59 + ($skuStockInfoWithWhcode == null ? 43 : $skuStockInfoWithWhcode.hashCode());
      Object $apiVersion = this.getApiVersion();
      result = result * 59 + ($apiVersion == null ? 43 : $apiVersion.hashCode());
      Object $response = this.getResponse();
      result = result * 59 + ($response == null ? 43 : $response.hashCode());
      return result;
   }

   public String toString() {
      return "SkuStockResponse(skuId=" + this.getSkuId() + ", skuStock=" + this.getSkuStock() + ", skuStockInfoWithWhcode=" + this.getSkuStockInfoWithWhcode() + ", apiVersion=" + this.getApiVersion() + ", response=" + this.getResponse() + ")";
   }

   public static class Response {
      private boolean success;
      private String message;
      private int code;

      public boolean isSuccess() {
         return this.success;
      }

      public String getMessage() {
         return this.message;
      }

      public int getCode() {
         return this.code;
      }

      public void setSuccess(boolean success) {
         this.success = success;
      }

      public void setMessage(String message) {
         this.message = message;
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
               Object this$message = this.getMessage();
               Object other$message = other.getMessage();
               if (this$message == null) {
                  if (other$message != null) {
                     return false;
                  }
               } else if (!this$message.equals(other$message)) {
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
         Object $message = this.getMessage();
         result = result * 59 + ($message == null ? 43 : $message.hashCode());
         return result;
      }

      public String toString() {
         return "SkuStockResponse.Response(success=" + this.isSuccess() + ", message=" + this.getMessage() + ", code=" + this.getCode() + ")";
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
         return "SkuStockResponse.SkuStock(available=" + this.getAvailable() + ", standalone=" + this.getStandalone() + ", reserved=" + this.getReserved() + ", total=" + this.getTotal() + ", occupiedQuantity=" + this.getOccupiedQuantity() + ", productChannelQuantity=" + this.getProductChannelQuantity() + ", productChannelOccupiedQuantity=" + this.getProductChannelOccupiedQuantity() + ", activityChannelQuantity=" + this.getActivityChannelQuantity() + ", activityChannelOccupiedQuantity=" + this.getActivityChannelOccupiedQuantity() + ")";
      }
   }

   public static class SkuStockWithWarehouseCode {
      private String skuId;
      private String whcode;
      private SkuStock skuStock;

      public String getSkuId() {
         return this.skuId;
      }

      public String getWhcode() {
         return this.whcode;
      }

      public SkuStock getSkuStock() {
         return this.skuStock;
      }

      public void setSkuId(String skuId) {
         this.skuId = skuId;
      }

      public void setWhcode(String whcode) {
         this.whcode = whcode;
      }

      public void setSkuStock(SkuStock skuStock) {
         this.skuStock = skuStock;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SkuStockWithWarehouseCode)) {
            return false;
         } else {
            SkuStockWithWarehouseCode other = (SkuStockWithWarehouseCode)o;
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

               Object this$skuStock = this.getSkuStock();
               Object other$skuStock = other.getSkuStock();
               if (this$skuStock == null) {
                  if (other$skuStock != null) {
                     return false;
                  }
               } else if (!this$skuStock.equals(other$skuStock)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SkuStockWithWarehouseCode;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         Object $whcode = this.getWhcode();
         result = result * 59 + ($whcode == null ? 43 : $whcode.hashCode());
         Object $skuStock = this.getSkuStock();
         result = result * 59 + ($skuStock == null ? 43 : $skuStock.hashCode());
         return result;
      }

      public String toString() {
         return "SkuStockResponse.SkuStockWithWarehouseCode(skuId=" + this.getSkuId() + ", whcode=" + this.getWhcode() + ", skuStock=" + this.getSkuStock() + ")";
      }
   }
}
