package com.jd.open.api.sdk.domain.ware.KeeperWareAuditService.response.getWareAuditDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ViolationDetail implements Serializable {
   private String marks;

   @JsonProperty("marks")
   public void setMarks(String marks) {
      this.marks = marks;
   }

   @JsonProperty("marks")
   public String getMarks() {
      return this.marks;
   }
}
