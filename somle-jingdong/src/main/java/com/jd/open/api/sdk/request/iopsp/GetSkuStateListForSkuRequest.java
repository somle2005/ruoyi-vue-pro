package com.jd.open.api.sdk.request.iopsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.iopsp.QueryGoodsOpenProvider.request.getSkuStateListForSku.GetSkuStateGoodsReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.iopsp.GetSkuStateListForSkuResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GetSkuStateListForSkuRequest extends AbstractRequest implements JdRequest<GetSkuStateListForSkuResponse> {
   private GetSkuStateGoodsReq rpcReq;

   public String getApiMethod() {
      return "jingdong.getSkuStateListForSku";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("rpcReq", this.rpcReq);
      return JsonUtil.toJson(pmap);
   }

   public Class<GetSkuStateListForSkuResponse> getResponseClass() {
      return GetSkuStateListForSkuResponse.class;
   }

   @JsonProperty("rpcReq")
   public void setRpcReq(GetSkuStateGoodsReq rpcReq) {
      this.rpcReq = rpcReq;
   }

   @JsonProperty("rpcReq")
   public GetSkuStateGoodsReq getRpcReq() {
      return this.rpcReq;
   }
}
