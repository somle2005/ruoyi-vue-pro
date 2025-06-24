package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.TransportWriteUpdateWareTransportIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class TransportWriteUpdateWareTransportIdRequest extends AbstractRequest implements JdRequest<TransportWriteUpdateWareTransportIdResponse> {
   private Long wareId;
   private Long transportId;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setTransportId(Long transportId) {
      this.transportId = transportId;
   }

   public Long getTransportId() {
      return this.transportId;
   }

   public String getApiMethod() {
      return "jingdong.transport.write.updateWareTransportId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("transportId", this.transportId);
      return JsonUtil.toJson(pmap);
   }

   public Class<TransportWriteUpdateWareTransportIdResponse> getResponseClass() {
      return TransportWriteUpdateWareTransportIdResponse.class;
   }
}
