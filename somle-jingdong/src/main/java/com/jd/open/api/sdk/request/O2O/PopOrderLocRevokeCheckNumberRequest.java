package com.jd.open.api.sdk.request.O2O;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.O2O.LocOrderCodeSoaService.request.revokeCheckNumber.RevokeCheckNumParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.O2O.PopOrderLocRevokeCheckNumberResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderLocRevokeCheckNumberRequest extends AbstractRequest implements JdRequest<PopOrderLocRevokeCheckNumberResponse> {
   private RevokeCheckNumParam revokeCheckNumParam;

   public String getApiMethod() {
      return "jingdong.pop.order.loc.revokeCheckNumber";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("revokeCheckNumParam", this.revokeCheckNumParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderLocRevokeCheckNumberResponse> getResponseClass() {
      return PopOrderLocRevokeCheckNumberResponse.class;
   }

   @JsonProperty("revokeCheckNumParam")
   public void setRevokeCheckNumParam(RevokeCheckNumParam revokeCheckNumParam) {
      this.revokeCheckNumParam = revokeCheckNumParam;
   }

   @JsonProperty("revokeCheckNumParam")
   public RevokeCheckNumParam getRevokeCheckNumParam() {
      return this.revokeCheckNumParam;
   }
}
