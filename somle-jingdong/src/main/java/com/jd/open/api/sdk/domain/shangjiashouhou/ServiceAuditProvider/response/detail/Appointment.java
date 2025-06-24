package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class Appointment implements Serializable {
   private Date appointDateBegin;
   private Date appointDateEnd;
   private String appointDateStr;
   private int appointDateType;
   private Date reserveDate;
   private String extJsonStr;

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
   public void setAppointDateType(int appointDateType) {
      this.appointDateType = appointDateType;
   }

   @JsonProperty("appointDateType")
   public int getAppointDateType() {
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

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }
}
