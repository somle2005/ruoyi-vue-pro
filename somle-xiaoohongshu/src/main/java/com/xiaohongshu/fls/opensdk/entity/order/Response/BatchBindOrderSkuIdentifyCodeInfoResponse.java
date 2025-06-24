package com.xiaohongshu.fls.opensdk.entity.order.Response;

import java.util.List;

public class BatchBindOrderSkuIdentifyCodeInfoResponse {
   private List<Res> res;

   public List<Res> getRes() {
      return this.res;
   }

   public void setRes(List<Res> res) {
      this.res = res;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BatchBindOrderSkuIdentifyCodeInfoResponse)) {
         return false;
      } else {
         BatchBindOrderSkuIdentifyCodeInfoResponse other = (BatchBindOrderSkuIdentifyCodeInfoResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$res = this.getRes();
            Object other$res = other.getRes();
            if (this$res == null) {
               if (other$res != null) {
                  return false;
               }
            } else if (!this$res.equals(other$res)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BatchBindOrderSkuIdentifyCodeInfoResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $res = this.getRes();
      result = result * 59 + ($res == null ? 43 : $res.hashCode());
      return result;
   }

   public String toString() {
      return "BatchBindOrderSkuIdentifyCodeInfoResponse(res=" + this.getRes() + ")";
   }

   public static class Res {
      public String packageId;
      public boolean success;
      public String msg;

      public String getPackageId() {
         return this.packageId;
      }

      public boolean isSuccess() {
         return this.success;
      }

      public String getMsg() {
         return this.msg;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setSuccess(boolean success) {
         this.success = success;
      }

      public void setMsg(String msg) {
         this.msg = msg;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Res)) {
            return false;
         } else {
            Res other = (Res)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.isSuccess() != other.isSuccess()) {
               return false;
            } else {
               Object this$packageId = this.getPackageId();
               Object other$packageId = other.getPackageId();
               if (this$packageId == null) {
                  if (other$packageId != null) {
                     return false;
                  }
               } else if (!this$packageId.equals(other$packageId)) {
                  return false;
               }

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
         return other instanceof Res;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + (this.isSuccess() ? 79 : 97);
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $msg = this.getMsg();
         result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
         return result;
      }

      public String toString() {
         return "BatchBindOrderSkuIdentifyCodeInfoResponse.Res(packageId=" + this.getPackageId() + ", success=" + this.isSuccess() + ", msg=" + this.getMsg() + ")";
      }
   }
}
