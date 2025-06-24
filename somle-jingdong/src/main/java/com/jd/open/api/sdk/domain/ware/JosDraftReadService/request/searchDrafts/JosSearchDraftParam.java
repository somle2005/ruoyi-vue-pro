package com.jd.open.api.sdk.domain.ware.JosDraftReadService.request.searchDrafts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class JosSearchDraftParam implements Serializable {
   private Set<Long> productIds;
   private String productName;
   private Set<Integer> draftComputeStatus;
   private Integer pageNo;
   private Integer pageSize;
   private Date startAuditTime;
   private Date endAuditTime;
   private Date startCreateTime;
   private Date endCreateTime;
   private Date startModified;
   private Date endModified;
   private Integer isPm;
   private List<JosOrderby> josOrderList;

   @JsonProperty("productIds")
   public void setProductIds(Set<Long> productIds) {
      this.productIds = productIds;
   }

   @JsonProperty("productIds")
   public Set<Long> getProductIds() {
      return this.productIds;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("draftComputeStatus")
   public void setDraftComputeStatus(Set<Integer> draftComputeStatus) {
      this.draftComputeStatus = draftComputeStatus;
   }

   @JsonProperty("draftComputeStatus")
   public Set<Integer> getDraftComputeStatus() {
      return this.draftComputeStatus;
   }

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("startAuditTime")
   public void setStartAuditTime(Date startAuditTime) {
      this.startAuditTime = startAuditTime;
   }

   @JsonProperty("startAuditTime")
   public Date getStartAuditTime() {
      return this.startAuditTime;
   }

   @JsonProperty("endAuditTime")
   public void setEndAuditTime(Date endAuditTime) {
      this.endAuditTime = endAuditTime;
   }

   @JsonProperty("endAuditTime")
   public Date getEndAuditTime() {
      return this.endAuditTime;
   }

   @JsonProperty("startCreateTime")
   public void setStartCreateTime(Date startCreateTime) {
      this.startCreateTime = startCreateTime;
   }

   @JsonProperty("startCreateTime")
   public Date getStartCreateTime() {
      return this.startCreateTime;
   }

   @JsonProperty("endCreateTime")
   public void setEndCreateTime(Date endCreateTime) {
      this.endCreateTime = endCreateTime;
   }

   @JsonProperty("endCreateTime")
   public Date getEndCreateTime() {
      return this.endCreateTime;
   }

   @JsonProperty("startModified")
   public void setStartModified(Date startModified) {
      this.startModified = startModified;
   }

   @JsonProperty("startModified")
   public Date getStartModified() {
      return this.startModified;
   }

   @JsonProperty("endModified")
   public void setEndModified(Date endModified) {
      this.endModified = endModified;
   }

   @JsonProperty("endModified")
   public Date getEndModified() {
      return this.endModified;
   }

   @JsonProperty("isPm")
   public void setIsPm(Integer isPm) {
      this.isPm = isPm;
   }

   @JsonProperty("isPm")
   public Integer getIsPm() {
      return this.isPm;
   }

   @JsonProperty("josOrderList")
   public void setJosOrderList(List<JosOrderby> josOrderList) {
      this.josOrderList = josOrderList;
   }

   @JsonProperty("josOrderList")
   public List<JosOrderby> getJosOrderList() {
      return this.josOrderList;
   }
}
