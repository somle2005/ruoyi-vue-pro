package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.change.PerformParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csSparepartDeliverstateChangeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csSparepartDeliverstateChangeRequest extends AbstractRequest implements JdRequest<Jd3csSparepartDeliverstateChangeResponse> {
   private PerformParam param;

   public String getApiMethod() {
      return "jingdong.jd3cs.sparepart.deliverstate.change";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csSparepartDeliverstateChangeResponse> getResponseClass() {
      return Jd3csSparepartDeliverstateChangeResponse.class;
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
