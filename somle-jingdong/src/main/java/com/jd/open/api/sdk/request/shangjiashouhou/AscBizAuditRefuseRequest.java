package com.jd.open.api.sdk.request.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.refuse.RefuseServiceCmd;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscBizAuditRefuseResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscBizAuditRefuseRequest extends AbstractRequest implements JdRequest<AscBizAuditRefuseResponse> {
   private RefuseServiceCmd RefuseServiceCmd;

   public String getApiMethod() {
      return "jingdong.asc.biz.audit.refuse";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("RefuseServiceCmd", this.RefuseServiceCmd);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscBizAuditRefuseResponse> getResponseClass() {
      return AscBizAuditRefuseResponse.class;
   }

   @JsonProperty("RefuseServiceCmd")
   public void setRefuseServiceCmd(RefuseServiceCmd RefuseServiceCmd) {
      this.RefuseServiceCmd = RefuseServiceCmd;
   }

   @JsonProperty("RefuseServiceCmd")
   public RefuseServiceCmd getRefuseServiceCmd() {
      return this.RefuseServiceCmd;
   }
}
