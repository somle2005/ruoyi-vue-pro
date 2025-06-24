package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getTrendData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private String msg;
   private String code;
   private Boolean success;
   private List<FullCouponDataInfo> data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("data")
   public void setData(List<FullCouponDataInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<FullCouponDataInfo> getData() {
      return this.data;
   }
}
