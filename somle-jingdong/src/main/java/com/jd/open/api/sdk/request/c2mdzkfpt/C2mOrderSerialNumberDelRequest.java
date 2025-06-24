package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SerialNumberOpenService.request.del.SerialNumberQueryEntity;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.C2mOrderSerialNumberDelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class C2mOrderSerialNumberDelRequest extends AbstractRequest implements JdRequest<C2mOrderSerialNumberDelResponse> {
   private SerialNumberQueryEntity param1;

   public String getApiMethod() {
      return "jingdong.c2m.order.serialNumber.del";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param1", this.param1);
      return JsonUtil.toJson(pmap);
   }

   public Class<C2mOrderSerialNumberDelResponse> getResponseClass() {
      return C2mOrderSerialNumberDelResponse.class;
   }

   @JsonProperty("param1")
   public void setParam1(SerialNumberQueryEntity param1) {
      this.param1 = param1;
   }

   @JsonProperty("param1")
   public SerialNumberQueryEntity getParam1() {
      return this.param1;
   }
}
