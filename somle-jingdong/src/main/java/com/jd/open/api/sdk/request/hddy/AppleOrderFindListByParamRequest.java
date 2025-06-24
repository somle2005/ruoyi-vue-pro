package com.jd.open.api.sdk.request.hddy;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hddy.AppleOrderFindListByParamResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AppleOrderFindListByParamRequest extends AbstractRequest implements JdRequest<AppleOrderFindListByParamResponse> {
   private String paramMap;

   public void setParamMap(String paramMap) {
      this.paramMap = paramMap;
   }

   public String getParamMap() {
      return this.paramMap;
   }

   public String getApiMethod() {
      return "jingdong.appleOrder.findListByParam";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("paramMap", this.paramMap);
      return JsonUtil.toJson(pmap);
   }

   public Class<AppleOrderFindListByParamResponse> getResponseClass() {
      return AppleOrderFindListByParamResponse.class;
   }
}
