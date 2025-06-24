package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromotionVO implements Serializable {
   private Long promoId;
   private String name;
   private Integer type;
   private Integer bound;
   private String beginTime;
   private String endTime;
   private Integer member;
   private String slogan;
   private String comment;
   private Integer status;
   private Integer favorMode;
   private Long rfId;

   @JsonProperty("promo_id")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promo_id")
   public Long getPromoId() {
      return this.promoId;
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

   @JsonProperty("bound")
   public void setBound(Integer bound) {
      this.bound = bound;
   }

   @JsonProperty("bound")
   public Integer getBound() {
      return this.bound;
   }

   @JsonProperty("begin_time")
   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("begin_time")
   public String getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("end_time")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("end_time")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("member")
   public void setMember(Integer member) {
      this.member = member;
   }

   @JsonProperty("member")
   public Integer getMember() {
      return this.member;
   }

   @JsonProperty("slogan")
   public void setSlogan(String slogan) {
      this.slogan = slogan;
   }

   @JsonProperty("slogan")
   public String getSlogan() {
      return this.slogan;
   }

   @JsonProperty("comment")
   public void setComment(String comment) {
      this.comment = comment;
   }

   @JsonProperty("comment")
   public String getComment() {
      return this.comment;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("favor_mode")
   public void setFavorMode(Integer favorMode) {
      this.favorMode = favorMode;
   }

   @JsonProperty("favor_mode")
   public Integer getFavorMode() {
      return this.favorMode;
   }

   @JsonProperty("rf_Id")
   public void setRfId(Long rfId) {
      this.rfId = rfId;
   }

   @JsonProperty("rf_Id")
   public Long getRfId() {
      return this.rfId;
   }
}
