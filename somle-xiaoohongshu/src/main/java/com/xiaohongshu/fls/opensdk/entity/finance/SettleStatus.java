package com.xiaohongshu.fls.opensdk.entity.finance;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum SettleStatus {
   WAIT_SETTLE(0),
   SETTLED(1);

   private int code;

   public int getCode() {
      return this.code;
   }

   private SettleStatus(int code) {
      this.code = code;
   }

   @JsonCreator
   public static SettleStatus from(String name) {
      for(SettleStatus vl : values()) {
         if (vl.name().equalsIgnoreCase(name)) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the SettleStatus [%s] is not exist", name));
   }

   @JsonCreator
   public static SettleStatus from(int code) {
      for(SettleStatus vl : values()) {
         if (vl.getCode() == code) {
            return vl;
         }
      }

      throw new RuntimeException(String.format("the SettleStatus [%s] is not exist", code));
   }
}
