package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.storeDoorPick;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class AppointmentInfo implements Serializable {
   private Date appointDateBegin;
   private Date appointDateEnd;
   private String appointDateStr;
   private Integer appointDateType;
   private Date reserveDate;
   private Integer reserveType;
   private Date appointRenewDate;
   private String appointRenewRange;

   @JsonProperty("appointDateBegin")
   public void setAppointDateBegin(Date appointDateBegin) {
      this.appointDateBegin = appointDateBegin;
   }

   @JsonProperty("appointDateBegin")
   public Date getAppointDateBegin() {
      return this.appointDateBegin;
   }

   @JsonProperty("appointDateEnd")
   public void setAppointDateEnd(Date appointDateEnd) {
      this.appointDateEnd = appointDateEnd;
   }

   @JsonProperty("appointDateEnd")
   public Date getAppointDateEnd() {
      return this.appointDateEnd;
   }

   @JsonProperty("appointDateStr")
   public void setAppointDateStr(String appointDateStr) {
      this.appointDateStr = appointDateStr;
   }

   @JsonProperty("appointDateStr")
   public String getAppointDateStr() {
      return this.appointDateStr;
   }

   @JsonProperty("appointDateType")
   public void setAppointDateType(Integer appointDateType) {
      this.appointDateType = appointDateType;
   }

   @JsonProperty("appointDateType")
   public Integer getAppointDateType() {
      return this.appointDateType;
   }

   @JsonProperty("reserveDate")
   public void setReserveDate(Date reserveDate) {
      this.reserveDate = reserveDate;
   }

   @JsonProperty("reserveDate")
   public Date getReserveDate() {
      return this.reserveDate;
   }

   @JsonProperty("reserveType")
   public void setReserveType(Integer reserveType) {
      this.reserveType = reserveType;
   }

   @JsonProperty("reserveType")
   public Integer getReserveType() {
      return this.reserveType;
   }

   @JsonProperty("appointRenewDate")
   public void setAppointRenewDate(Date appointRenewDate) {
      this.appointRenewDate = appointRenewDate;
   }

   @JsonProperty("appointRenewDate")
   public Date getAppointRenewDate() {
      return this.appointRenewDate;
   }

   @JsonProperty("appointRenewRange")
   public void setAppointRenewRange(String appointRenewRange) {
      this.appointRenewRange = appointRenewRange;
   }

   @JsonProperty("appointRenewRange")
   public String getAppointRenewRange() {
      return this.appointRenewRange;
   }
}
