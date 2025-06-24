package com.jd.open.api.sdk.domain.ware.SeriesProductJosReadService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SeriesProductPage implements Serializable {
   private Long total;
   private Integer pageIndex;
   private Integer pageSize;
   private List<SeriesProductVo> series;

   @JsonProperty("total")
   public void setTotal(Long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Long getTotal() {
      return this.total;
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

   @JsonProperty("series")
   public void setSeries(List<SeriesProductVo> series) {
      this.series = series;
   }

   @JsonProperty("series")
   public List<SeriesProductVo> getSeries() {
      return this.series;
   }
}
