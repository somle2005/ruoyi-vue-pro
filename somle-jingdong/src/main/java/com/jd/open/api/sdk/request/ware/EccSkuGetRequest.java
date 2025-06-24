package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.EccSkuGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccSkuGetRequest extends AbstractRequest implements JdRequest<EccSkuGetResponse> {
   private Long skuId;

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.ecc.sku.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sku_id", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EccSkuGetResponse> getResponseClass() {
      return EccSkuGetResponse.class;
   }
}
