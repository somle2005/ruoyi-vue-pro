package com.jd.open.api.sdk.domain.shangjiashouhou.DoorPickwareSupportQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PickwareInfo implements Serializable {
   private String pickwareCode;
   private Integer pickwareType;
   private Integer pickwareState;
   private Integer pickwareMethod;

   @JsonProperty("pickwareCode")
   public void setPickwareCode(String pickwareCode) {
      this.pickwareCode = pickwareCode;
   }

   @JsonProperty("pickwareCode")
   public String getPickwareCode() {
      return this.pickwareCode;
   }

   @JsonProperty("pickwareType")
   public void setPickwareType(Integer pickwareType) {
      this.pickwareType = pickwareType;
   }

   @JsonProperty("pickwareType")
   public Integer getPickwareType() {
      return this.pickwareType;
   }

   @JsonProperty("pickwareState")
   public void setPickwareState(Integer pickwareState) {
      this.pickwareState = pickwareState;
   }

   @JsonProperty("pickwareState")
   public Integer getPickwareState() {
      return this.pickwareState;
   }

   @JsonProperty("pickwareMethod")
   public void setPickwareMethod(Integer pickwareMethod) {
      this.pickwareMethod = pickwareMethod;
   }

   @JsonProperty("pickwareMethod")
   public Integer getPickwareMethod() {
      return this.pickwareMethod;
   }
}
