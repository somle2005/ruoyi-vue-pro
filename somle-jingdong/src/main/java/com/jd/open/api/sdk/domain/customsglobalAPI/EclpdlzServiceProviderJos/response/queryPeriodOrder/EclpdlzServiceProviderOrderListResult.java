package com.jd.open.api.sdk.domain.customsglobalAPI.EclpdlzServiceProviderJos.response.queryPeriodOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class EclpdlzServiceProviderOrderListResult implements Serializable {
   private EclpdlzServiceProviderResultHead header;
   private List<String> body;
   private int page;
   private int pageSize;
   private long totalCount;

   @JsonProperty("header")
   public void setHeader(EclpdlzServiceProviderResultHead header) {
      this.header = header;
   }

   @JsonProperty("header")
   public EclpdlzServiceProviderResultHead getHeader() {
      return this.header;
   }

   @JsonProperty("body")
   public void setBody(List<String> body) {
      this.body = body;
   }

   @JsonProperty("body")
   public List<String> getBody() {
      return this.body;
   }

   @JsonProperty("page")
   public void setPage(int page) {
      this.page = page;
   }

   @JsonProperty("page")
   public int getPage() {
      return this.page;
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
}
