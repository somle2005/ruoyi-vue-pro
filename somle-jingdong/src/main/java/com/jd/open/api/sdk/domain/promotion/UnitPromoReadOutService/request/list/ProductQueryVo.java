package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductQueryVo implements Serializable {
   private int pageSize;
   private long promoId;
   private Long skuId;
   private int pageIndex;

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("promoId")
   public void setPromoId(long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("pageIndex")
   public void setPageIndex(int pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public int getPageIndex() {
      return this.pageIndex;
   }
}
