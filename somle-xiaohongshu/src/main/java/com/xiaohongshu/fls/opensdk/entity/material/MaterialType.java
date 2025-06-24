package com.xiaohongshu.fls.opensdk.entity.material;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum MaterialType {
   IMAGE(1),
   VIDEO(2);

   private int code;

   public int getCode() {
      return this.code;
   }

   private MaterialType(int code) {
      this.code = code;
   }

   @JsonCreator
   public static MaterialType from(String name) {
      for(MaterialType vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the MaterialType [%s] is not exist", name));
   }

   @JsonCreator
   public static MaterialType from(int code) {
      for(MaterialType vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the MaterialType [%s] is not exist", code));
   }
}
