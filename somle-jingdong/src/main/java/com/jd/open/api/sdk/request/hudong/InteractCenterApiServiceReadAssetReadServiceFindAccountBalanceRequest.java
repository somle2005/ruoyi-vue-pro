package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.InteractCenterApiServiceReadAssetReadServiceFindAccountBalanceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InteractCenterApiServiceReadAssetReadServiceFindAccountBalanceRequest extends AbstractRequest implements JdRequest<InteractCenterApiServiceReadAssetReadServiceFindAccountBalanceResponse> {
   private String appName;
   private Long appId;
   private String appKey;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setAppId(Long appId) {
      this.appId = appId;
   }

   public Long getAppId() {
      return this.appId;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public String getApiMethod() {
      return "jingdong.interact.center.api.service.read.AssetReadService.findAccountBalance";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("appId", this.appId);
      pmap.put("appKey", this.appKey);
      return JsonUtil.toJson(pmap);
   }

   public Class<InteractCenterApiServiceReadAssetReadServiceFindAccountBalanceResponse> getResponseClass() {
      return InteractCenterApiServiceReadAssetReadServiceFindAccountBalanceResponse.class;
   }
}
