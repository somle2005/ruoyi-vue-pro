package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderSoplWaybillUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderSoplWaybillUpdateRequest extends AbstractRequest implements JdRequest<OrderSoplWaybillUpdateResponse> {
   private String orderId;
   private String logisticsId;
   private String waybill;
   private String tradeNo;

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }

   public String getApiMethod() {
      return "360buy.order.sopl.waybill.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("order_id", this.orderId);
      map.put("logistics_id", this.logisticsId);
      map.put("waybill", this.waybill);
      map.put("trade_no", this.tradeNo);
      return JsonUtil.toJson(map);
   }

   public Class<OrderSoplWaybillUpdateResponse> getResponseClass() {
      return OrderSoplWaybillUpdateResponse.class;
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
