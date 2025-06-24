package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SkuWriteMergeSkuFeaturesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SkuWriteMergeSkuFeaturesRequest extends AbstractRequest implements JdRequest<SkuWriteMergeSkuFeaturesResponse> {
   private Long skuId;
   private String featureKey;
   private String featureValue;

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setFeatureKey(String featureKey) {
      this.featureKey = featureKey;
   }

   public String getFeatureKey() {
      return this.featureKey;
   }

   public void setFeatureValue(String featureValue) {
      this.featureValue = featureValue;
   }

   public String getFeatureValue() {
      return this.featureValue;
   }

   public String getApiMethod() {
      return "jingdong.sku.write.mergeSkuFeatures";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("featureKey", this.featureKey);
      pmap.put("featureValue", this.featureValue);
      return JsonUtil.toJson(pmap);
   }

   public Class<SkuWriteMergeSkuFeaturesResponse> getResponseClass() {
      return SkuWriteMergeSkuFeaturesResponse.class;
   }
}
