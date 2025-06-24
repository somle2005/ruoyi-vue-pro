package com.xiaohongshu.fls.opensdk.entity.boutique;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OperationType {
   INIT(1),
   ADD(2);

   private int code;

   public int getCode() {
      return this.code;
   }

   private OperationType(int code) {
      this.code = code;
   }

   @JsonCreator
   public static OperationType from(String name) {
      for(OperationType vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the OperationType [%s] is not exist", name));
   }

   @JsonCreator
   public static OperationType from(int code) {
      for(OperationType vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the OperationType [%s] is not exist", code));
   }
}
