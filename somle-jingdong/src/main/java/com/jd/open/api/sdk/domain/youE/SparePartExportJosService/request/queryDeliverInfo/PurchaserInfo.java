package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.queryDeliverInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PurchaserInfo implements Serializable {
   private String purchaserId;
   private Integer channelId;

   @JsonProperty("purchaserId")
   public void setPurchaserId(String purchaserId) {
      this.purchaserId = purchaserId;
   }

   @JsonProperty("purchaserId")
   public String getPurchaserId() {
      return this.purchaserId;
   }

   @JsonProperty("channelId")
   public void setChannelId(Integer channelId) {
      this.channelId = channelId;
   }

   @JsonProperty("channelId")
   public Integer getChannelId() {
      return this.channelId;
   }
}
