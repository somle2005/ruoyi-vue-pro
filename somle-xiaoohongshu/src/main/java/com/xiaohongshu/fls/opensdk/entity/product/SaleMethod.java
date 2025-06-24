package com.xiaohongshu.fls.opensdk.entity.product;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum SaleMethod {
   DEFAULT(0),
   BOUTIQUE(1),
   SUPERMARKET(2);

   private int code;

   public int getCode() {
      return this.code;
   }

   private SaleMethod(int code) {
      this.code = code;
   }

   @JsonCreator
   public static SaleMethod from(String name) {
      for(SaleMethod vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the vendor [%s] is not exist", name));
   }

   @JsonCreator
   public static SaleMethod from(int code) {
      for(SaleMethod vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the variant [%s] is not exist", code));
   }
}
