package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.PopWareGpsApiOnlineRecordJosServiceQueryListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopWareGpsApiOnlineRecordJosServiceQueryListRequest extends AbstractRequest implements JdRequest<PopWareGpsApiOnlineRecordJosServiceQueryListResponse> {
   private String queryToJson;
   private String customsId;
   private String serviceId;

   public void setQueryToJson(String queryToJson) {
      this.queryToJson = queryToJson;
   }

   public String getQueryToJson() {
      return this.queryToJson;
   }

   public void setCustomsId(String customsId) {
      this.customsId = customsId;
   }

   public String getCustomsId() {
      return this.customsId;
   }

   public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
   }

   public String getServiceId() {
      return this.serviceId;
   }

   public String getApiMethod() {
      return "jingdong.pop.ware.gps.api.OnlineRecordJosService.queryList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("queryToJson", this.queryToJson);
      pmap.put("customsId", this.customsId);
      pmap.put("serviceId", this.serviceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopWareGpsApiOnlineRecordJosServiceQueryListResponse> getResponseClass() {
      return PopWareGpsApiOnlineRecordJosServiceQueryListResponse.class;
   }
}
