package com.jd.open.api.sdk.request.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.request.query.SubSidyGetImgUrlAuthParam;
import com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.request.query.SubsidyGetImgUrlParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.DigitalSubsidyOrderImgQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DigitalSubsidyOrderImgQueryRequest extends AbstractRequest implements JdRequest<DigitalSubsidyOrderImgQueryResponse> {
   private SubsidyGetImgUrlParam SubsidyGetImgUrlParam;
   private SubSidyGetImgUrlAuthParam SubSidyGetImgUrlAuthParam;

   public String getApiMethod() {
      return "jingdong.digital.subsidy.order.img.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("SubsidyGetImgUrlParam", this.SubsidyGetImgUrlParam);
      pmap.put("SubSidyGetImgUrlAuthParam", this.SubSidyGetImgUrlAuthParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<DigitalSubsidyOrderImgQueryResponse> getResponseClass() {
      return DigitalSubsidyOrderImgQueryResponse.class;
   }

   @JsonProperty("SubsidyGetImgUrlParam")
   public void setSubsidyGetImgUrlParam(SubsidyGetImgUrlParam SubsidyGetImgUrlParam) {
      this.SubsidyGetImgUrlParam = SubsidyGetImgUrlParam;
   }

   @JsonProperty("SubsidyGetImgUrlParam")
   public SubsidyGetImgUrlParam getSubsidyGetImgUrlParam() {
      return this.SubsidyGetImgUrlParam;
   }

   @JsonProperty("SubSidyGetImgUrlAuthParam")
   public void setSubSidyGetImgUrlAuthParam(SubSidyGetImgUrlAuthParam SubSidyGetImgUrlAuthParam) {
      this.SubSidyGetImgUrlAuthParam = SubSidyGetImgUrlAuthParam;
   }

   @JsonProperty("SubSidyGetImgUrlAuthParam")
   public SubSidyGetImgUrlAuthParam getSubSidyGetImgUrlAuthParam() {
      return this.SubSidyGetImgUrlAuthParam;
   }
}
