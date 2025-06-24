package com.jd.open.api.sdk.domain.youE.OrderFinishExportService.request.orderFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FailureTreeInfo implements Serializable {
   private String failureName;
   private String failureReason;
   private String fixMethod;
   private String repairObj;

   @JsonProperty("failureName")
   public void setFailureName(String failureName) {
      this.failureName = failureName;
   }

   @JsonProperty("failureName")
   public String getFailureName() {
      return this.failureName;
   }

   @JsonProperty("failureReason")
   public void setFailureReason(String failureReason) {
      this.failureReason = failureReason;
   }

   @JsonProperty("failureReason")
   public String getFailureReason() {
      return this.failureReason;
   }

   @JsonProperty("fixMethod")
   public void setFixMethod(String fixMethod) {
      this.fixMethod = fixMethod;
   }

   @JsonProperty("fixMethod")
   public String getFixMethod() {
      return this.fixMethod;
   }

   @JsonProperty("repairObj")
   public void setRepairObj(String repairObj) {
      this.repairObj = repairObj;
   }

   @JsonProperty("repairObj")
   public String getRepairObj() {
      return this.repairObj;
   }
}
