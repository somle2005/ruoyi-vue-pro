package com.xiaohongshu.fls.opensdk.entity.product;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum AttributeType {
   SPL(1),
   MUST_FILL(2),
   OPTIONAL_FILL(3),
   SPV(4);

   private int code;

   public int getCode() {
      return this.code;
   }

   private AttributeType(int code) {
      this.code = code;
   }

   @JsonCreator
   public static AttributeType from(String name) {
      for(AttributeType vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the attribute [%s] is not exist", name));
   }

   @JsonCreator
   public static AttributeType from(int code) {
      for(AttributeType vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the variant [%s] is not exist", code));
   }
}
