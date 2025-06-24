package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.NewSaaSSyncService.request.syncEngineerInfo.ExeEngineerInfoParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeNewSaaSSyncSyncEngineerInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeNewSaaSSyncSyncEngineerInfoRequest extends AbstractRequest implements JdRequest<UeNewSaaSSyncSyncEngineerInfoResponse> {
   private ExeEngineerInfoParam param;

   public String getApiMethod() {
      return "jingdong.ue.newSaaSSync.syncEngineerInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeNewSaaSSyncSyncEngineerInfoResponse> getResponseClass() {
      return UeNewSaaSSyncSyncEngineerInfoResponse.class;
   }

   @JsonProperty("param")
   public void setParam(ExeEngineerInfoParam param) {
      this.param = param;
   }

   @JsonProperty("param")
   public ExeEngineerInfoParam getParam() {
      return this.param;
   }
}
