package com.jd.open.api.sdk.domain.seller.VenderConfigService.response.findPayTimeLimitRulsByVenderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class VenderPayTimeLimitRule implements Serializable {
   private Integer ruleType;
   private Long venderId;
   private Date startTime;
   private String timeLimt;
   private Date endTime;

   @JsonProperty("ruleType")
   public void setRuleType(Integer ruleType) {
      this.ruleType = ruleType;
   }

   @JsonProperty("ruleType")
   public Integer getRuleType() {
      return this.ruleType;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("startTime")
   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public Date getStartTime() {
      return this.startTime;
   }

   @JsonProperty("timeLimt")
   public void setTimeLimt(String timeLimt) {
      this.timeLimt = timeLimt;
   }

   @JsonProperty("timeLimt")
   public String getTimeLimt() {
      return this.timeLimt;
   }

   @JsonProperty("endTime")
   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Date getEndTime() {
      return this.endTime;
   }
}
