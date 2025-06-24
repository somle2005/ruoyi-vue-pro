package com.jd.open.api.sdk.domain.hddy.AppleSaleInfoJsfService.response.findListByParam;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Page implements Serializable {
   private Integer total;
   private Integer pages;
   private Integer pageSize;
   private Integer page;
   private AppleSaleInfo[] rows;

   @JsonProperty("total")
   public void setTotal(Integer total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Integer getTotal() {
      return this.total;
   }

   @JsonProperty("pages")
   public void setPages(Integer pages) {
      this.pages = pages;
   }

   @JsonProperty("pages")
   public Integer getPages() {
      return this.pages;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("page")
   public void setPage(Integer page) {
      this.page = page;
   }

   @JsonProperty("page")
   public Integer getPage() {
      return this.page;
   }

   @JsonProperty("rows")
   public void setRows(AppleSaleInfo[] rows) {
      this.rows = rows;
   }

   @JsonProperty("rows")
   public AppleSaleInfo[] getRows() {
      return this.rows;
   }
}
