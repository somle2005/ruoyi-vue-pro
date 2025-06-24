package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeNewSaaSOrderGetUnHandleOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeNewSaaSOrderGetUnHandleOrderRequest extends AbstractRequest implements JdRequest<UeNewSaaSOrderGetUnHandleOrderResponse> {
   private String appId;
   private String ivs;

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setIvs(String ivs) {
      this.ivs = ivs;
   }

   public String getIvs() {
      return this.ivs;
   }

   public String getApiMethod() {
      return "jingdong.ue.newSaaSOrder.getUnHandleOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("ivs", this.ivs);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeNewSaaSOrderGetUnHandleOrderResponse> getResponseClass() {
      return UeNewSaaSOrderGetUnHandleOrderResponse.class;
   }
}
