package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderGetmobilelistResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderGetmobilelistRequest extends AbstractRequest implements JdRequest<PopOrderGetmobilelistResponse> {
   private String appName;
   private String region;
   private String orderId;
   private Integer expiration;
   private String orderType;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setRegion(String region) {
      this.region = region;
   }

   public String getRegion() {
      return this.region;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setExpiration(Integer expiration) {
      this.expiration = expiration;
   }

   public Integer getExpiration() {
      return this.expiration;
   }

   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   public String getOrderType() {
      return this.orderType;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.getmobilelist";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("region", this.region);
      pmap.put("orderId", this.orderId);
      pmap.put("expiration", this.expiration);
      pmap.put("orderType", this.orderType);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderGetmobilelistResponse> getResponseClass() {
      return PopOrderGetmobilelistResponse.class;
   }
}
