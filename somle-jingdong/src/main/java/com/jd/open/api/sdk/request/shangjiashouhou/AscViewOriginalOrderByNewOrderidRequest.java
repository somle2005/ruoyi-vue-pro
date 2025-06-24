package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscViewOriginalOrderByNewOrderidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscViewOriginalOrderByNewOrderidRequest extends AbstractRequest implements JdRequest<AscViewOriginalOrderByNewOrderidResponse> {
   private Long orderId;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.asc.view.originalOrderByNewOrderid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscViewOriginalOrderByNewOrderidResponse> getResponseClass() {
      return AscViewOriginalOrderByNewOrderidResponse.class;
   }
}
