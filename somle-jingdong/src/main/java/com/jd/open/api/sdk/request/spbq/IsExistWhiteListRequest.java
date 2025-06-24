package com.jd.open.api.sdk.request.spbq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.spbq.IsExistWhiteListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IsExistWhiteListRequest extends AbstractRequest implements JdRequest<IsExistWhiteListResponse> {
   public String getApiMethod() {
      return "jingdong.isExistWhiteList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<IsExistWhiteListResponse> getResponseClass() {
      return IsExistWhiteListResponse.class;
   }
}
