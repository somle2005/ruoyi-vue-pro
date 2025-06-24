package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsSplitOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsSplitOrderRequest extends AbstractRequest implements JdRequest<DropshipDpsSplitOrderResponse> {
   private String splitOrderJson;

   public void setSplitOrderJson(String splitOrderJson) {
      this.splitOrderJson = splitOrderJson;
   }

   public String getSplitOrderJson() {
      return this.splitOrderJson;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.splitOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("splitOrderJson", this.splitOrderJson);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsSplitOrderResponse> getResponseClass() {
      return DropshipDpsSplitOrderResponse.class;
   }
}
