package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeNewSaaSOrderSyncEngineerServiceAreaResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeNewSaaSOrderSyncEngineerServiceAreaRequest extends AbstractRequest implements JdRequest<UeNewSaaSOrderSyncEngineerServiceAreaResponse> {
   private String engineerServiceAreaIdList;
   private String engineerId;
   private String appId;
   private String siteId;

   public void setEngineerServiceAreaIdList(String engineerServiceAreaIdList) {
      this.engineerServiceAreaIdList = engineerServiceAreaIdList;
   }

   public String getEngineerServiceAreaIdList() {
      return this.engineerServiceAreaIdList;
   }

   public void setEngineerId(String engineerId) {
      this.engineerId = engineerId;
   }

   public String getEngineerId() {
      return this.engineerId;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setSiteId(String siteId) {
      this.siteId = siteId;
   }

   public String getSiteId() {
      return this.siteId;
   }

   public String getApiMethod() {
      return "jingdong.ue.newSaaSOrder.syncEngineerServiceArea";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("engineerServiceAreaIdList", this.engineerServiceAreaIdList);
      pmap.put("engineerId", this.engineerId);
      pmap.put("appId", this.appId);
      pmap.put("siteId", this.siteId);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeNewSaaSOrderSyncEngineerServiceAreaResponse> getResponseClass() {
      return UeNewSaaSOrderSyncEngineerServiceAreaResponse.class;
   }
}
