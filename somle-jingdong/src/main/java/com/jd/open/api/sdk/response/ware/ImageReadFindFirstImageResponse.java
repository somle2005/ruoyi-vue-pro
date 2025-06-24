package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ImageReadService.response.findFirstImage.Image;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImageReadFindFirstImageResponse extends AbstractResponse {
   private Image image;

   @JsonProperty("image")
   public void setImage(Image image) {
      this.image = image;
   }

   @JsonProperty("image")
   public Image getImage() {
      return this.image;
   }
}
