package com.jd.open.api.sdk.domain.youE.OrderQueryJosService.response.queryCallHistory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VirtualNumberCallRecordInfoResult implements Serializable {
   private List<VirtualNumberCallRecordInfo> virtualNumberCallRecordInfoList;

   @JsonProperty("virtualNumberCallRecordInfoList")
   public void setVirtualNumberCallRecordInfoList(List<VirtualNumberCallRecordInfo> virtualNumberCallRecordInfoList) {
      this.virtualNumberCallRecordInfoList = virtualNumberCallRecordInfoList;
   }

   @JsonProperty("virtualNumberCallRecordInfoList")
   public List<VirtualNumberCallRecordInfo> getVirtualNumberCallRecordInfoList() {
      return this.virtualNumberCallRecordInfoList;
   }
}
