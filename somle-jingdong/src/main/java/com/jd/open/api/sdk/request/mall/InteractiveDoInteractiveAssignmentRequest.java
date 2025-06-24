package com.jd.open.api.sdk.request.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.doInteractiveAssignment.InteractiveAssignmentParam;
import com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.doInteractiveAssignment.SysParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.InteractiveDoInteractiveAssignmentResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InteractiveDoInteractiveAssignmentRequest extends AbstractRequest implements JdRequest<InteractiveDoInteractiveAssignmentResponse> {
   private SysParam sysParam;
   private InteractiveAssignmentParam interactiveAssignmentParam;

   public String getApiMethod() {
      return "jingdong.interactive.doInteractiveAssignment";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sysParam", this.sysParam);
      pmap.put("interactiveAssignmentParam", this.interactiveAssignmentParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<InteractiveDoInteractiveAssignmentResponse> getResponseClass() {
      return InteractiveDoInteractiveAssignmentResponse.class;
   }

   @JsonProperty("sysParam")
   public void setSysParam(SysParam sysParam) {
      this.sysParam = sysParam;
   }

   @JsonProperty("sysParam")
   public SysParam getSysParam() {
      return this.sysParam;
   }

   @JsonProperty("interactiveAssignmentParam")
   public void setInteractiveAssignmentParam(InteractiveAssignmentParam interactiveAssignmentParam) {
      this.interactiveAssignmentParam = interactiveAssignmentParam;
   }

   @JsonProperty("interactiveAssignmentParam")
   public InteractiveAssignmentParam getInteractiveAssignmentParam() {
      return this.interactiveAssignmentParam;
   }
}
