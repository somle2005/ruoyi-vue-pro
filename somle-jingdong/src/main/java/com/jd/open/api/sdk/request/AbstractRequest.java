package com.jd.open.api.sdk.request;

import com.jd.open.api.sdk.internal.util.StringUtil;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractRequest {
   private final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
   protected String timestamp;
   protected String version;
   protected String method;
   protected String signmethod;
   protected String sign;
   protected Map<String, String> reserveParams;
   protected String isvToken;

   public AbstractRequest() {
      this.timestamp = this.sdf.format(new Date());
      this.version = "2.0";
   }

   public Map<String, String> getSysParams() {
      Map<String, String> sysParams = new HashMap();
      sysParams.put("method", this.method);
      sysParams.put("timestamp", this.timestamp);
      sysParams.put("v", this.version);
      if (!StringUtil.isEmpty(this.signmethod)) {
         sysParams.put("sign_method", this.signmethod);
      }

      return sysParams;
   }

   protected String getMethod() {
      return this.method;
   }

   protected void setMethod(String method) {
      this.method = method;
   }

   public String getTimestamp() {
      return this.timestamp;
   }

   public void setTimestamp(String timestamp) {
      this.timestamp = timestamp;
   }

   protected String getVersion() {
      return this.version;
   }

   public void setVersion(String version) {
      this.version = version;
   }

   public String getSignmethod() {
      return this.signmethod;
   }

   public void setSignmethod(String signmethod) {
      this.signmethod = signmethod;
   }

   protected String getSign() {
      return this.sign;
   }

   protected void setSign(String sign) {
      this.sign = sign;
   }

   public String getOtherParams() throws IOException {
      return null;
   }

   public Map<String, String> getReserveParams() {
      return this.reserveParams;
   }

   public void setReserveParams(Map<String, String> reserveParams) {
      this.reserveParams = reserveParams;
   }

   public String getIsvToken() {
      return this.isvToken;
   }

   public void setIsvToken(String isvToken) {
      this.isvToken = isvToken;
   }
}
