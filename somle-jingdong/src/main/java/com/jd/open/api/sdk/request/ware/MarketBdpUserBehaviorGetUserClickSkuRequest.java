package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.MarketBdpUserBehaviorGetUserClickSkuResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketBdpUserBehaviorGetUserClickSkuRequest extends AbstractRequest implements JdRequest<MarketBdpUserBehaviorGetUserClickSkuResponse> {
   private String pin;
   private String openIdBuyer;
   private String xidBuyer;

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
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
      return "jingdong.market.bdp.userBehavior.getUserClickSku";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pin", this.pin);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketBdpUserBehaviorGetUserClickSkuResponse> getResponseClass() {
      return MarketBdpUserBehaviorGetUserClickSkuResponse.class;
   }
}
