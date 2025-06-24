package com.jd.open.api.sdk.domain.ECLP.SamReturnStockService.response.rejectorderinfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SamReturnStockResponse implements Serializable {
   private int code;
   private String msg;
   private List<SamOrderInfo> samOrderInfoList;
   private String totalSize;
   private String pageStart;
   private String pageSize;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("sam_order_info_list")
   public void setSamOrderInfoList(List<SamOrderInfo> samOrderInfoList) {
      this.samOrderInfoList = samOrderInfoList;
   }

   @JsonProperty("sam_order_info_list")
   public List<SamOrderInfo> getSamOrderInfoList() {
      return this.samOrderInfoList;
   }

   @JsonProperty("total_size")
   public void setTotalSize(String totalSize) {
      this.totalSize = totalSize;
   }

   @JsonProperty("total_size")
   public String getTotalSize() {
      return this.totalSize;
   }

   @JsonProperty("page_start")
   public void setPageStart(String pageStart) {
      this.pageStart = pageStart;
   }

   @JsonProperty("page_start")
   public String getPageStart() {
      return this.pageStart;
   }

   @JsonProperty("page_size")
   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("page_size")
   public String getPageSize() {
      return this.pageSize;
   }
}
