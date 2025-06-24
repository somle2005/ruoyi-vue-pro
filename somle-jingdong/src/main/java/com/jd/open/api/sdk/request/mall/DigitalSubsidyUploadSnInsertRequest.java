package com.jd.open.api.sdk.request.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.SubsidyOutUploadJsfService.request.insert.SubsidySkuAuthParam;
import com.jd.open.api.sdk.domain.mall.SubsidyOutUploadJsfService.request.insert.SubsidySkuSnInfoParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.DigitalSubsidyUploadSnInsertResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DigitalSubsidyUploadSnInsertRequest extends AbstractRequest implements JdRequest<DigitalSubsidyUploadSnInsertResponse> {
   private List<SubsidySkuSnInfoParam> subsidySkuSnInfoParamList;
   private SubsidySkuAuthParam subsidySkuAuthParam;

   public String getApiMethod() {
      return "jingdong.digital.subsidy.upload.sn.insert";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("subsidySkuSnInfoParamList", this.subsidySkuSnInfoParamList);
      pmap.put("subsidySkuAuthParam", this.subsidySkuAuthParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<DigitalSubsidyUploadSnInsertResponse> getResponseClass() {
      return DigitalSubsidyUploadSnInsertResponse.class;
   }

   @JsonProperty("subsidySkuSnInfoParamList")
   public void setSubsidySkuSnInfoParamList(List<SubsidySkuSnInfoParam> subsidySkuSnInfoParamList) {
      this.subsidySkuSnInfoParamList = subsidySkuSnInfoParamList;
   }

   @JsonProperty("subsidySkuSnInfoParamList")
   public List<SubsidySkuSnInfoParam> getSubsidySkuSnInfoParamList() {
      return this.subsidySkuSnInfoParamList;
   }

   @JsonProperty("subsidySkuAuthParam")
   public void setSubsidySkuAuthParam(SubsidySkuAuthParam subsidySkuAuthParam) {
      this.subsidySkuAuthParam = subsidySkuAuthParam;
   }

   @JsonProperty("subsidySkuAuthParam")
   public SubsidySkuAuthParam getSubsidySkuAuthParam() {
      return this.subsidySkuAuthParam;
   }
}
