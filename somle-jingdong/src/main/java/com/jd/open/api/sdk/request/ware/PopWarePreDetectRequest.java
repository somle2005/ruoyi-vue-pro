package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.request.preDetect.I18nParam;
import com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.request.preDetect.WarePreDetectRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.PopWarePreDetectResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopWarePreDetectRequest extends AbstractRequest implements JdRequest<PopWarePreDetectResponse> {
   private I18nParam i18nParam;
   private WarePreDetectRequest request;

   public String getApiMethod() {
      return "jingdong.pop.ware.preDetect";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("i18nParam", this.i18nParam);
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopWarePreDetectResponse> getResponseClass() {
      return PopWarePreDetectResponse.class;
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
   public void setRequest(WarePreDetectRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public WarePreDetectRequest getRequest() {
      return this.request;
   }
}
