package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSeriesProductRelationUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSeriesProductRelationUpdateRequest extends AbstractRequest implements JdRequest<WareSeriesProductRelationUpdateResponse> {
   private Long seriesProductId;
   private String productId;
   private String seriesProductName;
   private String order;

   public void setSeriesProductId(Long seriesProductId) {
      this.seriesProductId = seriesProductId;
   }

   public Long getSeriesProductId() {
      return this.seriesProductId;
   }

   public void setProductId(String productId) {
      this.productId = productId;
   }

   public String getProductId() {
      return this.productId;
   }

   public void setSeriesProductName(String seriesProductName) {
      this.seriesProductName = seriesProductName;
   }

   public String getSeriesProductName() {
      return this.seriesProductName;
   }

   public void setOrder(String order) {
      this.order = order;
   }

   public String getOrder() {
      return this.order;
   }

   public String getApiMethod() {
      return "jingdong.ware.series.productRelation.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("seriesProductId", this.seriesProductId);
      pmap.put("productId", this.productId);
      pmap.put("seriesProductName", this.seriesProductName);
      pmap.put("order", this.order);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSeriesProductRelationUpdateResponse> getResponseClass() {
      return WareSeriesProductRelationUpdateResponse.class;
   }
}
