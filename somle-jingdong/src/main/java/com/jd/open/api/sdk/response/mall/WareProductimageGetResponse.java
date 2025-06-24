package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get.ImagePath;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareProductimageGetResponse extends AbstractResponse {
   private List<ImagePath> imagePathList;

   @JsonProperty("image_path_list")
   public void setImagePathList(List<ImagePath> imagePathList) {
      this.imagePathList = imagePathList;
   }

   @JsonProperty("image_path_list")
   public List<ImagePath> getImagePathList() {
      return this.imagePathList;
   }
}
