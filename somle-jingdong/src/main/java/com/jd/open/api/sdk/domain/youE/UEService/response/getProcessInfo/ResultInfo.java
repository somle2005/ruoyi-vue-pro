package com.jd.open.api.sdk.domain.youE.UEService.response.getProcessInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private String errMsg;
   private List<ProcessInfo> processInfoList;
   private Integer resultCode;

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("processInfoList")
   public void setProcessInfoList(List<ProcessInfo> processInfoList) {
      this.processInfoList = processInfoList;
   }

   @JsonProperty("processInfoList")
   public List<ProcessInfo> getProcessInfoList() {
      return this.processInfoList;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }
}
