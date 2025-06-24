package com.jd.open.api.sdk.domain.ware.KeeperWareAuditService.response.getWareAuditDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AuditReason implements Serializable {
   private String firstName;
   private String thirdName;
   private String secondName;

   @JsonProperty("firstName")
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   @JsonProperty("firstName")
   public String getFirstName() {
      return this.firstName;
   }

   @JsonProperty("thirdName")
   public void setThirdName(String thirdName) {
      this.thirdName = thirdName;
   }

   @JsonProperty("thirdName")
   public String getThirdName() {
      return this.thirdName;
   }

   @JsonProperty("secondName")
   public void setSecondName(String secondName) {
      this.secondName = secondName;
   }

   @JsonProperty("secondName")
   public String getSecondName() {
      return this.secondName;
   }
}
