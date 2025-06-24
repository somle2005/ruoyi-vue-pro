package com.jd.open.api.sdk.domain.youE.BizOrderJsfService.response.queryCancelOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private List<CancelOrderVO> result;
   private String errMsg;
   private long pageSize;
   private int resultCode;

   @JsonProperty("result")
   public void setResult(List<CancelOrderVO> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<CancelOrderVO> getResult() {
      return this.result;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("pageSize")
   public void setPageSize(long pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public long getPageSize() {
      return this.pageSize;
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
