package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.BizProgressJsfService.request.dispatchOrder2Site.OrderSendSiteParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeNewSaaSOrderDispatchOrder2SiteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeNewSaaSOrderDispatchOrder2SiteRequest extends AbstractRequest implements JdRequest<UeNewSaaSOrderDispatchOrder2SiteResponse> {
   private OrderSendSiteParam orderSendSiteParam;

   public String getApiMethod() {
      return "jingdong.ue.newSaaSOrder.dispatchOrder2Site";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderSendSiteParam", this.orderSendSiteParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeNewSaaSOrderDispatchOrder2SiteResponse> getResponseClass() {
      return UeNewSaaSOrderDispatchOrder2SiteResponse.class;
   }

   @JsonProperty("orderSendSiteParam")
   public void setOrderSendSiteParam(OrderSendSiteParam orderSendSiteParam) {
      this.orderSendSiteParam = orderSendSiteParam;
   }

   @JsonProperty("orderSendSiteParam")
   public OrderSendSiteParam getOrderSendSiteParam() {
      return this.orderSendSiteParam;
   }
}
