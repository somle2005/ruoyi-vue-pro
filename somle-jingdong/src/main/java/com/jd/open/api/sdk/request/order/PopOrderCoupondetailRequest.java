package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderCoupondetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderCoupondetailRequest extends AbstractRequest implements JdRequest<PopOrderCoupondetailResponse> {
   private Long orderId;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.coupondetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderCoupondetailResponse> getResponseClass() {
      return PopOrderCoupondetailResponse.class;
   }
}
