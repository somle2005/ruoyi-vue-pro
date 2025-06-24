package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.FindBusinessByVenderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FindBusinessByVenderIdRequest extends AbstractRequest implements JdRequest<FindBusinessByVenderIdResponse> {
   public String getApiMethod() {
      return "jingdong.findBusinessByVenderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<FindBusinessByVenderIdResponse> getResponseClass() {
      return FindBusinessByVenderIdResponse.class;
   }
}
