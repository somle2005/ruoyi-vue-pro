package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.PopWareGpsApiOnlineRecordJosServiceCustomsUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopWareGpsApiOnlineRecordJosServiceCustomsUpdateRequest extends AbstractRequest implements JdRequest<PopWareGpsApiOnlineRecordJosServiceCustomsUpdateResponse> {
   private String recordingParamToJson;
   private String recordedParamToJson;
   private String customsId;
   private String serviceId;

   public void setRecordingParamToJson(String recordingParamToJson) {
      this.recordingParamToJson = recordingParamToJson;
   }

   public String getRecordingParamToJson() {
      return this.recordingParamToJson;
   }

   public void setRecordedParamToJson(String recordedParamToJson) {
      this.recordedParamToJson = recordedParamToJson;
   }

   public String getRecordedParamToJson() {
      return this.recordedParamToJson;
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
      return "jingdong.pop.ware.gps.api.OnlineRecordJosService.customsUpdate";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("recordingParamToJson", this.recordingParamToJson);
      pmap.put("recordedParamToJson", this.recordedParamToJson);
      pmap.put("customsId", this.customsId);
      pmap.put("serviceId", this.serviceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopWareGpsApiOnlineRecordJosServiceCustomsUpdateResponse> getResponseClass() {
      return PopWareGpsApiOnlineRecordJosServiceCustomsUpdateResponse.class;
   }
}
