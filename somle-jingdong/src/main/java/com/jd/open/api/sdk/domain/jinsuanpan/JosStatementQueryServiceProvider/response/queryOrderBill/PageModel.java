package com.jd.open.api.sdk.domain.jinsuanpan.JosStatementQueryServiceProvider.response.queryOrderBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageModel implements Serializable {
   private long totalElements;
   private Integer pageIndex;
   private Integer pageSize;
   private List<OrderBillStatementVo> content;

   @JsonProperty("totalElements")
   public void setTotalElements(long totalElements) {
      this.totalElements = totalElements;
   }

   @JsonProperty("totalElements")
   public long getTotalElements() {
      return this.totalElements;
   }

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

   @JsonProperty("content")
   public void setContent(List<OrderBillStatementVo> content) {
      this.content = content;
   }

   @JsonProperty("content")
   public List<OrderBillStatementVo> getContent() {
      return this.content;
   }
}
