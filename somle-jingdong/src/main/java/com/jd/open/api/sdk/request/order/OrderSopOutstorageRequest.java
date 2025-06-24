package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderSopOutstorageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderSopOutstorageRequest extends AbstractRequest implements JdRequest<OrderSopOutstorageResponse> {
   private String logisticsId;
   private String waybill;
   private String orderId;
   private String tradeNo;

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }

   public String getApiMethod() {
      return "360buy.order.sop.outstorage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("order_id", this.orderId);
      map.put("trade_no", this.tradeNo);
      map.put("logistics_id", this.logisticsId);
      map.put("waybill", this.waybill);
      return JsonUtil.toJson(map);
   }

   public Class<OrderSopOutstorageResponse> getResponseClass() {
      return OrderSopOutstorageResponse.class;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getLogisticsId() {
      return this.logisticsId;
   }

   public void setLogisticsId(String logisticsId) {
      this.logisticsId = logisticsId;
   }

   public String getWaybill() {
      return this.waybill;
   }

   public void setWaybill(String waybill) {
      this.waybill = waybill;
   }
}
