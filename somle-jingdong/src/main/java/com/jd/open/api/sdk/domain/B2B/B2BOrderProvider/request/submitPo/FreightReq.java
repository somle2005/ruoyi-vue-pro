package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class FreightReq implements Serializable {
   private BigDecimal freight;
   private BigDecimal jdFreight;
   private Boolean needValidate;

   @JsonProperty("freight")
   public void setFreight(BigDecimal freight) {
      this.freight = freight;
   }

   @JsonProperty("freight")
   public BigDecimal getFreight() {
      return this.freight;
   }

   @JsonProperty("jdFreight")
   public void setJdFreight(BigDecimal jdFreight) {
      this.jdFreight = jdFreight;
   }

   @JsonProperty("jdFreight")
   public BigDecimal getJdFreight() {
      return this.jdFreight;
   }

   @JsonProperty("needValidate")
   public void setNeedValidate(Boolean needValidate) {
      this.needValidate = needValidate;
   }

   @JsonProperty("needValidate")
   public Boolean getNeedValidate() {
      return this.needValidate;
   }
}
