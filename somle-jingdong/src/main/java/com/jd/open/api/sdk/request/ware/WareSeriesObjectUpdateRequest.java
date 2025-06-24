package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSeriesObjectUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSeriesObjectUpdateRequest extends AbstractRequest implements JdRequest<WareSeriesObjectUpdateResponse> {
   private String seriesName;
   private Long seriesProductId;

   public void setSeriesName(String seriesName) {
      this.seriesName = seriesName;
   }

   public String getSeriesName() {
      return this.seriesName;
   }

   public void setSeriesProductId(Long seriesProductId) {
      this.seriesProductId = seriesProductId;
   }

   public Long getSeriesProductId() {
      return this.seriesProductId;
   }

   public String getApiMethod() {
      return "jingdong.ware.series.object.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("seriesName", this.seriesName);
      pmap.put("seriesProductId", this.seriesProductId);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSeriesObjectUpdateResponse> getResponseClass() {
      return WareSeriesObjectUpdateResponse.class;
   }
}
