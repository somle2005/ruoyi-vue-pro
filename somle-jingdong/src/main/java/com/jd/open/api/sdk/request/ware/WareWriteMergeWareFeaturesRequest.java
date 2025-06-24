package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareWriteMergeWareFeaturesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareWriteMergeWareFeaturesRequest extends AbstractRequest implements JdRequest<WareWriteMergeWareFeaturesResponse> {
   private Long wareId;
   private String featureKey;
   private String featureValue;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
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
      return "jingdong.ware.write.mergeWareFeatures";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("featureKey", this.featureKey);
      pmap.put("featureValue", this.featureValue);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareWriteMergeWareFeaturesResponse> getResponseClass() {
      return WareWriteMergeWareFeaturesResponse.class;
   }
}
