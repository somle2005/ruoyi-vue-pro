package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.BizProgressJsfService.request.dispatchOrder2Engineer.OrderSendEngineerParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeNewSaaSOrderDispatchOrder2EngineerResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeNewSaaSOrderDispatchOrder2EngineerRequest extends AbstractRequest implements JdRequest<UeNewSaaSOrderDispatchOrder2EngineerResponse> {
   private OrderSendEngineerParam orderSendEngineerParam;

   public String getApiMethod() {
      return "jingdong.ue.newSaaSOrder.dispatchOrder2Engineer";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderSendEngineerParam", this.orderSendEngineerParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeNewSaaSOrderDispatchOrder2EngineerResponse> getResponseClass() {
      return UeNewSaaSOrderDispatchOrder2EngineerResponse.class;
   }

   @JsonProperty("orderSendEngineerParam")
   public void setOrderSendEngineerParam(OrderSendEngineerParam orderSendEngineerParam) {
      this.orderSendEngineerParam = orderSendEngineerParam;
   }

   @JsonProperty("orderSendEngineerParam")
   public OrderSendEngineerParam getOrderSendEngineerParam() {
      return this.orderSendEngineerParam;
   }
}
