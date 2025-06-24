package com.jd.open.api.sdk.domain.fangchan.HouseJosCustomerCluePublishService.response.getCustomerNoticeDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class HouseJosNoticeClueVO implements Serializable {
   private Long clueId;
   private Long spuId;
   private String spuTitle;
   private String phone;
   private Short type;
   private Date submitTime;

   @JsonProperty("clueId")
   public void setClueId(Long clueId) {
      this.clueId = clueId;
   }

   @JsonProperty("clueId")
   public Long getClueId() {
      return this.clueId;
   }

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("spuTitle")
   public void setSpuTitle(String spuTitle) {
      this.spuTitle = spuTitle;
   }

   @JsonProperty("spuTitle")
   public String getSpuTitle() {
      return this.spuTitle;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("type")
   public void setType(Short type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Short getType() {
      return this.type;
   }

   @JsonProperty("submitTime")
   public void setSubmitTime(Date submitTime) {
      this.submitTime = submitTime;
   }

   @JsonProperty("submitTime")
   public Date getSubmitTime() {
      return this.submitTime;
   }
}
