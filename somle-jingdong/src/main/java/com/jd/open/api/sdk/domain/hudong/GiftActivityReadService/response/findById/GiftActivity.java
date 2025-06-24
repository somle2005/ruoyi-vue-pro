package com.jd.open.api.sdk.domain.hudong.GiftActivityReadService.response.findById;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class GiftActivity implements Serializable {
   private Integer isPrize;
   private String descInfo;
   private String modifier;
   private String sourceLink;
   private Integer isSinglePrize;
   private Integer channel;
   private Integer source;
   private Integer type;
   private Integer autoStop;
   private String modelIds;
   private Date modified;
   private Long rfId;
   private Date startTime;
   private Long activityId;
   private Date validate;
   private Integer isEverydayAward;
   private String creator;
   private String subtitleName;
   private Integer riskValue;
   private Date created;
   private String taskIds;
   private String activityName;
   private String sourceCloseLink;
   private String pictureLink;
   private Date endTime;
   private String sourceName;
   private Integer status;

   @JsonProperty("isPrize")
   public void setIsPrize(Integer isPrize) {
      this.isPrize = isPrize;
   }

   @JsonProperty("isPrize")
   public Integer getIsPrize() {
      return this.isPrize;
   }

   @JsonProperty("descInfo")
   public void setDescInfo(String descInfo) {
      this.descInfo = descInfo;
   }

   @JsonProperty("descInfo")
   public String getDescInfo() {
      return this.descInfo;
   }

   @JsonProperty("modifier")
   public void setModifier(String modifier) {
      this.modifier = modifier;
   }

   @JsonProperty("modifier")
   public String getModifier() {
      return this.modifier;
   }

   @JsonProperty("sourceLink")
   public void setSourceLink(String sourceLink) {
      this.sourceLink = sourceLink;
   }

   @JsonProperty("sourceLink")
   public String getSourceLink() {
      return this.sourceLink;
   }

   @JsonProperty("isSinglePrize")
   public void setIsSinglePrize(Integer isSinglePrize) {
      this.isSinglePrize = isSinglePrize;
   }

   @JsonProperty("isSinglePrize")
   public Integer getIsSinglePrize() {
      return this.isSinglePrize;
   }

   @JsonProperty("channel")
   public void setChannel(Integer channel) {
      this.channel = channel;
   }

   @JsonProperty("channel")
   public Integer getChannel() {
      return this.channel;
   }

   @JsonProperty("source")
   public void setSource(Integer source) {
      this.source = source;
   }

   @JsonProperty("source")
   public Integer getSource() {
      return this.source;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("autoStop")
   public void setAutoStop(Integer autoStop) {
      this.autoStop = autoStop;
   }

   @JsonProperty("autoStop")
   public Integer getAutoStop() {
      return this.autoStop;
   }

   @JsonProperty("modelIds")
   public void setModelIds(String modelIds) {
      this.modelIds = modelIds;
   }

   @JsonProperty("modelIds")
   public String getModelIds() {
      return this.modelIds;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("rfId")
   public void setRfId(Long rfId) {
      this.rfId = rfId;
   }

   @JsonProperty("rfId")
   public Long getRfId() {
      return this.rfId;
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

   @JsonProperty("validate")
   public void setValidate(Date validate) {
      this.validate = validate;
   }

   @JsonProperty("validate")
   public Date getValidate() {
      return this.validate;
   }

   @JsonProperty("isEverydayAward")
   public void setIsEverydayAward(Integer isEverydayAward) {
      this.isEverydayAward = isEverydayAward;
   }

   @JsonProperty("isEverydayAward")
   public Integer getIsEverydayAward() {
      return this.isEverydayAward;
   }

   @JsonProperty("creator")
   public void setCreator(String creator) {
      this.creator = creator;
   }

   @JsonProperty("creator")
   public String getCreator() {
      return this.creator;
   }

   @JsonProperty("subtitleName")
   public void setSubtitleName(String subtitleName) {
      this.subtitleName = subtitleName;
   }

   @JsonProperty("subtitleName")
   public String getSubtitleName() {
      return this.subtitleName;
   }

   @JsonProperty("riskValue")
   public void setRiskValue(Integer riskValue) {
      this.riskValue = riskValue;
   }

   @JsonProperty("riskValue")
   public Integer getRiskValue() {
      return this.riskValue;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("taskIds")
   public void setTaskIds(String taskIds) {
      this.taskIds = taskIds;
   }

   @JsonProperty("taskIds")
   public String getTaskIds() {
      return this.taskIds;
   }

   @JsonProperty("activityName")
   public void setActivityName(String activityName) {
      this.activityName = activityName;
   }

   @JsonProperty("activityName")
   public String getActivityName() {
      return this.activityName;
   }

   @JsonProperty("sourceCloseLink")
   public void setSourceCloseLink(String sourceCloseLink) {
      this.sourceCloseLink = sourceCloseLink;
   }

   @JsonProperty("sourceCloseLink")
   public String getSourceCloseLink() {
      return this.sourceCloseLink;
   }

   @JsonProperty("pictureLink")
   public void setPictureLink(String pictureLink) {
      this.pictureLink = pictureLink;
   }

   @JsonProperty("pictureLink")
   public String getPictureLink() {
      return this.pictureLink;
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
}
