package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderQueryOrderStatusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderQueryOrderStatusRequest extends AbstractRequest implements JdRequest<EclpOrderQueryOrderStatusResponse> {
   private String eclpSoNo;

   public void setEclpSoNo(String eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   public String getEclpSoNo() {
      return this.eclpSoNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.queryOrderStatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("eclpSoNo", this.eclpSoNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderQueryOrderStatusResponse> getResponseClass() {
      return EclpOrderQueryOrderStatusResponse.class;
   }
}
