package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bOrderLogisticsGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bOrderLogisticsGetRequest extends AbstractRequest implements JdRequest<B2bOrderLogisticsGetResponse> {
   private Long jdOrderId;

   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   public String getApiMethod() {
      return "jingdong.b2b.order.logistics.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("jdOrderId", this.jdOrderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bOrderLogisticsGetResponse> getResponseClass() {
      return B2bOrderLogisticsGetResponse.class;
   }
}
