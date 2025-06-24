package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.queryResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartResultParam implements Serializable {
   private Integer pageNo;
   private Integer confirmState;
   private Integer pageSize;

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("confirmState")
   public void setConfirmState(Integer confirmState) {
      this.confirmState = confirmState;
   }

   @JsonProperty("confirmState")
   public Integer getConfirmState() {
      return this.confirmState;
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
