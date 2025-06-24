package com.jd.open.api.sdk.domain.supplier.JosBrandPerformanceInfoService.response.searchBrandPerformanceInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {
   private Integer page;
   private Integer pageSize;
   private Integer total;
   private List<String> rows;

   @JsonProperty("page")
   public void setPage(Integer page) {
      this.page = page;
   }

   @JsonProperty("page")
   public Integer getPage() {
      return this.page;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("total")
   public void setTotal(Integer total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Integer getTotal() {
      return this.total;
   }

   @JsonProperty("rows")
   public void setRows(List<String> rows) {
      this.rows = rows;
   }

   @JsonProperty("rows")
   public List<String> getRows() {
      return this.rows;
   }
}
