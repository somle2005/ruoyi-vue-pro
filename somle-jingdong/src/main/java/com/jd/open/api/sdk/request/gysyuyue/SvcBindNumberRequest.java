package com.jd.open.api.sdk.request.gysyuyue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gysyuyue.SvcBindNumberResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SvcBindNumberRequest extends AbstractRequest implements JdRequest<SvcBindNumberResponse> {
   private Integer appId;
   private Long id;

   public void setAppId(Integer appId) {
      this.appId = appId;
   }

   public Integer getAppId() {
      return this.appId;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public String getApiMethod() {
      return "jingdong.svc.bind.number";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("id", this.id);
      return JsonUtil.toJson(pmap);
   }

   public Class<SvcBindNumberResponse> getResponseClass() {
      return SvcBindNumberResponse.class;
   }
}
