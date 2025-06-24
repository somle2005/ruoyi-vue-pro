package com.jd.open.api.sdk.domain.youE.OrgJsfService.response.customerOrderVirtualInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private int resultCode;
   private String errMsg;
   private List<BizOrderVirtualNumberVo> result;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
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

   @JsonProperty("result")
   public void setResult(List<BizOrderVirtualNumberVo> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<BizOrderVirtualNumberVo> getResult() {
      return this.result;
   }
}
