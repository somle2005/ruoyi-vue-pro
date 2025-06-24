package com.jd.open.api.sdk.request.delivery;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.delivery.DeliveryLogisticsGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DeliveryLogisticsGetRequest extends AbstractRequest implements JdRequest<DeliveryLogisticsGetResponse> {
   private String optionalFields;

   public String getApiMethod() {
      return "360buy.delivery.logistics.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("optional_fields", this.optionalFields);
      return JsonUtil.toJson(map);
   }

   public Class<DeliveryLogisticsGetResponse> getResponseClass() {
      return DeliveryLogisticsGetResponse.class;
   }

   public String getOptionalFields() {
      return this.optionalFields;
   }

   public void setOptionalFields(String optionalFields) {
      this.optionalFields = optionalFields;
   }
}
