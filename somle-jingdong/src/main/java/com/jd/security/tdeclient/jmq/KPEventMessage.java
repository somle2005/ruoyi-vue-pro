package com.jd.security.tdeclient.jmq;

import java.util.HashMap;

class KPEventMessage extends BasicMessage {
   public KPEventMessage(String host, String service, String sdkVer, String env, int event_code, String event, int major_kver, HashMap<String, Integer> keylist) {
      this.businessId = BasicMessage.getRandomString();
      this.text = MsgType.EVENT.name();
      this.attributes = new KPEventAttribute(MsgType.EVENT.id, host, MsgLevel.INFO.id, service, sdkVer, env, event_code, event, major_kver, keylist);
   }
}
