package com.jd.open.api.sdk.request.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.queryInteractiveInfo.InteractiveParam;
import com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.queryInteractiveInfo.SysParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.InteractiveQueryInteractiveInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InteractiveQueryInteractiveInfoRequest extends AbstractRequest implements JdRequest<InteractiveQueryInteractiveInfoResponse> {
   private SysParam sysParam;
   private InteractiveParam interactiveParam;

   public String getApiMethod() {
      return "jingdong.interactive.queryInteractiveInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sysParam", this.sysParam);
      pmap.put("interactiveParam", this.interactiveParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<InteractiveQueryInteractiveInfoResponse> getResponseClass() {
      return InteractiveQueryInteractiveInfoResponse.class;
   }

   @JsonProperty("sysParam")
   public void setSysParam(SysParam sysParam) {
      this.sysParam = sysParam;
   }

   @JsonProperty("sysParam")
   public SysParam getSysParam() {
      return this.sysParam;
   }

   @JsonProperty("interactiveParam")
   public void setInteractiveParam(InteractiveParam interactiveParam) {
      this.interactiveParam = interactiveParam;
   }

   @JsonProperty("interactiveParam")
   public InteractiveParam getInteractiveParam() {
      return this.interactiveParam;
   }
}
