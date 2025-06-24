package com.jd.open.api.sdk.request.spgl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.spgl.BatchPoJsfService.request.issue.BatchPoParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.spgl.SrmSkuBatchinfoIssueResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SrmSkuBatchinfoIssueRequest extends AbstractRequest implements JdRequest<SrmSkuBatchinfoIssueResponse> {
   private BatchPoParam param1;

   public String getApiMethod() {
      return "jingdong.srm.sku.batchinfo.issue";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param1", this.param1);
      return JsonUtil.toJson(pmap);
   }

   public Class<SrmSkuBatchinfoIssueResponse> getResponseClass() {
      return SrmSkuBatchinfoIssueResponse.class;
   }

   @JsonProperty("param1")
   public void setParam1(BatchPoParam param1) {
      this.param1 = param1;
   }

   @JsonProperty("param1")
   public BatchPoParam getParam1() {
      return this.param1;
   }
}
