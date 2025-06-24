package com.jd.open.api.sdk.request.website.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.ware.SkuJdPriceGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SkuJdPriceGetRequest extends AbstractRequest implements JdRequest<SkuJdPriceGetResponse> {
   private String skuId;
   private Integer webSite;
   private Integer origin;

   public String getApiMethod() {
      return "jingdong.sku.jdprice.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sku_id", this.skuId);
      pmap.put("website", this.webSite);
      pmap.put("origin", this.origin);
      return JsonUtil.toJson(pmap);
   }

   public Class<SkuJdPriceGetResponse> getResponseClass() {
      return SkuJdPriceGetResponse.class;
   }

   @JsonProperty("sku_id")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("website")
   public Integer getWebSite() {
      return this.webSite;
   }

   @JsonProperty("website")
   public void setWebSite(Integer webSite) {
      this.webSite = webSite;
   }

   @JsonProperty("origin")
   public Integer getOrigin() {
      return this.origin;
   }

   @JsonProperty("origin")
   public void setOrigin(Integer origin) {
      this.origin = origin;
   }
}
