package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.EccSkuSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccSkuSearchRequest extends AbstractRequest implements JdRequest<EccSkuSearchResponse> {
   private String skuId;

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.ecc.sku.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sku_id", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EccSkuSearchResponse> getResponseClass() {
      return EccSkuSearchResponse.class;
   }
}
