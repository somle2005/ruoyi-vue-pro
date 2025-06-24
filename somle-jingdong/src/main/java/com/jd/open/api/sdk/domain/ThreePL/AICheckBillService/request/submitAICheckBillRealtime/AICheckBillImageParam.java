package com.jd.open.api.sdk.domain.ThreePL.AICheckBillService.request.submitAICheckBillRealtime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AICheckBillImageParam implements Serializable {
   private String imageUrl;
   private String imageMd5;

   @JsonProperty("imageUrl")
   public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
   }

   @JsonProperty("imageUrl")
   public String getImageUrl() {
      return this.imageUrl;
   }

   @JsonProperty("imageMd5")
   public void setImageMd5(String imageMd5) {
      this.imageMd5 = imageMd5;
   }

   @JsonProperty("imageMd5")
   public String getImageMd5() {
      return this.imageMd5;
   }
}
