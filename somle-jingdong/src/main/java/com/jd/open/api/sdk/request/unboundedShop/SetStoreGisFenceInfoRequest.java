package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.SetStoreGisFenceInfoResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class SetStoreGisFenceInfoRequest extends AbstractRequest implements JdRequest<SetStoreGisFenceInfoResponse> {
   private BigDecimal kilometres;
   private String vertexs;
   private Long storeId;

   public void setKilometres(BigDecimal kilometres) {
      this.kilometres = kilometres;
   }

   public BigDecimal getKilometres() {
      return this.kilometres;
   }

   public void setVertexs(String vertexs) {
      this.vertexs = vertexs;
   }

   public String getVertexs() {
      return this.vertexs;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.setStoreGisFenceInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("kilometres", this.kilometres);
      pmap.put("vertexs", this.vertexs);
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SetStoreGisFenceInfoResponse> getResponseClass() {
      return SetStoreGisFenceInfoResponse.class;
   }
}
