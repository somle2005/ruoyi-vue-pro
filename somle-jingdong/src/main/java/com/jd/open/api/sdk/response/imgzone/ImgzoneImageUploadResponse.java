package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.imgzone.ImageInfoJosService.response.upload.ImageInfoDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImgzoneImageUploadResponse extends AbstractResponse {
   private ImageInfoDto returnType;

   @JsonProperty("returnType")
   public void setReturnType(ImageInfoDto returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ImageInfoDto getReturnType() {
      return this.returnType;
   }
}
