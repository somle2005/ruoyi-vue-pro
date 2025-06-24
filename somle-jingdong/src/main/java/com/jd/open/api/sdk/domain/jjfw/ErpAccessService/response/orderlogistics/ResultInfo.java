package com.jd.open.api.sdk.domain.jjfw.ErpAccessService.response.orderlogistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private List<Map> orderProcessesList;
   private String errMsg;
   private Integer pageSize;
   private Integer resultCode;

   @JsonProperty("orderProcessesList")
   public void setOrderProcessesList(List<Map> orderProcessesList) {
      this.orderProcessesList = orderProcessesList;
   }

   @JsonProperty("orderProcessesList")
   public List<Map> getOrderProcessesList() {
      return this.orderProcessesList;
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

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }
}
