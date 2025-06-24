package com.jd.open.api.sdk.request.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.SalesReturnOrderQueryJosApi.request.query.SalesReturnOrderParamDto;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcrmaDirectreturnSalesreturnorderQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcrmaDirectreturnSalesreturnorderQueryRequest extends AbstractRequest implements JdRequest<VcrmaDirectreturnSalesreturnorderQueryResponse> {
   private SalesReturnOrderParamDto requestParam;

   public String getApiMethod() {
      return "jingdong.vcrma.directreturn.salesreturnorder.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("requestParam", this.requestParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcrmaDirectreturnSalesreturnorderQueryResponse> getResponseClass() {
      return VcrmaDirectreturnSalesreturnorderQueryResponse.class;
   }

   @JsonProperty("requestParam")
   public void setRequestParam(SalesReturnOrderParamDto requestParam) {
      this.requestParam = requestParam;
   }

   @JsonProperty("requestParam")
   public SalesReturnOrderParamDto getRequestParam() {
      return this.requestParam;
   }
}
