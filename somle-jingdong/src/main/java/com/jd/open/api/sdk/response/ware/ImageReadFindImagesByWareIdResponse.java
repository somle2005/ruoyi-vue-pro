package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ImageReadService.response.findImagesByWareId.Image;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class ImageReadFindImagesByWareIdResponse extends AbstractResponse {
   private List<Image> images;

   @JsonProperty("images")
   public void setImages(List<Image> images) {
      this.images = images;
   }

   @JsonProperty("images")
   public List<Image> getImages() {
      return this.images;
   }
}
