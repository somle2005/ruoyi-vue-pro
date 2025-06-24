package com.jd.open.api.sdk.request.stock;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.stock.StoreQueryStoreHouseRentlistResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StoreQueryStoreHouseRentlistRequest extends AbstractRequest implements JdRequest<StoreQueryStoreHouseRentlistResponse> {
   private Integer page;
   private Integer pageSize;

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.store.queryStoreHouseRentlist";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("page", this.page);
      pmap.put("page_size", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<StoreQueryStoreHouseRentlistResponse> getResponseClass() {
      return StoreQueryStoreHouseRentlistResponse.class;
   }
}
