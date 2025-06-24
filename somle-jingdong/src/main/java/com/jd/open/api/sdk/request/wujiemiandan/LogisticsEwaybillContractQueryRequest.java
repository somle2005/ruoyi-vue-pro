package com.jd.open.api.sdk.request.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.QueryContractApi.request.query.QueryContractRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LogisticsEwaybillContractQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsEwaybillContractQueryRequest extends AbstractRequest implements JdRequest<LogisticsEwaybillContractQueryResponse> {
   private QueryContractRequest request;

   public String getApiMethod() {
      return "jingdong.logistics.ewaybill.contract.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsEwaybillContractQueryResponse> getResponseClass() {
      return LogisticsEwaybillContractQueryResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(QueryContractRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public QueryContractRequest getRequest() {
      return this.request;
   }
}
