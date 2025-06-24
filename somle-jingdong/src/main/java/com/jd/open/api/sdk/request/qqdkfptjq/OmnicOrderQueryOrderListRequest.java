package com.jd.open.api.sdk.request.qqdkfptjq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.qqdkfptjq.OmnicOmcJosService.request.orderList.OmcJosRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicOrderQueryOrderListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OmnicOrderQueryOrderListRequest extends AbstractRequest implements JdRequest<OmnicOrderQueryOrderListResponse> {
   private OmcJosRequest request;

   public String getApiMethod() {
      return "jingdong.omnic.order.query.orderList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicOrderQueryOrderListResponse> getResponseClass() {
      return OmnicOrderQueryOrderListResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(OmcJosRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public OmcJosRequest getRequest() {
      return this.request;
   }
}
