package com.jd.open.api.sdk.request.EPT;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.EPT.EptWarecenterOutapiWareskuQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EptWarecenterOutapiWareskuQueryRequest extends AbstractRequest implements JdRequest<EptWarecenterOutapiWareskuQueryResponse> {
   private String wareId;

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public String getApiMethod() {
      return "jingdong.ept.warecenter.outapi.waresku.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EptWarecenterOutapiWareskuQueryResponse> getResponseClass() {
      return EptWarecenterOutapiWareskuQueryResponse.class;
   }
}
