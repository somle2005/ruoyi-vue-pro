package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.VenderCategoryGetValidCategoryResultByVenderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderCategoryGetValidCategoryResultByVenderIdRequest extends AbstractRequest implements JdRequest<VenderCategoryGetValidCategoryResultByVenderIdResponse> {
   public String getApiMethod() {
      return "jingdong.vender.category.getValidCategoryResultByVenderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderCategoryGetValidCategoryResultByVenderIdResponse> getResponseClass() {
      return VenderCategoryGetValidCategoryResultByVenderIdResponse.class;
   }
}
