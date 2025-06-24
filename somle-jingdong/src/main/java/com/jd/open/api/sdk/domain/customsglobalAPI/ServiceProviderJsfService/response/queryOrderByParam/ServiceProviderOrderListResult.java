package com.jd.open.api.sdk.domain.customsglobalAPI.ServiceProviderJsfService.response.queryOrderByParam;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ServiceProviderOrderListResult implements Serializable {
   private int pageSize;
   private int page;
   private List<String> body;
   private long totalCount;
   private ServiceProviderResultHead header;

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("page")
   public void setPage(int page) {
      this.page = page;
   }

   @JsonProperty("page")
   public int getPage() {
      return this.page;
   }

   @JsonProperty("body")
   public void setBody(List<String> body) {
      this.body = body;
   }

   @JsonProperty("body")
   public List<String> getBody() {
      return this.body;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(long totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public long getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("header")
   public void setHeader(ServiceProviderResultHead header) {
      this.header = header;
   }

   @JsonProperty("header")
   public ServiceProviderResultHead getHeader() {
      return this.header;
   }
}
