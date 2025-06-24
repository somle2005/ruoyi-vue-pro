package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.request.batchQueryCustomServiceApplyResult.SkuServiceBatchApplyResultVo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipCustomizedBatchQueryCustomServiceApplyResultResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipCustomizedBatchQueryCustomServiceApplyResultRequest extends AbstractRequest implements JdRequest<YipCustomizedBatchQueryCustomServiceApplyResultResponse> {
   private SkuServiceBatchApplyResultVo batchApplyVo;

   public String getApiMethod() {
      return "jingdong.yip.customized.batchQueryCustomServiceApplyResult";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("batchApplyVo", this.batchApplyVo);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipCustomizedBatchQueryCustomServiceApplyResultResponse> getResponseClass() {
      return YipCustomizedBatchQueryCustomServiceApplyResultResponse.class;
   }

   @JsonProperty("batchApplyVo")
   public void setBatchApplyVo(SkuServiceBatchApplyResultVo batchApplyVo) {
      this.batchApplyVo = batchApplyVo;
   }

   @JsonProperty("batchApplyVo")
   public SkuServiceBatchApplyResultVo getBatchApplyVo() {
      return this.batchApplyVo;
   }
}
