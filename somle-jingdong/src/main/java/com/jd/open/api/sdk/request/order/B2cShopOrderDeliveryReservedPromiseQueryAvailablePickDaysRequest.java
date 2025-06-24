package com.jd.open.api.sdk.request.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.ReservedPromiseTemplateJosService.request.queryAvailablePickDays.AvailablePickDaysQueries;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.B2cShopOrderDeliveryReservedPromiseQueryAvailablePickDaysResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2cShopOrderDeliveryReservedPromiseQueryAvailablePickDaysRequest extends AbstractRequest implements JdRequest<B2cShopOrderDeliveryReservedPromiseQueryAvailablePickDaysResponse> {
   private AvailablePickDaysQueries param;

   public String getApiMethod() {
      return "jingdong.b2c.shop.order.delivery.reservedPromise.queryAvailablePickDays";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2cShopOrderDeliveryReservedPromiseQueryAvailablePickDaysResponse> getResponseClass() {
      return B2cShopOrderDeliveryReservedPromiseQueryAvailablePickDaysResponse.class;
   }

   @JsonProperty("param")
   public void setParam(AvailablePickDaysQueries param) {
      this.param = param;
   }

   @JsonProperty("param")
   public AvailablePickDaysQueries getParam() {
      return this.param;
   }
}
