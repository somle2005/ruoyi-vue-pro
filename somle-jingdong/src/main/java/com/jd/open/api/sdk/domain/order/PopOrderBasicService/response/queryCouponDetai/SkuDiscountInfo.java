package com.jd.open.api.sdk.domain.order.PopOrderBasicService.response.queryCouponDetai;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuDiscountInfo implements Serializable {
   private String code;
   private String publicCode;
   private List<SkuDiscountType> discountTypeList;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("publicCode")
   public void setPublicCode(String publicCode) {
      this.publicCode = publicCode;
   }

   @JsonProperty("publicCode")
   public String getPublicCode() {
      return this.publicCode;
   }

   @JsonProperty("discountTypeList")
   public void setDiscountTypeList(List<SkuDiscountType> discountTypeList) {
      this.discountTypeList = discountTypeList;
   }

   @JsonProperty("discountTypeList")
   public List<SkuDiscountType> getDiscountTypeList() {
      return this.discountTypeList;
   }
}
