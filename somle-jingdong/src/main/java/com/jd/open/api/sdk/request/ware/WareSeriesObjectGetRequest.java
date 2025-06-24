package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSeriesObjectGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSeriesObjectGetRequest extends AbstractRequest implements JdRequest<WareSeriesObjectGetResponse> {
   private Long seriesProductId;

   public void setSeriesProductId(Long seriesProductId) {
      this.seriesProductId = seriesProductId;
   }

   public Long getSeriesProductId() {
      return this.seriesProductId;
   }

   public String getApiMethod() {
      return "jingdong.ware.series.object.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("seriesProductId", this.seriesProductId);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSeriesObjectGetResponse> getResponseClass() {
      return WareSeriesObjectGetResponse.class;
   }
}
