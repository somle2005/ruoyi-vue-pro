package com.jd.open.api.sdk.domain.youE.CollectedJsfService.request.collected;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CollectedOrder implements Serializable {
   private String orderNo;
   private String oldInBarcode;
   private String oldOutBarcode;
   private String oldBarcode1;
   private String oldBarcode2;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("oldInBarcode")
   public void setOldInBarcode(String oldInBarcode) {
      this.oldInBarcode = oldInBarcode;
   }

   @JsonProperty("oldInBarcode")
   public String getOldInBarcode() {
      return this.oldInBarcode;
   }

   @JsonProperty("oldOutBarcode")
   public void setOldOutBarcode(String oldOutBarcode) {
      this.oldOutBarcode = oldOutBarcode;
   }

   @JsonProperty("oldOutBarcode")
   public String getOldOutBarcode() {
      return this.oldOutBarcode;
   }

   @JsonProperty("oldBarcode1")
   public void setOldBarcode1(String oldBarcode1) {
      this.oldBarcode1 = oldBarcode1;
   }

   @JsonProperty("oldBarcode1")
   public String getOldBarcode1() {
      return this.oldBarcode1;
   }

   @JsonProperty("oldBarcode2")
   public void setOldBarcode2(String oldBarcode2) {
      this.oldBarcode2 = oldBarcode2;
   }

   @JsonProperty("oldBarcode2")
   public String getOldBarcode2() {
      return this.oldBarcode2;
   }
}
