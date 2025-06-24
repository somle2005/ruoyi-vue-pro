package com.jd.open.api.sdk.request.risk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.request.detail.I18nParam;
import com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.request.detail.KeeperWareRectificationDetailRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.risk.WareAuditRectificationDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareAuditRectificationDetailRequest extends AbstractRequest implements JdRequest<WareAuditRectificationDetailResponse> {
   private I18nParam i18nParam;
   private KeeperWareRectificationDetailRequest request;

   public String getApiMethod() {
      return "jingdong.ware.audit.rectification.detail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("i18nParam", this.i18nParam);
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareAuditRectificationDetailResponse> getResponseClass() {
      return WareAuditRectificationDetailResponse.class;
   }

   @JsonProperty("i18nParam")
   public void setI18nParam(I18nParam i18nParam) {
      this.i18nParam = i18nParam;
   }

   @JsonProperty("i18nParam")
   public I18nParam getI18nParam() {
      return this.i18nParam;
   }

   @JsonProperty("request")
   public void setRequest(KeeperWareRectificationDetailRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public KeeperWareRectificationDetailRequest getRequest() {
      return this.request;
   }
}
