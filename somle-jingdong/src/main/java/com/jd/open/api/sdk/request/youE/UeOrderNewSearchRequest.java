package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewSearchRequest extends AbstractRequest implements JdRequest<UeOrderNewSearchResponse> {
   private String venderCode;
   private String appid;
   private int pageSize;
   private int page;
   private int serviceTypeId;

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

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setServiceTypeId(int serviceTypeId) {
      this.serviceTypeId = serviceTypeId;
   }

   public int getServiceTypeId() {
      return this.serviceTypeId;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("appid", this.appid);
      pmap.put("pageSize", this.pageSize);
      pmap.put("page", this.page);
      pmap.put("serviceTypeId", this.serviceTypeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewSearchResponse> getResponseClass() {
      return UeOrderNewSearchResponse.class;
   }
}
