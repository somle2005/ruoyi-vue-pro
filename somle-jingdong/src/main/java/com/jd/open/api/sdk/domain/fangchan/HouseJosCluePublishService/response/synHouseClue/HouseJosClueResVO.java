package com.jd.open.api.sdk.domain.fangchan.HouseJosCluePublishService.response.synHouseClue;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class HouseJosClueResVO implements Serializable {
   private Integer[] clueId;
   private Long[] clueRelationId;
   private String[] clueName;
   private String[] clueType;
   private Date[] clueTime;
   private String[] cluePhone;
   private String[] cluePhoneName;

   @JsonProperty("clueId")
   public void setClueId(Integer[] clueId) {
      this.clueId = clueId;
   }

   @JsonProperty("clueId")
   public Integer[] getClueId() {
      return this.clueId;
   }

   @JsonProperty("clueRelationId")
   public void setClueRelationId(Long[] clueRelationId) {
      this.clueRelationId = clueRelationId;
   }

   @JsonProperty("clueRelationId")
   public Long[] getClueRelationId() {
      return this.clueRelationId;
   }

   @JsonProperty("clueName")
   public void setClueName(String[] clueName) {
      this.clueName = clueName;
   }

   @JsonProperty("clueName")
   public String[] getClueName() {
      return this.clueName;
   }

   @JsonProperty("clueType")
   public void setClueType(String[] clueType) {
      this.clueType = clueType;
   }

   @JsonProperty("clueType")
   public String[] getClueType() {
      return this.clueType;
   }

   @JsonProperty("clueTime")
   public void setClueTime(Date[] clueTime) {
      this.clueTime = clueTime;
   }

   @JsonProperty("clueTime")
   public Date[] getClueTime() {
      return this.clueTime;
   }

   @JsonProperty("cluePhone")
   public void setCluePhone(String[] cluePhone) {
      this.cluePhone = cluePhone;
   }

   @JsonProperty("cluePhone")
   public String[] getCluePhone() {
      return this.cluePhone;
   }

   @JsonProperty("cluePhoneName")
   public void setCluePhoneName(String[] cluePhoneName) {
      this.cluePhoneName = cluePhoneName;
   }

   @JsonProperty("cluePhoneName")
   public String[] getCluePhoneName() {
      return this.cluePhoneName;
   }
}
