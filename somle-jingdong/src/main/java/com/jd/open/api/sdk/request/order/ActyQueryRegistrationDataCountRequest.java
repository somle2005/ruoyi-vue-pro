package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.ActyQueryRegistrationDataCountResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ActyQueryRegistrationDataCountRequest extends AbstractRequest implements JdRequest<ActyQueryRegistrationDataCountResponse> {
   private Long skuId;
   private Long orderId;
   private String beginDate;
   private String endDate;

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setBeginDate(String beginDate) {
      this.beginDate = beginDate;
   }

   public String getBeginDate() {
      return this.beginDate;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public String getApiMethod() {
      return "jingdong.acty.queryRegistrationDataCount";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("orderId", this.orderId);
      pmap.put("beginDate", this.beginDate);
      pmap.put("endDate", this.endDate);
      return JsonUtil.toJson(pmap);
   }

   public Class<ActyQueryRegistrationDataCountResponse> getResponseClass() {
      return ActyQueryRegistrationDataCountResponse.class;
   }
}
