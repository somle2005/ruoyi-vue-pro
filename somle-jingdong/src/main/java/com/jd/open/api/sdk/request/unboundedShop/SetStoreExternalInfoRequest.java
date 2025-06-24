package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.SetStoreExternalInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SetStoreExternalInfoRequest extends AbstractRequest implements JdRequest<SetStoreExternalInfoResponse> {
   private Long storeId;
   private String weightLimit;

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setWeightLimit(String weightLimit) {
      this.weightLimit = weightLimit;
   }

   public String getWeightLimit() {
      return this.weightLimit;
   }

   public String getApiMethod() {
      return "jingdong.setStoreExternalInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("storeId", this.storeId);
      pmap.put("weightLimit", this.weightLimit);
      return JsonUtil.toJson(pmap);
   }

   public Class<SetStoreExternalInfoResponse> getResponseClass() {
      return SetStoreExternalInfoResponse.class;
   }
}
