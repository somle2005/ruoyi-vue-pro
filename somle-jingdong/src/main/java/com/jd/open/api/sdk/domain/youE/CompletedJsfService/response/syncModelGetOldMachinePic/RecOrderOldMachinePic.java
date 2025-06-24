package com.jd.open.api.sdk.domain.youE.CompletedJsfService.response.syncModelGetOldMachinePic;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RecOrderOldMachinePic implements Serializable {
   private String nameplatePic;
   private String orderNo;
   private String machinePic;

   @JsonProperty("nameplatePic")
   public void setNameplatePic(String nameplatePic) {
      this.nameplatePic = nameplatePic;
   }

   @JsonProperty("nameplatePic")
   public String getNameplatePic() {
      return this.nameplatePic;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("machinePic")
   public void setMachinePic(String machinePic) {
      this.machinePic = machinePic;
   }

   @JsonProperty("machinePic")
   public String getMachinePic() {
      return this.machinePic;
   }
}
