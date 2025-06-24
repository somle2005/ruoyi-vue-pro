package com.jd.open.api.sdk.domain.youE.BizOrderJsfService.response.queryChangeBookDateOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ChangeBookDateOrderVO implements Serializable {
   private String orderNo;
   private String wishBookDate;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("wishBookDate")
   public void setWishBookDate(String wishBookDate) {
      this.wishBookDate = wishBookDate;
   }

   @JsonProperty("wishBookDate")
   public String getWishBookDate() {
      return this.wishBookDate;
   }
}
