package com.jd.open.api.sdk.request.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.ReservedPromiseTemplateJosService.request.queryPromiseTemplates.TemplateQueries;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.B2cShopOrderDeliveryReservedPromiseQueryPromiseTemplatesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2cShopOrderDeliveryReservedPromiseQueryPromiseTemplatesRequest extends AbstractRequest implements JdRequest<B2cShopOrderDeliveryReservedPromiseQueryPromiseTemplatesResponse> {
   private TemplateQueries param;

   public String getApiMethod() {
      return "jingdong.b2c.shop.order.delivery.reservedPromise.queryPromiseTemplates";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2cShopOrderDeliveryReservedPromiseQueryPromiseTemplatesResponse> getResponseClass() {
      return B2cShopOrderDeliveryReservedPromiseQueryPromiseTemplatesResponse.class;
   }

   @JsonProperty("param")
   public void setParam(TemplateQueries param) {
      this.param = param;
   }

   @JsonProperty("param")
   public TemplateQueries getParam() {
      return this.param;
   }
}
