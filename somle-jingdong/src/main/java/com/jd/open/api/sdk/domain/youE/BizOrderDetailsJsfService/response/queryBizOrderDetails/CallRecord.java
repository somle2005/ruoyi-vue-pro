package com.jd.open.api.sdk.domain.youE.BizOrderDetailsJsfService.response.queryBizOrderDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CallRecord implements Serializable {
   private List<CallRecordVo> callRecordVos;

   @JsonProperty("callRecordVos")
   public void setCallRecordVos(List<CallRecordVo> callRecordVos) {
      this.callRecordVos = callRecordVos;
   }

   @JsonProperty("callRecordVos")
   public List<CallRecordVo> getCallRecordVos() {
      return this.callRecordVos;
   }
}
