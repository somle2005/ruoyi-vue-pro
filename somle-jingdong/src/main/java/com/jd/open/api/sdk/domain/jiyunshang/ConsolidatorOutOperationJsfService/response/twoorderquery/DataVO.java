package com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.twoorderquery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DataVO implements Serializable {
   private int totalRows;
   private int pageSize;
   private int currentPage;
   private TwoOrderVO[] list;

   @JsonProperty("totalRows")
   public void setTotalRows(int totalRows) {
      this.totalRows = totalRows;
   }

   @JsonProperty("totalRows")
   public int getTotalRows() {
      return this.totalRows;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("currentPage")
   public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
   }

   @JsonProperty("currentPage")
   public int getCurrentPage() {
      return this.currentPage;
   }

   @JsonProperty("list")
   public void setList(TwoOrderVO[] list) {
      this.list = list;
   }

   @JsonProperty("list")
   public TwoOrderVO[] getList() {
      return this.list;
   }
}
