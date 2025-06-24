package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.PopVenderCenerVenderBrandQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopVenderCenerVenderBrandQueryRequest extends AbstractRequest implements JdRequest<PopVenderCenerVenderBrandQueryResponse> {
   private String name;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public String getApiMethod() {
      return "jingdong.pop.vender.cener.venderBrand.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("name", this.name);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopVenderCenerVenderBrandQueryResponse> getResponseClass() {
      return PopVenderCenerVenderBrandQueryResponse.class;
   }
}
