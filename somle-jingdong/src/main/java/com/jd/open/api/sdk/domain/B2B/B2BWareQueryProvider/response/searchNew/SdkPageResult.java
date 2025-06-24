package com.jd.open.api.sdk.domain.B2B.B2BWareQueryProvider.response.searchNew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SdkPageResult implements Serializable {
   private int pageCount;
   private String resultCode;
   private int totalItem;
   private int pageNo;
   private List<BSkuInfoDto> result;
   private String resultMessage;
   private int pageSize;
   private String reqId;
   private boolean success;

   @JsonProperty("pageCount")
   public void setPageCount(int pageCount) {
      this.pageCount = pageCount;
   }

   @JsonProperty("pageCount")
   public int getPageCount() {
      return this.pageCount;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
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

   @JsonProperty("result")
   public void setResult(List<BSkuInfoDto> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<BSkuInfoDto> getResult() {
      return this.result;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
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

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }
}
