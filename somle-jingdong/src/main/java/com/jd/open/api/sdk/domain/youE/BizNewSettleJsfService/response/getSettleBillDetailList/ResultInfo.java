package com.jd.open.api.sdk.domain.youE.BizNewSettleJsfService.response.getSettleBillDetailList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private int resultCode;
   private String errMsg;
   private List<SettleBillDetailVO> result;
   private int pageSize;
   private int totalPage;
   private int count;

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
   public void setResult(List<SettleBillDetailVO> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<SettleBillDetailVO> getResult() {
      return this.result;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("totalPage")
   public void setTotalPage(int totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public int getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("count")
   public void setCount(int count) {
      this.count = count;
   }

   @JsonProperty("count")
   public int getCount() {
      return this.count;
   }
}
