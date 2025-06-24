package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.GrayScaleService.request.getgrayvalue.GrayscaleParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareCommonGrayGetgrayvalueResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareCommonGrayGetgrayvalueRequest extends AbstractRequest implements JdRequest<WareCommonGrayGetgrayvalueResponse> {
   private GrayscaleParam param;

   public String getApiMethod() {
      return "jingdong.ware.common.gray.getgrayvalue";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareCommonGrayGetgrayvalueResponse> getResponseClass() {
      return WareCommonGrayGetgrayvalueResponse.class;
   }

   @JsonProperty("param")
   public void setParam(GrayscaleParam param) {
      this.param = param;
   }

   @JsonProperty("param")
   public GrayscaleParam getParam() {
      return this.param;
   }
}
