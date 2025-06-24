package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsSearchsingleResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsSearchsingleRequest extends AbstractRequest implements JdRequest<DropshipDpsSearchsingleResponse> {
   private Long customOrderId;

   public void setCustomOrderId(Long customOrderId) {
      this.customOrderId = customOrderId;
   }

   public Long getCustomOrderId() {
      return this.customOrderId;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.searchsingle";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customOrderId", this.customOrderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsSearchsingleResponse> getResponseClass() {
      return DropshipDpsSearchsingleResponse.class;
   }
}
