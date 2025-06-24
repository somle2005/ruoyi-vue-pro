package com.xiaohongshu.fls.opensdk.entity.product;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum SpuType {
   NORMAL(0),
   UNION(1);

   private int code;

   public int getCode() {
      return this.code;
   }

   private SpuType(int code) {
      this.code = code;
   }

   @JsonCreator
   public static SpuType from(String name) {
      for(SpuType vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the vendor [%s] is not exist", name));
   }

   @JsonCreator
   public static SpuType from(int code) {
      for(SpuType vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the variant [%s] is not exist", code));
   }
}
