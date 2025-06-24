package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopAbnormalGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAbnormalGetRequest extends AbstractRequest implements JdRequest<LdopAbnormalGetResponse> {
   private String customerCode;

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.abnormal.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customerCode", this.customerCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAbnormalGetResponse> getResponseClass() {
      return LdopAbnormalGetResponse.class;
   }
}
