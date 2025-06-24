package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewExtsearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewExtsearchRequest extends AbstractRequest implements JdRequest<UeOrderNewExtsearchResponse> {
   private int pageSize;
   private String venderCode;
   private String appid;
   private int page;

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.extsearch";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageSize", this.pageSize);
      pmap.put("venderCode", this.venderCode);
      pmap.put("appid", this.appid);
      pmap.put("page", this.page);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewExtsearchResponse> getResponseClass() {
      return UeOrderNewExtsearchResponse.class;
   }
}
