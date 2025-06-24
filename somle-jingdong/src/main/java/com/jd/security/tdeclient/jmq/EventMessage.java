package com.jd.security.tdeclient.jmq;

class EventMessage extends BasicMessage {
   public EventMessage(String host, String service, String sdkVer, String env, int event_code, String event) {
      this.businessId = BasicMessage.getRandomString();
      this.text = MsgType.EVENT.name();
      this.attributes = new EventAttribute(MsgType.EVENT.id, host, MsgLevel.INFO.id, service, sdkVer, env, event_code, event);
   }
}
