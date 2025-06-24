package com.xiaohongshu.fls.opensdk.entity.product;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ItemStatus {
   STATUS_EDITING(0),
   STATUS_TO_APPROVE(1),
   STATUS_APPROVED(2),
   STATUS_NOT_APPROVED(-1),
   STATUS_INVALID(-2);

   private int code;

   public int getCode() {
      return this.code;
   }

   private ItemStatus(int code) {
      this.code = code;
   }

   @JsonCreator
   public static ItemStatus from(String name) {
      for(ItemStatus vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the vendor [%s] is not exist", name));
   }

   @JsonCreator
   public static ItemStatus from(int code) {
      for(ItemStatus vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the variant [%s] is not exist", code));
   }
}
