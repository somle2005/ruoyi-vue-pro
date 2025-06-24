package com.jd.open.api.sdk.request.jlapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jlapi.JlMemberUserextQueryByMobileResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JlMemberUserextQueryByMobileRequest extends AbstractRequest implements JdRequest<JlMemberUserextQueryByMobileResponse> {
   private String mobile;
   private Long platformId;

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public String getMobile() {
      return this.mobile;
   }

   public void setPlatformId(Long platformId) {
      this.platformId = platformId;
   }

   public Long getPlatformId() {
      return this.platformId;
   }

   public String getApiMethod() {
      return "jingdong.jl.member.userext.queryByMobile";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("mobile", this.mobile);
      pmap.put("platformId", this.platformId);
      return JsonUtil.toJson(pmap);
   }

   public Class<JlMemberUserextQueryByMobileResponse> getResponseClass() {
      return JlMemberUserextQueryByMobileResponse.class;
   }
}
