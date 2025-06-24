package com.jd.open.api.sdk.domain.unboundedShop.CouponActivityJosService.response.queryActivityPageInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CommonResult implements Serializable {
   private int code;
   private String desc;
   private PageInfo data;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }

   @JsonProperty("data")
   public void setData(PageInfo data) {
      this.data = data;
   }

   @JsonProperty("data")
   public PageInfo getData() {
      return this.data;
   }
}
