package com.jd.open.api.sdk.domain.plgz.BrandOperateFacade.response.queryOperateBrand;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageList implements Serializable {
   private int pageNum;
   private int pageSize;
   private List<BrandOperateFacade> content;
   private long totalElements;

   @JsonProperty("pageNum")
   public void setPageNum(int pageNum) {
      this.pageNum = pageNum;
   }

   @JsonProperty("pageNum")
   public int getPageNum() {
      return this.pageNum;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("content")
   public void setContent(List<BrandOperateFacade> content) {
      this.content = content;
   }

   @JsonProperty("content")
   public List<BrandOperateFacade> getContent() {
      return this.content;
   }

   @JsonProperty("totalElements")
   public void setTotalElements(long totalElements) {
      this.totalElements = totalElements;
   }

   @JsonProperty("totalElements")
   public long getTotalElements() {
      return this.totalElements;
   }
}
