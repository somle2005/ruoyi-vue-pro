package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.QueryServiceOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryServiceOrderRequest extends AbstractRequest implements JdRequest<QueryServiceOrderResponse> {
   private String orderParam;

   public void setOrderParam(String orderParam) {
      this.orderParam = orderParam;
   }

   public String getOrderParam() {
      return this.orderParam;
   }

   public String getApiMethod() {
      return "jingdong.queryServiceOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderParam", this.orderParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryServiceOrderResponse> getResponseClass() {
      return QueryServiceOrderResponse.class;
   }
}
