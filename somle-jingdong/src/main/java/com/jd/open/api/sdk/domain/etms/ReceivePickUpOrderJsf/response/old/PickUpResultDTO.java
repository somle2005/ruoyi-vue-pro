package com.jd.open.api.sdk.domain.etms.ReceivePickUpOrderJsf.response.old;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PickUpResultDTO implements Serializable {
   private Integer code;
   private String messsage;
   private String pickUpCode;
   private Boolean upToLowGrade;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("messsage")
   public void setMesssage(String messsage) {
      this.messsage = messsage;
   }

   @JsonProperty("messsage")
   public String getMesssage() {
      return this.messsage;
   }

   @JsonProperty("pickUpCode")
   public void setPickUpCode(String pickUpCode) {
      this.pickUpCode = pickUpCode;
   }

   @JsonProperty("pickUpCode")
   public String getPickUpCode() {
      return this.pickUpCode;
   }

   @JsonProperty("upToLowGrade")
   public void setUpToLowGrade(Boolean upToLowGrade) {
      this.upToLowGrade = upToLowGrade;
   }

   @JsonProperty("upToLowGrade")
   public Boolean getUpToLowGrade() {
      return this.upToLowGrade;
   }
}
