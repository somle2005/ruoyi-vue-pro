package com.jd.open.api.sdk.domain.order.OutShipJosService.request.outship;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosRequest implements Serializable {
   private List<BatchStockOutOrder> data;
   private Integer belongType;

   @JsonProperty("data")
   public void setData(List<BatchStockOutOrder> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<BatchStockOutOrder> getData() {
      return this.data;
   }

   @JsonProperty("belongType")
   public void setBelongType(Integer belongType) {
      this.belongType = belongType;
   }

   @JsonProperty("belongType")
   public Integer getBelongType() {
      return this.belongType;
   }
}
