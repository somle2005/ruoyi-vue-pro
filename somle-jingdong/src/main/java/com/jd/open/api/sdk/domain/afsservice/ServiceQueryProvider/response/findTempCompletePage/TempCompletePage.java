package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findTempCompletePage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class TempCompletePage implements Serializable {
   private int totalNum;
   private List<TempComplete> tempCompleteList;

   @JsonProperty("totalNum")
   public void setTotalNum(int totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public int getTotalNum() {
      return this.totalNum;
   }

   @JsonProperty("tempCompleteList")
   public void setTempCompleteList(List<TempComplete> tempCompleteList) {
      this.tempCompleteList = tempCompleteList;
   }

   @JsonProperty("tempCompleteList")
   public List<TempComplete> getTempCompleteList() {
      return this.tempCompleteList;
   }
}
