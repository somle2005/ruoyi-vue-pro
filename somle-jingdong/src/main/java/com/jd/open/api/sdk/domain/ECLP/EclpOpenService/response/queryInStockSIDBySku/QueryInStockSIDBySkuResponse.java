package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryInStockSIDBySku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class QueryInStockSIDBySkuResponse implements Serializable {
   private Integer total;
   private Integer pageSize;
   private Integer pageNo;
   private List<String[]> serialNos;

   @JsonProperty("total")
   public void setTotal(Integer total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Integer getTotal() {
      return this.total;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("serialNos")
   public void setSerialNos(List<String[]> serialNos) {
      this.serialNos = serialNos;
   }

   @JsonProperty("serialNos")
   public List<String[]> getSerialNos() {
      return this.serialNos;
   }
}
