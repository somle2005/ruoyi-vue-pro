package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderQueryStoreCoverageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderQueryStoreCoverageRequest extends AbstractRequest implements JdRequest<MedicineDsOrderQueryStoreCoverageResponse> {
   private String storeId;

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.queryStoreCoverage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderQueryStoreCoverageResponse> getResponseClass() {
      return MedicineDsOrderQueryStoreCoverageResponse.class;
   }
}
