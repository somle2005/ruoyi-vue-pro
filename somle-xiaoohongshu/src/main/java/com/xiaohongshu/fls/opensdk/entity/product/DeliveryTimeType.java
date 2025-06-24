package com.xiaohongshu.fls.opensdk.entity.product;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum DeliveryTimeType {
   DEFAULT(0),
   RELATIVE_TIME(1),
   ABSOLUTE_TIME(2),
   TODAY(3),
   RELATIVE_TIME_NEW(4),
   ABSOLUTE_TIME_NEW(5);

   private int code;

   public int getCode() {
      return this.code;
   }

   private DeliveryTimeType(int code) {
      this.code = code;
   }

   @JsonCreator
   public static DeliveryTimeType from(String name) {
      for(DeliveryTimeType vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the attribute [%s] is not exist", name));
   }

   @JsonCreator
   public static DeliveryTimeType from(int code) {
      for(DeliveryTimeType vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the variant [%s] is not exist", code));
   }

   @JsonCreator
   public static DeliveryTimeType from(Integer code) {
      for(DeliveryTimeType vl : values()) {
         if (code != null && vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the variant [%s] is not exist", code));
   }
}
