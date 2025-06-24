package com.jd.open.api.sdk.domain.spgl.ProductReadRpcService.response.queryProductInfoByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {
   private Long total;
   private List<ProductInfoDTO> data;

   @JsonProperty("total")
   public void setTotal(Long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Long getTotal() {
      return this.total;
   }

   @JsonProperty("data")
   public void setData(List<ProductInfoDTO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<ProductInfoDTO> getData() {
      return this.data;
   }
}
