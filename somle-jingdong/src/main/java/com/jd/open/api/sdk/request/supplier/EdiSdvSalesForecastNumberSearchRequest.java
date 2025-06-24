package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiSdvSalesForecastNumberSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EdiSdvSalesForecastNumberSearchRequest extends AbstractRequest implements JdRequest<EdiSdvSalesForecastNumberSearchResponse> {
   private int page;
   private int pageSize;

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.edi.sdv.sales.forecast.number.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiSdvSalesForecastNumberSearchResponse> getResponseClass() {
      return EdiSdvSalesForecastNumberSearchResponse.class;
   }
}
