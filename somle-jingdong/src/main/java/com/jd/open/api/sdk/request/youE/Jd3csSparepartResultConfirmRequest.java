package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.confirm.PerformParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csSparepartResultConfirmResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csSparepartResultConfirmRequest extends AbstractRequest implements JdRequest<Jd3csSparepartResultConfirmResponse> {
   private PerformParam param;

   public String getApiMethod() {
      return "jingdong.jd3cs.sparepart.result.confirm";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csSparepartResultConfirmResponse> getResponseClass() {
      return Jd3csSparepartResultConfirmResponse.class;
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
