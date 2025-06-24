package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.request.createFullCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OpenMemberCreateModelInfo implements Serializable {
   private Integer userClass;
   private Integer userLevel;
   private String memberLevelName;
   private Long brandId;

   @JsonProperty("userClass")
   public void setUserClass(Integer userClass) {
      this.userClass = userClass;
   }

   @JsonProperty("userClass")
   public Integer getUserClass() {
      return this.userClass;
   }

   @JsonProperty("userLevel")
   public void setUserLevel(Integer userLevel) {
      this.userLevel = userLevel;
   }

   @JsonProperty("userLevel")
   public Integer getUserLevel() {
      return this.userLevel;
   }

   @JsonProperty("memberLevelName")
   public void setMemberLevelName(String memberLevelName) {
      this.memberLevelName = memberLevelName;
   }

   @JsonProperty("memberLevelName")
   public String getMemberLevelName() {
      return this.memberLevelName;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }
}
