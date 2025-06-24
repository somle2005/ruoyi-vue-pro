package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class AppointmentInfoExport implements Serializable {
   private Date appointDateBegin;
   private Date appointDateEnd;
   private String appointDateStr;
   private int appointDateType;
   private Date reserveDate;
   private String sendPay;

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

   @JsonProperty("sendPay")
   public void setSendPay(String sendPay) {
      this.sendPay = sendPay;
   }

   @JsonProperty("sendPay")
   public String getSendPay() {
      return this.sendPay;
   }
}
