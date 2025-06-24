package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemCategoriesFindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemCategoriesFindRequest extends AbstractRequest implements JdRequest<VcItemCategoriesFindResponse> {
   public String getApiMethod() {
      return "jingdong.vc.item.categories.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemCategoriesFindResponse> getResponseClass() {
      return VcItemCategoriesFindResponse.class;
   }
}
