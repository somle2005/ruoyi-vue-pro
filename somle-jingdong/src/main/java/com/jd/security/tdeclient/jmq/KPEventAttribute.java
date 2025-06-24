package com.jd.security.tdeclient.jmq;

import java.util.HashMap;

class KPEventAttribute extends EventAttribute {
   int cur_key;
   HashMap<String, Integer> keylist;

   public int getCur_key() {
      return this.cur_key;
   }

   public void setCur_key(int cur_key) {
      this.cur_key = cur_key;
   }

   public HashMap<String, Integer> getKeylist() {
      return this.keylist;
   }

   public void setKeylist(HashMap<String, Integer> keylist) {
      this.keylist = keylist;
   }

   public KPEventAttribute(int type, String host, int level, String service, String sdk_ver, String env, int code, String event, int major_kver, HashMap<String, Integer> keylist) {
      super(type, host, level, service, sdk_ver, env, code, event);
      this.keylist = keylist;
      this.cur_key = major_kver;
   }
}
