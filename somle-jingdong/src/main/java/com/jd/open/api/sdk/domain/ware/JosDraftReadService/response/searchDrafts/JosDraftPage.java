package com.jd.open.api.sdk.domain.ware.JosDraftReadService.response.searchDrafts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosDraftPage implements Serializable {
   private long total;
   private List<JosSearchDraft> data;
   private int pageNo;
   private int pageSize;

   @JsonProperty("total")
   public void setTotal(long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public long getTotal() {
      return this.total;
   }

   @JsonProperty("data")
   public void setData(List<JosSearchDraft> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<JosSearchDraft> getData() {
      return this.data;
   }

   @JsonProperty("pageNo")
   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public int getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }
}
