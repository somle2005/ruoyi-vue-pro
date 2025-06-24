package com.jd.open.api.sdk.domain.youE.AssignListJsfService.response.getSyncAssignOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BaseResultInfo implements Serializable {
   private Integer resultCode;
   private String errMsg;
   private List<NewAssignOrder> data;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("data")
   public void setData(List<NewAssignOrder> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<NewAssignOrder> getData() {
      return this.data;
   }
}
