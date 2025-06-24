package com.jd.open.api.sdk.domain.ware.JOSMaterialService.response.unbind;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class JosUnbindResult implements Serializable {
   private Set<Long> successIds;
   private Set<Long> failIds;

   @JsonProperty("successIds")
   public void setSuccessIds(Set<Long> successIds) {
      this.successIds = successIds;
   }

   @JsonProperty("successIds")
   public Set<Long> getSuccessIds() {
      return this.successIds;
   }

   @JsonProperty("failIds")
   public void setFailIds(Set<Long> failIds) {
      this.failIds = failIds;
   }

   @JsonProperty("failIds")
   public Set<Long> getFailIds() {
      return this.failIds;
   }
}
