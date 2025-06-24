package com.jd.open.api.sdk.domain.youE.BizDeliverArriveJsfService.response.queryOrderExpectedReceiptTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private Integer totalPage;
   private int resultCode;
   private String errMsg;
   private List<OrderExpectDeliverVO> result;

   @JsonProperty("totalPage")
   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public Integer getTotalPage() {
      return this.totalPage;
   }

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
   public void setResult(List<OrderExpectDeliverVO> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<OrderExpectDeliverVO> getResult() {
      return this.result;
   }
}
