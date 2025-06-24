package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.IzaoCustomizeGetSkuBindInfoWithBizIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IzaoCustomizeGetSkuBindInfoWithBizIdRequest extends AbstractRequest implements JdRequest<IzaoCustomizeGetSkuBindInfoWithBizIdResponse> {
   private String skuId;
   private String venderId;
   private String businessId;

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

   public void setBusinessId(String businessId) {
      this.businessId = businessId;
   }

   public String getBusinessId() {
      return this.businessId;
   }

   public String getApiMethod() {
      return "jingdong.izao.customize.getSkuBindInfoWithBizId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("venderId", this.venderId);
      pmap.put("businessId", this.businessId);
      return JsonUtil.toJson(pmap);
   }

   public Class<IzaoCustomizeGetSkuBindInfoWithBizIdResponse> getResponseClass() {
      return IzaoCustomizeGetSkuBindInfoWithBizIdResponse.class;
   }
}
