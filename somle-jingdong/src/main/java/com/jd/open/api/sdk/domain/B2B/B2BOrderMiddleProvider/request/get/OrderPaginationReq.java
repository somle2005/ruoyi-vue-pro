package com.jd.open.api.sdk.domain.B2B.B2BOrderMiddleProvider.request.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class OrderPaginationReq implements Serializable {
   private Integer pageIndex;
   private Integer pageSize;
   private Integer orderTier;
   private Integer sortType;
   private Date submitOrderTimeFrom;
   private Date submitOrderTimeTo;
   private Integer[] jdOrderState;
   private Integer deliverState;
   private Map<String, String> extInfo;
   private Integer orderPlatform;
   private Set<Integer> orderSource;
   private SpecSearchInfoReq specSearchInfoReq;

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

   @JsonProperty("orderTier")
   public void setOrderTier(Integer orderTier) {
      this.orderTier = orderTier;
   }

   @JsonProperty("orderTier")
   public Integer getOrderTier() {
      return this.orderTier;
   }

   @JsonProperty("sortType")
   public void setSortType(Integer sortType) {
      this.sortType = sortType;
   }

   @JsonProperty("sortType")
   public Integer getSortType() {
      return this.sortType;
   }

   @JsonProperty("submitOrderTimeFrom")
   public void setSubmitOrderTimeFrom(Date submitOrderTimeFrom) {
      this.submitOrderTimeFrom = submitOrderTimeFrom;
   }

   @JsonProperty("submitOrderTimeFrom")
   public Date getSubmitOrderTimeFrom() {
      return this.submitOrderTimeFrom;
   }

   @JsonProperty("submitOrderTimeTo")
   public void setSubmitOrderTimeTo(Date submitOrderTimeTo) {
      this.submitOrderTimeTo = submitOrderTimeTo;
   }

   @JsonProperty("submitOrderTimeTo")
   public Date getSubmitOrderTimeTo() {
      return this.submitOrderTimeTo;
   }

   @JsonProperty("jdOrderState")
   public void setJdOrderState(Integer[] jdOrderState) {
      this.jdOrderState = jdOrderState;
   }

   @JsonProperty("jdOrderState")
   public Integer[] getJdOrderState() {
      return this.jdOrderState;
   }

   @JsonProperty("deliverState")
   public void setDeliverState(Integer deliverState) {
      this.deliverState = deliverState;
   }

   @JsonProperty("deliverState")
   public Integer getDeliverState() {
      return this.deliverState;
   }

   @JsonProperty("extInfo")
   public void setExtInfo(Map<String, String> extInfo) {
      this.extInfo = extInfo;
   }

   @JsonProperty("extInfo")
   public Map<String, String> getExtInfo() {
      return this.extInfo;
   }

   @JsonProperty("orderPlatform")
   public void setOrderPlatform(Integer orderPlatform) {
      this.orderPlatform = orderPlatform;
   }

   @JsonProperty("orderPlatform")
   public Integer getOrderPlatform() {
      return this.orderPlatform;
   }

   @JsonProperty("orderSource")
   public void setOrderSource(Set<Integer> orderSource) {
      this.orderSource = orderSource;
   }

   @JsonProperty("orderSource")
   public Set<Integer> getOrderSource() {
      return this.orderSource;
   }

   @JsonProperty("specSearchInfoReq")
   public void setSpecSearchInfoReq(SpecSearchInfoReq specSearchInfoReq) {
      this.specSearchInfoReq = specSearchInfoReq;
   }

   @JsonProperty("specSearchInfoReq")
   public SpecSearchInfoReq getSpecSearchInfoReq() {
      return this.specSearchInfoReq;
   }
}
