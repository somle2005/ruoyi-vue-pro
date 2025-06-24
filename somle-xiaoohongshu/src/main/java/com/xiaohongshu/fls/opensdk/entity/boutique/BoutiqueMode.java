package com.xiaohongshu.fls.opensdk.entity.boutique;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum BoutiqueMode {
   DOMESTIC_GENERAL_SHIPPING(1),
   DOMESTIC_FAST_SHIPPING(3),
   INCLUDE_TAX_FAST_SHIPPING(5),
   INTERNATIONAL_DIRECT_GENERAL_SHIPPING(7),
   INTERNATIONAL_DIRECT_FAST_SHIPPING(9);

   private int code;

   public int getCode() {
      return this.code;
   }

   private BoutiqueMode(int code) {
      this.code = code;
   }

   @JsonCreator
   public static BoutiqueMode from(String name) {
      for(BoutiqueMode vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the BoutiqueMode [%s] is not exist", name));
   }

   @JsonCreator
   public static BoutiqueMode from(int code) {
      for(BoutiqueMode vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the BoutiqueMode [%s] is not exist", code));
   }
}
