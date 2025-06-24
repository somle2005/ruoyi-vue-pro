package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OverseasOrderSopOutstorageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OverseasOrderSopOutstorageRequest extends AbstractRequest implements JdRequest<OverseasOrderSopOutstorageResponse> {
   private String orderId;
   private String tradeNo;

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }

   public String getApiMethod() {
      return "360buy.overseas.order.sop.outstorage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("order_id", this.orderId);
      map.put("trade_no", this.tradeNo);
      return JsonUtil.toJson(map);
   }

   public Class<OverseasOrderSopOutstorageResponse> getResponseClass() {
      return OverseasOrderSopOutstorageResponse.class;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }
}
