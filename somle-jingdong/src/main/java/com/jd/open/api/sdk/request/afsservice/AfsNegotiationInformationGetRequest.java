package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.AfsNegotiationInformationGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AfsNegotiationInformationGetRequest extends AbstractRequest implements JdRequest<AfsNegotiationInformationGetResponse> {
   private Long id;
   private Long refId;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setRefId(Long refId) {
      this.refId = refId;
   }

   public Long getRefId() {
      return this.refId;
   }

   public String getApiMethod() {
      return "jingdong.afs.negotiation.Information.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("id", this.id);
      pmap.put("refId", this.refId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AfsNegotiationInformationGetResponse> getResponseClass() {
      return AfsNegotiationInformationGetResponse.class;
   }
}
