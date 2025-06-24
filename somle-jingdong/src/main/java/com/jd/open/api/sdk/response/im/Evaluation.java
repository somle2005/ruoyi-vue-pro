package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class Evaluation implements Serializable {
   private String customer;
   private String waiter;
   private String desc;
   private int score;
   private Date evaTime;
   private Integer solveOption;

   @JsonProperty("customer")
   public void setCustomer(String customer) {
      this.customer = customer;
   }

   @JsonProperty("customer")
   public String getCustomer() {
      return this.customer;
   }

   @JsonProperty("waiter")
   public void setWaiter(String waiter) {
      this.waiter = waiter;
   }

   @JsonProperty("waiter")
   public String getWaiter() {
      return this.waiter;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }

   @JsonProperty("score")
   public void setScore(int score) {
      this.score = score;
   }

   @JsonProperty("score")
   public int getScore() {
      return this.score;
   }

   @JsonProperty("evaTime")
   public void setEvaTime(Date evaTime) {
      this.evaTime = evaTime;
   }

   @JsonProperty("evaTime")
   public Date getEvaTime() {
      return this.evaTime;
   }

   @JsonProperty("solveOption")
   public void setSolveOption(Integer solveOption) {
      this.solveOption = solveOption;
   }

   @JsonProperty("solveOption")
   public Integer getSolveOption() {
      return this.solveOption;
   }
}
