package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.VenderAuthFindUserResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderAuthFindUserRequest extends AbstractRequest implements JdRequest<VenderAuthFindUserResponse> {
   private String pin;
   private String openIdSeller;
   private String xidSeller;

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setOpenIdSeller(String openIdSeller) {
      this.openIdSeller = openIdSeller;
   }

   public String getOpenIdSeller() {
      return this.openIdSeller;
   }

   public void setXidSeller(String xidSeller) {
      this.xidSeller = xidSeller;
   }

   public String getXidSeller() {
      return this.xidSeller;
   }

   public String getApiMethod() {
      return "jingdong.vender.auth.findUser";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pin", this.pin);
      pmap.put("open_id_seller", this.openIdSeller);
      pmap.put("xid_seller", this.xidSeller);
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderAuthFindUserResponse> getResponseClass() {
      return VenderAuthFindUserResponse.class;
   }
}
