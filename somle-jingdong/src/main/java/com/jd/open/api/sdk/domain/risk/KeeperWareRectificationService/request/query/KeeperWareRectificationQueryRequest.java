package com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.request.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class KeeperWareRectificationQueryRequest implements Serializable {
   private String reason;
   private Integer rectifyTimeSort;
   private Long wareId;
   private Integer pageNo;
   private Integer pageSize;
   private String wareName;

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("rectifyTimeSort")
   public void setRectifyTimeSort(Integer rectifyTimeSort) {
      this.rectifyTimeSort = rectifyTimeSort;
   }

   @JsonProperty("rectifyTimeSort")
   public Integer getRectifyTimeSort() {
      return this.rectifyTimeSort;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
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

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }
}
