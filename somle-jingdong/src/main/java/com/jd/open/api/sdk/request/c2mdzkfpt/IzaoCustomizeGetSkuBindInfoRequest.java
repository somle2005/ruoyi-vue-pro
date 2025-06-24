package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.IzaoCustomizeGetSkuBindInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IzaoCustomizeGetSkuBindInfoRequest extends AbstractRequest implements JdRequest<IzaoCustomizeGetSkuBindInfoResponse> {
   private String skuId;
   private String venderId;

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   public String getVenderId() {
      return this.venderId;
   }

   public String getApiMethod() {
      return "jingdong.izao.customize.getSkuBindInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("venderId", this.venderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<IzaoCustomizeGetSkuBindInfoResponse> getResponseClass() {
      return IzaoCustomizeGetSkuBindInfoResponse.class;
   }
}
