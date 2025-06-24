package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.commitDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class JosLineationPrice implements Serializable {
   private Integer lpType;
   private BigDecimal lineationPrice;
   private String lpUrl;

   @JsonProperty("lpType")
   public void setLpType(Integer lpType) {
      this.lpType = lpType;
   }

   @JsonProperty("lpType")
   public Integer getLpType() {
      return this.lpType;
   }

   @JsonProperty("lineationPrice")
   public void setLineationPrice(BigDecimal lineationPrice) {
      this.lineationPrice = lineationPrice;
   }

   @JsonProperty("lineationPrice")
   public BigDecimal getLineationPrice() {
      return this.lineationPrice;
   }

   @JsonProperty("lpUrl")
   public void setLpUrl(String lpUrl) {
      this.lpUrl = lpUrl;
   }

   @JsonProperty("lpUrl")
   public String getLpUrl() {
      return this.lpUrl;
   }
}
