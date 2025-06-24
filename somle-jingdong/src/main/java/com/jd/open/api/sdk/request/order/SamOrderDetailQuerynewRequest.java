package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.SamOrderDetailQuerynewResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SamOrderDetailQuerynewRequest extends AbstractRequest implements JdRequest<SamOrderDetailQuerynewResponse> {
   private String orderId;

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.sam.order.detail.querynew";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SamOrderDetailQuerynewResponse> getResponseClass() {
      return SamOrderDetailQuerynewResponse.class;
   }
}
