package com.jd.security.tdeclient.jmq;

import java.util.Random;

class BasicMessage {
   protected String businessId;
   protected String text;
   protected BasicAttribute attributes;

   public String getBusinessId() {
      return this.businessId;
   }

   public void setBusinessId(String businessId) {
      this.businessId = businessId;
   }

   public String getText() {
      return this.text;
   }

   public void setText(String text) {
      this.text = text;
   }

   public BasicAttribute getAttributes() {
      return this.attributes;
   }

   public void setAttributes(BasicAttribute attributes) {
      this.attributes = attributes;
   }

   public static String getRandomString() {
      Random r = new Random(System.currentTimeMillis());
      String abc = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz=+-*/_|<>^~@?%&";
      StringBuilder buffer = new StringBuilder(40);

      for(int i = 0; i < 40; ++i) {
         int rc = r.nextInt(40);
         buffer.append(abc.charAt(rc));
      }

      return buffer.toString();
   }

   public static enum MsgType {
      INIT(1),
      EXCEPTION(2),
      STATISTIC(3),
      EVENT(4);

      int id;

      private MsgType(int i) {
         this.id = i;
      }
   }

   public static enum MsgLevel {
      INFO(1),
      WARN(2),
      ERROR(3),
      SEVERE(4);

      int id;

      private MsgLevel(int i) {
         this.id = i;
      }
   }
}
