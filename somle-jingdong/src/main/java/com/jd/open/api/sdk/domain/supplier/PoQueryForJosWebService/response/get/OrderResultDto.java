package com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderResultDto implements Serializable {
   private Integer pageIndex;
   private Integer pageSize;
   private Integer recordCount;
   private Integer totalPage;
   private List<PurchaseOrderDto> purchaseOrderList;

   @JsonProperty("pageIndex")
   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public Integer getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("recordCount")
   public void setRecordCount(Integer recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public Integer getRecordCount() {
      return this.recordCount;
   }

   @JsonProperty("totalPage")
   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public Integer getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("purchaseOrderList")
   public void setPurchaseOrderList(List<PurchaseOrderDto> purchaseOrderList) {
      this.purchaseOrderList = purchaseOrderList;
   }

   @JsonProperty("purchaseOrderList")
   public List<PurchaseOrderDto> getPurchaseOrderList() {
      return this.purchaseOrderList;
   }
}
