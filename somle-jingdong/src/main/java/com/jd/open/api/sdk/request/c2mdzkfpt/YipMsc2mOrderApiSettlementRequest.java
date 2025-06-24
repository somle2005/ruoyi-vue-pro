package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipMsc2mOrderApiSettlementResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipMsc2mOrderApiSettlementRequest extends AbstractRequest implements JdRequest<YipMsc2mOrderApiSettlementResponse> {
   private String area;
   private String pin;
   private String domain;
   private Integer channel;
   private String email;
   private String cart;
   private String skuId;
   private String openIdBuyer;
   private String xidBuyer;

   public void setArea(String area) {
      this.area = area;
   }

   public String getArea() {
      return this.area;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setDomain(String domain) {
      this.domain = domain;
   }

   public String getDomain() {
      return this.domain;
   }

   public void setChannel(Integer channel) {
      this.channel = channel;
   }

   public Integer getChannel() {
      return this.channel;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail() {
      return this.email;
   }

   public void setCart(String cart) {
      this.cart = cart;
   }

   public String getCart() {
      return this.cart;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
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
      return "jingdong.yip.msc2m.orderApi.settlement";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("area", this.area);
      pmap.put("pin", this.pin);
      pmap.put("domain", this.domain);
      pmap.put("channel", this.channel);
      pmap.put("email", this.email);
      pmap.put("cart", this.cart);
      pmap.put("skuId", this.skuId);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipMsc2mOrderApiSettlementResponse> getResponseClass() {
      return YipMsc2mOrderApiSettlementResponse.class;
   }
}
