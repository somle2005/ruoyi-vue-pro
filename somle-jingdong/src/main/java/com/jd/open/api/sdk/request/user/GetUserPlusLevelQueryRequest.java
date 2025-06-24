package com.jd.open.api.sdk.request.user;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.user.GetUserPlusLevelQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GetUserPlusLevelQueryRequest extends AbstractRequest implements JdRequest<GetUserPlusLevelQueryResponse> {
   public String getApiMethod() {
      return "jingdong.getUserPlusLevel.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<GetUserPlusLevelQueryResponse> getResponseClass() {
      return GetUserPlusLevelQueryResponse.class;
   }
}
