package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.AttrRecogClient.request.checkCateSup.CheckCateSupParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.AssetsAiAttrCheckCateSupResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AssetsAiAttrCheckCateSupRequest extends AbstractRequest implements JdRequest<AssetsAiAttrCheckCateSupResponse> {
   private CheckCateSupParam checkParam;

   public String getApiMethod() {
      return "jingdong.assets.ai.attr.checkCateSup";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("checkParam", this.checkParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<AssetsAiAttrCheckCateSupResponse> getResponseClass() {
      return AssetsAiAttrCheckCateSupResponse.class;
   }

   @JsonProperty("checkParam")
   public void setCheckParam(CheckCateSupParam checkParam) {
      this.checkParam = checkParam;
   }

   @JsonProperty("checkParam")
   public CheckCateSupParam getCheckParam() {
      return this.checkParam;
   }
}
