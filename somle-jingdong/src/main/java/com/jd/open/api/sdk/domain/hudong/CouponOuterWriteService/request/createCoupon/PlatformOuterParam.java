package com.jd.open.api.sdk.domain.hudong.CouponOuterWriteService.request.createCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PlatformOuterParam implements Serializable {
   private Integer selectType;
   private Integer channel;
   private Integer channelSelectType;
   private String platform;

   @JsonProperty("selectType")
   public void setSelectType(Integer selectType) {
      this.selectType = selectType;
   }

   @JsonProperty("selectType")
   public Integer getSelectType() {
      return this.selectType;
   }

   @JsonProperty("channel")
   public void setChannel(Integer channel) {
      this.channel = channel;
   }

   @JsonProperty("channel")
   public Integer getChannel() {
      return this.channel;
   }

   @JsonProperty("channelSelectType")
   public void setChannelSelectType(Integer channelSelectType) {
      this.channelSelectType = channelSelectType;
   }

   @JsonProperty("channelSelectType")
   public Integer getChannelSelectType() {
      return this.channelSelectType;
   }

   @JsonProperty("platform")
   public void setPlatform(String platform) {
      this.platform = platform;
   }

   @JsonProperty("platform")
   public String getPlatform() {
      return this.platform;
   }
}
