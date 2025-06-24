package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareDelistingGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareDelistingGetRequest extends AbstractRequest implements JdRequest<WareDelistingGetResponse> {
   private String cid;
   private String page;
   private String pageSize;
   private String endModified;
   private String startModified;
   private String fields;

   public String getApiMethod() {
      return "360buy.ware.delisting.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("page", this.page);
      pmap.put("cid", this.cid);
      pmap.put("page_size", this.pageSize);
      pmap.put("end_modified", this.endModified);
      pmap.put("start_modified", this.startModified);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareDelistingGetResponse> getResponseClass() {
      return WareDelistingGetResponse.class;
   }

   public String getCid() {
      return this.cid;
   }

   public void setCid(String cid) {
      this.cid = cid;
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

   public String getEndModified() {
      return this.endModified;
   }

   public void setEndModified(String endModified) {
      this.endModified = endModified;
   }

   public String getStartModified() {
      return this.startModified;
   }

   public void setStartModified(String startModified) {
      this.startModified = startModified;
   }

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }
}
