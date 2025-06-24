package com.jd.open.api.sdk.request.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.request.query.SubSidyGetImgUrlAuthParam;
import com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.request.query.SubsidyAuditParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.DigitalSubsidyOrderAuditResultQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DigitalSubsidyOrderAuditResultQueryRequest extends AbstractRequest implements JdRequest<DigitalSubsidyOrderAuditResultQueryResponse> {
   private SubsidyAuditParam SubsidyAuditParam;
   private SubSidyGetImgUrlAuthParam SubSidyGetImgUrlAuthParam;

   public String getApiMethod() {
      return "jingdong.digital.subsidy.order.audit.result.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("SubsidyAuditParam", this.SubsidyAuditParam);
      pmap.put("SubSidyGetImgUrlAuthParam", this.SubSidyGetImgUrlAuthParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<DigitalSubsidyOrderAuditResultQueryResponse> getResponseClass() {
      return DigitalSubsidyOrderAuditResultQueryResponse.class;
   }

   @JsonProperty("SubsidyAuditParam")
   public void setSubsidyAuditParam(SubsidyAuditParam SubsidyAuditParam) {
      this.SubsidyAuditParam = SubsidyAuditParam;
   }

   @JsonProperty("SubsidyAuditParam")
   public SubsidyAuditParam getSubsidyAuditParam() {
      return this.SubsidyAuditParam;
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
