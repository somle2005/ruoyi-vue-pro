package com.jd.open.api.sdk.request.spbq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.spbq.BdsSymbolBindRpc.request.createSpuSymbolBind.BdsSymbolBindSpuRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.spbq.CreateSpuSymbolBindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CreateSpuSymbolBindRequest extends AbstractRequest implements JdRequest<CreateSpuSymbolBindResponse> {
   private BdsSymbolBindSpuRequest request;

   public String getApiMethod() {
      return "jingdong.createSpuSymbolBind";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<CreateSpuSymbolBindResponse> getResponseClass() {
      return CreateSpuSymbolBindResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(BdsSymbolBindSpuRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public BdsSymbolBindSpuRequest getRequest() {
      return this.request;
   }
}
