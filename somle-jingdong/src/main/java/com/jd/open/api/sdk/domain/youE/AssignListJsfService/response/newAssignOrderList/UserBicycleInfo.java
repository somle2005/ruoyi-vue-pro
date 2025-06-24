package com.jd.open.api.sdk.domain.youE.AssignListJsfService.response.newAssignOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UserBicycleInfo implements Serializable {
   private String oldBattCate;
   private String oldBicyLPN;
   private String oldBicyVIN;

   @JsonProperty("oldBattCate")
   public void setOldBattCate(String oldBattCate) {
      this.oldBattCate = oldBattCate;
   }

   @JsonProperty("oldBattCate")
   public String getOldBattCate() {
      return this.oldBattCate;
   }

   @JsonProperty("oldBicyLPN")
   public void setOldBicyLPN(String oldBicyLPN) {
      this.oldBicyLPN = oldBicyLPN;
   }

   @JsonProperty("oldBicyLPN")
   public String getOldBicyLPN() {
      return this.oldBicyLPN;
   }

   @JsonProperty("oldBicyVIN")
   public void setOldBicyVIN(String oldBicyVIN) {
      this.oldBicyVIN = oldBicyVIN;
   }

   @JsonProperty("oldBicyVIN")
   public String getOldBicyVIN() {
      return this.oldBicyVIN;
   }
}
