package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderQueryCouponDetaiResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderQueryCouponDetaiRequest extends AbstractRequest implements JdRequest<PopOrderQueryCouponDetaiResponse> {
   private Long orderId;
   private boolean queryPromoFlag;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setQueryPromoFlag(boolean queryPromoFlag) {
      this.queryPromoFlag = queryPromoFlag;
   }

   public boolean getQueryPromoFlag() {
      return this.queryPromoFlag;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.queryCouponDetai";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("queryPromoFlag", this.queryPromoFlag);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderQueryCouponDetaiResponse> getResponseClass() {
      return PopOrderQueryCouponDetaiResponse.class;
   }
}
