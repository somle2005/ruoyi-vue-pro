package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderOrderDeleteApplyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderOrderDeleteApplyRequest extends AbstractRequest implements JdRequest<OrderOrderDeleteApplyResponse> {
   private long orderId;
   private int delApplyType;
   private String delApplyReason;

   public void setOrderId(long orderId) {
      this.orderId = orderId;
   }

   public long getOrderId() {
      return this.orderId;
   }

   public void setDelApplyType(int delApplyType) {
      this.delApplyType = delApplyType;
   }

   public int getDelApplyType() {
      return this.delApplyType;
   }

   public void setDelApplyReason(String delApplyReason) {
      this.delApplyReason = delApplyReason;
   }

   public String getDelApplyReason() {
      return this.delApplyReason;
   }

   public String getApiMethod() {
      return "jingdong.order.orderDelete.apply";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_id", this.orderId);
      pmap.put("del_apply_type", this.delApplyType);
      pmap.put("del_apply_reason", this.delApplyReason);
      return JsonUtil.toJson(pmap);
   }

   public Class<OrderOrderDeleteApplyResponse> getResponseClass() {
      return OrderOrderDeleteApplyResponse.class;
   }
}
