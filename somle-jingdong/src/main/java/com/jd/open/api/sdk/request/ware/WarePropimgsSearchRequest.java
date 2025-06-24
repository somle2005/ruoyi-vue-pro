package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WarePropimgsSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarePropimgsSearchRequest extends AbstractRequest implements JdRequest<WarePropimgsSearchResponse> {
   private String wareId;
   private String page;
   private String pageSize;
   private String fields;

   public String getApiMethod() {
      return "360buy.ware.propimgs.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("page", this.page);
      pmap.put("page_size", this.pageSize);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<WarePropimgsSearchResponse> getResponseClass() {
      return WarePropimgsSearchResponse.class;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getPage() {
      return this.page;
   }

   public void setPage(String page) {
      this.page = page;
   }

   public String getPageSize() {
      return this.pageSize;
   }

   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }
}
