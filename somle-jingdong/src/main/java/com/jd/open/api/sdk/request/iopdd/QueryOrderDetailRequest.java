package com.jd.open.api.sdk.request.iopdd;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.iopdd.QueryOrderDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryOrderDetailRequest extends AbstractRequest implements JdRequest<QueryOrderDetailResponse> {
   private String thirdOrderId;
   private Long jdOrderId;

   public void setThirdOrderId(String thirdOrderId) {
      this.thirdOrderId = thirdOrderId;
   }

   public String getThirdOrderId() {
      return this.thirdOrderId;
   }

   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   public String getApiMethod() {
      return "jingdong.queryOrderDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("thirdOrderId", this.thirdOrderId);
      pmap.put("jdOrderId", this.jdOrderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryOrderDetailResponse> getResponseClass() {
      return QueryOrderDetailResponse.class;
   }
}
