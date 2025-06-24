package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class AdditionalPaymentResp implements Serializable {
   private Integer type;
   private String code;
   private BigDecimal amount;
   private String description;

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("amount")
   public void setAmount(BigDecimal amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public BigDecimal getAmount() {
      return this.amount;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("description")
   public String getDescription() {
      return this.description;
   }
}
