package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.request.getUnitFlowLogList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromoQueryVO implements Serializable {
   private Integer pageSize;
   private Integer pageIndex;
   private String promoId;

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("pageIndex")
   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public Integer getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("promoId")
   public void setPromoId(String promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public String getPromoId() {
      return this.promoId;
   }
}
