package com.jd.open.api.sdk.domain.iopdd.QueryOrderOpenProvider.response.queryOrderDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class DeliveryInfoOrderOpenResp implements Serializable {
   private Date deliveryOutTime;

   @JsonProperty("deliveryOutTime")
   public void setDeliveryOutTime(Date deliveryOutTime) {
      this.deliveryOutTime = deliveryOutTime;
   }

   @JsonProperty("deliveryOutTime")
   public Date getDeliveryOutTime() {
      return this.deliveryOutTime;
   }
}
