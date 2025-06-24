package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSeriesObjectAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSeriesObjectAddRequest extends AbstractRequest implements JdRequest<WareSeriesObjectAddResponse> {
   private String seriesName;
   private Long brandId;
   private Long categoryId;

   public void setSeriesName(String seriesName) {
      this.seriesName = seriesName;
   }

   public String getSeriesName() {
      return this.seriesName;
   }

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public String getApiMethod() {
      return "jingdong.ware.series.object.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("seriesName", this.seriesName);
      pmap.put("brandId", this.brandId);
      pmap.put("categoryId", this.categoryId);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSeriesObjectAddResponse> getResponseClass() {
      return WareSeriesObjectAddResponse.class;
   }
}
