package com.jd.open.api.sdk.request.jlapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jlapi.JlMemberUserextQueryByUserCodeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JlMemberUserextQueryByUserCodeRequest extends AbstractRequest implements JdRequest<JlMemberUserextQueryByUserCodeResponse> {
   private Long platformId;
   private String userCode;

   public void setPlatformId(Long platformId) {
      this.platformId = platformId;
   }

   public Long getPlatformId() {
      return this.platformId;
   }

   public void setUserCode(String userCode) {
      this.userCode = userCode;
   }

   public String getUserCode() {
      return this.userCode;
   }

   public String getApiMethod() {
      return "jingdong.jl.member.userext.queryByUserCode";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("platformId", this.platformId);
      pmap.put("userCode", this.userCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<JlMemberUserextQueryByUserCodeResponse> getResponseClass() {
      return JlMemberUserextQueryByUserCodeResponse.class;
   }
}
