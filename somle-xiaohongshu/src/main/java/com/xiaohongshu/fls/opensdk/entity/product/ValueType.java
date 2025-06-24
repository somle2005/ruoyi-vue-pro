package com.xiaohongshu.fls.opensdk.entity.product;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ValueType {
   LIST_VALUE(0),
   TEXT_VALUE(1);

   private int code;

   public int getCode() {
      return this.code;
   }

   private ValueType(int code) {
      this.code = code;
   }

   @JsonCreator
   public static ValueType from(String name) {
      for(ValueType vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the attribute [%s] is not exist", name));
   }

   @JsonCreator
   public static ValueType from(int code) {
      for(ValueType vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the variant [%s] is not exist", code));
   }
}
