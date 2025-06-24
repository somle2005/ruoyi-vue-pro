package com.jd.open.api.sdk.domain.hudong.GiftActivityReadService.response.findAllGiftActivityForPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GiftActivity implements Serializable {
   private Integer isPrize;
   private List<GiftRuleActivity> giftRuleActivityList;
   private String modifier;
   private Integer type;
   private Date modified;
   private Date startTime;
   private Long activityId;
   private String creator;
   private Date created;
   private String activityName;
   private Date endTime;
   private String sourceName;
   private Integer status;
   private Integer source;

   @JsonProperty("isPrize")
   public void setIsPrize(Integer isPrize) {
      this.isPrize = isPrize;
   }

   @JsonProperty("isPrize")
   public Integer getIsPrize() {
      return this.isPrize;
   }

   @JsonProperty("giftRuleActivityList")
   public void setGiftRuleActivityList(List<GiftRuleActivity> giftRuleActivityList) {
      this.giftRuleActivityList = giftRuleActivityList;
   }

   @JsonProperty("giftRuleActivityList")
   public List<GiftRuleActivity> getGiftRuleActivityList() {
      return this.giftRuleActivityList;
   }

   @JsonProperty("modifier")
   public void setModifier(String modifier) {
      this.modifier = modifier;
   }

   @JsonProperty("modifier")
   public String getModifier() {
      return this.modifier;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("startTime")
   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public Date getStartTime() {
      return this.startTime;
   }

   @JsonProperty("activityId")
   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   @JsonProperty("activityId")
   public Long getActivityId() {
      return this.activityId;
   }

   @JsonProperty("creator")
   public void setCreator(String creator) {
      this.creator = creator;
   }

   @JsonProperty("creator")
   public String getCreator() {
      return this.creator;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("activityName")
   public void setActivityName(String activityName) {
      this.activityName = activityName;
   }

   @JsonProperty("activityName")
   public String getActivityName() {
      return this.activityName;
   }

   @JsonProperty("endTime")
   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Date getEndTime() {
      return this.endTime;
   }

   @JsonProperty("sourceName")
   public void setSourceName(String sourceName) {
      this.sourceName = sourceName;
   }

   @JsonProperty("sourceName")
   public String getSourceName() {
      return this.sourceName;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("source")
   public void setSource(Integer source) {
      this.source = source;
   }

   @JsonProperty("source")
   public Integer getSource() {
      return this.source;
   }
}
