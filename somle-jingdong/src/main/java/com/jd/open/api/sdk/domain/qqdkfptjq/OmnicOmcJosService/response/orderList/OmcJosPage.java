package com.jd.open.api.sdk.domain.qqdkfptjq.OmnicOmcJosService.response.orderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OmcJosPage implements Serializable {
   private Integer totalItem;
   private Integer pageNo;
   private Integer pageSize;
   private List<OrderModel> data;

   @JsonProperty("totalItem")
   public void setTotalItem(Integer totalItem) {
      this.totalItem = totalItem;
   }

   @JsonProperty("totalItem")
   public Integer getTotalItem() {
      return this.totalItem;
   }

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("data")
   public void setData(List<OrderModel> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<OrderModel> getData() {
      return this.data;
   }
}
