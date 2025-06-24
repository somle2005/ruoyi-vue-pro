package com.jd.open.api.sdk.request.user;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.user.UserGetUserInfoByOpenIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UserGetUserInfoByOpenIdRequest extends AbstractRequest implements JdRequest<UserGetUserInfoByOpenIdResponse> {
   private String openId;

   public void setOpenId(String openId) {
      this.openId = openId;
   }

   public String getOpenId() {
      return this.openId;
   }

   public String getApiMethod() {
      return "jingdong.user.getUserInfoByOpenId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("openId", this.openId);
      return JsonUtil.toJson(pmap);
   }

   public Class<UserGetUserInfoByOpenIdResponse> getResponseClass() {
      return UserGetUserInfoByOpenIdResponse.class;
   }
}
