package com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JOSPageResult implements Serializable {
   private Integer pageIndex;
   private Integer pageSize;
   private Integer totalCount;
   private List<JOSVideoSkuRelative> data;

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

   @JsonProperty("totalCount")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Integer getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("data")
   public void setData(List<JOSVideoSkuRelative> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<JOSVideoSkuRelative> getData() {
      return this.data;
   }
}
