package com.jd.open.api.sdk.domain.jyy.VenderAppointOrderFacade.response.getAppointList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AppointListPage implements Serializable {
   private long totalCount;
   private int pageNumber;
   private int pageSize;
   private List<AppointVO> list;

   @JsonProperty("totalCount")
   public void setTotalCount(long totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public long getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("pageNumber")
   public void setPageNumber(int pageNumber) {
      this.pageNumber = pageNumber;
   }

   @JsonProperty("pageNumber")
   public int getPageNumber() {
      return this.pageNumber;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("list")
   public void setList(List<AppointVO> list) {
      this.list = list;
   }

   @JsonProperty("list")
   public List<AppointVO> getList() {
      return this.list;
   }
}
