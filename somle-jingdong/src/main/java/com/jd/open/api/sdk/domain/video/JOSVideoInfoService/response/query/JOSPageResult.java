package com.jd.open.api.sdk.domain.video.JOSVideoInfoService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JOSPageResult implements Serializable {
   private Integer pageIndex;
   private Integer pageSize;
   private Integer totalCount;
   private List<JOSVideoInfo> data;

   @JsonProperty("page_index")
   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("page_index")
   public Integer getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("page_size")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("page_size")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("total_count")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("total_count")
   public Integer getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("data")
   public void setData(List<JOSVideoInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<JOSVideoInfo> getData() {
      return this.data;
   }
}
