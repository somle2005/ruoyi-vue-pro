package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getPromoDetailInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class FullCouponDetailInfo implements Serializable {
   private Integer wareGrade;
   private String promoName;
   private String startTime;
   private Long promoId;
   private String endTime;
   private String wareGradeName;
   private FullCouponPlatForm fullCouponPlatForm;
   private List<FullCouponOrderModes> fullCouponOrderModesList;

   @JsonProperty("wareGrade")
   public void setWareGrade(Integer wareGrade) {
      this.wareGrade = wareGrade;
   }

   @JsonProperty("wareGrade")
   public Integer getWareGrade() {
      return this.wareGrade;
   }

   @JsonProperty("promoName")
   public void setPromoName(String promoName) {
      this.promoName = promoName;
   }

   @JsonProperty("promoName")
   public String getPromoName() {
      return this.promoName;
   }

   @JsonProperty("startTime")
   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public String getStartTime() {
      return this.startTime;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("wareGradeName")
   public void setWareGradeName(String wareGradeName) {
      this.wareGradeName = wareGradeName;
   }

   @JsonProperty("wareGradeName")
   public String getWareGradeName() {
      return this.wareGradeName;
   }

   @JsonProperty("fullCouponPlatForm")
   public void setFullCouponPlatForm(FullCouponPlatForm fullCouponPlatForm) {
      this.fullCouponPlatForm = fullCouponPlatForm;
   }

   @JsonProperty("fullCouponPlatForm")
   public FullCouponPlatForm getFullCouponPlatForm() {
      return this.fullCouponPlatForm;
   }

   @JsonProperty("fullCouponOrderModesList")
   public void setFullCouponOrderModesList(List<FullCouponOrderModes> fullCouponOrderModesList) {
      this.fullCouponOrderModesList = fullCouponOrderModesList;
   }

   @JsonProperty("fullCouponOrderModesList")
   public List<FullCouponOrderModes> getFullCouponOrderModesList() {
      return this.fullCouponOrderModesList;
   }
}
