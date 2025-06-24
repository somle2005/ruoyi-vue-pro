package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.VenderCategoryGetFullValidCategoryResultByVenderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderCategoryGetFullValidCategoryResultByVenderIdRequest extends AbstractRequest implements JdRequest<VenderCategoryGetFullValidCategoryResultByVenderIdResponse> {
   public String getApiMethod() {
      return "jingdong.vender.category.getFullValidCategoryResultByVenderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderCategoryGetFullValidCategoryResultByVenderIdResponse> getResponseClass() {
      return VenderCategoryGetFullValidCategoryResultByVenderIdResponse.class;
   }
}
