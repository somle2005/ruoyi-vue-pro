package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WaitPageResult implements Serializable {
   private boolean success;
   private String code;
   private String msg;
   private List<WaitProcessResult> data;
   private int pageSize;
   private int pageNumber;
   private int totalCount;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
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

   @JsonProperty("data")
   public void setData(List<WaitProcessResult> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<WaitProcessResult> getData() {
      return this.data;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("pageNumber")
   public void setPageNumber(int pageNumber) {
      this.pageNumber = pageNumber;
   }

   @JsonProperty("pageNumber")
   public int getPageNumber() {
      return this.pageNumber;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(int totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public int getTotalCount() {
      return this.totalCount;
   }
}
