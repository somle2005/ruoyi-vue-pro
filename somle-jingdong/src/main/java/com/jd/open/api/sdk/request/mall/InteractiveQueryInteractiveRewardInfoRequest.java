package com.jd.open.api.sdk.request.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.queryInteractiveRewardInfo.InteractiveRewardParam;
import com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.queryInteractiveRewardInfo.SysParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.InteractiveQueryInteractiveRewardInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InteractiveQueryInteractiveRewardInfoRequest extends AbstractRequest implements JdRequest<InteractiveQueryInteractiveRewardInfoResponse> {
   private SysParam sysParam;
   private InteractiveRewardParam interactiveRewardParam;

   public String getApiMethod() {
      return "jingdong.interactive.queryInteractiveRewardInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sysParam", this.sysParam);
      pmap.put("interactiveRewardParam", this.interactiveRewardParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<InteractiveQueryInteractiveRewardInfoResponse> getResponseClass() {
      return InteractiveQueryInteractiveRewardInfoResponse.class;
   }

   @JsonProperty("sysParam")
   public void setSysParam(SysParam sysParam) {
      this.sysParam = sysParam;
   }

   @JsonProperty("sysParam")
   public SysParam getSysParam() {
      return this.sysParam;
   }

   @JsonProperty("interactiveRewardParam")
   public void setInteractiveRewardParam(InteractiveRewardParam interactiveRewardParam) {
      this.interactiveRewardParam = interactiveRewardParam;
   }

   @JsonProperty("interactiveRewardParam")
   public InteractiveRewardParam getInteractiveRewardParam() {
      return this.interactiveRewardParam;
   }
}
