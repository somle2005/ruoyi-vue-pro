package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.QueryOrderInfoByLocCodeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryOrderInfoByLocCodeRequest extends AbstractRequest implements JdRequest<QueryOrderInfoByLocCodeResponse> {
   private String couponCode;

   public void setCouponCode(String couponCode) {
      this.couponCode = couponCode;
   }

   public String getCouponCode() {
      return this.couponCode;
   }

   public String getApiMethod() {
      return "jingdong.queryOrderInfoByLocCode";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("couponCode", this.couponCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryOrderInfoByLocCodeResponse> getResponseClass() {
      return QueryOrderInfoByLocCodeResponse.class;
   }
}
