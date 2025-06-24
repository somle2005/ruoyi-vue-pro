package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.request.createFullCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OpenBusiPlatformCreateModelInfo implements Serializable {
   private Integer selectType;
   private List<Integer> channelList;
   private Integer channelSelectType;
   private List<String> platform;

   @JsonProperty("selectType")
   public void setSelectType(Integer selectType) {
      this.selectType = selectType;
   }

   @JsonProperty("selectType")
   public Integer getSelectType() {
      return this.selectType;
   }

   @JsonProperty("channelList")
   public void setChannelList(List<Integer> channelList) {
      this.channelList = channelList;
   }

   @JsonProperty("channelList")
   public List<Integer> getChannelList() {
      return this.channelList;
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
   public void setPlatform(List<String> platform) {
      this.platform = platform;
   }

   @JsonProperty("platform")
   public List<String> getPlatform() {
      return this.platform;
   }
}
