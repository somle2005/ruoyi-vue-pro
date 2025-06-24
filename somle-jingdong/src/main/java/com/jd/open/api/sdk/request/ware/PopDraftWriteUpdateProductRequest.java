package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.updateProduct.JosUpdateProductReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.PopDraftWriteUpdateProductResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopDraftWriteUpdateProductRequest extends AbstractRequest implements JdRequest<PopDraftWriteUpdateProductResponse> {
   private JosUpdateProductReq josUpdateProductReq;

   public String getApiMethod() {
      return "jingdong.pop.draft.write.updateProduct";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josUpdateProductReq", this.josUpdateProductReq);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopDraftWriteUpdateProductResponse> getResponseClass() {
      return PopDraftWriteUpdateProductResponse.class;
   }

   @JsonProperty("josUpdateProductReq")
   public void setJosUpdateProductReq(JosUpdateProductReq josUpdateProductReq) {
      this.josUpdateProductReq = josUpdateProductReq;
   }

   @JsonProperty("josUpdateProductReq")
   public JosUpdateProductReq getJosUpdateProductReq() {
      return this.josUpdateProductReq;
   }
}
