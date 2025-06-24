package com.jd.open.api.sdk.domain.youE.BizInsuranceOrderJsfService.response.searchPassiveOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private int resultCode;
   private String errMsg;
   private long pageSize;
   private List<InsuranceOrderVo> result;

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

   @JsonProperty("pageSize")
   public void setPageSize(long pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public long getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("result")
   public void setResult(List<InsuranceOrderVo> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<InsuranceOrderVo> getResult() {
      return this.result;
   }
}
