package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.KeeperAuditResultService.request.detail.I18nParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareViolationDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareViolationDetailRequest extends AbstractRequest implements JdRequest<WareViolationDetailResponse> {
   private I18nParam i18nParam;
   private Long wareId;
   private String[] returnFields;
   private Integer sourceLabel;

   public String getApiMethod() {
      return "jingdong.ware.violation.detail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("i18nParam", this.i18nParam);
      pmap.put("wareId", this.wareId);
      pmap.put("returnFields", this.returnFields);
      pmap.put("sourceLabel", this.sourceLabel);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareViolationDetailResponse> getResponseClass() {
      return WareViolationDetailResponse.class;
   }

   @JsonProperty("i18nParam")
   public void setI18nParam(I18nParam i18nParam) {
      this.i18nParam = i18nParam;
   }

   @JsonProperty("i18nParam")
   public I18nParam getI18nParam() {
      return this.i18nParam;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("returnFields")
   public void setReturnFields(String[] returnFields) {
      this.returnFields = returnFields;
   }

   @JsonProperty("returnFields")
   public String[] getReturnFields() {
      return this.returnFields;
   }

   @JsonProperty("sourceLabel")
   public void setSourceLabel(Integer sourceLabel) {
      this.sourceLabel = sourceLabel;
   }

   @JsonProperty("sourceLabel")
   public Integer getSourceLabel() {
      return this.sourceLabel;
   }
}
