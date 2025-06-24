package com.xiaohongshu.fls.opensdk.entity.common.response;

public class ZoneInfo {
   public String name;
   public String shortName;
   public String code;
   public String upper;
   public String initialPinyin;
   public String pinyin;
   public String isActive;

   public String getName() {
      return this.name;
   }

   public String getShortName() {
      return this.shortName;
   }

   public String getCode() {
      return this.code;
   }

   public String getUpper() {
      return this.upper;
   }

   public String getInitialPinyin() {
      return this.initialPinyin;
   }

   public String getPinyin() {
      return this.pinyin;
   }

   public String getIsActive() {
      return this.isActive;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setShortName(String shortName) {
      this.shortName = shortName;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public void setUpper(String upper) {
      this.upper = upper;
   }

   public void setInitialPinyin(String initialPinyin) {
      this.initialPinyin = initialPinyin;
   }

   public void setPinyin(String pinyin) {
      this.pinyin = pinyin;
   }

   public void setIsActive(String isActive) {
      this.isActive = isActive;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ZoneInfo)) {
         return false;
      } else {
         ZoneInfo other = (ZoneInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$name = this.getName();
            Object other$name = other.getName();
            if (this$name == null) {
               if (other$name != null) {
                  return false;
               }
            } else if (!this$name.equals(other$name)) {
               return false;
            }

            Object this$shortName = this.getShortName();
            Object other$shortName = other.getShortName();
            if (this$shortName == null) {
               if (other$shortName != null) {
                  return false;
               }
            } else if (!this$shortName.equals(other$shortName)) {
               return false;
            }

            Object this$code = this.getCode();
            Object other$code = other.getCode();
            if (this$code == null) {
               if (other$code != null) {
                  return false;
               }
            } else if (!this$code.equals(other$code)) {
               return false;
            }

            Object this$upper = this.getUpper();
            Object other$upper = other.getUpper();
            if (this$upper == null) {
               if (other$upper != null) {
                  return false;
               }
            } else if (!this$upper.equals(other$upper)) {
               return false;
            }

            Object this$initialPinyin = this.getInitialPinyin();
            Object other$initialPinyin = other.getInitialPinyin();
            if (this$initialPinyin == null) {
               if (other$initialPinyin != null) {
                  return false;
               }
            } else if (!this$initialPinyin.equals(other$initialPinyin)) {
               return false;
            }

            Object this$pinyin = this.getPinyin();
            Object other$pinyin = other.getPinyin();
            if (this$pinyin == null) {
               if (other$pinyin != null) {
                  return false;
               }
            } else if (!this$pinyin.equals(other$pinyin)) {
               return false;
            }

            Object this$isActive = this.getIsActive();
            Object other$isActive = other.getIsActive();
            if (this$isActive == null) {
               if (other$isActive != null) {
                  return false;
               }
            } else if (!this$isActive.equals(other$isActive)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ZoneInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $shortName = this.getShortName();
      result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
      Object $code = this.getCode();
      result = result * 59 + ($code == null ? 43 : $code.hashCode());
      Object $upper = this.getUpper();
      result = result * 59 + ($upper == null ? 43 : $upper.hashCode());
      Object $initialPinyin = this.getInitialPinyin();
      result = result * 59 + ($initialPinyin == null ? 43 : $initialPinyin.hashCode());
      Object $pinyin = this.getPinyin();
      result = result * 59 + ($pinyin == null ? 43 : $pinyin.hashCode());
      Object $isActive = this.getIsActive();
      result = result * 59 + ($isActive == null ? 43 : $isActive.hashCode());
      return result;
   }

   public String toString() {
      return "ZoneInfo(name=" + this.getName() + ", shortName=" + this.getShortName() + ", code=" + this.getCode() + ", upper=" + this.getUpper() + ", initialPinyin=" + this.getInitialPinyin() + ", pinyin=" + this.getPinyin() + ", isActive=" + this.getIsActive() + ")";
   }
}
