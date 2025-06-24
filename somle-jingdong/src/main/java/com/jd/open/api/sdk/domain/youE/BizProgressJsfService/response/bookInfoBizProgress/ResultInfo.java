package com.jd.open.api.sdk.domain.youE.BizProgressJsfService.response.bookInfoBizProgress;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultInfo implements Serializable {
   private String errMsg;
   private int resultCode;

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }
}
