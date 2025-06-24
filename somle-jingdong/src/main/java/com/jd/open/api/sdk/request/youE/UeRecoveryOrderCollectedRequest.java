package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.CollectedJsfService.request.collected.BaseParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderCollectedResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderCollectedRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderCollectedResponse> {
   private BaseParam param;

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.collected";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderCollectedResponse> getResponseClass() {
      return UeRecoveryOrderCollectedResponse.class;
   }

   @JsonProperty("param")
   public void setParam(BaseParam param) {
      this.param = param;
   }

   @JsonProperty("param")
   public BaseParam getParam() {
      return this.param;
   }
}
