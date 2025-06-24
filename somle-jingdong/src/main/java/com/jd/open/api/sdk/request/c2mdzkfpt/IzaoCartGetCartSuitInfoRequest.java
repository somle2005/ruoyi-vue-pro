package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.IzaoCartGetCartSuitInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IzaoCartGetCartSuitInfoRequest extends AbstractRequest implements JdRequest<IzaoCartGetCartSuitInfoResponse> {
   private String suitInfoId;
   private String vendorId;

   public void setSuitInfoId(String suitInfoId) {
      this.suitInfoId = suitInfoId;
   }

   public String getSuitInfoId() {
      return this.suitInfoId;
   }

   public void setVendorId(String vendorId) {
      this.vendorId = vendorId;
   }

   public String getVendorId() {
      return this.vendorId;
   }

   public String getApiMethod() {
      return "jingdong.izao.cart.getCartSuitInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("suitInfoId", this.suitInfoId);
      pmap.put("vendorId", this.vendorId);
      return JsonUtil.toJson(pmap);
   }

   public Class<IzaoCartGetCartSuitInfoResponse> getResponseClass() {
      return IzaoCartGetCartSuitInfoResponse.class;
   }
}
