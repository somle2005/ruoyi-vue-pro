package com.jd.open.api.sdk.domain.refundapply.OrderAdjustResultService.response.OrderAdjustResultService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class AdjustSkuLineDto implements Serializable {
   private String skuUuid;
   private Integer adjustSkuNumber;
   private Long skuId;
   private BigDecimal adjustAmount;

   @JsonProperty("skuUuid")
   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String getSkuUuid() {
      return this.skuUuid;
   }

   @JsonProperty("adjustSkuNumber")
   public void setAdjustSkuNumber(Integer adjustSkuNumber) {
      this.adjustSkuNumber = adjustSkuNumber;
   }

   @JsonProperty("adjustSkuNumber")
   public Integer getAdjustSkuNumber() {
      return this.adjustSkuNumber;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("adjustAmount")
   public void setAdjustAmount(BigDecimal adjustAmount) {
      this.adjustAmount = adjustAmount;
   }

   @JsonProperty("adjustAmount")
   public BigDecimal getAdjustAmount() {
      return this.adjustAmount;
   }
}
