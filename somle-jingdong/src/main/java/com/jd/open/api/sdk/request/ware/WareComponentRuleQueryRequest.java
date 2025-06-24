package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ProductPublishTemplateService.request.query.ComponentRulesRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareComponentRuleQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareComponentRuleQueryRequest extends AbstractRequest implements JdRequest<WareComponentRuleQueryResponse> {
   private ComponentRulesRequest componentRulesRequest;

   public String getApiMethod() {
      return "jingdong.ware.component.rule.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("componentRulesRequest", this.componentRulesRequest);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareComponentRuleQueryResponse> getResponseClass() {
      return WareComponentRuleQueryResponse.class;
   }

   @JsonProperty("componentRulesRequest")
   public void setComponentRulesRequest(ComponentRulesRequest componentRulesRequest) {
      this.componentRulesRequest = componentRulesRequest;
   }

   @JsonProperty("componentRulesRequest")
   public ComponentRulesRequest getComponentRulesRequest() {
      return this.componentRulesRequest;
   }
}
