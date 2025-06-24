package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class AfsServiceDetailDto implements Serializable {
   private Integer afsServiceDetailId;
   private Long afsServiceId;
   private Long wareId;
   private String wareName;
   private String wareDescribe;
   private String wareBrand;
   private Integer wareCid1;
   private Integer wareCid2;
   private Integer wareCid3;
   private String createName;
   private String updateName;
   private Date createDate;
   private Date updateDate;
   private Long afsServiceDetailIdLong;

   @JsonProperty("afsServiceDetailId")
   public void setAfsServiceDetailId(Integer afsServiceDetailId) {
      this.afsServiceDetailId = afsServiceDetailId;
   }

   @JsonProperty("afsServiceDetailId")
   public Integer getAfsServiceDetailId() {
      return this.afsServiceDetailId;
   }

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("wareDescribe")
   public void setWareDescribe(String wareDescribe) {
      this.wareDescribe = wareDescribe;
   }

   @JsonProperty("wareDescribe")
   public String getWareDescribe() {
      return this.wareDescribe;
   }

   @JsonProperty("wareBrand")
   public void setWareBrand(String wareBrand) {
      this.wareBrand = wareBrand;
   }

   @JsonProperty("wareBrand")
   public String getWareBrand() {
      return this.wareBrand;
   }

   @JsonProperty("wareCid1")
   public void setWareCid1(Integer wareCid1) {
      this.wareCid1 = wareCid1;
   }

   @JsonProperty("wareCid1")
   public Integer getWareCid1() {
      return this.wareCid1;
   }

   @JsonProperty("wareCid2")
   public void setWareCid2(Integer wareCid2) {
      this.wareCid2 = wareCid2;
   }

   @JsonProperty("wareCid2")
   public Integer getWareCid2() {
      return this.wareCid2;
   }

   @JsonProperty("wareCid3")
   public void setWareCid3(Integer wareCid3) {
      this.wareCid3 = wareCid3;
   }

   @JsonProperty("wareCid3")
   public Integer getWareCid3() {
      return this.wareCid3;
   }

   @JsonProperty("createName")
   public void setCreateName(String createName) {
      this.createName = createName;
   }

   @JsonProperty("createName")
   public String getCreateName() {
      return this.createName;
   }

   @JsonProperty("updateName")
   public void setUpdateName(String updateName) {
      this.updateName = updateName;
   }

   @JsonProperty("updateName")
   public String getUpdateName() {
      return this.updateName;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("updateDate")
   public void setUpdateDate(Date updateDate) {
      this.updateDate = updateDate;
   }

   @JsonProperty("updateDate")
   public Date getUpdateDate() {
      return this.updateDate;
   }

   @JsonProperty("afsServiceDetailIdLong")
   public void setAfsServiceDetailIdLong(Long afsServiceDetailIdLong) {
      this.afsServiceDetailIdLong = afsServiceDetailIdLong;
   }

   @JsonProperty("afsServiceDetailIdLong")
   public Long getAfsServiceDetailIdLong() {
      return this.afsServiceDetailIdLong;
   }
}
