package com.jd.open.api.sdk.domain.evaluation.PopCommentJsfService.response.getCommentSummarys;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class CommentSummaryUgcVo implements Serializable {
   private Long skuId;
   private BigDecimal goodRate;
   private Integer goodRateShow;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("goodRate")
   public void setGoodRate(BigDecimal goodRate) {
      this.goodRate = goodRate;
   }

   @JsonProperty("goodRate")
   public BigDecimal getGoodRate() {
      return this.goodRate;
   }

   @JsonProperty("goodRateShow")
   public void setGoodRateShow(Integer goodRateShow) {
      this.goodRateShow = goodRateShow;
   }

   @JsonProperty("goodRateShow")
   public Integer getGoodRateShow() {
      return this.goodRateShow;
   }
}
