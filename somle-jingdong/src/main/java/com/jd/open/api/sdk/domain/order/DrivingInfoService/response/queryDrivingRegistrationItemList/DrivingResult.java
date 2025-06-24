package com.jd.open.api.sdk.domain.order.DrivingInfoService.response.queryDrivingRegistrationItemList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class DrivingResult implements Serializable {
   private Integer resultCode;
   private String message;
   private List<DrivingRegistrationItemEntity> registrationItems;
   private Integer count;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("registrationItems")
   public void setRegistrationItems(List<DrivingRegistrationItemEntity> registrationItems) {
      this.registrationItems = registrationItems;
   }

   @JsonProperty("registrationItems")
   public List<DrivingRegistrationItemEntity> getRegistrationItems() {
      return this.registrationItems;
   }

   @JsonProperty("count")
   public void setCount(Integer count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Integer getCount() {
      return this.count;
   }
}
