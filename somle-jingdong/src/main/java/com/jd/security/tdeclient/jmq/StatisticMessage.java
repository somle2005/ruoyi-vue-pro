package com.jd.security.tdeclient.jmq;

class StatisticMessage extends BasicMessage {
   public StatisticMessage(String host, String service, String sdkVer, String env, long[] stat) {
      this.businessId = BasicMessage.getRandomString();
      this.text = MsgType.STATISTIC.name();
      this.attributes = new StatisticAttribute(MsgType.STATISTIC.id, host, MsgLevel.INFO.id, service, sdkVer, env, stat);
   }
}
