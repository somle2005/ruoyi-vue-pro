package com.jd.security.tdeclient.jmq;

class ErrorAttribute extends BasicAttribute {
   int code;
   String msg;
   String heap;

   public int getCode() {
      return this.code;
   }

   public void setCode(int code) {
      this.code = code;
   }

   public String getMsg() {
      return this.msg;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }

   public String getHeap() {
      return this.heap;
   }

   public void setHeap(String heap) {
      this.heap = heap;
   }

   public ErrorAttribute(int type, String host, int level, String service, String sdk_ver, String env, int err_code, String err_msg, String stacktrace) {
      super(type, host, level, service, sdk_ver, env);
      this.code = err_code;
      this.msg = err_msg;
      this.heap = stacktrace;
   }
}
