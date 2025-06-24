package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceApplyOrderProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageMO implements Serializable {
   private int pageIndex;
   private int pageSize;
   private long totalCount;
   private List<ApplyOrderJosVo> list;

   @JsonProperty("pageIndex")
   public void setPageIndex(int pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public int getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(long totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public long getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("list")
   public void setList(List<ApplyOrderJosVo> list) {
      this.list = list;
   }

   @JsonProperty("list")
   public List<ApplyOrderJosVo> getList() {
      return this.list;
   }
}
