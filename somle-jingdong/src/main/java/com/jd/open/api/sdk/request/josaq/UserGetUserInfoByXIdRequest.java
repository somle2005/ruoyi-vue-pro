package com.jd.open.api.sdk.request.josaq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.josaq.UserGetUserInfoByXIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UserGetUserInfoByXIdRequest extends AbstractRequest implements JdRequest<UserGetUserInfoByXIdResponse> {
   private String XId;

   public void setXId(String XId) {
      this.XId = XId;
   }

   public String getXId() {
      return this.XId;
   }

   public String getApiMethod() {
      return "jingdong.user.getUserInfoByXId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("XId", this.XId);
      return JsonUtil.toJson(pmap);
   }

   public Class<UserGetUserInfoByXIdResponse> getResponseClass() {
      return UserGetUserInfoByXIdResponse.class;
   }
}
