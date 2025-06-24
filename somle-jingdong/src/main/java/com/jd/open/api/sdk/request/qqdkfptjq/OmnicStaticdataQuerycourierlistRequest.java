package com.jd.open.api.sdk.request.qqdkfptjq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicStaticdataQuerycourierlistResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OmnicStaticdataQuerycourierlistRequest extends AbstractRequest implements JdRequest<OmnicStaticdataQuerycourierlistResponse> {
   private String authKey;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public String getApiMethod() {
      return "jingdong.omnic.staticdata.querycourierlist";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicStaticdataQuerycourierlistResponse> getResponseClass() {
      return OmnicStaticdataQuerycourierlistResponse.class;
   }
}
