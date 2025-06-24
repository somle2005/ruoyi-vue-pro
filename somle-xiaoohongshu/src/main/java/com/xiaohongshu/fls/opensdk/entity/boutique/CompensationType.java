package com.xiaohongshu.fls.opensdk.entity.boutique;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum CompensationType {
   CUSTOMER(1),
   SELLER(2);

   private int code;

   public int getCode() {
      return this.code;
   }

   private CompensationType(int code) {
      this.code = code;
   }

   @JsonCreator
   public static CompensationType from(String name) {
      for(CompensationType vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the CompensationType [%s] is not exist", name));
   }

   @JsonCreator
   public static CompensationType from(int code) {
      for(CompensationType vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the CompensationType [%s] is not exist", code));
   }
}
