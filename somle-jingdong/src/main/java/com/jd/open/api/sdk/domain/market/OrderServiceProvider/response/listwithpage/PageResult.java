package com.jd.open.api.sdk.domain.market.OrderServiceProvider.response.listwithpage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {
   private int totalPage;
   private int pageSize;
   private int errorCode;
   private int currentPage;
   private int totalCount;
   private boolean isSuccess;
   private String errorMsg;
   private List<OrderVO> orderList;

   @JsonProperty("totalPage")
   public void setTotalPage(int totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public int getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(int errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public int getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("currentPage")
   public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
   }

   @JsonProperty("currentPage")
   public int getCurrentPage() {
      return this.currentPage;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(int totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public int getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("isSuccess")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public boolean getIsSuccess() {
      return this.isSuccess;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("orderList")
   public void setOrderList(List<OrderVO> orderList) {
      this.orderList = orderList;
   }

   @JsonProperty("orderList")
   public List<OrderVO> getOrderList() {
      return this.orderList;
   }
}
