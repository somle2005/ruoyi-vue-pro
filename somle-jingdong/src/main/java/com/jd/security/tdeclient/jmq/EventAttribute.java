package com.jd.security.tdeclient.jmq;

class EventAttribute extends BasicAttribute {
   int code;
   String event;

   public int getCode() {
      return this.code;
   }

   public void setCode(int code) {
      this.code = code;
   }

   public String getEvent() {
      return this.event;
   }

   public void setEvent(String event) {
      this.event = event;
   }

   public EventAttribute(int type, String host, int level, String service, String sdk_ver, String env, int code, String event) {
      super(type, host, level, service, sdk_ver, env);
      this.code = code;
      this.event = event;
   }
}
