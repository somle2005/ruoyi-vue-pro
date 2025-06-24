package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemSalernameGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemSalernameGetRequest extends AbstractRequest implements JdRequest<VcItemSalernameGetResponse> {
   private String salerCode;

   public void setSalerCode(String salerCode) {
      this.salerCode = salerCode;
   }

   public String getSalerCode() {
      return this.salerCode;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.salername.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("saler_code", this.salerCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemSalernameGetResponse> getResponseClass() {
      return VcItemSalernameGetResponse.class;
   }
}
