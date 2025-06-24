package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.GtinReceiveRpc.request.batchAdd.BatchAddVo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.GtinWriteBatchAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GtinWriteBatchAddRequest extends AbstractRequest implements JdRequest<GtinWriteBatchAddResponse> {
   private BatchAddVo batchAddVo;

   public String getApiMethod() {
      return "jingdong.gtin.write.batchAdd";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("batchAddVo", this.batchAddVo);
      return JsonUtil.toJson(pmap);
   }

   public Class<GtinWriteBatchAddResponse> getResponseClass() {
      return GtinWriteBatchAddResponse.class;
   }

   @JsonProperty("batchAddVo")
   public void setBatchAddVo(BatchAddVo batchAddVo) {
      this.batchAddVo = batchAddVo;
   }

   @JsonProperty("batchAddVo")
   public BatchAddVo getBatchAddVo() {
      return this.batchAddVo;
   }
}
