package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.request.skuCustomServiceBatchApply.SkuServiceBatchApplyVo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipCustomizedSkuCustomServiceBatchApplyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipCustomizedSkuCustomServiceBatchApplyRequest extends AbstractRequest implements JdRequest<YipCustomizedSkuCustomServiceBatchApplyResponse> {
   private SkuServiceBatchApplyVo batchApplyVo;

   public String getApiMethod() {
      return "jingdong.yip.customized.skuCustomServiceBatchApply";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("batchApplyVo", this.batchApplyVo);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipCustomizedSkuCustomServiceBatchApplyResponse> getResponseClass() {
      return YipCustomizedSkuCustomServiceBatchApplyResponse.class;
   }

   @JsonProperty("batchApplyVo")
   public void setBatchApplyVo(SkuServiceBatchApplyVo batchApplyVo) {
      this.batchApplyVo = batchApplyVo;
   }

   @JsonProperty("batchApplyVo")
   public SkuServiceBatchApplyVo getBatchApplyVo() {
      return this.batchApplyVo;
   }
}
