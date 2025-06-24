package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.AfsserviceFreightmessageGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AfsserviceFreightmessageGetRequest extends AbstractRequest implements JdRequest<AfsserviceFreightmessageGetResponse> {
   private Long afsServiceId;

   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   public String getApiMethod() {
      return "jingdong.afsservice.freightmessage.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afsServiceId", this.afsServiceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AfsserviceFreightmessageGetResponse> getResponseClass() {
      return AfsserviceFreightmessageGetResponse.class;
   }
}
