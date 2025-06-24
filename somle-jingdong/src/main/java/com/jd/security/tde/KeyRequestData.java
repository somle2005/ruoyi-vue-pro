package com.jd.security.tde;

import java.util.Date;

public class KeyRequestData {
   private int sdk_ver;
   private long ts;
   private String tid;

   public String getTid() {
      return this.tid;
   }

   public long getTs() {
      return this.ts;
   }

   public void setTs(long ts) {
      this.ts = ts;
   }

   public int getSdk_ver() {
      return this.sdk_ver;
   }

   public void setSdk_ver(int sdk_ver) {
      this.sdk_ver = sdk_ver;
   }

   public void setTid(String tid) {
      this.tid = tid;
   }

   public KeyRequestData() {
   }

   public KeyRequestData(String tid, int major_sdk_ver) {
      this.sdk_ver = major_sdk_ver;
      this.ts = (new Date()).getTime();
      this.tid = tid;
   }
}
