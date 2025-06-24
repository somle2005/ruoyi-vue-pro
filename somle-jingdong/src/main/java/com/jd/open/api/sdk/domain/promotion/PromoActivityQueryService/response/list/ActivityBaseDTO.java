package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ActivityBaseDTO implements Serializable {
   private Long activityId;
   private String name;
   private Integer type;
   private Date beginTime;
   private Date endTime;
   private Integer bound;
   private Integer extType;
   private String creator;
   private Integer deleted;
   private Integer activityStatus;
   private Date created;
   private Date modified;

   @JsonProperty("activityId")
   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   @JsonProperty("activityId")
   public Long getActivityId() {
      return this.activityId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("beginTime")
   public void setBeginTime(Date beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public Date getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("endTime")
   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Date getEndTime() {
      return this.endTime;
   }

   @JsonProperty("bound")
   public void setBound(Integer bound) {
      this.bound = bound;
   }

   @JsonProperty("bound")
   public Integer getBound() {
      return this.bound;
   }

   @JsonProperty("extType")
   public void setExtType(Integer extType) {
      this.extType = extType;
   }

   @JsonProperty("extType")
   public Integer getExtType() {
      return this.extType;
   }

   @JsonProperty("creator")
   public void setCreator(String creator) {
      this.creator = creator;
   }

   @JsonProperty("creator")
   public String getCreator() {
      return this.creator;
   }

   @JsonProperty("deleted")
   public void setDeleted(Integer deleted) {
      this.deleted = deleted;
   }

   @JsonProperty("deleted")
   public Integer getDeleted() {
      return this.deleted;
   }

   @JsonProperty("activityStatus")
   public void setActivityStatus(Integer activityStatus) {
      this.activityStatus = activityStatus;
   }

   @JsonProperty("activityStatus")
   public Integer getActivityStatus() {
      return this.activityStatus;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }
}
