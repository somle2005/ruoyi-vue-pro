package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PaginatedList implements Serializable {
   private Long total;
   private List<UnitPromotionSkuVO> dataList;

   @JsonProperty("total")
   public void setTotal(Long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Long getTotal() {
      return this.total;
   }

   @JsonProperty("dataList")
   public void setDataList(List<UnitPromotionSkuVO> dataList) {
      this.dataList = dataList;
   }

   @JsonProperty("dataList")
   public List<UnitPromotionSkuVO> getDataList() {
      return this.dataList;
   }
}
