package com.jd.open.api.sdk.request.ydy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ydy.PullDataService.request.getTemplateList.GetTemplateListReqDTO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ydy.PrintingTemplateGetTemplateListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PrintingTemplateGetTemplateListRequest extends AbstractRequest implements JdRequest<PrintingTemplateGetTemplateListResponse> {
   private GetTemplateListReqDTO param1;

   public String getApiMethod() {
      return "jingdong.printing.template.getTemplateList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param1", this.param1);
      return JsonUtil.toJson(pmap);
   }

   public Class<PrintingTemplateGetTemplateListResponse> getResponseClass() {
      return PrintingTemplateGetTemplateListResponse.class;
   }

   @JsonProperty("param1")
   public void setParam1(GetTemplateListReqDTO param1) {
      this.param1 = param1;
   }

   @JsonProperty("param1")
   public GetTemplateListReqDTO getParam1() {
      return this.param1;
   }
}
