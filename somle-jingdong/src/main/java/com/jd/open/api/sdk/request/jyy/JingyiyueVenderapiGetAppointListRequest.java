package com.jd.open.api.sdk.request.jyy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jyy.VenderAppointOrderFacade.request.getAppointList.AppointListQueryRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jyy.JingyiyueVenderapiGetAppointListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JingyiyueVenderapiGetAppointListRequest extends AbstractRequest implements JdRequest<JingyiyueVenderapiGetAppointListResponse> {
   private AppointListQueryRequest request;

   public String getApiMethod() {
      return "jingdong.jingyiyue.venderapi.getAppointList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<JingyiyueVenderapiGetAppointListResponse> getResponseClass() {
      return JingyiyueVenderapiGetAppointListResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(AppointListQueryRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public AppointListQueryRequest getRequest() {
      return this.request;
   }
}
