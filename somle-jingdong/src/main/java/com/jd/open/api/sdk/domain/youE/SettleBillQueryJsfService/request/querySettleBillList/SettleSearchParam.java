package com.jd.open.api.sdk.domain.youE.SettleBillQueryJsfService.request.querySettleBillList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SettleSearchParam implements Serializable {
   private List<String> itemCatIds;
   private Integer pageNo;
   private Integer pageSize;

   @JsonProperty("itemCatIds")
   public void setItemCatIds(List<String> itemCatIds) {
      this.itemCatIds = itemCatIds;
   }

   @JsonProperty("itemCatIds")
   public List<String> getItemCatIds() {
      return this.itemCatIds;
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
}
