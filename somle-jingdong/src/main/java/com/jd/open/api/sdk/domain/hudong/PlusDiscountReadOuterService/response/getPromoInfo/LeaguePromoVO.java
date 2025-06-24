package com.jd.open.api.sdk.domain.hudong.PlusDiscountReadOuterService.response.getPromoInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class LeaguePromoVO implements Serializable {
   private Integer memberLevel;
   private Boolean showDelSku;
   private boolean expired;
   private String promoName;
   private Long promoId;
   private String beginTime;
   private String endTime;
   private List<Integer> platForm;
   private String slogan;
   private Integer status;

   @JsonProperty("memberLevel")
   public void setMemberLevel(Integer memberLevel) {
      this.memberLevel = memberLevel;
   }

   @JsonProperty("memberLevel")
   public Integer getMemberLevel() {
      return this.memberLevel;
   }

   @JsonProperty("showDelSku")
   public void setShowDelSku(Boolean showDelSku) {
      this.showDelSku = showDelSku;
   }

   @JsonProperty("showDelSku")
   public Boolean getShowDelSku() {
      return this.showDelSku;
   }

   @JsonProperty("expired")
   public void setExpired(boolean expired) {
      this.expired = expired;
   }

   @JsonProperty("expired")
   public boolean getExpired() {
      return this.expired;
   }

   @JsonProperty("promoName")
   public void setPromoName(String promoName) {
      this.promoName = promoName;
   }

   @JsonProperty("promoName")
   public String getPromoName() {
      return this.promoName;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("beginTime")
   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public String getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("platForm")
   public void setPlatForm(List<Integer> platForm) {
      this.platForm = platForm;
   }

   @JsonProperty("platForm")
   public List<Integer> getPlatForm() {
      return this.platForm;
   }

   @JsonProperty("slogan")
   public void setSlogan(String slogan) {
      this.slogan = slogan;
   }

   @JsonProperty("slogan")
   public String getSlogan() {
      return this.slogan;
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
