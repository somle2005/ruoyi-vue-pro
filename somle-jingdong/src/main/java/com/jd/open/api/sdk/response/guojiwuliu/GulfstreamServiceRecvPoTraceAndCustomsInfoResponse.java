package com.jd.open.api.sdk.response.guojiwuliu;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.guojiwuliu.PoTraceAndCustomsInfoService.response.recvPoTraceAndCustomsInfo.ServiceResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GulfstreamServiceRecvPoTraceAndCustomsInfoResponse extends AbstractResponse {
   private ServiceResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(ServiceResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ServiceResult getReturnType() {
      return this.returnType;
   }
}
