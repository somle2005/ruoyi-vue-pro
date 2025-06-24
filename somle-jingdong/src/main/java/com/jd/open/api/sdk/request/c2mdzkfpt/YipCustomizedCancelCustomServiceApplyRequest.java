package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.request.cancelCustomServiceApply.SkuServiceCancelApplyVo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipCustomizedCancelCustomServiceApplyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipCustomizedCancelCustomServiceApplyRequest extends AbstractRequest implements JdRequest<YipCustomizedCancelCustomServiceApplyResponse> {
   private SkuServiceCancelApplyVo skuServiceCancelApplyVo;

   public String getApiMethod() {
      return "jingdong.yip.customized.cancelCustomServiceApply";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuServiceCancelApplyVo", this.skuServiceCancelApplyVo);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipCustomizedCancelCustomServiceApplyResponse> getResponseClass() {
      return YipCustomizedCancelCustomServiceApplyResponse.class;
   }

   @JsonProperty("skuServiceCancelApplyVo")
   public void setSkuServiceCancelApplyVo(SkuServiceCancelApplyVo skuServiceCancelApplyVo) {
      this.skuServiceCancelApplyVo = skuServiceCancelApplyVo;
   }

   @JsonProperty("skuServiceCancelApplyVo")
   public SkuServiceCancelApplyVo getSkuServiceCancelApplyVo() {
      return this.skuServiceCancelApplyVo;
   }
}
