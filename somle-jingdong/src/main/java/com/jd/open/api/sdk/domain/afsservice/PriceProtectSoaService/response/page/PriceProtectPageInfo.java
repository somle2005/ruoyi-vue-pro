package com.jd.open.api.sdk.domain.afsservice.PriceProtectSoaService.response.page;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PriceProtectPageInfo implements Serializable {
   private List<PriceProtectRecordDto> result;
   private String totalAmount;
   private Long totalItems;
   private Long pageIndex;
   private Long totalPages;
   private Long pageSize;
   private String errorCode;
   private String remark;
   private String errorMsg;

   @JsonProperty("result")
   public void setResult(List<PriceProtectRecordDto> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<PriceProtectRecordDto> getResult() {
      return this.result;
   }

   @JsonProperty("totalAmount")
   public void setTotalAmount(String totalAmount) {
      this.totalAmount = totalAmount;
   }

   @JsonProperty("totalAmount")
   public String getTotalAmount() {
      return this.totalAmount;
   }

   @JsonProperty("totalItems")
   public void setTotalItems(Long totalItems) {
      this.totalItems = totalItems;
   }

   @JsonProperty("totalItems")
   public Long getTotalItems() {
      return this.totalItems;
   }

   @JsonProperty("pageIndex")
   public void setPageIndex(Long pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public Long getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("totalPages")
   public void setTotalPages(Long totalPages) {
      this.totalPages = totalPages;
   }

   @JsonProperty("totalPages")
   public Long getTotalPages() {
      return this.totalPages;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Long pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Long getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}
