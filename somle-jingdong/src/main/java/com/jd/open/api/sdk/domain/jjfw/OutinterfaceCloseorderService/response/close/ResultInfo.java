package com.jd.open.api.sdk.domain.jjfw.OutinterfaceCloseorderService.response.close;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private Integer resultCode;
   private String errMsg;
   private List<ColseOrder> closeOrderList;
   private Integer pageSize;

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

   @JsonProperty("closeOrderList")
   public void setCloseOrderList(List<ColseOrder> closeOrderList) {
      this.closeOrderList = closeOrderList;
   }

   @JsonProperty("closeOrderList")
   public List<ColseOrder> getCloseOrderList() {
      return this.closeOrderList;
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
