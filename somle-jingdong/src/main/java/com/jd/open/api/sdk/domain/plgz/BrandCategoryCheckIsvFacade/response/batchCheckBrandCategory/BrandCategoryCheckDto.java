package com.jd.open.api.sdk.domain.plgz.BrandCategoryCheckIsvFacade.response.batchCheckBrandCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BrandCategoryCheckDto implements Serializable {
   private Integer checkType;
   private Integer resonType;
   private Integer checkCode;
   private Integer status;
   private ReminderDto pcReminder;
   private ReminderDto appReminder;

   @JsonProperty("checkType")
   public void setCheckType(Integer checkType) {
      this.checkType = checkType;
   }

   @JsonProperty("checkType")
   public Integer getCheckType() {
      return this.checkType;
   }

   @JsonProperty("resonType")
   public void setResonType(Integer resonType) {
      this.resonType = resonType;
   }

   @JsonProperty("resonType")
   public Integer getResonType() {
      return this.resonType;
   }

   @JsonProperty("checkCode")
   public void setCheckCode(Integer checkCode) {
      this.checkCode = checkCode;
   }

   @JsonProperty("checkCode")
   public Integer getCheckCode() {
      return this.checkCode;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("pcReminder")
   public void setPcReminder(ReminderDto pcReminder) {
      this.pcReminder = pcReminder;
   }

   @JsonProperty("pcReminder")
   public ReminderDto getPcReminder() {
      return this.pcReminder;
   }

   @JsonProperty("appReminder")
   public void setAppReminder(ReminderDto appReminder) {
      this.appReminder = appReminder;
   }

   @JsonProperty("appReminder")
   public ReminderDto getAppReminder() {
      return this.appReminder;
   }
}
