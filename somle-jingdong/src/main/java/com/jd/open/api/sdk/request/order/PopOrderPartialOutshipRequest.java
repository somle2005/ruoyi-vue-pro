package com.jd.open.api.sdk.request.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OutShipJosService.request.outship.JosRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderPartialOutshipResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderPartialOutshipRequest extends AbstractRequest implements JdRequest<PopOrderPartialOutshipResponse> {
   private JosRequest request;

   public String getApiMethod() {
      return "jingdong.pop.order.partial.outship";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderPartialOutshipResponse> getResponseClass() {
      return PopOrderPartialOutshipResponse.class;
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
