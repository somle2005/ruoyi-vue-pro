package com.jd.open.api.sdk.domain.fxbjk.BdsCustomerService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DetailData implements Serializable {
   private String statTm;
   private String sdate;
   private String responseRate;
   private double respDuration;
   private String avgResponseTime;
   private double reception30Num;
   private double medalNum;
   private String pin;
   private double evaluationNum;
   private double satisfactionPlusNum;
   private double receptionNum;
   private String responseRate30;
   private double respTimes;
   private double satisfactionNum;
   private double consultationNum;
   private String satisfactionRate;

   @JsonProperty("statTm")
   public void setStatTm(String statTm) {
      this.statTm = statTm;
   }

   @JsonProperty("statTm")
   public String getStatTm() {
      return this.statTm;
   }

   @JsonProperty("sdate")
   public void setSdate(String sdate) {
      this.sdate = sdate;
   }

   @JsonProperty("sdate")
   public String getSdate() {
      return this.sdate;
   }

   @JsonProperty("responseRate")
   public void setResponseRate(String responseRate) {
      this.responseRate = responseRate;
   }

   @JsonProperty("responseRate")
   public String getResponseRate() {
      return this.responseRate;
   }

   @JsonProperty("respDuration")
   public void setRespDuration(double respDuration) {
      this.respDuration = respDuration;
   }

   @JsonProperty("respDuration")
   public double getRespDuration() {
      return this.respDuration;
   }

   @JsonProperty("avgResponseTime")
   public void setAvgResponseTime(String avgResponseTime) {
      this.avgResponseTime = avgResponseTime;
   }

   @JsonProperty("avgResponseTime")
   public String getAvgResponseTime() {
      return this.avgResponseTime;
   }

   @JsonProperty("reception30Num")
   public void setReception30Num(double reception30Num) {
      this.reception30Num = reception30Num;
   }

   @JsonProperty("reception30Num")
   public double getReception30Num() {
      return this.reception30Num;
   }

   @JsonProperty("medalNum")
   public void setMedalNum(double medalNum) {
      this.medalNum = medalNum;
   }

   @JsonProperty("medalNum")
   public double getMedalNum() {
      return this.medalNum;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("evaluationNum")
   public void setEvaluationNum(double evaluationNum) {
      this.evaluationNum = evaluationNum;
   }

   @JsonProperty("evaluationNum")
   public double getEvaluationNum() {
      return this.evaluationNum;
   }

   @JsonProperty("satisfactionPlusNum")
   public void setSatisfactionPlusNum(double satisfactionPlusNum) {
      this.satisfactionPlusNum = satisfactionPlusNum;
   }

   @JsonProperty("satisfactionPlusNum")
   public double getSatisfactionPlusNum() {
      return this.satisfactionPlusNum;
   }

   @JsonProperty("receptionNum")
   public void setReceptionNum(double receptionNum) {
      this.receptionNum = receptionNum;
   }

   @JsonProperty("receptionNum")
   public double getReceptionNum() {
      return this.receptionNum;
   }

   @JsonProperty("responseRate30")
   public void setResponseRate30(String responseRate30) {
      this.responseRate30 = responseRate30;
   }

   @JsonProperty("responseRate30")
   public String getResponseRate30() {
      return this.responseRate30;
   }

   @JsonProperty("respTimes")
   public void setRespTimes(double respTimes) {
      this.respTimes = respTimes;
   }

   @JsonProperty("respTimes")
   public double getRespTimes() {
      return this.respTimes;
   }

   @JsonProperty("satisfactionNum")
   public void setSatisfactionNum(double satisfactionNum) {
      this.satisfactionNum = satisfactionNum;
   }

   @JsonProperty("satisfactionNum")
   public double getSatisfactionNum() {
      return this.satisfactionNum;
   }

   @JsonProperty("consultationNum")
   public void setConsultationNum(double consultationNum) {
      this.consultationNum = consultationNum;
   }

   @JsonProperty("consultationNum")
   public double getConsultationNum() {
      return this.consultationNum;
   }

   @JsonProperty("satisfactionRate")
   public void setSatisfactionRate(String satisfactionRate) {
      this.satisfactionRate = satisfactionRate;
   }

   @JsonProperty("satisfactionRate")
   public String getSatisfactionRate() {
      return this.satisfactionRate;
   }
}
