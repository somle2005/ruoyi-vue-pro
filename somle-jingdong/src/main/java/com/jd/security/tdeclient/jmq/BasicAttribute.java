package com.jd.security.tdeclient.jmq;

import java.util.Date;

class BasicAttribute {
   int type;
   String host;
   int level;
   String service;
   String sdk_ver;
   String env;
   long ts;

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public String getHost() {
      return this.host;
   }

   public void setHost(String host) {
      this.host = host;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.level = level;
   }

   public String getService() {
      return this.service;
   }

   public void setService(String service) {
      this.service = service;
   }

   public String getSdk_ver() {
      return this.sdk_ver;
   }

   public void setSdk_ver(String sdk_ver) {
      this.sdk_ver = sdk_ver;
   }

   public String getEnv() {
      return this.env;
   }

   public void setEnv(String env) {
      this.env = env;
   }

   public long getTs() {
      return this.ts;
   }

   public void setTs(long ts) {
      this.ts = ts;
   }

   public BasicAttribute(int type, String host, int level, String service, String sdk_ver, String env) {
      this.type = type;
      this.host = host;
      this.level = level;
      this.service = service;
      this.sdk_ver = sdk_ver;
      this.env = env;
      this.ts = (new Date()).getTime();
   }
}
