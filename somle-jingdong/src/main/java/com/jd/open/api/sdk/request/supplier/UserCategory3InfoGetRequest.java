package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.UserCategory3InfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UserCategory3InfoGetRequest extends AbstractRequest implements JdRequest<UserCategory3InfoGetResponse> {
   public String getApiMethod() {
      return "jingdong.userCategory3.info.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<UserCategory3InfoGetResponse> getResponseClass() {
      return UserCategory3InfoGetResponse.class;
   }
}
