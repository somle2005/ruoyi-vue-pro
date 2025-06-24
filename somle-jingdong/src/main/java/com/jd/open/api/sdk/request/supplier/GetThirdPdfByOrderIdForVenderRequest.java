package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.GetThirdPdfByOrderIdForVenderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GetThirdPdfByOrderIdForVenderRequest extends AbstractRequest implements JdRequest<GetThirdPdfByOrderIdForVenderResponse> {
   private Long orderId;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.getThirdPdfByOrderIdForVender";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<GetThirdPdfByOrderIdForVenderResponse> getResponseClass() {
      return GetThirdPdfByOrderIdForVenderResponse.class;
   }
}
