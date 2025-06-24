package com.xiaohongshu.fls.opensdk.entity.order;

public class CustomsStatusInfo {
   public String declarationOrderNo;
   public String failReason;
   public String customsName;
   public String customsCode;

   public String getDeclarationOrderNo() {
      return this.declarationOrderNo;
   }

   public String getFailReason() {
      return this.failReason;
   }

   public String getCustomsName() {
      return this.customsName;
   }

   public String getCustomsCode() {
      return this.customsCode;
   }

   public void setDeclarationOrderNo(String declarationOrderNo) {
      this.declarationOrderNo = declarationOrderNo;
   }

   public void setFailReason(String failReason) {
      this.failReason = failReason;
   }

   public void setCustomsName(String customsName) {
      this.customsName = customsName;
   }

   public void setCustomsCode(String customsCode) {
      this.customsCode = customsCode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CustomsStatusInfo)) {
         return false;
      } else {
         CustomsStatusInfo other = (CustomsStatusInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$declarationOrderNo = this.getDeclarationOrderNo();
            Object other$declarationOrderNo = other.getDeclarationOrderNo();
            if (this$declarationOrderNo == null) {
               if (other$declarationOrderNo != null) {
                  return false;
               }
            } else if (!this$declarationOrderNo.equals(other$declarationOrderNo)) {
               return false;
            }

            Object this$failReason = this.getFailReason();
            Object other$failReason = other.getFailReason();
            if (this$failReason == null) {
               if (other$failReason != null) {
                  return false;
               }
            } else if (!this$failReason.equals(other$failReason)) {
               return false;
            }

            Object this$customsName = this.getCustomsName();
            Object other$customsName = other.getCustomsName();
            if (this$customsName == null) {
               if (other$customsName != null) {
                  return false;
               }
            } else if (!this$customsName.equals(other$customsName)) {
               return false;
            }

            Object this$customsCode = this.getCustomsCode();
            Object other$customsCode = other.getCustomsCode();
            if (this$customsCode == null) {
               if (other$customsCode != null) {
                  return false;
               }
            } else if (!this$customsCode.equals(other$customsCode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CustomsStatusInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $declarationOrderNo = this.getDeclarationOrderNo();
      result = result * 59 + ($declarationOrderNo == null ? 43 : $declarationOrderNo.hashCode());
      Object $failReason = this.getFailReason();
      result = result * 59 + ($failReason == null ? 43 : $failReason.hashCode());
      Object $customsName = this.getCustomsName();
      result = result * 59 + ($customsName == null ? 43 : $customsName.hashCode());
      Object $customsCode = this.getCustomsCode();
      result = result * 59 + ($customsCode == null ? 43 : $customsCode.hashCode());
      return result;
   }

   public String toString() {
      return "CustomsStatusInfo(declarationOrderNo=" + this.getDeclarationOrderNo() + ", failReason=" + this.getFailReason() + ", customsName=" + this.getCustomsName() + ", customsCode=" + this.getCustomsCode() + ")";
   }
}
