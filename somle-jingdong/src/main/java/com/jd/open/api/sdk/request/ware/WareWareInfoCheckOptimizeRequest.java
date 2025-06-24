package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.WareOptimizeService.request.wareInfoCheckOptimize.I18nParam;
import com.jd.open.api.sdk.domain.ware.WareOptimizeService.request.wareInfoCheckOptimize.WareInfoReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareWareInfoCheckOptimizeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareWareInfoCheckOptimizeRequest extends AbstractRequest implements JdRequest<WareWareInfoCheckOptimizeResponse> {
   private I18nParam i18nParam;
   private WareInfoReq wareInfoReq;

   public String getApiMethod() {
      return "jingdong.ware.wareInfoCheckOptimize";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("i18nParam", this.i18nParam);
      pmap.put("wareInfoReq", this.wareInfoReq);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareWareInfoCheckOptimizeResponse> getResponseClass() {
      return WareWareInfoCheckOptimizeResponse.class;
   }

   @JsonProperty("i18nParam")
   public void setI18nParam(I18nParam i18nParam) {
      this.i18nParam = i18nParam;
   }

   @JsonProperty("i18nParam")
   public I18nParam getI18nParam() {
      return this.i18nParam;
   }

   @JsonProperty("wareInfoReq")
   public void setWareInfoReq(WareInfoReq wareInfoReq) {
      this.wareInfoReq = wareInfoReq;
   }

   @JsonProperty("wareInfoReq")
   public WareInfoReq getWareInfoReq() {
      return this.wareInfoReq;
   }
}
