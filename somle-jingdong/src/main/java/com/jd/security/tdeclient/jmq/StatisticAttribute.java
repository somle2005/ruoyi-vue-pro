package com.jd.security.tdeclient.jmq;

class StatisticAttribute extends BasicAttribute {
   String enccnt;
   String deccnt;
   String encerrcnt;
   String decerrcnt;

   public String getEnccnt() {
      return this.enccnt;
   }

   public void setEnccnt(String enccnt) {
      this.enccnt = enccnt;
   }

   public String getDeccnt() {
      return this.deccnt;
   }

   public void setDeccnt(String deccnt) {
      this.deccnt = deccnt;
   }

   public String getEncerrcnt() {
      return this.encerrcnt;
   }

   public void setEncerrcnt(String encerrcnt) {
      this.encerrcnt = encerrcnt;
   }

   public String getDecerrcnt() {
      return this.decerrcnt;
   }

   public void setDecerrcnt(String decerrcnt) {
      this.decerrcnt = decerrcnt;
   }

   public StatisticAttribute(int type, String host, int level, String service, String sdk_ver, String env, long[] stat) {
      super(type, host, level, service, sdk_ver, env);
      this.enccnt = stat == null ? "0" : Long.toString(stat[0]);
      this.deccnt = stat == null ? "0" : Long.toString(stat[1]);
      this.encerrcnt = stat == null ? "0" : Long.toString(stat[2]);
      this.decerrcnt = stat == null ? "0" : Long.toString(stat[3]);
   }
}
