package com.jd.open.api.sdk.domain.etms.GeneralWaybillQueryApi.response.generalQuery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SimpleOrderInfoDTO implements Serializable {
   private Date deliveryPromiseTime;
   private String extendMessageStr;

   @JsonProperty("deliveryPromiseTime")
   public void setDeliveryPromiseTime(Date deliveryPromiseTime) {
      this.deliveryPromiseTime = deliveryPromiseTime;
   }

   @JsonProperty("deliveryPromiseTime")
   public Date getDeliveryPromiseTime() {
      return this.deliveryPromiseTime;
   }

   @JsonProperty("extendMessageStr")
   public void setExtendMessageStr(String extendMessageStr) {
      this.extendMessageStr = extendMessageStr;
   }

   @JsonProperty("extendMessageStr")
   public String getExtendMessageStr() {
      return this.extendMessageStr;
   }
}
