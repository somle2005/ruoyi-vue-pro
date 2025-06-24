package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.SkuFareTemplateServiceGetTemplatesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SkuFareTemplateServiceGetTemplatesRequest extends AbstractRequest implements JdRequest<SkuFareTemplateServiceGetTemplatesResponse> {
   public String getApiMethod() {
      return "jingdong.SkuFareTemplateService.getTemplates";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<SkuFareTemplateServiceGetTemplatesResponse> getResponseClass() {
      return SkuFareTemplateServiceGetTemplatesResponse.class;
   }
}
