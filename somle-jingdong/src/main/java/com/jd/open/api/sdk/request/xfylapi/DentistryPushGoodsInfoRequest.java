package com.jd.open.api.sdk.request.xfylapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xfylapi.DentistryThirdDataExportService.request.pushGoodsInfo.ThirdGoodsParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.DentistryPushGoodsInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DentistryPushGoodsInfoRequest extends AbstractRequest implements JdRequest<DentistryPushGoodsInfoResponse> {
   private ThirdGoodsParam ThirdGoodsParam;

   public String getApiMethod() {
      return "jingdong.dentistry.pushGoodsInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ThirdGoodsParam", this.ThirdGoodsParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<DentistryPushGoodsInfoResponse> getResponseClass() {
      return DentistryPushGoodsInfoResponse.class;
   }

   @JsonProperty("ThirdGoodsParam")
   public void setThirdGoodsParam(ThirdGoodsParam ThirdGoodsParam) {
      this.ThirdGoodsParam = ThirdGoodsParam;
   }

   @JsonProperty("ThirdGoodsParam")
   public ThirdGoodsParam getThirdGoodsParam() {
      return this.ThirdGoodsParam;
   }
}
