package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSeriesProductRelationDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSeriesProductRelationDeleteRequest extends AbstractRequest implements JdRequest<WareSeriesProductRelationDeleteResponse> {
   private String productId;
   private Long seriesProductId;

   public void setProductId(String productId) {
      this.productId = productId;
   }

   public String getProductId() {
      return this.productId;
   }

   public void setSeriesProductId(Long seriesProductId) {
      this.seriesProductId = seriesProductId;
   }

   public Long getSeriesProductId() {
      return this.seriesProductId;
   }

   public String getApiMethod() {
      return "jingdong.ware.series.productRelation.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("productId", this.productId);
      pmap.put("seriesProductId", this.seriesProductId);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSeriesProductRelationDeleteResponse> getResponseClass() {
      return WareSeriesProductRelationDeleteResponse.class;
   }
}
