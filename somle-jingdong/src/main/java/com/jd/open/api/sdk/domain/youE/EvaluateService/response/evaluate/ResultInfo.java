package com.jd.open.api.sdk.domain.youE.EvaluateService.response.evaluate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private String errMsg;
   private Integer resultCode;
   private Integer pageSize;
   private List<Evaluate> evaluateList;

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("evaluateList")
   public void setEvaluateList(List<Evaluate> evaluateList) {
      this.evaluateList = evaluateList;
   }

   @JsonProperty("evaluateList")
   public List<Evaluate> getEvaluateList() {
      return this.evaluateList;
   }
}
