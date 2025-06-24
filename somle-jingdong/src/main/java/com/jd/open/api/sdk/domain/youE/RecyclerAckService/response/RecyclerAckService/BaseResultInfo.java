package com.jd.open.api.sdk.domain.youE.RecyclerAckService.response.RecyclerAckService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseResultInfo implements Serializable {
   private Integer resultCode;
   private String errMsg;
   private Boolean data;

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
   public void setData(Boolean data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Boolean getData() {
      return this.data;
   }
}
