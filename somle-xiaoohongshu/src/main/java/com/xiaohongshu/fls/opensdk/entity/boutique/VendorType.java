package com.xiaohongshu.fls.opensdk.entity.boutique;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum VendorType {
   INDIVIDUAL(1),
   ENTERPRISE(2);

   private int code;

   public int getCode() {
      return this.code;
   }

   private VendorType(int code) {
      this.code = code;
   }

   @JsonCreator
   public static VendorType from(String name) {
      for(VendorType vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the VendorType [%s] is not exist", name));
   }

   @JsonCreator
   public static VendorType from(int code) {
      for(VendorType vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the VendorType [%s] is not exist", code));
   }
}
