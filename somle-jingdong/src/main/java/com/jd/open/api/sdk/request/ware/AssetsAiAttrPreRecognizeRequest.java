package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.AttrRecogClient.request.preRecognize.PreRecognizeParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.AssetsAiAttrPreRecognizeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AssetsAiAttrPreRecognizeRequest extends AbstractRequest implements JdRequest<AssetsAiAttrPreRecognizeResponse> {
   private PreRecognizeParam recogParam;

   public String getApiMethod() {
      return "jingdong.assets.ai.attr.preRecognize";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("recogParam", this.recogParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<AssetsAiAttrPreRecognizeResponse> getResponseClass() {
      return AssetsAiAttrPreRecognizeResponse.class;
   }

   @JsonProperty("recogParam")
   public void setRecogParam(PreRecognizeParam recogParam) {
      this.recogParam = recogParam;
   }

   @JsonProperty("recogParam")
   public PreRecognizeParam getRecogParam() {
      return this.recogParam;
   }
}
