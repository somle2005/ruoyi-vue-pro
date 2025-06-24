package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderSetStoreCoverageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderSetStoreCoverageRequest extends AbstractRequest implements JdRequest<MedicineDsOrderSetStoreCoverageResponse> {
   private String vertexs;
   private String storeId;

   public void setVertexs(String vertexs) {
      this.vertexs = vertexs;
   }

   public String getVertexs() {
      return this.vertexs;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.setStoreCoverage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vertexs", this.vertexs);
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderSetStoreCoverageResponse> getResponseClass() {
      return MedicineDsOrderSetStoreCoverageResponse.class;
   }
}
