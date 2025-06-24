package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.searchShopStockFlow;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ShopStockSearchFlowResponse implements Serializable {
   private int responseCode;
   private String errMsg;
   private int pageCount;
   private int pageSize;
   private List<ShopStockFlowSub> data;
   private String requestId;

   @JsonProperty("responseCode")
   public void setResponseCode(int responseCode) {
      this.responseCode = responseCode;
   }

   @JsonProperty("responseCode")
   public int getResponseCode() {
      return this.responseCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("pageCount")
   public void setPageCount(int pageCount) {
      this.pageCount = pageCount;
   }

   @JsonProperty("pageCount")
   public int getPageCount() {
      return this.pageCount;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("data")
   public void setData(List<ShopStockFlowSub> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<ShopStockFlowSub> getData() {
      return this.data;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }
}
