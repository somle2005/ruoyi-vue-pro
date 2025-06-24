package com.jd.open.api.sdk.request.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.delivery.GetVenderAllDeliveryCompanyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GetVenderAllDeliveryCompanyRequest extends AbstractRequest implements JdRequest<GetVenderAllDeliveryCompanyResponse> {
   private String fields;

   @JsonProperty("fields")
   public String getFields() {
      return this.fields;
   }

   @JsonProperty("fields")
   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getApiMethod() {
      return "360buy.get.vender.all.delivery.company";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("fields", this.fields);
      return JsonUtil.toJson(map);
   }

   public Class<GetVenderAllDeliveryCompanyResponse> getResponseClass() {
      return GetVenderAllDeliveryCompanyResponse.class;
   }
}
