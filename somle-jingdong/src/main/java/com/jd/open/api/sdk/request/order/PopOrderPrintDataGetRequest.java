package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderPrintDataGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderPrintDataGetRequest extends AbstractRequest implements JdRequest<PopOrderPrintDataGetResponse> {
   private String orderId;

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.print.data.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_id", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderPrintDataGetResponse> getResponseClass() {
      return PopOrderPrintDataGetResponse.class;
   }
}
