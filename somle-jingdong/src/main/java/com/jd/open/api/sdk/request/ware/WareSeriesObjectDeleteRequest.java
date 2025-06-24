package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSeriesObjectDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSeriesObjectDeleteRequest extends AbstractRequest implements JdRequest<WareSeriesObjectDeleteResponse> {
   private Long seriesProductId;

   public void setSeriesProductId(Long seriesProductId) {
      this.seriesProductId = seriesProductId;
   }

   public Long getSeriesProductId() {
      return this.seriesProductId;
   }

   public String getApiMethod() {
      return "jingdong.ware.series.object.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("seriesProductId", this.seriesProductId);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSeriesObjectDeleteResponse> getResponseClass() {
      return WareSeriesObjectDeleteResponse.class;
   }
}
