package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ReserveProductJosService.request.query.OpenAccessContext;
import com.jd.open.api.sdk.domain.ware.ReserveProductJosService.request.query.QueryReserveProductParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareReserveDataQueryResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WareReserveDataQueryRequest extends AbstractRequest implements JdRequest<WareReserveDataQueryResponse> {
   private OpenAccessContext openAccessContext;
   private List<QueryReserveProductParam> request;

   public String getApiMethod() {
      return "jingdong.ware.reserve.data.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("openAccessContext", this.openAccessContext);
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareReserveDataQueryResponse> getResponseClass() {
      return WareReserveDataQueryResponse.class;
   }

   @JsonProperty("openAccessContext")
   public void setOpenAccessContext(OpenAccessContext openAccessContext) {
      this.openAccessContext = openAccessContext;
   }

   @JsonProperty("openAccessContext")
   public OpenAccessContext getOpenAccessContext() {
      return this.openAccessContext;
   }

   @JsonProperty("request")
   public void setRequest(List<QueryReserveProductParam> request) {
      this.request = request;
   }

   @JsonProperty("request")
   public List<QueryReserveProductParam> getRequest() {
      return this.request;
   }
}
