package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.WarehouseStockinQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarehouseStockinQueryRequest extends AbstractRequest implements JdRequest<WarehouseStockinQueryResponse> {
   private Integer pageIndex;

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public String getApiMethod() {
      return "jingdong.warehouse.stockin.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageIndex", this.pageIndex);
      return JsonUtil.toJson(pmap);
   }

   public Class<WarehouseStockinQueryResponse> getResponseClass() {
      return WarehouseStockinQueryResponse.class;
   }
}
