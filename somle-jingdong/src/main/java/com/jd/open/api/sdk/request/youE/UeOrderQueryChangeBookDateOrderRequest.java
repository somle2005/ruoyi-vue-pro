package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderQueryChangeBookDateOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderQueryChangeBookDateOrderRequest extends AbstractRequest implements JdRequest<UeOrderQueryChangeBookDateOrderResponse> {
   private String appId;
   private long page;
   private long pageSize;

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setPage(long page) {
      this.page = page;
   }

   public long getPage() {
      return this.page;
   }

   public void setPageSize(long pageSize) {
      this.pageSize = pageSize;
   }

   public long getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.queryChangeBookDateOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderQueryChangeBookDateOrderResponse> getResponseClass() {
      return UeOrderQueryChangeBookDateOrderResponse.class;
   }
}
