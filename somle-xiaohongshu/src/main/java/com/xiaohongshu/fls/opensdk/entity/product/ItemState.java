package com.xiaohongshu.fls.opensdk.entity.product;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ItemState {
   STATE_ACTIVE(1),
   STATE_DELETED(-1);

   private int code;

   public int getCode() {
      return this.code;
   }

   private ItemState(int code) {
      this.code = code;
   }

   @JsonCreator
   public static ItemState from(String name) {
      for(ItemState vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the vendor [%s] is not exist", name));
   }

   @JsonCreator
   public static ItemState from(int code) {
      for(ItemState vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the variant [%s] is not exist", code));
   }
}
