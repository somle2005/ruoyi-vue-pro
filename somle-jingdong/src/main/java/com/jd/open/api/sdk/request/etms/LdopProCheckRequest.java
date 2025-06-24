package com.jd.open.api.sdk.request.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.ServiceFrontCheckApi.request.check.ProCheckDTO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopProCheckResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopProCheckRequest extends AbstractRequest implements JdRequest<LdopProCheckResponse> {
   private ProCheckDTO ProCheckDTO;

   public String getApiMethod() {
      return "jingdong.ldop.pro.check";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ProCheckDTO", this.ProCheckDTO);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopProCheckResponse> getResponseClass() {
      return LdopProCheckResponse.class;
   }

   @JsonProperty("ProCheckDTO")
   public void setProCheckDTO(ProCheckDTO ProCheckDTO) {
      this.ProCheckDTO = ProCheckDTO;
   }

   @JsonProperty("ProCheckDTO")
   public ProCheckDTO getProCheckDTO() {
      return this.ProCheckDTO;
   }
}
