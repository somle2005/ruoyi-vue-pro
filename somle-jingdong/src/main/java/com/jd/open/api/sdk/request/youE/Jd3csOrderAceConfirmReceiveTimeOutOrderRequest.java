package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.OrderProcessJsfService.request.confirmReceiveTimeOutOrder.PerformParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csOrderAceConfirmReceiveTimeOutOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csOrderAceConfirmReceiveTimeOutOrderRequest extends AbstractRequest implements JdRequest<Jd3csOrderAceConfirmReceiveTimeOutOrderResponse> {
   private PerformParam param;

   public String getApiMethod() {
      return "jingdong.jd3cs.order.ace.confirmReceiveTimeOutOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csOrderAceConfirmReceiveTimeOutOrderResponse> getResponseClass() {
      return Jd3csOrderAceConfirmReceiveTimeOutOrderResponse.class;
   }

   @JsonProperty("param")
   public void setParam(PerformParam param) {
      this.param = param;
   }

   @JsonProperty("param")
   public PerformParam getParam() {
      return this.param;
   }
}
