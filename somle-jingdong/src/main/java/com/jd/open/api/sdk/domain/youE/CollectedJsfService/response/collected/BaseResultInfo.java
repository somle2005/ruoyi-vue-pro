package com.jd.open.api.sdk.domain.youE.CollectedJsfService.response.collected;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BaseResultInfo implements Serializable {
   private boolean success;
   private Integer resultCode;
   private String errMsg;
   private List<FailOrderVO> data;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

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
   public void setData(List<FailOrderVO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<FailOrderVO> getData() {
      return this.data;
   }
}
