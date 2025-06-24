package com.jd.open.api.sdk.request.EPT;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.EPT.EptWarecenterWareGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EptWarecenterWareGetRequest extends AbstractRequest implements JdRequest<EptWarecenterWareGetResponse> {
   private long wareId;

   public void setWareId(long wareId) {
      this.wareId = wareId;
   }

   public long getWareId() {
      return this.wareId;
   }

   public String getApiMethod() {
      return "jingdong.ept.warecenter.ware.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EptWarecenterWareGetResponse> getResponseClass() {
      return EptWarecenterWareGetResponse.class;
   }
}
