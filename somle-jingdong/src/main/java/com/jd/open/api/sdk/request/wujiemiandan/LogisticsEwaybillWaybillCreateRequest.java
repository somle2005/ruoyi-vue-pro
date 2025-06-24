package com.jd.open.api.sdk.request.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.request.create.WaybillReceiveRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LogisticsEwaybillWaybillCreateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsEwaybillWaybillCreateRequest extends AbstractRequest implements JdRequest<LogisticsEwaybillWaybillCreateResponse> {
   private WaybillReceiveRequest request;

   public String getApiMethod() {
      return "jingdong.logistics.ewaybill.waybill.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsEwaybillWaybillCreateResponse> getResponseClass() {
      return LogisticsEwaybillWaybillCreateResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(WaybillReceiveRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public WaybillReceiveRequest getRequest() {
      return this.request;
   }
}
