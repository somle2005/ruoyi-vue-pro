package com.jd.security.tdeclient.jmq;

class InitMessage extends BasicMessage {
   public InitMessage(String host, String service, String sdkVer, String env) {
      this.businessId = BasicMessage.getRandomString();
      this.text = MsgType.INIT.name();
      this.attributes = new BasicAttribute(MsgType.INIT.id, host, MsgLevel.INFO.id, service, sdkVer, env);
   }
}
