package com.jd.open.api.sdk.request.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.storeDoorPick.StoreDoorPickApplyCmd;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscBizStoreDoorPickResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscBizStoreDoorPickRequest extends AbstractRequest implements JdRequest<AscBizStoreDoorPickResponse> {
   private StoreDoorPickApplyCmd StoreDoorPickApplyCmd;

   public String getApiMethod() {
      return "jingdong.asc.biz.storeDoorPick";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("StoreDoorPickApplyCmd", this.StoreDoorPickApplyCmd);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscBizStoreDoorPickResponse> getResponseClass() {
      return AscBizStoreDoorPickResponse.class;
   }

   @JsonProperty("StoreDoorPickApplyCmd")
   public void setStoreDoorPickApplyCmd(StoreDoorPickApplyCmd StoreDoorPickApplyCmd) {
      this.StoreDoorPickApplyCmd = StoreDoorPickApplyCmd;
   }

   @JsonProperty("StoreDoorPickApplyCmd")
   public StoreDoorPickApplyCmd getStoreDoorPickApplyCmd() {
      return this.StoreDoorPickApplyCmd;
   }
}
