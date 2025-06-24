package com.jd.open.api.sdk.request.innertest;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.innertest.Openid2pinResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Openid2pinRequest extends AbstractRequest implements JdRequest<Openid2pinResponse> {
   private String pin;
   private String appkey;
   private String userid;
   private String openIdBuyer;
   private String xidBuyer;

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setAppkey(String appkey) {
      this.appkey = appkey;
   }

   public String getAppkey() {
      return this.appkey;
   }

   public void setUserid(String userid) {
      this.userid = userid;
   }

   public String getUserid() {
      return this.userid;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.openid2pin";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pin", this.pin);
      pmap.put("appkey", this.appkey);
      pmap.put("userid", this.userid);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<Openid2pinResponse> getResponseClass() {
      return Openid2pinResponse.class;
   }
}
