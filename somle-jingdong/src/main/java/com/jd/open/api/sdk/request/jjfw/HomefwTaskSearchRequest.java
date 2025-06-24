package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskSearchRequest extends AbstractRequest implements JdRequest<HomefwTaskSearchResponse> {
   private Integer page;
   private Integer pageSize;
   private String venderCode;

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

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      pmap.put("venderCode", this.venderCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskSearchResponse> getResponseClass() {
      return HomefwTaskSearchResponse.class;
   }
}
