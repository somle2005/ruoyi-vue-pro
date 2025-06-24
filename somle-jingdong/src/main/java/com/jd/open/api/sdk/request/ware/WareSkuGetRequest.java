package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSkuGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSkuGetRequest extends AbstractRequest implements JdRequest<WareSkuGetResponse> {
   private String skuId;
   private String fields;

   public String getApiMethod() {
      return "360buy.ware.sku.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sku_id", this.skuId);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSkuGetResponse> getResponseClass() {
      return WareSkuGetResponse.class;
   }

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }
}
