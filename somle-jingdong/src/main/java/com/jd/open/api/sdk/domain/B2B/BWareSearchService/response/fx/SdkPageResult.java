package com.jd.open.api.sdk.domain.B2B.BWareSearchService.response.fx;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SdkPageResult implements Serializable {
   private int pageCount;
   private String code;
   private int totalItem;
   private int pageNo;
   private List<BizSkuDto> dataList;
   private String errorMessage;
   private int pageSize;
   private String reqId;
   private boolean isSuccess;

   @JsonProperty("pageCount")
   public void setPageCount(int pageCount) {
      this.pageCount = pageCount;
   }

   @JsonProperty("pageCount")
   public int getPageCount() {
      return this.pageCount;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("totalItem")
   public void setTotalItem(int totalItem) {
      this.totalItem = totalItem;
   }

   @JsonProperty("totalItem")
   public int getTotalItem() {
      return this.totalItem;
   }

   @JsonProperty("pageNo")
   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public int getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("dataList")
   public void setDataList(List<BizSkuDto> dataList) {
      this.dataList = dataList;
   }

   @JsonProperty("dataList")
   public List<BizSkuDto> getDataList() {
      return this.dataList;
   }

   @JsonProperty("errorMessage")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("errorMessage")
   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("reqId")
   public void setReqId(String reqId) {
      this.reqId = reqId;
   }

   @JsonProperty("reqId")
   public String getReqId() {
      return this.reqId;
   }

   @JsonProperty("isSuccess")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public boolean getIsSuccess() {
      return this.isSuccess;
   }
}
