package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findWaitAuditApplys;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WaitAuditApplysPage implements Serializable {
   private List<WaitAuditApplyExport> applyInfoList;
   private int totalNum;

   @JsonProperty("applyInfoList")
   public void setApplyInfoList(List<WaitAuditApplyExport> applyInfoList) {
      this.applyInfoList = applyInfoList;
   }

   @JsonProperty("applyInfoList")
   public List<WaitAuditApplyExport> getApplyInfoList() {
      return this.applyInfoList;
   }

   @JsonProperty("totalNum")
   public void setTotalNum(int totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public int getTotalNum() {
      return this.totalNum;
   }
}
