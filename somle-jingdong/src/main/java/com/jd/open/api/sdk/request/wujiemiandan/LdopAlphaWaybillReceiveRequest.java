package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaWaybillReceiveResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaWaybillReceiveRequest extends AbstractRequest implements JdRequest<LdopAlphaWaybillReceiveResponse> {
   private String content;

   public void setContent(String content) {
      this.content = content;
   }

   public String getContent() {
      return this.content;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.waybill.receive";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("content", this.content);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaWaybillReceiveResponse> getResponseClass() {
      return LdopAlphaWaybillReceiveResponse.class;
   }
}
