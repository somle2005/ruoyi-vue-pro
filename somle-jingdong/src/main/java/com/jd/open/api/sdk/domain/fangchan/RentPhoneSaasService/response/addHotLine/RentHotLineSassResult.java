package com.jd.open.api.sdk.domain.fangchan.RentPhoneSaasService.response.addHotLine;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RentHotLineSassResult implements Serializable {
   private String code;
   private String message;
   private Long id;
   private Long venderId;
   private String venderName;
   private String phoneName;
   private Integer workHourStart;
   private Integer workHourEnd;
   private String phoneMain;
   private String phoneExtension;
   private Date created;
   private Date modified;
   private List<RealEstateHotlineLandingVO> phoneLandingList;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("venderName")
   public void setVenderName(String venderName) {
      this.venderName = venderName;
   }

   @JsonProperty("venderName")
   public String getVenderName() {
      return this.venderName;
   }

   @JsonProperty("phoneName")
   public void setPhoneName(String phoneName) {
      this.phoneName = phoneName;
   }

   @JsonProperty("phoneName")
   public String getPhoneName() {
      return this.phoneName;
   }

   @JsonProperty("workHourStart")
   public void setWorkHourStart(Integer workHourStart) {
      this.workHourStart = workHourStart;
   }

   @JsonProperty("workHourStart")
   public Integer getWorkHourStart() {
      return this.workHourStart;
   }

   @JsonProperty("workHourEnd")
   public void setWorkHourEnd(Integer workHourEnd) {
      this.workHourEnd = workHourEnd;
   }

   @JsonProperty("workHourEnd")
   public Integer getWorkHourEnd() {
      return this.workHourEnd;
   }

   @JsonProperty("phoneMain")
   public void setPhoneMain(String phoneMain) {
      this.phoneMain = phoneMain;
   }

   @JsonProperty("phoneMain")
   public String getPhoneMain() {
      return this.phoneMain;
   }

   @JsonProperty("phoneExtension")
   public void setPhoneExtension(String phoneExtension) {
      this.phoneExtension = phoneExtension;
   }

   @JsonProperty("phoneExtension")
   public String getPhoneExtension() {
      return this.phoneExtension;
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

   @JsonProperty("phoneLandingList")
   public void setPhoneLandingList(List<RealEstateHotlineLandingVO> phoneLandingList) {
      this.phoneLandingList = phoneLandingList;
   }

   @JsonProperty("phoneLandingList")
   public List<RealEstateHotlineLandingVO> getPhoneLandingList() {
      return this.phoneLandingList;
   }
}
