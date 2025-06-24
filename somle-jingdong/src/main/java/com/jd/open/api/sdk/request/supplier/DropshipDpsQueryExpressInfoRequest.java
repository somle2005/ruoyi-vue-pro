package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsQueryExpressInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsQueryExpressInfoRequest extends AbstractRequest implements JdRequest<DropshipDpsQueryExpressInfoResponse> {
   private String customOrderIds;

   public void setCustomOrderIds(String customOrderIds) {
      this.customOrderIds = customOrderIds;
   }

   public String getCustomOrderIds() {
      return this.customOrderIds;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.queryExpressInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customOrderIds", this.customOrderIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsQueryExpressInfoResponse> getResponseClass() {
      return DropshipDpsQueryExpressInfoResponse.class;
   }
}
