package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.queryResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PerformResult implements Serializable {
   private String msg;
   private Integer pageCount;
   private Integer resultCode;
   private Integer totalCount;
   private Integer pageSize;
   private SparePartResult data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("pageCount")
   public void setPageCount(Integer pageCount) {
      this.pageCount = pageCount;
   }

   @JsonProperty("pageCount")
   public Integer getPageCount() {
      return this.pageCount;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Integer getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("data")
   public void setData(SparePartResult data) {
      this.data = data;
   }

   @JsonProperty("data")
   public SparePartResult getData() {
      return this.data;
   }
}
