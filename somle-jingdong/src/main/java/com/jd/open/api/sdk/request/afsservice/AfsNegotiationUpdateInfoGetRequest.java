package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.AfsNegotiationUpdateInfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AfsNegotiationUpdateInfoGetRequest extends AbstractRequest implements JdRequest<AfsNegotiationUpdateInfoGetResponse> {
   private Long refId;

   public void setRefId(Long refId) {
      this.refId = refId;
   }

   public Long getRefId() {
      return this.refId;
   }

   public String getApiMethod() {
      return "jingdong.afs.negotiation.updateInfo.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("refId", this.refId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AfsNegotiationUpdateInfoGetResponse> getResponseClass() {
      return AfsNegotiationUpdateInfoGetResponse.class;
   }
}
