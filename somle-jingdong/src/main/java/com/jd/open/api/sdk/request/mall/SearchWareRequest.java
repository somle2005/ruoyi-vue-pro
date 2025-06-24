package com.jd.open.api.sdk.request.mall;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.SearchWareResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SearchWareRequest extends AbstractRequest implements JdRequest<SearchWareResponse> {
   private String key;
   private String filtType;
   private String areaIds;
   private String sortType;
   private String page;
   private String charset;
   private String urlencode;

   public void setKey(String key) {
      this.key = key;
   }

   public String getKey() {
      return this.key;
   }

   public void setFiltType(String filtType) {
      this.filtType = filtType;
   }

   public String getFiltType() {
      return this.filtType;
   }

   public void setAreaIds(String areaIds) {
      this.areaIds = areaIds;
   }

   public String getAreaIds() {
      return this.areaIds;
   }

   public void setSortType(String sortType) {
      this.sortType = sortType;
   }

   public String getSortType() {
      return this.sortType;
   }

   public void setPage(String page) {
      this.page = page;
   }

   public String getPage() {
      return this.page;
   }

   public void setCharset(String charset) {
      this.charset = charset;
   }

   public String getCharset() {
      return this.charset;
   }

   public void setUrlencode(String urlencode) {
      this.urlencode = urlencode;
   }

   public String getUrlencode() {
      return this.urlencode;
   }

   public String getApiMethod() {
      return "jingdong.search.ware";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("key", this.key);
      pmap.put("filt_type", this.filtType);
      pmap.put("area_ids", this.areaIds);
      pmap.put("sort_type", this.sortType);
      pmap.put("page", this.page);
      pmap.put("charset", this.charset);
      pmap.put("urlencode", this.urlencode);
      return JsonUtil.toJson(pmap);
   }

   public Class<SearchWareResponse> getResponseClass() {
      return SearchWareResponse.class;
   }
}
