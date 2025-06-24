package com.jd.open.api.sdk.request.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.request.batchquery.SubSidyGetImgUrlAuthParam;
import com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.request.batchquery.SubsidyGetImgUrlParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.DigitalSubsidyOrderImgBatchqueryResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DigitalSubsidyOrderImgBatchqueryRequest extends AbstractRequest implements JdRequest<DigitalSubsidyOrderImgBatchqueryResponse> {
   private List<SubsidyGetImgUrlParam> subsidyGetImgUrlParamList;
   private SubSidyGetImgUrlAuthParam SubSidyGetImgUrlAuthParam;

   public String getApiMethod() {
      return "jingdong.digital.subsidy.order.img.batchquery";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("subsidyGetImgUrlParamList", this.subsidyGetImgUrlParamList);
      pmap.put("SubSidyGetImgUrlAuthParam", this.SubSidyGetImgUrlAuthParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<DigitalSubsidyOrderImgBatchqueryResponse> getResponseClass() {
      return DigitalSubsidyOrderImgBatchqueryResponse.class;
   }

   @JsonProperty("subsidyGetImgUrlParamList")
   public void setSubsidyGetImgUrlParamList(List<SubsidyGetImgUrlParam> subsidyGetImgUrlParamList) {
      this.subsidyGetImgUrlParamList = subsidyGetImgUrlParamList;
   }

   @JsonProperty("subsidyGetImgUrlParamList")
   public List<SubsidyGetImgUrlParam> getSubsidyGetImgUrlParamList() {
      return this.subsidyGetImgUrlParamList;
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
