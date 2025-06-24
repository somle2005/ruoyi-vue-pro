package com.jd.open.api.sdk.request.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ReturnExecuteOrderHandlerJosApi.request.callWaybillByVc.ReturnExecuteOrderCallLogisticsDto;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcrmaDirectreturnExecuteorderCallWaybillByVcResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcrmaDirectreturnExecuteorderCallWaybillByVcRequest extends AbstractRequest implements JdRequest<VcrmaDirectreturnExecuteorderCallWaybillByVcResponse> {
   private ReturnExecuteOrderCallLogisticsDto requestParam;

   public String getApiMethod() {
      return "jingdong.vcrma.directreturn.executeorder.callWaybillByVc";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("requestParam", this.requestParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcrmaDirectreturnExecuteorderCallWaybillByVcResponse> getResponseClass() {
      return VcrmaDirectreturnExecuteorderCallWaybillByVcResponse.class;
   }

   @JsonProperty("requestParam")
   public void setRequestParam(ReturnExecuteOrderCallLogisticsDto requestParam) {
      this.requestParam = requestParam;
   }

   @JsonProperty("requestParam")
   public ReturnExecuteOrderCallLogisticsDto getRequestParam() {
      return this.requestParam;
   }
}
