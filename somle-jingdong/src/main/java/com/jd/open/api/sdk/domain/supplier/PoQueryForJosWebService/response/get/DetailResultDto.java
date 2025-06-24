package com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DetailResultDto implements Serializable {
   private Integer pageIndex;
   private Integer pageSize;
   private Integer recordCount;
   private Integer totalPage;
   private Long orderId;
   private Date deliveryTime;
   private List<PurchaseAllocationDetailDto> allocationDetailList;

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

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("deliveryTime")
   public void setDeliveryTime(Date deliveryTime) {
      this.deliveryTime = deliveryTime;
   }

   @JsonProperty("deliveryTime")
   public Date getDeliveryTime() {
      return this.deliveryTime;
   }

   @JsonProperty("allocationDetailList")
   public void setAllocationDetailList(List<PurchaseAllocationDetailDto> allocationDetailList) {
      this.allocationDetailList = allocationDetailList;
   }

   @JsonProperty("allocationDetailList")
   public List<PurchaseAllocationDetailDto> getAllocationDetailList() {
      return this.allocationDetailList;
   }
}
