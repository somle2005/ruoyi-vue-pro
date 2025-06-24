package com.jd.security.tdeclient.jmq;

class ErrorMessage extends BasicMessage {
   public ErrorMessage(String host, String service, String sdkVer, String env, int level, int err_code, String err_msg, String stacktrace) {
      this.businessId = BasicMessage.getRandomString();
      this.text = MsgType.EXCEPTION.name();
      this.attributes = new ErrorAttribute(MsgType.EXCEPTION.id, host, level, service, sdkVer, env, err_code, err_msg, stacktrace);
   }
}
