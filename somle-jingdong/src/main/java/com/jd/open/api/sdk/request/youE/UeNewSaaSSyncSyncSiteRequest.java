package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.NewSaaSSyncService.request.syncSite.ExeSiteInfoParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeNewSaaSSyncSyncSiteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeNewSaaSSyncSyncSiteRequest extends AbstractRequest implements JdRequest<UeNewSaaSSyncSyncSiteResponse> {
   private ExeSiteInfoParam param;

   public String getApiMethod() {
      return "jingdong.ue.newSaaSSync.syncSite";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeNewSaaSSyncSyncSiteResponse> getResponseClass() {
      return UeNewSaaSSyncSyncSiteResponse.class;
   }

   @JsonProperty("param")
   public void setParam(ExeSiteInfoParam param) {
      this.param = param;
   }

   @JsonProperty("param")
   public ExeSiteInfoParam getParam() {
      return this.param;
   }
}
