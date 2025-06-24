package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.OrderSparePartJosService.request.received.PerformParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csOrderSparePartReceivedResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csOrderSparePartReceivedRequest extends AbstractRequest implements JdRequest<Jd3csOrderSparePartReceivedResponse> {
   private PerformParam param;

   public String getApiMethod() {
      return "jingdong.jd3cs.order.SparePart.received";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csOrderSparePartReceivedResponse> getResponseClass() {
      return Jd3csOrderSparePartReceivedResponse.class;
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
