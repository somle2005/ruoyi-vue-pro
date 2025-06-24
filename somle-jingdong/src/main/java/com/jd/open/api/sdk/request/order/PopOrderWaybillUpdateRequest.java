package com.jd.open.api.sdk.request.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.WaybillJosService.request.update.JosRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderWaybillUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderWaybillUpdateRequest extends AbstractRequest implements JdRequest<PopOrderWaybillUpdateResponse> {
   private JosRequest request;

   public String getApiMethod() {
      return "jingdong.pop.order.waybill.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderWaybillUpdateResponse> getResponseClass() {
      return PopOrderWaybillUpdateResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(JosRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public JosRequest getRequest() {
      return this.request;
   }
}
