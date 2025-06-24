package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceApplyOrderProvider.request.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ApplyOrderJosQueryParam implements Serializable {
   private List<Integer> invoiceStatusList;
   private Long orderId;
   private String applyTimeOrder;
   private Date orderCompleteTimeStart;
   private Date orderCompleteTimeEnd;
   private Date applyTimeStart;
   private Date applyTimeEnd;
   private Integer pageSize;
   private Integer pageIndex;
   private Long companyId;

   @JsonProperty("invoiceStatusList")
   public void setInvoiceStatusList(List<Integer> invoiceStatusList) {
      this.invoiceStatusList = invoiceStatusList;
   }

   @JsonProperty("invoiceStatusList")
   public List<Integer> getInvoiceStatusList() {
      return this.invoiceStatusList;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("applyTimeOrder")
   public void setApplyTimeOrder(String applyTimeOrder) {
      this.applyTimeOrder = applyTimeOrder;
   }

   @JsonProperty("applyTimeOrder")
   public String getApplyTimeOrder() {
      return this.applyTimeOrder;
   }

   @JsonProperty("orderCompleteTimeStart")
   public void setOrderCompleteTimeStart(Date orderCompleteTimeStart) {
      this.orderCompleteTimeStart = orderCompleteTimeStart;
   }

   @JsonProperty("orderCompleteTimeStart")
   public Date getOrderCompleteTimeStart() {
      return this.orderCompleteTimeStart;
   }

   @JsonProperty("orderCompleteTimeEnd")
   public void setOrderCompleteTimeEnd(Date orderCompleteTimeEnd) {
      this.orderCompleteTimeEnd = orderCompleteTimeEnd;
   }

   @JsonProperty("orderCompleteTimeEnd")
   public Date getOrderCompleteTimeEnd() {
      return this.orderCompleteTimeEnd;
   }

   @JsonProperty("applyTimeStart")
   public void setApplyTimeStart(Date applyTimeStart) {
      this.applyTimeStart = applyTimeStart;
   }

   @JsonProperty("applyTimeStart")
   public Date getApplyTimeStart() {
      return this.applyTimeStart;
   }

   @JsonProperty("applyTimeEnd")
   public void setApplyTimeEnd(Date applyTimeEnd) {
      this.applyTimeEnd = applyTimeEnd;
   }

   @JsonProperty("applyTimeEnd")
   public Date getApplyTimeEnd() {
      return this.applyTimeEnd;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("pageIndex")
   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public Integer getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("companyId")
   public void setCompanyId(Long companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Long getCompanyId() {
      return this.companyId;
   }
}
