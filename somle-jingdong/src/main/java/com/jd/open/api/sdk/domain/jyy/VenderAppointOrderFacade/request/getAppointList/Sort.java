package com.jd.open.api.sdk.domain.jyy.VenderAppointOrderFacade.request.getAppointList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Sort implements Serializable {
   private Direction direction;
   private String fieldName;

   @JsonProperty("direction")
   public void setDirection(Direction direction) {
      this.direction = direction;
   }

   @JsonProperty("direction")
   public Direction getDirection() {
      return this.direction;
   }

   @JsonProperty("fieldName")
   public void setFieldName(String fieldName) {
      this.fieldName = fieldName;
   }

   @JsonProperty("fieldName")
   public String getFieldName() {
      return this.fieldName;
   }
}
