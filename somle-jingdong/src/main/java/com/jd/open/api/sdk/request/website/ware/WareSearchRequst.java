package com.jd.open.api.sdk.request.website.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.ware.WareSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSearchRequst extends AbstractRequest implements JdRequest<WareSearchResponse> {
   private String cid;
   private String q;
   private String page;
   private String pageSize;
   private String fields;

   public String getApiMethod() {
      return "jingdong.wares.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid", this.cid);
      pmap.put("q", this.q);
      pmap.put("page", this.page);
      pmap.put("page_size", this.pageSize);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSearchResponse> getResponseClass() {
      return WareSearchResponse.class;
   }

   @JsonProperty("cid")
   public String getCid() {
      return this.cid;
   }

   @JsonProperty("cid")
   public void setCid(String cid) {
      this.cid = cid;
   }

   @JsonProperty("q")
   public String getQ() {
      return this.q;
   }

   @JsonProperty("q")
   public void setQ(String q) {
      this.q = q;
   }

   @JsonProperty("page")
   public String getPage() {
      return this.page;
   }

   @JsonProperty("page")
   public void setPage(String page) {
      this.page = page;
   }

   @JsonProperty("page_size")
   public String getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("page_size")
   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("fields")
   public String getFields() {
      return this.fields;
   }

   @JsonProperty("fields")
   public void setFields(String fields) {
      this.fields = fields;
   }
}
