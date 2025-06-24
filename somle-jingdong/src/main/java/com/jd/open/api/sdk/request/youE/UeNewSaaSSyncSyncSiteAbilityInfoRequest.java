package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.NewSaaSSyncService.request.syncSiteAbilityInfo.SiteAbilityInfo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeNewSaaSSyncSyncSiteAbilityInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeNewSaaSSyncSyncSiteAbilityInfoRequest extends AbstractRequest implements JdRequest<UeNewSaaSSyncSyncSiteAbilityInfoResponse> {
   private SiteAbilityInfo param;

   public String getApiMethod() {
      return "jingdong.ue.newSaaSSync.syncSiteAbilityInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeNewSaaSSyncSyncSiteAbilityInfoResponse> getResponseClass() {
      return UeNewSaaSSyncSyncSiteAbilityInfoResponse.class;
   }

   @JsonProperty("param")
   public void setParam(SiteAbilityInfo param) {
      this.param = param;
   }

   @JsonProperty("param")
   public SiteAbilityInfo getParam() {
      return this.param;
   }
}
