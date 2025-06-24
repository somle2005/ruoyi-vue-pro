package com.xiaohongshu.fls.opensdk.entity.express;

public class ElectronicBillItem {
   private Integer count;
   private String name;
   private String specification;

   public Integer getCount() {
      return this.count;
   }

   public String getName() {
      return this.name;
   }

   public String getSpecification() {
      return this.specification;
   }

   public void setCount(Integer count) {
      this.count = count;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setSpecification(String specification) {
      this.specification = specification;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillItem)) {
         return false;
      } else {
         ElectronicBillItem other = (ElectronicBillItem)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$count = this.getCount();
            Object other$count = other.getCount();
            if (this$count == null) {
               if (other$count != null) {
                  return false;
               }
            } else if (!this$count.equals(other$count)) {
               return false;
            }

            Object this$name = this.getName();
            Object other$name = other.getName();
            if (this$name == null) {
               if (other$name != null) {
                  return false;
               }
            } else if (!this$name.equals(other$name)) {
               return false;
            }

            Object this$specification = this.getSpecification();
            Object other$specification = other.getSpecification();
            if (this$specification == null) {
               if (other$specification != null) {
                  return false;
               }
            } else if (!this$specification.equals(other$specification)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillItem;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $count = this.getCount();
      result = result * 59 + ($count == null ? 43 : $count.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $specification = this.getSpecification();
      result = result * 59 + ($specification == null ? 43 : $specification.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillItem(count=" + this.getCount() + ", name=" + this.getName() + ", specification=" + this.getSpecification() + ")";
   }
}
