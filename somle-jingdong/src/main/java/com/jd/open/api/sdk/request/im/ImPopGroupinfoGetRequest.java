package com.jd.open.api.sdk.request.im;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.im.ImPopGroupinfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImPopGroupinfoGetRequest extends AbstractRequest implements JdRequest<ImPopGroupinfoGetResponse> {
   public String getApiMethod() {
      return "jingdong.im.pop.groupinfo.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<ImPopGroupinfoGetResponse> getResponseClass() {
      return ImPopGroupinfoGetResponse.class;
   }
}
