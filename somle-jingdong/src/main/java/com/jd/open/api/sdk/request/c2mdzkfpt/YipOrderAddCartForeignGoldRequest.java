package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipOrderAddCartForeignGoldResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipOrderAddCartForeignGoldRequest extends AbstractRequest implements JdRequest<YipOrderAddCartForeignGoldResponse> {
   private String thirdPartyParam;

   public void setThirdPartyParam(String thirdPartyParam) {
      this.thirdPartyParam = thirdPartyParam;
   }

   public String getThirdPartyParam() {
      return this.thirdPartyParam;
   }

   public String getApiMethod() {
      return "jingdong.yip.order.addCartForeignGold";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("thirdPartyParam", this.thirdPartyParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipOrderAddCartForeignGoldResponse> getResponseClass() {
      return YipOrderAddCartForeignGoldResponse.class;
   }
}
