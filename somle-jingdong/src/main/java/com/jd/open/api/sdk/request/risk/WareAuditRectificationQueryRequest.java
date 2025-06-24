package com.jd.open.api.sdk.request.risk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.request.query.I18nParam;
import com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.request.query.KeeperWareRectificationQueryRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.risk.WareAuditRectificationQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareAuditRectificationQueryRequest extends AbstractRequest implements JdRequest<WareAuditRectificationQueryResponse> {
   private I18nParam i18nParam;
   private KeeperWareRectificationQueryRequest request;

   public String getApiMethod() {
      return "jingdong.ware.audit.rectification.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("i18nParam", this.i18nParam);
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareAuditRectificationQueryResponse> getResponseClass() {
      return WareAuditRectificationQueryResponse.class;
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
   public void setRequest(KeeperWareRectificationQueryRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public KeeperWareRectificationQueryRequest getRequest() {
      return this.request;
   }
}
