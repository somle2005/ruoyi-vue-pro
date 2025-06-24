package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.flowLog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductQueryVo implements Serializable {
   private int pageSize;
   private long promoId;
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

   @JsonProperty("pageIndex")
   public void setPageIndex(int pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public int getPageIndex() {
      return this.pageIndex;
   }
}
