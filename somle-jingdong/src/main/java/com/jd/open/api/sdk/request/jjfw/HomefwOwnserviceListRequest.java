package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwOwnserviceListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwOwnserviceListRequest extends AbstractRequest implements JdRequest<HomefwOwnserviceListResponse> {
   public String getApiMethod() {
      return "jingdong.homefw.ownservice.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwOwnserviceListResponse> getResponseClass() {
      return HomefwOwnserviceListResponse.class;
   }
}
