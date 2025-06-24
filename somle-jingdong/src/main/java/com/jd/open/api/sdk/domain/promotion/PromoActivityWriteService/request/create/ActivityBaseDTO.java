package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ActivityBaseDTO implements Serializable {
   private String name;
   private Integer type;
   private Date beginTime;
   private Date endTime;
   private Integer bound;
   private Integer extType;
   private String rsn;
   private Integer venderType;

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

   @JsonProperty("rsn")
   public void setRsn(String rsn) {
      this.rsn = rsn;
   }

   @JsonProperty("rsn")
   public String getRsn() {
      return this.rsn;
   }

   @JsonProperty("venderType")
   public void setVenderType(Integer venderType) {
      this.venderType = venderType;
   }

   @JsonProperty("venderType")
   public Integer getVenderType() {
      return this.venderType;
   }
}
