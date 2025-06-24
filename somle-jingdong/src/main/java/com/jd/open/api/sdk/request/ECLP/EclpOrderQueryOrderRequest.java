package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderQueryOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderQueryOrderRequest extends AbstractRequest implements JdRequest<EclpOrderQueryOrderResponse> {
   private String eclpSoNo;

   public void setEclpSoNo(String eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   public String getEclpSoNo() {
      return this.eclpSoNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.queryOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("eclpSoNo", this.eclpSoNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderQueryOrderResponse> getResponseClass() {
      return EclpOrderQueryOrderResponse.class;
   }
}
