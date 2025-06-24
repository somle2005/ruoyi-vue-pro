package com.jd.open.api.sdk.domain.c2mdzkfpt.CustomOrderInfoOpenService.request.getOrderCustomInfos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class CustomOrderInfoBatchQueryEntity implements Serializable {
   private String supplier;
   private Long coId;
   private Integer pageSize;
   private Date startTime;
   private Date endTime;
   private Integer page;
   private Date orderCreateStartTime;
   private Date orderCreateEndTime;

   @JsonProperty("supplier")
   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }

   @JsonProperty("supplier")
   public String getSupplier() {
      return this.supplier;
   }

   @JsonProperty("coId")
   public void setCoId(Long coId) {
      this.coId = coId;
   }

   @JsonProperty("coId")
   public Long getCoId() {
      return this.coId;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("startTime")
   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public Date getStartTime() {
      return this.startTime;
   }

   @JsonProperty("endTime")
   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Date getEndTime() {
      return this.endTime;
   }

   @JsonProperty("page")
   public void setPage(Integer page) {
      this.page = page;
   }

   @JsonProperty("page")
   public Integer getPage() {
      return this.page;
   }

   @JsonProperty("orderCreateStartTime")
   public void setOrderCreateStartTime(Date orderCreateStartTime) {
      this.orderCreateStartTime = orderCreateStartTime;
   }

   @JsonProperty("orderCreateStartTime")
   public Date getOrderCreateStartTime() {
      return this.orderCreateStartTime;
   }

   @JsonProperty("orderCreateEndTime")
   public void setOrderCreateEndTime(Date orderCreateEndTime) {
      this.orderCreateEndTime = orderCreateEndTime;
   }

   @JsonProperty("orderCreateEndTime")
   public Date getOrderCreateEndTime() {
      return this.orderCreateEndTime;
   }
}
