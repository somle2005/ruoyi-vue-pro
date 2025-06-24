package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsSearchsingleorderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsSearchsingleorderRequest extends AbstractRequest implements JdRequest<DropshipDpsSearchsingleorderResponse> {
   private Long customOrderId;

   public void setCustomOrderId(Long customOrderId) {
      this.customOrderId = customOrderId;
   }

   public Long getCustomOrderId() {
      return this.customOrderId;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.searchsingleorder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customOrderId", this.customOrderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsSearchsingleorderResponse> getResponseClass() {
      return DropshipDpsSearchsingleorderResponse.class;
   }
}
