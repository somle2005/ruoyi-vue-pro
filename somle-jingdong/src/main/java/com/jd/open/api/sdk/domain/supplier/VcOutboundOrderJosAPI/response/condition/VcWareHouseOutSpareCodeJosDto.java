package com.jd.open.api.sdk.domain.supplier.VcOutboundOrderJosAPI.response.condition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class VcWareHouseOutSpareCodeJosDto implements Serializable {
   private BigDecimal returnPrice;
   private String wareSku;
   private String wareName;
   private String remark;
   private String snNo;
   private String spareCode;

   @JsonProperty("returnPrice")
   public void setReturnPrice(BigDecimal returnPrice) {
      this.returnPrice = returnPrice;
   }

   @JsonProperty("returnPrice")
   public BigDecimal getReturnPrice() {
      return this.returnPrice;
   }

   @JsonProperty("wareSku")
   public void setWareSku(String wareSku) {
      this.wareSku = wareSku;
   }

   @JsonProperty("wareSku")
   public String getWareSku() {
      return this.wareSku;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("snNo")
   public void setSnNo(String snNo) {
      this.snNo = snNo;
   }

   @JsonProperty("snNo")
   public String getSnNo() {
      return this.snNo;
   }

   @JsonProperty("spareCode")
   public void setSpareCode(String spareCode) {
      this.spareCode = spareCode;
   }

   @JsonProperty("spareCode")
   public String getSpareCode() {
      return this.spareCode;
   }
}
