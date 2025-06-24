package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.IzaoCartGetCartInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IzaoCartGetCartInfoRequest extends AbstractRequest implements JdRequest<IzaoCartGetCartInfoResponse> {
   private String customInfoId;
   private Integer cartType;
   private String venderId;

   public void setCustomInfoId(String customInfoId) {
      this.customInfoId = customInfoId;
   }

   public String getCustomInfoId() {
      return this.customInfoId;
   }

   public void setCartType(Integer cartType) {
      this.cartType = cartType;
   }

   public Integer getCartType() {
      return this.cartType;
   }

   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   public String getVenderId() {
      return this.venderId;
   }

   public String getApiMethod() {
      return "jingdong.izao.cart.getCartInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customInfoId", this.customInfoId);
      pmap.put("cartType", this.cartType);
      pmap.put("venderId", this.venderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<IzaoCartGetCartInfoResponse> getResponseClass() {
      return IzaoCartGetCartInfoResponse.class;
   }
}
