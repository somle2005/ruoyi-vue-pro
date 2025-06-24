package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipCustomizedGetCustomInstanceIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipCustomizedGetCustomInstanceIdRequest extends AbstractRequest implements JdRequest<YipCustomizedGetCustomInstanceIdResponse> {
   private String rawUserKey;
   private String skuId;

   public void setRawUserKey(String rawUserKey) {
      this.rawUserKey = rawUserKey;
   }

   public String getRawUserKey() {
      return this.rawUserKey;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.yip.customized.getCustomInstanceId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("rawUserKey", this.rawUserKey);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipCustomizedGetCustomInstanceIdResponse> getResponseClass() {
      return YipCustomizedGetCustomInstanceIdResponse.class;
   }
}
