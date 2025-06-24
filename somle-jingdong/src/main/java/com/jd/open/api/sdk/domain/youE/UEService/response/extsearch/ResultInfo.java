package com.jd.open.api.sdk.domain.youE.UEService.response.extsearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private List<ExtTast> extTastList;
   private Integer resultCode;
   private String errMsg;
   private Integer pageSize;

   @JsonProperty("extTastList")
   public void setExtTastList(List<ExtTast> extTastList) {
      this.extTastList = extTastList;
   }

   @JsonProperty("extTastList")
   public List<ExtTast> getExtTastList() {
      return this.extTastList;
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

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }
}
