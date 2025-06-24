package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class MachiningDestDetail implements Serializable {
   private String destOwnerNo;
   private String destSkuNo;
   private String destProductLevel;
   private BigDecimal destQty;

   @JsonProperty("destOwnerNo")
   public void setDestOwnerNo(String destOwnerNo) {
      this.destOwnerNo = destOwnerNo;
   }

   @JsonProperty("destOwnerNo")
   public String getDestOwnerNo() {
      return this.destOwnerNo;
   }

   @JsonProperty("destSkuNo")
   public void setDestSkuNo(String destSkuNo) {
      this.destSkuNo = destSkuNo;
   }

   @JsonProperty("destSkuNo")
   public String getDestSkuNo() {
      return this.destSkuNo;
   }

   @JsonProperty("destProductLevel")
   public void setDestProductLevel(String destProductLevel) {
      this.destProductLevel = destProductLevel;
   }

   @JsonProperty("destProductLevel")
   public String getDestProductLevel() {
      return this.destProductLevel;
   }

   @JsonProperty("destQty")
   public void setDestQty(BigDecimal destQty) {
      this.destQty = destQty;
   }

   @JsonProperty("destQty")
   public BigDecimal getDestQty() {
      return this.destQty;
   }
}
