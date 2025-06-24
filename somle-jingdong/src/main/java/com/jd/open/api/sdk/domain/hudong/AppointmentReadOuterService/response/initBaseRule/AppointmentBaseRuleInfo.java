package com.jd.open.api.sdk.domain.hudong.AppointmentReadOuterService.response.initBaseRule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AppointmentBaseRuleInfo implements Serializable {
   private Boolean hasAuth;
   private Boolean hasHideMemberAuth;
   private String limitEndTime;
   private VenderTypeInfo venderTypeInfo;
   private String limitBeginTime;

   @JsonProperty("hasAuth")
   public void setHasAuth(Boolean hasAuth) {
      this.hasAuth = hasAuth;
   }

   @JsonProperty("hasAuth")
   public Boolean getHasAuth() {
      return this.hasAuth;
   }

   @JsonProperty("hasHideMemberAuth")
   public void setHasHideMemberAuth(Boolean hasHideMemberAuth) {
      this.hasHideMemberAuth = hasHideMemberAuth;
   }

   @JsonProperty("hasHideMemberAuth")
   public Boolean getHasHideMemberAuth() {
      return this.hasHideMemberAuth;
   }

   @JsonProperty("limitEndTime")
   public void setLimitEndTime(String limitEndTime) {
      this.limitEndTime = limitEndTime;
   }

   @JsonProperty("limitEndTime")
   public String getLimitEndTime() {
      return this.limitEndTime;
   }

   @JsonProperty("venderTypeInfo")
   public void setVenderTypeInfo(VenderTypeInfo venderTypeInfo) {
      this.venderTypeInfo = venderTypeInfo;
   }

   @JsonProperty("venderTypeInfo")
   public VenderTypeInfo getVenderTypeInfo() {
      return this.venderTypeInfo;
   }

   @JsonProperty("limitBeginTime")
   public void setLimitBeginTime(String limitBeginTime) {
      this.limitBeginTime = limitBeginTime;
   }

   @JsonProperty("limitBeginTime")
   public String getLimitBeginTime() {
      return this.limitBeginTime;
   }
}
