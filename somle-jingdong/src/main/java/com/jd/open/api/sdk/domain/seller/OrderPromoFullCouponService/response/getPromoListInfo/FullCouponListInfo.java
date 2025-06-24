package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getPromoListInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FullCouponListInfo implements Serializable {
   private Long promoId;
   private String promoName;
   private Integer promoType;
   private Integer memberType;
   private Integer memberLevel;
   private String memberName;
   private Integer status;
   private String statusName;
   private Integer wareGrade;
   private String wareGradeName;
   private String startTime;
   private String endTime;

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("promoName")
   public void setPromoName(String promoName) {
      this.promoName = promoName;
   }

   @JsonProperty("promoName")
   public String getPromoName() {
      return this.promoName;
   }

   @JsonProperty("promoType")
   public void setPromoType(Integer promoType) {
      this.promoType = promoType;
   }

   @JsonProperty("promoType")
   public Integer getPromoType() {
      return this.promoType;
   }

   @JsonProperty("memberType")
   public void setMemberType(Integer memberType) {
      this.memberType = memberType;
   }

   @JsonProperty("memberType")
   public Integer getMemberType() {
      return this.memberType;
   }

   @JsonProperty("memberLevel")
   public void setMemberLevel(Integer memberLevel) {
      this.memberLevel = memberLevel;
   }

   @JsonProperty("memberLevel")
   public Integer getMemberLevel() {
      return this.memberLevel;
   }

   @JsonProperty("memberName")
   public void setMemberName(String memberName) {
      this.memberName = memberName;
   }

   @JsonProperty("memberName")
   public String getMemberName() {
      return this.memberName;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("statusName")
   public void setStatusName(String statusName) {
      this.statusName = statusName;
   }

   @JsonProperty("statusName")
   public String getStatusName() {
      return this.statusName;
   }

   @JsonProperty("wareGrade")
   public void setWareGrade(Integer wareGrade) {
      this.wareGrade = wareGrade;
   }

   @JsonProperty("wareGrade")
   public Integer getWareGrade() {
      return this.wareGrade;
   }

   @JsonProperty("wareGradeName")
   public void setWareGradeName(String wareGradeName) {
      this.wareGradeName = wareGradeName;
   }

   @JsonProperty("wareGradeName")
   public String getWareGradeName() {
      return this.wareGradeName;
   }

   @JsonProperty("startTime")
   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public String getStartTime() {
      return this.startTime;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }
}
