package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.SizeHelperTemplateService.request.get.QueryTemplateRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SizehelperTemplateGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SizehelperTemplateGetRequest extends AbstractRequest implements JdRequest<SizehelperTemplateGetResponse> {
   private QueryTemplateRequest request;

   public String getApiMethod() {
      return "jingdong.sizehelper.template.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<SizehelperTemplateGetResponse> getResponseClass() {
      return SizehelperTemplateGetResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(QueryTemplateRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public QueryTemplateRequest getRequest() {
      return this.request;
   }
}
