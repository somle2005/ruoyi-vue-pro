package com.jd.open.api.sdk.request.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.BWareSearchService.request.tuopan.BizSkuSearchReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bWareSearchSkulistTuopanResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bWareSearchSkulistTuopanRequest extends AbstractRequest implements JdRequest<B2bWareSearchSkulistTuopanResponse> {
   private BizSkuSearchReq req;

   public String getApiMethod() {
      return "jingdong.b2b.ware.search.skulist.tuopan";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("req", this.req);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bWareSearchSkulistTuopanResponse> getResponseClass() {
      return B2bWareSearchSkulistTuopanResponse.class;
   }

   @JsonProperty("req")
   public void setReq(BizSkuSearchReq req) {
      this.req = req;
   }

   @JsonProperty("req")
   public BizSkuSearchReq getReq() {
      return this.req;
   }
}
