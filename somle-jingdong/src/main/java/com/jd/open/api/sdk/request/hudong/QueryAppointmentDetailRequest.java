package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.QueryAppointmentDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryAppointmentDetailRequest extends AbstractRequest implements JdRequest<QueryAppointmentDetailResponse> {
   private String appName;
   private String appId;
   private Long preSellId;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setPreSellId(Long preSellId) {
      this.preSellId = preSellId;
   }

   public Long getPreSellId() {
      return this.preSellId;
   }

   public String getApiMethod() {
      return "jingdong.queryAppointmentDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("appId", this.appId);
      pmap.put("preSellId", this.preSellId);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryAppointmentDetailResponse> getResponseClass() {
      return QueryAppointmentDetailResponse.class;
   }
}
