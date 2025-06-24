package com.jd.open.api.sdk.domain.B2B.B2BPromotionProvider.request.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PlatformInfo implements Serializable {
   private Integer platform;
   private Integer channel;

   @JsonProperty("platform")
   public void setPlatform(Integer platform) {
      this.platform = platform;
   }

   @JsonProperty("platform")
   public Integer getPlatform() {
      return this.platform;
   }

   @JsonProperty("channel")
   public void setChannel(Integer channel) {
      this.channel = channel;
   }

   @JsonProperty("channel")
   public Integer getChannel() {
      return this.channel;
   }
}
