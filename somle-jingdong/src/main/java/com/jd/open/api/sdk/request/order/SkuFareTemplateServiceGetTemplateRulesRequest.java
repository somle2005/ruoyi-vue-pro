package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.SkuFareTemplateServiceGetTemplateRulesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SkuFareTemplateServiceGetTemplateRulesRequest extends AbstractRequest implements JdRequest<SkuFareTemplateServiceGetTemplateRulesResponse> {
   private long templateId;

   public void setTemplateId(long templateId) {
      this.templateId = templateId;
   }

   public long getTemplateId() {
      return this.templateId;
   }

   public String getApiMethod() {
      return "jingdong.SkuFareTemplateService.getTemplateRules";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("template_id", this.templateId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SkuFareTemplateServiceGetTemplateRulesResponse> getResponseClass() {
      return SkuFareTemplateServiceGetTemplateRulesResponse.class;
   }
}
