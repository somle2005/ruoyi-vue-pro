package com.jd.open.api.sdk.domain.ware.ProductWrapService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SearchResult implements Serializable {
   private int code;
   private long total;
   private List<Long[]> skuList;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("total")
   public void setTotal(long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public long getTotal() {
      return this.total;
   }

   @JsonProperty("skuList")
   public void setSkuList(List<Long[]> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<Long[]> getSkuList() {
      return this.skuList;
   }
}
