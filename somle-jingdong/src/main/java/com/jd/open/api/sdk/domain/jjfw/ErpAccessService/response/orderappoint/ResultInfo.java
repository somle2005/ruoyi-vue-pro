package com.jd.open.api.sdk.domain.jjfw.ErpAccessService.response.orderappoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultInfo implements Serializable {
   private String errMsg;
   private Integer pageSize;
   private Integer resultCode;

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

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }
}
