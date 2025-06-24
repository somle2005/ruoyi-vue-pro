package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class PackageDeliverRequest extends BaseRequest {
   public String packageId;
   public String expressNo;
   public String expressCompanyCode;
   public String expressCompanyName;
   public Long deliveringTime;
   public Boolean unpack;
   public List<String> itemIdList;

   public String getPackageId() {
      return this.packageId;
   }

   public String getExpressNo() {
      return this.expressNo;
   }

   public String getExpressCompanyCode() {
      return this.expressCompanyCode;
   }

   public String getExpressCompanyName() {
      return this.expressCompanyName;
   }

   public Long getDeliveringTime() {
      return this.deliveringTime;
   }

   public Boolean getUnpack() {
      return this.unpack;
   }

   public List<String> getItemIdList() {
      return this.itemIdList;
   }

   public void setPackageId(String packageId) {
      this.packageId = packageId;
   }

   public void setExpressNo(String expressNo) {
      this.expressNo = expressNo;
   }

   public void setExpressCompanyCode(String expressCompanyCode) {
      this.expressCompanyCode = expressCompanyCode;
   }

   public void setExpressCompanyName(String expressCompanyName) {
      this.expressCompanyName = expressCompanyName;
   }

   public void setDeliveringTime(Long deliveringTime) {
      this.deliveringTime = deliveringTime;
   }

   public void setUnpack(Boolean unpack) {
      this.unpack = unpack;
   }

   public void setItemIdList(List<String> itemIdList) {
      this.itemIdList = itemIdList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PackageDeliverRequest)) {
         return false;
      } else {
         PackageDeliverRequest other = (PackageDeliverRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$deliveringTime = this.getDeliveringTime();
            Object other$deliveringTime = other.getDeliveringTime();
            if (this$deliveringTime == null) {
               if (other$deliveringTime != null) {
                  return false;
               }
            } else if (!this$deliveringTime.equals(other$deliveringTime)) {
               return false;
            }

            Object this$unpack = this.getUnpack();
            Object other$unpack = other.getUnpack();
            if (this$unpack == null) {
               if (other$unpack != null) {
                  return false;
               }
            } else if (!this$unpack.equals(other$unpack)) {
               return false;
            }

            Object this$packageId = this.getPackageId();
            Object other$packageId = other.getPackageId();
            if (this$packageId == null) {
               if (other$packageId != null) {
                  return false;
               }
            } else if (!this$packageId.equals(other$packageId)) {
               return false;
            }

            Object this$expressNo = this.getExpressNo();
            Object other$expressNo = other.getExpressNo();
            if (this$expressNo == null) {
               if (other$expressNo != null) {
                  return false;
               }
            } else if (!this$expressNo.equals(other$expressNo)) {
               return false;
            }

            Object this$expressCompanyCode = this.getExpressCompanyCode();
            Object other$expressCompanyCode = other.getExpressCompanyCode();
            if (this$expressCompanyCode == null) {
               if (other$expressCompanyCode != null) {
                  return false;
               }
            } else if (!this$expressCompanyCode.equals(other$expressCompanyCode)) {
               return false;
            }

            Object this$expressCompanyName = this.getExpressCompanyName();
            Object other$expressCompanyName = other.getExpressCompanyName();
            if (this$expressCompanyName == null) {
               if (other$expressCompanyName != null) {
                  return false;
               }
            } else if (!this$expressCompanyName.equals(other$expressCompanyName)) {
               return false;
            }

            Object this$itemIdList = this.getItemIdList();
            Object other$itemIdList = other.getItemIdList();
            if (this$itemIdList == null) {
               if (other$itemIdList != null) {
                  return false;
               }
            } else if (!this$itemIdList.equals(other$itemIdList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PackageDeliverRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $deliveringTime = this.getDeliveringTime();
      result = result * 59 + ($deliveringTime == null ? 43 : $deliveringTime.hashCode());
      Object $unpack = this.getUnpack();
      result = result * 59 + ($unpack == null ? 43 : $unpack.hashCode());
      Object $packageId = this.getPackageId();
      result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
      Object $expressNo = this.getExpressNo();
      result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
      Object $expressCompanyCode = this.getExpressCompanyCode();
      result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
      Object $expressCompanyName = this.getExpressCompanyName();
      result = result * 59 + ($expressCompanyName == null ? 43 : $expressCompanyName.hashCode());
      Object $itemIdList = this.getItemIdList();
      result = result * 59 + ($itemIdList == null ? 43 : $itemIdList.hashCode());
      return result;
   }

   public String toString() {
      return "PackageDeliverRequest(packageId=" + this.getPackageId() + ", expressNo=" + this.getExpressNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressCompanyName=" + this.getExpressCompanyName() + ", deliveringTime=" + this.getDeliveringTime() + ", unpack=" + this.getUnpack() + ", itemIdList=" + this.getItemIdList() + ")";
   }
}
