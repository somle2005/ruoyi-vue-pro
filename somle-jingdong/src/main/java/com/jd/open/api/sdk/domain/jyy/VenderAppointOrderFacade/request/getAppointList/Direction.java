package com.jd.open.api.sdk.domain.jyy.VenderAppointOrderFacade.request.getAppointList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Direction implements Serializable {
   private String description;

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("description")
   public String getDescription() {
      return this.description;
   }
}
