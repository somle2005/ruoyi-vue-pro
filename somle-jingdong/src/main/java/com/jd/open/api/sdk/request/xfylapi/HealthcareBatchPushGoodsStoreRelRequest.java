package com.jd.open.api.sdk.request.xfylapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xfylapi.ThirdDataExportService.request.batchPushGoodsStoreRel.BatchPushGoodsStoreRelParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.HealthcareBatchPushGoodsStoreRelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HealthcareBatchPushGoodsStoreRelRequest extends AbstractRequest implements JdRequest<HealthcareBatchPushGoodsStoreRelResponse> {
   private BatchPushGoodsStoreRelParam batchGoodsStoreRel;

   public String getApiMethod() {
      return "jingdong.healthcare.batchPushGoodsStoreRel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("batchGoodsStoreRel", this.batchGoodsStoreRel);
      return JsonUtil.toJson(pmap);
   }

   public Class<HealthcareBatchPushGoodsStoreRelResponse> getResponseClass() {
      return HealthcareBatchPushGoodsStoreRelResponse.class;
   }

   @JsonProperty("batchGoodsStoreRel")
   public void setBatchGoodsStoreRel(BatchPushGoodsStoreRelParam batchGoodsStoreRel) {
      this.batchGoodsStoreRel = batchGoodsStoreRel;
   }

   @JsonProperty("batchGoodsStoreRel")
   public BatchPushGoodsStoreRelParam getBatchGoodsStoreRel() {
      return this.batchGoodsStoreRel;
   }
}
