package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeInsuranceSearchJdPassiveOrdersResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeInsuranceSearchJdPassiveOrdersRequest extends AbstractRequest implements JdRequest<UeInsuranceSearchJdPassiveOrdersResponse> {
   private String appId;
   private long pageSize;
   private long page;

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setPageSize(long pageSize) {
      this.pageSize = pageSize;
   }

   public long getPageSize() {
      return this.pageSize;
   }

   public void setPage(long page) {
      this.page = page;
   }

   public long getPage() {
      return this.page;
   }

   public String getApiMethod() {
      return "jingdong.ue.insurance.searchJdPassiveOrders";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("pageSize", this.pageSize);
      pmap.put("page", this.page);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeInsuranceSearchJdPassiveOrdersResponse> getResponseClass() {
      return UeInsuranceSearchJdPassiveOrdersResponse.class;
   }
}
